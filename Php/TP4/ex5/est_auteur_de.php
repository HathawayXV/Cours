<?php
class est_auteur_de
{
    protected $auteur;
    protected $bd;

    function __construct($numAuteur = null, $numBd = null) {
        if(!is_null($numAuteur)){
            $this->Auteur = $numAuteur;
            $this->Bd = $numBd;
        }
    }

    public function __toString()
    {
        return "Auteur " . $this->auteur . " de BD " . $this->bd;
    }
}
?>