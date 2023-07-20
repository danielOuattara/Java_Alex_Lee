package java_Basics_02;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _07_Read_Write_File_1 {
    public static void main(String[] args) {

        // -------------------- create a file
        System.out.println("Creating file ...");
        try {
            File myFile = new File("src/studentsList.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created : " + myFile.getName());
            } else {
                System.out.println(" File " + myFile.getName() + " already created");
            }

            System.out.println("Done ! ");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        //  -------------------- write to file
        System.out.println(" Writing to file ... ");

        try {
            FileWriter writeToFile = new FileWriter("src/studentsList.txt");
            writeToFile.write("Files in Java might be tricky, but it is fun enough!\n");
            writeToFile.write("Lorem ipsum from a generator find on the internet\n");
            writeToFile.write("Learning Java is a bit hard but the play is worthy!\n");
            writeToFile.close();

            System.out.println("Done ! ");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        //  -------------------- read a file
        System.out.println(" Reading file ...");
        try {
            File myFile = new File("src/studentsList.txt");
            Scanner fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();

            System.out.println("Done ! ");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


}
