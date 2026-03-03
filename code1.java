import java.util.Scanner;

public class PlusPetitNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des deux entiers
        System.out.print("Entrez le premier entier : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = scanner.nextInt();

        // Affichage des valeurs saisies
        System.out.println("Premier entier : " + nombre1);
        System.out.println("Deuxième entier : " + nombre2);

        // Recherche du plus petit
        int plusPetit;

        if (nombre1 < nombre2) {
            plusPetit = nombre1;
        } else {
            plusPetit = nombre2;
        }

        // Affichage du résultat
        System.out.println("Le plus petit nombre est : " + plusPetit);

        scanner.close();
    }
}