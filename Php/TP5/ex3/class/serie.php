<?php
require_once ("objet.php");
class serie extends objet
{
    protected static $classe = 'serie';
    protected $numSerie;
    protected $nomSerie;
    protected $categorie;

    function __construct($numSerie = null, $nomSerie = null, $categorie = null) {
        if(!is_null($numSerie)){
            $this->numSerie = $numSerie;
            $this->nomSerie = $nomSerie;
            $this->categorie = $categorie;
        }
    }

    public function __toString()
    {
        return "Serie " . $this->nomSerie;
    }
}
?>