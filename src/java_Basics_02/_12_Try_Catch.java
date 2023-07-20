package java_Basics_02;

import java.util.Scanner;

public class _12_Try_Catch {
    public static void main(String[] args) {

        int[] myNumbers_1 = {1, 2, 3};
        // System.out.println(myNumbers_1[10]); // Exception

        /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
         * at java_Basics_02._12_Try_Catch.main(_12_Try_Catch.java:7)
         */


        //----------------------------------------------------------------

        try {
            int[] myNumbers_2 = {1, 2, 3};
            System.out.println(myNumbers_2[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong n°1.");
        }

        System.out.println("----------------------------------------------------------------");

        try {
            int[] myNumbers_3 = {1, 2, 3};
            System.out.println(myNumbers_3[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong n°2.");
        } finally {
            System.out.println("Try...Catch terminated ! ");
        }

        System.out.println("----------------------------------------------------------------");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer :");
        try {
            int user_input = scanner.nextInt();
            System.out.println("you typed in : " + user_input);
        } catch (Exception e) {
            System.out.println("Your input is not valid...\nEnter an integer");
        }

        System.out.println("----------------------------------------------------------------");

//        int[] first_prime_numbers = null;
        int[] first_prime_numbers = {2, 3, 5, 7};

        scanner = new Scanner(System.in);
        System.out.print("Enter an index integer :");

        int user_index_input = scanner.nextInt();
        System.out.println("you typed in : " + user_index_input);
        try {
            System.out.println("You requested the prime number : " + first_prime_numbers[user_index_input]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Error ");
            System.out.println("Your input is not valid...\nEnter an integer between 0 and 3");

        } catch (ArrayIndexOutOfBoundsException e) {
            int upperIndex = first_prime_numbers.length - 1;
            System.out.println("ArrayIndexOutOfBoundsException Error : \nEnter an integer between 0 and " + upperIndex);
        }
        catch (Exception e) {
            System.out.println("Exception Error : Something went wrong !");
        }

        scanner.close();
    }
}
