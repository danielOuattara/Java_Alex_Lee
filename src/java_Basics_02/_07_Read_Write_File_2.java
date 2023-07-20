package java_Basics_02;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _07_Read_Write_File_2 {
    public static void main(String[] args) {


        //  -------------------- read & write to a file
        System.out.println("# Reading file from studentsList.txt AND writing content to newStudentsList.txt ...");
        try {
            File myFile = new File("src/studentsList.txt");
            Scanner fileReader = new Scanner(myFile);

            String studentsListContent = "";
            while (fileReader.hasNextLine()) {
                // System.out.println(fileReader.nextLine());
                studentsListContent = studentsListContent.concat(fileReader.nextLine() + "\n");
            }
            fileReader.close();


            FileWriter writeToFile = new FileWriter("src/newStudentsList.txt");
            writeToFile.write(studentsListContent);
            writeToFile.close();


            System.out.println("# Done ! ");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //--------------------------------- read from new file
        System.out.println("# Reading file newStudentsList.txt");
        try {
            File myFile = new File("src/newStudentsList.txt");
            Scanner fileReader = new Scanner(myFile);

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            System.out.println("# Done ! ");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


}
