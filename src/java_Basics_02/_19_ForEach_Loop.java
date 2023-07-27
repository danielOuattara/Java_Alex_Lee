package java_Basics_02;

import java.util.ArrayList;

public class _19_ForEach_Loop {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("------------------------------");

        for (String cartItem : cars) {
            System.out.println(cartItem);
        }

        System.out.println("------------------------------");

        char[] letters = {'a', 'b', 'c', 'd'};
        for (char singleLetter : letters) {
            System.out.println(singleLetter);
        }

        System.out.println("------------------------------");

        ArrayList<Integer> firstPrimeNumbers = new ArrayList<Integer>();
        firstPrimeNumbers.add(2);
        firstPrimeNumbers.add(3);
        firstPrimeNumbers.add(5);
        firstPrimeNumbers.add(7);

        for (int i = 0; i < firstPrimeNumbers.size(); i++) {
            System.out.println(firstPrimeNumbers.get(i));
        }

        System.out.println("---");

        for (Integer singlePrimeNumber : firstPrimeNumbers) {
            System.out.println(singlePrimeNumber);
        }
    }
}
