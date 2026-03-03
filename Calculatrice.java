import java.util.Scanner;

    public class Calculatrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Demander les deux nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = sc.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = sc.nextDouble();

        // Demander l'opération
        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = sc.next().charAt(0);

        double resultat;

        switch(operation) {

            case '+':
                resultat = nombre1 + nombre2;
                System.out.println("Résultat : " + resultat);
                break;

            case '-':
                resultat = nombre1 - nombre2;
                System.out.println("Résultat : " + resultat);
                break;

            case '*':
                resultat = nombre1 * nombre2;
                System.out.println("Résultat : " + resultat);
                break;

            case '/':
                if(nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                    System.out.println("Résultat : " + resultat);
                } else {
                    System.out.println("Erreur : division par zéro impossible.");
                }
                break;

            default:
                System.out.println("Opération invalide !");
        }

        sc.close();
    }
}


