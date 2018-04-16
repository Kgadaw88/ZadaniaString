import java.util.Scanner;

/**
 *  Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m
 */
 public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(word.endsWith("m"));
        System.out.println(word.endsWith("M"));
    }
}
