package EX03BIS;

public class Client {

    int Num = 01;
    String Nom;
    String Adresse;

    String getname(){
        return Nom;
    }

    public String toString(){
        String s ="";
        s = s + "Numero : " + Num + "\nNom : " + Nom + "\nAdresse : " + Adresse + '\n';
        return s;
    }

    void information(){
        System.out.println("Nom : " + Nom + "\nAdresse : " + Adresse + "\n Numero : " + Num);
    }

    Client(String nom, String adresse){
        this.Nom = nom;
        this.Adresse = adresse;
        this.Num = Compte.Compteur;
    }

    public static void main(String[] args) {
        Client  Yannick = new Client("Yannick", "123456789");

    }
}
