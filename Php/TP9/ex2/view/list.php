<main>
    <ul>
        <?php
            echo "<li>$identifiant</li>";
            foreach ($tableau as $val) {
                $id = $val->get($identifiant);
                $lienDetails = "<a href='routeur.php?objet=$classe&action=displayOne&$identifiant=$id'>détails</a>";
                $btnSupp = "<a href='routeur.php?objet=$classe&action=delete&$identifiant=$id'>🗑️</a>";
                echo "<li>$classe {$val->get($identifiant)} | $lienDetails | $btnSupp</li>";
            }
        ?>
    </ul>
</main>