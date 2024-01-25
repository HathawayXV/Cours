<?php
require_once ("../ex3/objet.php");
class adherent extends objet
{
    protected $login;
    protected $password;
    protected $nomAdherent;
    protected $prenomAdherent;
    protected $email;
    protected $telephone;

    //constructeur
    public function __construct($login, $password, $nomAdherent, $prenomAdherent, $email, $telephone)
    {
        $this->login = $login;
        $this->password = $password;
        $this->nomAdherent = $nomAdherent;
        $this->prenomAdherent = $prenomAdherent;
        $this->email = $email;
        $this->telephone = $telephone;
    }

    //methode to string
    public function __toString()
    {
        return "Adhérent " . $this->login . " (" . $this->nomAdherent . " " . $this->prenomAdherent . ")";
    }
}
?>