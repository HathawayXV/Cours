-- Date: 2020-11-05 10:58:00
-- Name: PROCEDURE & FONCTION
-- Description: Amphi 1
-- Version: 1.0
-- Modified by: HAN Yannick

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--

--Pourquoi fonction et procédure stockées ?--
/*
- Pour enregistrer des programmes dans le noyau d’Oracle
- Comme une table ou une vue, elles peuvent être utiliséees par d’autres utilisateurs, s’ils ont les droits voulus.
- Stockées sous forme de pseudo-code : pas de nouvelle compilation → efficace
*/

--/////////////////////////////////////////////////////////////////////--

--Procedure :--

--Declaration :--
/*
CREATE [OR REPLACE] PROCEDURE nom procedure [(liste paramètres formels)]
AS | IS
[partie d´eclaration]
BEGIN
...
[EXCEPTION
...]
END [nom procedure];
*/

--Paramètres :--
/*
- TYPE : type de données du paramètre
- IN : paramètre d’entrée
- OUT : paramètre de sortie
- IN OUT : paramètre d’entrée et de sortie
- NOCOPY : pour les paramètres de type RECORD ou TABLE
*/

--/////////////////////////////////////////////////////////////////////--

--Exemple :--

CREATE PROCEDURE realActeursProc (nbFilms NUMBER) IS --Déclaration de la procédure
    nbRealAct NUMBER(5);
    singulierException EXCEPTION;
BEGIN
    SELECT COUNT(distinct A.numIndividu) INTO nbRealAct
        FROM Film F JOIN Acteur A ON (realisateur=numIndividu)
            WHERE F.numFilm=A.numFilm;
    IF nbRealAct > nbFilms THEN --Si un seul réalisateur a joué dans son film, on lève l'exception singulierException
        DBMS OUTPUT.PUT LINE(nbRealAct||' réalisateurs ont joué dans plus de '||nbFilms||'de leurs films');
    ELSE DBMS OUTPUT.PUT LINE('Aucun réalisateur n a joué dans plus de '||nbFilms||'de ses films');
    END IF;
END;

--Explication :--
/*
CREATE PROCEDURE realActeursProc (nbFilms NUMBER) IS : on déclare la procédure realActeursProc avec un paramètre nbFilms
nbRealAct : nombre de réalisateurs ayant joué dans leur film par default à 0
singulierException : exception levée si un seul réalisateur a joué dans son film
*/

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--

--Fonction :--

--Declaration :--
/*
CREATE [OR REPLACE] FUNCTION nom fonction
[(liste param`etres formels)]
RETURN typeRetour AS | IS
[partie d´eclaration]
BEGIN
...
RETURN valeurRetour
...
[EXCEPTION ...]
END [nom fonction];
*/

--Paramètres :--
/*
- partie d´eclaration: similaire à celle d’un bloc PL/SQL
- typeRetour : le type PL/SQL de valeurRetour retournée par la fonction.
- liste de paramètres : idem procédures, mais IN préférable dans les fonctions!!!
*/

--/////////////////////////////////////////////////////////////////////--

--Exemple :--

-- On cherche toujours les r´ealisateurs qui ont jou´e dans plus de nbFilms de leurs films...

CREATE FUNCTION nbRealActeurFonc (nbFilms NUMBER)
RETURN NUMBER IS
    nbRealAct NUMBER(5) := 0 ;
BEGIN
    SELECT COUNT(distinct A.numIndividu) INTO nbRealAct
        FROM Film F JOIN Acteur A ON (realisateur=numIndividu)
            WHERE F.numFilm=A.numFilm;
    RETURN nbRealAct;
END;

--Explication :--
/*
CREATE FUNCTION nbRealActeurFonc (nbFilms NUMBER) : on déclare la fonction nbRealActeurFonc avec un paramètre nbFilms
nbRealAct : nombre de réalisateurs ayant joué dans leur film par default à 0
*/

--Appel de la fonction :--
/*
- nom procedure [(liste de paramétres effectifs)];
- nomVariable := nom fonction [(liste de param`etres effectifs)];
*/

--Appel de la fonction 2 --
/*
NbFilm := 20;
nbRealAct := nbRealActeurFonc(NbFilm);
*/

--///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////--