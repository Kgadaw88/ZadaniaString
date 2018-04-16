import java.util.Scanner;

/**
 *  Odczytaj dany wyraz z konsoli  oraz liczbę  naturalną n. Nasz program powinien zwrócić n ostatnich znaków wyrazu.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int var = input.nextInt();

        System.out.println(word.substring(word.length()-var));
    }
}
