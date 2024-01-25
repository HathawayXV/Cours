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

    public static function getAll(){
        //requete
        $requete = "SELECT * FROM est_auteur_de;";
        //execution
        $resultat = connexion::pdo()->query($requete);
        //recuperation des resultats
        $resultat->setFetchMode(PDO::FETCH_CLASS, 'est_auteur_de');
        //renvoi du tableau
        $tableau = $resultat->fetchAll();
        //retourne le tableau
        return $tableau;
    }
}
?>