// Oscar Avina
// 08/1/2026
// Module 11.3 Assignment
// This program adds 10 random numbers to data.file and then reads and displays all the numbers stored in the file.

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RandomNumberFile {

    public static void main(String[] args) {
        File dataFile = new File("data.file");

        try {
            // creates the file if it does not exist
            if (!dataFile.exists()) {
                dataFile.createNewFile();
            }

            // appends the ten random integers separated by spaces
            PrintWriter fileWriter = new PrintWriter(
                    new FileOutputStream(dataFile, true));

            // generates 10 random numbers between 1 and 100 and writes them to the file
            for (int count = 0; count < 10; count++) {
                int randomNumber =
                        (int)(Math.random() * 100) + 1;

                fileWriter.print(randomNumber + " ");
            }

            fileWriter.close();

            // reopens the file, read its contents, and displays them
            Scanner fileReader = new Scanner(dataFile);

            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }

            System.out.println();
            fileReader.close();
        }
        catch (IOException exception) {
            System.out.println(
                    "An IOException has been thrown.");
        }
    }
}