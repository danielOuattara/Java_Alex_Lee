package java_Basics_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_13_While_Loops {
    public static void main(String[] args) {
        //-------------------------------
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("-------------------------------");
        int counter2 = 0;
        do {
            System.out.println(counter2);
            counter2++;
        } while (counter2 < 10);

        System.out.println("-------------------------------");
        String sentence = "flapjacks are awesome!";
        Scanner scanner = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        System.out.println(words);

    }
}
