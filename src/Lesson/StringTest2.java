package Lesson;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {

        String word = "  jeden dwa trzy cztery pięć sześć siedem";
        String sub = word.substring(2,7);
        System.out.println(sub);
        String rep = word.replaceAll("dwa","he he");
        System.out.println(rep);
        String trim = word.trim();
        System.out.println(trim);
        char let = word.charAt(4);
        System.out.println(let);
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        String[] split = word.trim().split(" ");
//        String[] split = trim.split(" "); to jest to samo co wiersz wyżej
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));


//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//
//        String[] letter = new String[word.length()];
//        for (int i = 0; i < word.length(); i++) {
//            letter[i] = word.substring(i, (i + 1));
//        }
//        for (int i = 1; i <= word.length(); i++) {
//            System.out.print(letter[letter.length-i]);
//
//        }
    }
}

