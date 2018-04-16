import java.util.Scanner;

/**
 * Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe.
 */
public class Zdanie8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszy wyraz");
        String wyraz1 = input.nextLine();

        System.out.println("Podaj drugi wyraz");
        String wyraz2 = input.nextLine();

        System.out.println(wyraz1.equals(wyraz2));
    }
}
