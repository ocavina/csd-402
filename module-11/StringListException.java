// Oscar Avina
// 08/1/2026
// Module 11.3 Assignment
// This program uses an ArrayList to store a list of zoo animals and handles selections that are outside the list.

import java.util.ArrayList;
import java.util.Scanner;

public class StringListException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> zooAnimals = new ArrayList<String>();

        // adds 10 zoo animals to the ArrayList
        zooAnimals.add("Lion");
        zooAnimals.add("Tiger");
        zooAnimals.add("Elephant");
        zooAnimals.add("Giraffe");
        zooAnimals.add("Zebra");
        zooAnimals.add("Gorilla");
        zooAnimals.add("Panda");
        zooAnimals.add("Penguin");
        zooAnimals.add("Flamingo");
        zooAnimals.add("Rhinoceros");

        // displays each animal along with its index number
        int elementNumber = 0;

        for (String animal : zooAnimals) {
            System.out.println(elementNumber + ": " + animal);
            elementNumber++;
        }

        // asks the user which animal they would like to see again and stores the input in a variable
        System.out.print(
            "Enter the number of the animal you would like to see again: "
        );
        String userSelection = input.nextLine();

        // trys to convert the user's response and display the chosen animal
        try {
            int selectedNumber = Integer.parseInt(userSelection);
            // changes the int into an integer object
            Integer boxedNumber = selectedNumber;
            // changes the integer object back into an int
            int selectedIndex = boxedNumber;

            System.out.println(
                "Selected animal: " + zooAnimals.get(selectedIndex)
            );
        }
        catch (Exception exception) {
            // displays this message when the user enters an invalid selection
            System.out.println("Exception has been thrown. Out of Bounds.");
        }

        input.close();
    }
}