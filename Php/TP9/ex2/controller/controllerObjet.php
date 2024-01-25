<?php
require_once('../model/adherent.php');
require_once('../model/serie.php');
require_once('../model/auteur.php');
require_once('../model/categorie.php');
require_once('../model/nationalite.php');
require_once('../model/bd.php');
require_once('../model/etat.php');

class controllerObjet {
    public static function displayAll(){
        $title = "Les " . static::$classe;
        $identifiant = static::$identifiant;
        $classe = static::$classe;
        require_once('../view/debut.php');
        require_once('../view/menu.html');
        $tableau = $classe::getAll();
        require_once('../view/list.php');
        require_once('../view/fin.php');
    }

    public static function displayOne(){
        $title = "un(e) " . static::$classe;
        $id = $_GET[static::$identifiant];
        $classe = static::$classe;
        require_once('../view/debut.php');
        require_once('../view/menu.html');
        $tableau = $classe::getOne($id);
        require_once('../view/detail.php');
        require_once('../view/fin.php');
    }

    public static function delete(){
        $id = $_GET[static::$identifiant];
        $classe = static::$classe;
        $classe::delete($id);
        self::displayAll();
    }

    public static function create(){
        $champs = static::$champs;
        $classe = static::$classe;
        $donnees = array();
        foreach ($_GET as $key => $value) {
            if ($key !== "objet" && $key !== "action") {
                $donnees[$key] = $value;
            }
        }
        $classe::create($donnees); // Change this line
        self::displayAll();
    }

    public static function displayCreationForm(){
        $champs = static::$champs;
        $classe = static::$classe;
        $identifiant = static::$identifiant;
        $title = "Création " .$classe;
        require_once('../view/debut.php');
        require_once('../view/menu.html');
        require_once('../view/formulaireCreation.php');
        require_once('../view/fin.php');
    }
}
?>