-- Date: 2020-11-05 10:58:00
-- Name: PLSQL CURSEUR
-- Description: Amphi 1
-- Version: 1.0
-- Modified by: HAN Yannick

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--

--Pourquoi PLSQL ?--
/*
- Pour effectuer des traitements de données qui impliquent des transaction complexes
- Pour effectuer un contrôle d'intégrité des données
- Pour stocker dans la base des données les opérations fréquentes
- Pour minimiser le temps d’interaction entre la base de données et la portion interface.
- Pour minimiser l’impact des mises à jour sur une application avec un grand nombre de postes clients.
*/

--La structure d'un bloc PL/SQL :--
/*
- Déclaration des structures et des variables utilisées dans le bloc
- Corp qui contient les instructions à exécuter
- Traitement des exceptions / erreur.
*/

/*
DECLARE
    --Déclaration des variables
BEGIN
    --Instructions
EXCEPTION
    --Gestion des exceptions
END;
*/

--/////////////////////////////////////////////////////////////////////--

--Exemple :--

DECLARE --Déclaration des variables
    nbRealAct NUMBER(5); --Nombre de réalisateurs ayant joué dans leur film
    singulierException EXCEPTION; --Exception levée si un seul réalisateur a joué dans son film
BEGIN --Début du bloc
    SELECT COUNT(distinct A.numIndividu) INTO nbRealAct --Compte le nombre de réalisateurs ayant joué dans leur film
    FROM Film F JOIN Acteur A ON (realisateur=numIndividu) --Jointure entre les tables Film et Acteur
    WHERE F.numFilm=A.numFilm; --Condition de jointure
    IF nbRealAct = 1 THEN RAISE singulierException; END IF; --Si un seul réalisateur a joué dans son film, on lève l'exception singulierException
    DBMS OUTPUT.PUT LINE(nbRealAct||'réalisateurs ont joué dansleur film'); --Affiche le nombre de réalisateurs ayant joué dans leur film
EXCEPTION --Gestion des exceptions
    WHEN singulierException THEN 
    DBMS OUTPUT.PUT LINE('Un seul réalisateur a joué dans son film'); --Affiche un message d'erreur
END;

--Explication :--
/*
DECLARE : on déclare les variables utilisées dans le bloc, pour nous nbRealAct et singulierException;
    nbRealAct : nombre de réalisateurs ayant joué dans leur film par default à 0
    singulierException : exception levée si un seul réalisateur a joué dans son film

BEGIN : début du bloc
    SELECT : On compte le nombre de réalisateurs ayant joué dans leur film et on le stock dans nbRealAct
    IF : Si un seul réalisateur a joué dans son film, on lève l'exception singulierException
    DBMS OUTPUT.PUT LINE : Affiche le nombre de réalisateurs ayant joué dans leur film

EXCEPTION : Gestion des exceptions
    WHEN : Si l'exception singulierException est levée
    DBMS OUTPUT.PUT LINE : Affiche un message d'erreur
*/

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--

--CURSEURS :--
/*
Définition : Un curseur est une structure qui contient les informations suivantes 
    - le texte source de l’instruction SQL
    - le texte compil´e de l’instruction SQL
    - un tampon qui contiendra une ligne du résultat
    - le statut du curseur (ouvert, fermé, etc.)
    - des informations de travail
    - des informations de contrôle
*/

--La structure d'un curseur :--
/*
- utilisation du mots "DECLARE" avant la déclaration du curseur
- déclaration des variables utilisées dans le curseur
- déclaration du curseur a l'aide de son nom suivit d'un "IS"
- SELECT
- FROM
- WHERE
*/

/*
DECLARE
    --Déclaration des variables
CURSOR nomDuCurseur IS
    --Instructions(SELECT, FROM, WHERE);
BEGIN
    --Instructions
END;
*/

--Curseur usage :--
/*
- Ouverture du curseur : OPEN nomDuCurseur;
- Fermeture du curseur : CLOSE nomDuCurseur;
- Récupération des données : FETCH nomDuCurseur INTO nomDeLaVariable/nom de la structure;
*/

