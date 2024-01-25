<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>des données de la base</title>
</head>
<body>
    <?php

    require_once ("adherent.php");
    require_once ("bd.php");
    require_once ("connexion.php");

    connexion::connect();

    $requete = "SELECT * FROM bd LIMIT 5;";

    $resultat = connexion::pdo()->query($requete);

    $resultat->setFetchMode(PDO::FETCH_CLASS, 'bd');

    $tableau = $resultat->fetchAll();

    echo "<h2> les 5 premières entrées de la table bd </h2>";
    echo "<ul>";
    foreach ($tableau as $uneBD) {
        echo "<li>$uneBD</li>";
    }
    echo "</ul>";

    //pour les adhérents
    echo "<br>";
    echo "<h2> les 5 premières entrées de la table adhérent </h2>";
    $requete = "SELECT * FROM adherent;";

    $resultat = connexion::pdo()->query($requete);

    $resultat->setFetchMode(PDO::FETCH_CLASS, 'adherent');

    $tableau = $resultat->fetchAll();

    echo "<ul>";
    foreach ($tableau as $uneBD) {
        echo "<li>$uneBD</li>";
    }
    echo "</ul>";


    ?>
</body>
</html>
