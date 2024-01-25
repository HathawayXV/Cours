<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>Exercice 2 TP4</title>
</head>

<body>
    <h1>Voici la liste de nos catégories</h1>
    <?php
    require_once ("categorie.php");
    $categorie1 = new categorie(
        numCategorie: 1,
        nomCategorie: "western",
        descriptif: "On y retrouve les mêmes éléments que dans les films du même genre. Cow-boys, Indiens, shérifs, saloons, Ouest américain, colts et stetsons en font partie intégrante."
    );
    $categorie2 = new categorie(
        numCategorie: 2,
        nomCategorie: "humoristique",
        descriptif: "Les auteurs de ce genre déploient le comique de situation, la parodie, l\'autodérision, l\'humour noir, le délire.'"
    );

    echo '<ol><li>' . $categorie1->__toString() . '</li><li> ' . $categorie2->__toString() . '</li></ol>';
    ?>
</body>

</html>