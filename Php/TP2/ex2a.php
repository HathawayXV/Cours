<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Exercice 2</title>
</head>
<body>
<h1>Palmarès de la coupe du monde de football depuis 2002</h1>
<?php
    $capital = array(10000);

    for($i = 1 ; $i <= 10 ; $i++){
            $temp = $capital[$i - 1] * 1.05;
            $capital[$i] = floor($temp);
    }

    echo "<pre>"; print_r($capital); echo "</pre>"; // affichage du tableau
?>
</body>
</html>