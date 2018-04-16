/**
 *  Wypisz naekran następujący komunikat (uwzględniając cytat):“Mowa jest srebrem, a milczenie złotem”
 */
public class Zadanie7 {
    public static void main(String[] args) {
        String cytat = String.format("Mowa jest srebrem, a milczenie złotem");

        String c = "0022";
        String quote = String.valueOf(Character.toChars(Integer.parseInt(c, 16))); // wyświetla znaki unicode
        System.out.println(quote + cytat + quote);
    }
}
