import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Odczytaj imię i nazwisko danej osoby, na ekran wypisz imię inazwisko razem.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj swoje imię ");
        String name = input.nextLine();

        System.out.println("Podaj swoje nazwisko ");
        String lastName = input.nextLine();

        System.out.println("Twoje imię i nazwisko to " + name + " " + lastName);
    }
}
