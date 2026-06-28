// Oscar Avina
// 06/27/2026
// Module 5.2 Assignment
// This program locates the largest and smallest values in two-dimensional arrays

public class Avina_mod_5_csd402 {
    // method to find the location of the largest value in an array of decimal numbers
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0}; // initialize an array to hold the row and column indexes of the largest value found
        double largestValue = arrayParam[0][0];

        // similar loops are used in the other methods as well
        for (int row = 0; row < arrayParam.length; row++) { // outer loop iterates through each row of the array
            for (int column = 0; column < arrayParam[row].length; column++) { // inner loop iterates through each column of the current row
                if (arrayParam[row][column] > largestValue) { // compares the current value to the largest value found so far
                    largestValue = arrayParam[row][column]; // if the current value is larger, update the largest value var
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }

    // this does the exact same thing as the method above, but it accepts an array of integers instead of decimals
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largestValue) {
                    largestValue = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }

    // method to find the location of the smallest value in an array of decimal numbers
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallestValue = arrayParam[0][0];

        // similar loop logic as the above methods, but this time we are looking for the smallest value instead of the largest
        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallestValue) { // compares the current value to the smallest value found so far
                    smallestValue = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }

    // this does the exact same thing as the method above, but it accepts an array of integers instead of decimals
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallestValue) {
                    smallestValue = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }
}