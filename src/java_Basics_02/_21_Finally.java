package java_Basics_02;

import java.util.Scanner;

public class _21_Finally {
    public static void main(String[] args) {
        try {
            int[] myNumbers_2 = {1, 2, 3};
            System.out.println(myNumbers_2[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong n°1.");
        } finally {
            System.out.println("code execution completed !");
        }

        //---------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer :");
        try {
            int user_input = scanner.nextInt();
            System.out.println("you typed in : " + user_input);
        } catch (Exception e) {
            System.out.println("Your input is not valid...\nEnter an integer");
        } finally {
            scanner.close();
            System.out.println("Done !");
        }
    }
}
