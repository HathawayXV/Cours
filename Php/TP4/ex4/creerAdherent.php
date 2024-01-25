<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>Exercice 2, 1 TP4</title>
</head>

<body>
    <h1>Affichage du $_GET</h1>
    <?php
	require_once ("./adherent.php");
	$adherentget = new adherent(
		login: $_GET['login'],
		password: $_GET['mdp'],
		nomAdherent: $_GET['nom'],
		prenomAdherent: $_GET['prenom'],
		email: $_GET['email'],
		telephone: $_GET['telephone']
	);

	echo '<pre>';
	echo print_r($adherentget);
	echo '</pre>';

    echo '<h1>Affichage de l adherent</h1>';

	echo '<p>L adherent ' . $adherentget->__toString() . '</p>';
    echo '<ul><li>login : ' . $adherentget->get('login') . '</li>';
	echo '<li>email : ' . $adherentget->get('email') . '</li>';
	echo '<li>telephone : ' . $adherentget->get('telephone') . '</li>';
    ?>
	<a href="./formulaireCreationAdherent.html">retour au formulaire précédent</a>
</body>

</html>