<?php
require_once ("./objet.php");
class bd extends objet
{
    protected $numBd;
    protected $titre;
    protected $anneeParution;
    protected $serie = null;
    protected $rang;
    protected $emprunteur = null;
    protected $etat = null;

    public function __construct($numBd = null, $titre = null, $anneeParution = null, $serie = null, $rang = null, $emprunteur = null, $etat = null) {
        if(!is_null($numBd)){
            $this->numBd = $numBd;
            $this->titre = $titre;
            $this->anneeParution = $anneeParution;
            $this->serie = $serie;
            $this->rang = $rang;
            $this->emprunteur = $emprunteur;
            $this->etat = $etat;
        }
    }

    public function __toString()
    {
        return "BD " . $this->titre . " (" . $this->anneeParution . ")";
    }

}
?>