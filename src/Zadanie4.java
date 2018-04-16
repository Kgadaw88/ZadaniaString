import java.util.Scanner;

/**
 *  Odczytaj wyraz i sprawdź czy pierwszy znak Stringa to cyfra.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(word.matches("\\d+.*"));
    }
}