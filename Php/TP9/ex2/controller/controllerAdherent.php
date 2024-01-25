<?php
require_once('../model/adherent.php');
require_once('controllerObjet.php');
class controllerAdherent extends controllerObjet{
    protected static $classe = "adherent";
    protected static $identifiant = "login";

    protected static $champs = array(
        "login" => ["Text", "identifiant"],
        "mdp" => ["password", "mot de passe"],
        "nomAdherent" => ["Text", "nom"],
        "prenomAdherent" => ["Text", "prénom"],
        "email" => ["email", "email"],
        "telephone" => ["Text", "téléphone"],
    );
}
?>