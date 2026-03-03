
import java.util.Scanner;

public class Presentation{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Déclaration des variables
        System.out.print("Entrez votre nom");
        String nom = sc.nextLine();
        System.out.print("Entrez votre taille ");
        double taille = sc.nextFloat();
        System.out.print("Entrez votre Age");
        int age = sc.nextInt();

        // Affichage de la phrase
        System.out.println("Je m'appelle " + nom + 
                           ", je mesure " + taille + 
                           " m et j'ai " + age + " ans.");
        sc.close();
    }
}