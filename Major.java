import java.util.Scanner;

public class Major{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }

        sc.close();
    }
}