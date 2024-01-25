<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>des données de la base</title>
</head>
<body>
    <?php

    require_once ("./class/adherent.php");
    require_once ("./class/bd.php");
    require_once ("connexion.php");

    connexion::connect();

    $tableau = bd::getAll();

    echo "<h2> les 5 premières entrées de la table bd </h2>";
    echo "<ul>";
    foreach ($tableau as $uneBD) {
        echo "<li>$uneBD</li>";
    }
    echo "</ul>";

    //pour les adhérents
    echo "<br>";
    echo "<h2> les 5 premières entrées de la table adhérent </h2>";
    $tableau = adherent::getAll();

    echo "<ul>";
    foreach ($tableau as $uneBD) {
        echo "<li>$uneBD</li>";
    }
    echo "</ul>";


    ?>
</body>
</html>
