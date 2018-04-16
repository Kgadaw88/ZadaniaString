import java.util.Scanner;

/**
 *  Odczytaj wprowadzony wyraz przez użytkowika i sprawdź czypierwsza litera wyrazu jest taka sama jak ostatnia.
 *  Wypisz odpowiednikomunikat.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        char litera1 = word.charAt(0);
        char litera2 = word.charAt(word.length()-1);


        System.out.println(litera1==litera2);
    }
}
