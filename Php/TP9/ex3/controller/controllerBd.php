<?php
require_once('../model/bd.php');
require_once('controllerObjet.php');
class controllerBd extends controllerObjet{
    protected static $classe = "bd";
    protected static $identifiant = "numBd";

    protected static $champs = array(
        "numBd" => ["Number", "numéro de BD"],
        "titreBd" => ["Text", "titre"],
        "prix" => ["Number", "prix"],
        "numAuteur" => ["Number", "numéro d'auteur"],
    );
}
?>