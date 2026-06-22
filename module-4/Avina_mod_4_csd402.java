// Oscar Avina
// 06/21/2026
// Module 4.2 Assignment
// This program calculates and displays averages of arrays

public class Avina_mod_4_csd402 {
    public static void main(String[] args) {
        // creates the different arrays to use
        short[] shortArray = {1, 2, 3, 4, 5, 6, 7};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {1000, 2000, 3000, 4000, 5000};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        // displays the short array and its average
        System.out.print("The Short array values are: ");
        for (int i = 0; i < shortArray.length; i++) { // loops through the short array to display its values. similar loops are used for the other arrays as well
            System.out.print(shortArray[i] + " ");
        }
        System.out.println();
        System.out.println("Short array average is: " + average(shortArray)); // calls the average method for the short array. similar calls are used for the other arrays as well
        System.out.println();

        // displays the int array and its average
        System.out.print("The Int array values are: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Int array average is: " + average(intArray));
        System.out.println();

        // displayd the long array and its average
        System.out.print("The Long array values are: ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();
        System.out.println("Long array average is: " + average(longArray));
        System.out.println();

        // displays the double array and its average
        System.out.print("The Double array values are: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
        System.out.println("Double array average is: " + average(doubleArray));
    }

    // returns the average of a short array
    public static short average(short[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) { // loops through the short array to calculate the sum of its values. similar loops are used for the other arrays as well
            sum += array[i];
        }
        return (short)(sum / array.length); // returns the average of the short array. similar return statements are used for the other arrays as well
    }

    // returns the average of an int array
    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // return the average of a long array
    public static long average(long[] array) {
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // return the average of a double array
    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}