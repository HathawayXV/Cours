<?php
require_once ("../ex3/objet.php");
class auteur extends objet
{
    protected static $classe = 'auteur';
    protected $numAuteur;
    protected $nomAuteur;
    protected $prenomAuteur;
    protected $nationalite = null;

    //constructeur
    public function __construct($numAuteur = null, $nomAuteur = null, $prenomAuteur = null, $nationalite = null) {
        if(!is_null($numAuteur)){
            $this->numAuteur = $numAuteur;
            $this->nomAuteur = $nomAuteur;
            $this->prenomAuteur = $prenomAuteur;
            $this->nationalite = $nationalite;
            $this->nationalite = $nationalite;
        }
    }

    //methode to string
    public function __toString()
    {
        return "Adhérent " . $this->numAuteur . " (" . $this->nomAuteur . " " . $this->prenomAuteur . ")";
    }
}
?>