--Rappel :--
/*
FETCH : récupère une ligne du résultat de la requête SQL et la stocke dans une variable ou une structure, vous devez déclarer les variables avant de les utiliser.
FOR : permet de parcourir le résultat d’une requête SQL ligne par ligne, vous pouvez crée une variable pendant l'utilisation de la boucle (exemple 2).
*/

--Mise à jour d'un curseur--
/*
- Déclaration d'un curseur FOR UPDATE : CURSOR nomDuCurseur IS SELECT ... FOR UPDATE;
- Mise à jour d'un curseur : UPDATE nomDuCurseur SET ... WHERE ...;
*/

/*
DECLARE
    --Déclaration des variables
CURSOR nomDuCurseur IS
    --Instructions(SELECT, FROM, WHERE);
    FOR UPDATE;
BEGIN
    --Instructions
    UPDATE nomDuCurseur SET ... WHERE ...;
END;
*/

/* Vous pouvez utiliser la fonction CURRENT OF qui permet de faire référence à la ligne courante du curseur. */

--/////////////////////////////////////////////////////////////////////--

--Exemple 1 :--

/* On veut afficher les titres des comédies. */

DECLARE /*Déclaration des variables*/
monNumero ens2004.film.numfilm%type; /*Type de la variable monNumero*/
monTitre ens2004.film.Titre%type; /*Type de la variable monTitre*/
Cursor monCurseur IS /*Déclaration du curseur*/
    /*Instructions*/
    SELECT numfilm, titre
    FROM ens2004.film NATURAL JOIN ens2004.genrefilm
    WHERE codegenre='CO';

/*Suite*/
BEGIN 
OPEN monCurseur ; /* ouverture du curseur */
LOOP /*Boucle*/
    FETCH monCurseur INTO monNumero, monTitre; /*Récupération des données*/
    EXIT WHEN monCurseur%NOTFOUND; /*Sortie de la boucle quand nous avons atteint la fin du curseur*/
    DBMS OUTPUT.PUT LINE(' Son Numéro : ' ||monNumero||' SonTitre : ' ||monTitre) ;
END LOOP; /*Fin de la boucle*/
DBMS OUTPUT.PUT LINE('Voici le nombre total de comédies : '|| monCurseur%rowCount); /*Affiche le nombre total de comédies*/
CLOSE MonCurseur; /*Fermeture du curseur*/
END;

--Exemple 2 : --

DECLARE
cpt NUMBER:= 0; /*Initialisation de la variable cpt à 0*/
Cursor monCurseur IS
    SELECT numfilm, titre
    FROM ens2004.film NATURAL JOIN ens2004.genrefilm
    WHERE codegenre='CO';
BEGIN
FOR ligneCurseur IN monCurseur ; /*Boucle FOR avec ligneCurseur déclarer DANS LA BOUCLE FOR*/
LOOP
    DBMS OUTPUT.PUT LINE(' Son Numéro : ' || ligneCurseur.numFilm || 'SonTitre : ' || ligneCurseur.titre) ; /*Affiche le numéro et le titre du film*/
    cpt:=cpt+1; /*Incrémente cpt de 1*/
END LOOP;
DBMS OUTPUT.PUT LINE('Voici le total des comédies : '||cpt) ; /*Affiche le nombre total de comédies*/
END;

--Exemple 3--
DECLARE
CURSOR inc prime IS
    SELECT * 
    FROM employe
    WHERE emp sal < 3000
    FOR UPDATE; /*Mise à jour du curseur*/
BEGIN
IF r structure.prime < 500 THEN
    UPDATE employe 
        SET prime = prime * 1.2
        WHERE CURRENT OF inc_prime; /*Mise à jour de la ligne courante du curseur*/
    ELSE UPDATE employe
        SET prime = prime * 1.1 
        WHERE CURRENT OF inc_prime; /*Mise à jour de la ligne courante du curseur*/
END IF;
END;

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--
