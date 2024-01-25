<?php
require_once ("objet.php");
class categorie extends objet
{
    protected static $classe = 'categorie';
    protected $numCategorie;
    protected $nomCategorie;
    protected $descriptif;

    //constructeur
    public function __construct($numCategorie = null, $nomCategorie = null, $descriptif = null)
    {
        if(!is_null($numCategorie)){
            $this->numCategorie = $numCategorie;
            $this->nomCategorie = $nomCategorie;
            $this->descriptif = $descriptif;
        }
    }

    //methode to string
    public function __toString()
    {
        return "Categorie " . $this->nomCategorie . " (" . $this->descriptif . ")";
    }
}
?>