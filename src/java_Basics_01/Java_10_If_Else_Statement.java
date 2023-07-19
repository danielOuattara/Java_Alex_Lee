package java_Basics_01;

import java.util.Scanner;

public class Java_10_If_Else_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a grade : ");
        int grade = scan.nextInt();

        System.out.print("Your score is: " + grade + " ");

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("E");
        } else if (grade >= 0 && grade < 50) {
            System.out.println("F");
        } else {
            System.out.println("Score not in range, try again !");
        }

    }


}
