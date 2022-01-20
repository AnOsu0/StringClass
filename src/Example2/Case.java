package Example2;

import java.util.Locale;
import java.util.Scanner;

public class Case {
    static Scanner sc = new Scanner(System.in);

    public static String changeCase (){
        String text = sc.nextLine();
        char firstletter = text.charAt(0);
        if (Character.isUpperCase(firstletter)){
            return text.toUpperCase();
        } else if (Character.isLowerCase(firstletter)){
            return text.toLowerCase();
        } else {
            return text;
        }
    }
}
