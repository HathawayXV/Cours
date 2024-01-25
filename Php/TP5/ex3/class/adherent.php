<?php
require_once ("objet.php");
class adherent extends objet
{
    protected static $class = "adherent";
    protected $login;
    protected $password;
    protected $nomAdherent;
    protected $prenomAdherent;
    protected $email;
    protected $telephone;

    //constructeur
    public function __construct($login = null, $password = null, $nomAdherent = null, $prenomAdherent = null, $email = null, $telephone = null)
    {
        if(!is_null($login)){
            $this->login = $login;
            $this->password = $password;
            $this->nomAdherent = $nomAdherent;
            $this->prenomAdherent = $prenomAdherent;
            $this->email = $email;
            $this->telephone = $telephone;
        }
    }

    //methode to string
    public function __toString()
    {
        return "Adhérent " . $this->login . " (" . $this->nomAdherent . " " . $this->prenomAdherent . ")";
    }
}
?>