package MyApp;

import java.util.Scanner;

public class MyAppConsoleMenu {

    public static int menu() {


        int userMenu;

        System.out.println("1. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction. ");
        System.out.println("2. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.");
        System.out.println("3. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.");
        System.out.println("4. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.");
        System.out.println("5. Sieve of Eratosthenes."); //Primfaktorzerlegung
        System.out.println("6. Search for a specific string in Linus Torvald's joke (String-Matching-\n" +
                "Algorithm).");
        System.out.println("0. Exit.");
        System.out.println();

        userMenu = DisplayMenu.inInt("Please enter a number for an option: ");

        switch () {
            case 1:
                System.out.println("You chose 1.");
                break;
            case 2:
                System.out.println("You chose 2.");
                break;
            case 3:
                System.out.println("You chose 3.");
                break;
            case 4:
                System.out.println("You chose 4.");
                break;
            case 5:
                System.out.println("You chose 5.");
                break;
            case 6:
                System.out.println("You chose 6.");
                break;
            case 7:
                System.out.println("Go back.");
                break;
        }

        class DisplayMenu {



        }
    }
}
