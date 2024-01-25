<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Exercice 2</title>
</head>
<body>
<h1>Palmarès de la coupe du monde de football depuis 1930</h1>
<?php
    $tab = array(
        "2022" => "Argentine",
        "2018" => "France",
        "2014" => "Allemagne",
        "2010" => "Espagne",
        "2006" => "Italie",
        "2002" => "Brésil",
        "1998" => "France",
        "1994" => "Brésil",
        "1990" => "Allemagne",
        "1986" => "Argentine",
        "1982" => "Italie",
        "1978" => "Argentine",
        "1974" => "Allemagne",
        "1970" => "Brésil",
        "1966" => "Angleterre",
        "1962" => "Brésil",
        "1958" => "Brésil",
        "1954" => "Allemagne",
        "1950" => "Uruguay",
        "1938" => "Italie",
        "1934" => "Italie",
        "1930" => "Uruguay"
    );

    //$vainqueur = array_unique($tab);
    $vainqueur = array_unique($tab);
    $vainqueur = array_values($vainqueur);

    echo "<pre>"; print_r($vainqueur); echo "</pre>"; // affichage du tableau
?>
</body>
</html>