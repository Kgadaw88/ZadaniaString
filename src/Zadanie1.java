import java.util.Scanner;

/**
 *  Odczytaj wyraz i wypisz długość wprowadonego wyrazu.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz jaki ma zostać odczytany:");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Wyraz " + text + " ma liter: " + text.length());
    }
}
