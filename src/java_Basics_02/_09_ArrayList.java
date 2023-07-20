package java_Basics_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _09_ArrayList {
    public static void main(String[] args) {
        // Array VS ArrayList !

        //---------------------------------

        String[] fruits_1 = new String[3];
        fruits_1[0] = "lemon";
        fruits_1[1] = "papaya";
        fruits_1[2] = "strawberry";
        System.out.println("fruits_1 = " + Arrays.toString(fruits_1));

        //---------------------------------

        String[] fruits_2 = {"mangoes", "bananas", "orange"};
        System.out.println("fruits_2 = " + Arrays.toString(fruits_2));

        //---------------------------------

        ArrayList<String> fruits_3 = new ArrayList<>();
        fruits_3.add("blackberry");
        fruits_3.add("melon");
        fruits_3.add("grapes");
        System.out.println("fruits_3 = " + fruits_3);

        //---------------------------------

        fruits_3.remove(1);
        System.out.println("fruits_3 = " + fruits_3);

        //---------------------------------

        fruits_3.remove("grappes"); // INFO : grappes not defined so Do nothing !!!
        System.out.println("fruits_3 = " + fruits_3);

        //---------------------------------

        fruits_3.remove("grapes");
        System.out.println("fruits_3 = " + fruits_3);

        //---------------------------------

        fruits_3.clear();
        System.out.println("fruits_3 = " + fruits_3);

        //---------------------------------

        fruits_3.add("blackberry"); // duplicate OK
        fruits_3.add("melon");
        fruits_3.add("grapes");
        System.out.println("fruits_3 = " + fruits_3);

        //---------------------------------


        System.out.println("fruits_3 contains melon : " + fruits_3.contains("melon")); // true
        System.out.println("fruits_3 contains melon : " + fruits_3.contains(" water melon")); // false
        System.out.println("fruits_3 at position 2 : " + fruits_3.get(1));

        System.out.println("fruits_3 updated at position 2 : " + fruits_3.set(1, "orange"));
        System.out.println("updated fruits_3 at position 2 : " + fruits_3.get(1));

        System.out.println("fruits_3 size is " + fruits_3.size());

        System.out.println("------------------------------\nloop in fruit_3 :");

        for (String fruit : fruits_3) {
            System.out.println(fruit);
        }

        //----------------------------------------

        System.out.println("-------------------\nSorting ArrayList fruits_3 using Collection utility class :");
        Collections.sort(fruits_3);
        for (String fruit : fruits_3) {
            System.out.println(fruit);
        }


        //---------------------------------
        System.out.println("-------------------");

        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("primeNumbers= " + primeNumbers);
    }
}

