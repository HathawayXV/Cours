<main>
    <form action="routeur.php" method="get">
        <input type="hidden" name="objet" value="<?php echo $classe; ?>">
        <input type="hidden" name="action" value="create">
        <?php
        foreach ($champs as $champ => $details) {
            echo "<div>";
            echo "<label for=\'$champ\'>$details[1]</label>";
            echo "<input type=\'$details[0]' name='$champ' placeholder=\'$details[1]\' required>";
            echo "</div>";
        }
        ?>
        <button type="submit">Créer</button>
    </form>
</main>