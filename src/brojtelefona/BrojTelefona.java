package brojtelefona;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BrojTelefona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Unesite broj telefona u formatu ***/***-****");

            String  broj    = s.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]{3}/[0-9]{3}-[0-9]{4}$");
            Matcher matcher = pattern.matcher(broj);

            if (matcher.find()) {
                System.out.println("Uneti broj je validan.");

                break;
            }
        }
    }
}
