<?php
class objet {
    public function get($attribut)
    {
        return $this->$attribut;
    }

    public function set($attribut, $valeur)
    {
        $this->$attribut = $valeur;
    }

    public static function getAll(){
        $classRecuperee = static::class;
        //requete
        $requete = "SELECT * FROM $classRecuperee;";
        //execution
        $resultat = connexion::pdo()->query($requete);
        //recuperation des resultats
        $resultat->setFetchMode(PDO::FETCH_CLASS, $classRecuperee);
        //renvoi du tableau
        $tableau = $resultat->fetchAll();
        //retourne le tableau
        return $tableau;
    }
}
?>