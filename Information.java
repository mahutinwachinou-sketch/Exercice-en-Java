import java.util.Scanner;

public class Information {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demander le prénom
        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();

        // Demander l'âge
        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();

        // Affichage
        System.out.println(prenom + ", vous avez " + age + " ans.");

        sc.close();
    }
}