<?php
require_once('../model/auteur.php');
require_once('controllerObjet.php');
class controllerAuteur extends controllerObjet{
    protected static $classe = "auteur";
    protected static $identifiant = "numAuteur";

    protected static $champs = array(
        "numAuteur" => ["Number", "numéro d'auteur"],
        "nomAuteur" => ["Text", "nom"],
        "prenomAuteur" => ["Text", "prénom"],
        "nationalite" => ["Text", "nationalité"],
    );

}
?>