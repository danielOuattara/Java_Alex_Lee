package java_Basics_02;

import java.util.Arrays;


class Student {
    String name;
    int grade;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}


public class _25_Methods_Chaining {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name.toUpperCase().charAt(0));
        System.out.println(Arrays.toString(name.toUpperCase().split(" ")));

        String firstName = "Mike";
        String lastName = " Tyson";

        System.out.println(firstName.concat(lastName));

        //=========================================================

        Student student = new Student();
        student.setGrade(99).setName("Bob");

    }
}
