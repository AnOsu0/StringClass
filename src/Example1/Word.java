package Example1;

import java.util.Scanner;

public class Word {
    static Scanner sc = new Scanner(System.in);

    public static int getInt (){
        int a = sc.nextInt();
        sc.nextLine();
        return a;
    }

    public static StringBuilder showWord (){
        System.out.println("Podaj ile słów chcesz wprowadzić");
        int a = getInt();
        System.out.println("Podaj słowa");
        char[] lastLetters = new char[a];
        for (int i = 0; i < lastLetters.length; i++) {
            String word = sc.nextLine();
            lastLetters[i]=word.charAt(word.length()-1);
        }
        StringBuilder builder = new StringBuilder();
        for (char lastLetter : lastLetters) {
            builder.append(lastLetter);
        }

        return builder;
    }
}
