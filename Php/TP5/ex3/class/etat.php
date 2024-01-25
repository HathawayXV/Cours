<?php
require_once ("objet.php");
class etat extends objet
{
    protected static $classe = 'etat';
    protected $numEtat;
    protected $nomEtat;

    function __construct($numEtat = null, $nomEtat = null) {
        if(!is_null($numEtat)){
            $this->numEtat = $numEtat;
            $this->nomEtat = $nomEtat;
        }
    }

    public function __toString()
    {
        return "Etat " . $this->nomEtat;
    }
}
?>

