<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>Exercice 2, 1 TP4</title>
</head>

<body>
    <h1>Voici la liste de nos adhérents</h1>
    <?php
    require_once ("adherent.php");
    $adherent1 = new adherent(
		login: "MatinBio",
		password: "Kylian",
		nomAdherent: "Kylian",
		prenomAdherent: "Chepa",
		email: "dokkan.kiki@gmail.com",
		telephone: '06.12.34.56.78'
	);
    $adherent2 = new adherent(
		login: "thebest",
		password: "myriam",
		nomAdherent: "Sébastien",
		prenomAdherent: "Messaoudi",
		email: "notnull@gmail.com",
		telephone: "0612345678"
	);

    echo '<ol><li> Adhérent ' . $adherent1->__toString() . '</li><li> Adhérent ' . $adherent2->__toString() . '</li></ol>';
    echo '<h1>Quelque détails</h1>';
    echo '<p>L email de l adherent ' . $adherent1->get('login') . ' est ' . $adherent1->get('email') . '</p>';
    echo '<p>Le numero de téléphone de l adherent ' . $adherent2->get('login') . ' est ' . $adherent1->get('telephone') . '</p>';

    ?>
</body>

</html>