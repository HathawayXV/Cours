-- Date: 2020-11-05 10:58:00
-- Name: TRIGGER
-- Description: Amphi 1
-- Version: 1.0
-- Modified by: HAN Yannick

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--

--Pourquoi les triggers ?--
/*
Un d´eclencheur d´efinit une action qui doit s’ex´ecuter quand survient un ´ev´enement dans la base de données.
Il peut servir à :
- avertir d’un événement
- ajouter des contraintes sur les valeurs des attributs d’une table
- enregistrer des changements
- ajouter des r`egles de gestion
*/

--Fonctionnalité d'un trigger ?--
/*
a toute modification concernant un objet :
- INSERT
- UPDATE
- DELETE

a la création, suppression ou modification :
- CREATE
- ALTER
- DROP

a la connexion, d´econnexion d’un utilisateur :
- LOGON
- LOGOFF

démarrage ou arrˆet d’une instance :
- STARTUP
- SHUTDOWN
*/

--Durée d'activité d'un trigger ?--
/*
L’action associée à un déclencheur est un bloc PL/SQL enregistré dans la base.
Un déclencheur est opérationnel jusqu’à la suppression de la table à laquelle il est lié.
*/

--syntaxe d'un trigger ?--
/*
CREATE [OR REPLACE] TRIGGER [schema.]nomTrigger
{ BEFORE | AFTER |INSTEAD OF } listeEvenement ON nomTable
[FOR EACH ROW]
[ WHEN condition]
corpsTrigger
*/

/*
CREATE [OR REPLACE] TRIGGER nomTrigger
{ BEFORE | AFTER |INSTEAD OF } listeEvenement ON nomTable
BEGIN
corpsTrigger
END;
*/

--/////////////////////////////////////////////////////////////////////--

--Exemple :--

create or replace trigger trigEtud1
before update on etudiant
begin
    DBMS OUTPUT.PUT LINE('Mise `a jour de la table etudiant');
end;


--Explication :--
/*
CREATE [OR REPLACE] TRIGGER trigEtud1 : on déclare le trigger trigEtud1
BEFORE UPDATE ON etudiant : on déclenche le trigger avant une mise à jour de la table etudiant
BEGIN : début du trigger
DBMS OUTPUT.PUT LINE('Mise `a jour de la table etudiant'); : affiche un message
END; : fin du trigger
*/

--Exemple 2:--

create or replace trigger trigEtud2
before update on etudiant FOR EACH ROW
begin
    DBMS OUTPUT.PUT LINE('Mise à jour une ligne de la table etudiant');
end;

--Explication :--
/*
CREATE [OR REPLACE] TRIGGER trigEtud2 : on déclare le trigger trigEtud2
BEFORE UPDATE ON etudiant FOR EACH ROW : on déclenche le trigger avant une mise à jour d'une ligne de la table etudiant
BEGIN : début du trigger
DBMS OUTPUT.PUT LINE('Mise à jour une ligne de la table etudiant'); : affiche un message
END; : fin du trigger
*/

--Exemple 3:--

create or replace trigger trigEtud
before insert or update on etudiant FOR EACH ROW
begin
    if inserting then
        if user!='AVILNAT' then
            raise application error(-20001,'Utilisateur non autorisé');
            DBMS OUTPUT.PUT LINE('Utilisateur autorisé : '||user);
        end if;
    end if;
    if updating then
        DBMS OUTPUT.PUT LINE('Mise `a jour une ligne de la table etudiant');
    end if;
end;

--Explication :--
/*
CREATE [OR REPLACE] TRIGGER trigEtud : on déclare le trigger trigEtud
BEFORE INSERT OR UPDATE ON etudiant FOR EACH ROW : on déclenche le trigger avant une insertion ou une mise à jour d'une ligne de la table etudiant
BEGIN : début du trigger
IF INSERTING THEN : si on insère une ligne
IF USER!='AVILNAT' THEN : si l'utilisateur n'est pas AVILNAT
RAISE APPLICATION ERROR(-20001,'Utilisateur non autorisé'); : on lève une exception
DBMS OUTPUT.PUT LINE('Utilisateur autorisé : '||user); : affiche un message
END IF;
END IF;
IF UPDATING THEN : si on met à jour une ligne
DBMS OUTPUT.PUT LINE('Mise `a jour une ligne de la table etudiant'); : affiche un message
END IF;
END; : fin du trigger
*/

--Exemple 4:--

create or replace trigger traceEtudiant
    after update or delete on etudiant FOR EACH ROW
begin
    insert into auditEtudiant values
        (SYSDATE, :old.NumEtudiant,:old.nom,:old.prenom,:old.moyenne);
end;

--Explication :--
/*
CREATE [OR REPLACE] TRIGGER traceEtudiant : on déclare le trigger traceEtudiant
AFTER UPDATE OR DELETE ON etudiant FOR EACH ROW : on déclenche le trigger après une mise à jour ou une suppression d'une ligne de la table etudiant
BEGIN : début du trigger
INSERT INTO auditEtudiant VALUES : on insère dans la table auditEtudiant
(SYSDATE, :old.NumEtudiant,:old.nom,:old.prenom,:old.moyenne); : les valeurs de la ligne supprimée
END; : fin du trigger
*/

--Exemple 5:--

create or replace trigger moyenneMax
    after update on etudiant FOR EACH ROW
    when (new.moyenne > 2*old.moyenne) → ici pas de :
begin
    insert into alerte values
    (SYSDATE, :old.NumEtudiant,'Moyenne a plus que doublé');
end;

--Explication :--
/*
CREATE [OR REPLACE] TRIGGER moyenneMax : on déclare le trigger moyenneMax
AFTER UPDATE ON etudiant FOR EACH ROW : on déclenche le trigger après une mise à jour d'une ligne de la table etudiant
WHEN (new.moyenne > 2*old.moyenne) : si la nouvelle moyenne est supérieur au double de l'ancienne moyenne
BEGIN : début du trigger
INSERT INTO alerte VALUES : on insère dans la table alerte
(SYSDATE, :old.NumEtudiant,'Moyenne a plus que doublé'); : les valeurs de la ligne supprimée
END; : fin du trigger
*/

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--