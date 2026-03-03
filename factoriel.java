import java.util.Scanner;

public class factoriel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Le factoriel n'est pas défini pour les nombres négatifs.");
        } else {
            long factoriel = 1;

            for (int i = 1; i <= n; i++) {
                factoriel *= i;
            }

            System.out.println("Le factoriel de " + n + " est : " + factoriel);
        }

        scanner.close();
    }
}