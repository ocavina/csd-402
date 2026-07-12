// Oscar Avina
// 07/12/2026
// Module 8.2 Assignment
// This program stores integers in an ArrayList and finds the largest value.

import java.util.ArrayList;
import java.util.Scanner;

public class OscarArrayListTest {

    public static Integer max(ArrayList list) {
        // returns the largest value in the ArrayList, or 0 if the ArrayList is empty
        if (list.isEmpty()) {
            return 0;
        }
        // uses the first element as the initial largest value
        Integer largestValue = (Integer) list.get(0);

        // compares the remaining elements to the current largest value
        for (int index = 1; index < list.size(); index++) {
            Integer currentValue = (Integer) list.get(index);

            if (currentValue > largestValue) {
                largestValue = currentValue;
            }
        }
        return largestValue;
    }

    // main method to test the method with user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        int enteredValue;

        // reads and stores integers, including the ending value of 0
        do {
            System.out.print("Enter an integer (enter '0' to stop): ");
            enteredValue = input.nextInt();
            integerList.add(enteredValue);
        } while (enteredValue != 0);

        // calls the method and displays the returned largest value
        Integer largestValue = max(integerList);
        System.out.println("The largest value in your list is: " + largestValue);

        System.out.println();

        // tests the max method with an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        System.out.println("This is a test for an empty list: " + max(emptyList));
    }
}