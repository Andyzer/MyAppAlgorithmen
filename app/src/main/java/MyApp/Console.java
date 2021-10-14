package MyApp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Übungsaufgabe Algorithmen und Datenbanken
 */

public class Console implements IConsole {

    public static void main(String[] args) {
        Console ps4 = new Console();
        int xbox360 = ps4.readInt("What is the meaning of life, the universe and everything? ");
        if (xbox360 == 42) {
            System.out.println("Yes!");
        } else {
            System.out.println("Die, Rebel SCUM!");
        }

        System.out.println(ps4.readStr("Was geht? "));
        System.out.println("Hi");

    }

    public String readStr(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    public int readInt(String text) {
        // Scanner erzeugt
        int result = 0;                                 // 2 variablen deklariert
        boolean noException = false;
        /**
         * while (!noException) => auf break verzichten!
         */
        while (true) {                                  //bis man eine gute antwort hat gehts weiter
            System.out.print(text);
            try {
                Scanner sc = new Scanner(System.in);    // wird versucht, eine Zahl (int) zu lesen
                result = sc.nextInt();
                noException = true;                     // wenns geht, wird es angenommen
            } catch (InputMismatchException e) {        // sonst Ausführung abgebrochen und Exception geworfen

            }
            if (noException) break;                     // wenn keine Exception, schleife beendet
        }
        return result;
    }

    public void write(String s) {
    }

}

