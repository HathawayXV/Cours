/**
 * EX-01
 */
import java.util.Scanner;
import java.util.Random;

public class AfficherSaisir {
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.printf("PI = %2.3f", Math.PI);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int num = sc.nextInt();

        // random 
        Random rd = new Random();
        int val = rd.nextInt(num);
        System.out.println("Votre valeur au hasard compris entre 0 et " + num + " est " + val);

    }
}