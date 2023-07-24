package java_Basics_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _12_Try_Catch_Test {
    public static void main(String[] args) {

//        int[] first_prime_numbers = null;
        int[] first_prime_numbers = {2, 3, 5, 7};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index integer :");

        try {
            int user_index_input = scanner.nextInt();
            System.out.println("you typed in : " + user_index_input);
            System.out.println("You requested the prime number : " + first_prime_numbers[user_index_input] + "\nDone");

        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("InputMismatchException Error ");
            System.out.println("Your input is not valid integer...\nEnter an integer between 0 and 3");

        } catch (NullPointerException e) {
            System.out.println("NullPointerException Error ");
            System.out.println("Your input is not valid...\nEnter an integer between 0 and 3");

        } catch (ArrayIndexOutOfBoundsException e) {
            int upperIndex = first_prime_numbers.length - 1;
            System.out.println("ArrayIndexOutOfBoundsException Error : \nEnter an integer between 0 and " + upperIndex);

        } catch (Exception e) {
            System.out.println("Exception Error : Something went wrong !");
        }

        scanner.close();
    }
}
