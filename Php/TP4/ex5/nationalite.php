<?php
require_once ("./objet.php");
class nationalite extends objet
{
    protected static $classe = 'nationalite';
    protected $numNationalite;
    protected $nomNationalite;
    protected $nomAbrege;

    function __construct($numNationalite = null, $nomNationalite = null, $nomAbrege = null) {
        if(!is_null($numNationalite)){
            $this->numNationalite = $numNationalite;
            $this->nomNationalite = $nomNationalite;
            $this->nomAbrege = $nomAbrege;
        }
    }

    public function __toString()
    {
        return "Nationalité " . $this->nomNationalite;
    }
}
?>