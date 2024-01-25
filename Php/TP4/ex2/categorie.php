<?php
require_once ("../ex3/objet.php");
class categorie{
    protected $numCategorie;
    protected $nomCategorie;
    protected $descriptif;

    //constructeur
    public function __construct($numCategorie, $nomCategorie, $descriptif)
    {
        $this->numCategorie = $numCategorie;
        $this->nomCategorie = $nomCategorie;
        $this->descriptif = $descriptif;
    }

    //methode to string
    public function __toString()
    {
        return "Categorie " . $this->nomCategorie . " (" . $this->descriptif . ")";
    }
}
?>