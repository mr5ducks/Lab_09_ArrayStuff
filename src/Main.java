import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        //also remember to label each part this is kinda hard to read
        //go through task 3 4 8 7. for some reason they aren't working
        //reread notes
        //get rid of that System.out
        // 1 this is a bit confusing but remember you notes
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        // All my variables min and max write with [] not {}
        int sum = 0;
        int numbers = 0;
        boolean fin = false;
        int position = -1;
        int min = dataPoints[0];
        int max = dataPoints[0];

        // 2
        for (int i = 0; i < dataPoints.length; i++) {
        dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // 3
        for (int i = 0; i < dataPoints.length; i++) {
            if (i > 0) {
            System.out.print("\n | ");
            }
            System.out.print(dataPoints[i]);
        }
        System.out.println();

        // 4
        for (int val : dataPoints) {
            sum += val;
        }

        double average = (double) sum / dataPoints.length;
        System.out.print("\nThe sum of the dataPoints array is= " + sum);
        System.out.print("\nThe average of dataPoints array is= " + average);

        // 5
        int user = SafeInput.getRangedInt(scanner, "Please enter a number", 1, 100);
        System.out.print("\nYou entered= " + user);

        for (int i = 0; i < dataPoints.length; i++) {
        if (dataPoints[i] == user) {
            numbers++;
            }
        }

        // 6
        System.out.print("The value " + user + " was found " + numbers + " time(s) in the dataPoints array.");

        // 7
        int searchValue = SafeInput.getRangedInt(scanner, "Enter another integer to search for", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
        if (dataPoints[i] == searchValue) {
            fin = true;
            position = i;
            break;
            }
        }

        if (fin) {
            System.out.print("The value " + searchValue + " was found at array index " + position + ".");
        } else {
            System.out.print("The value " + searchValue + " was not found in the dataPoints array.");
        }

        // 8
        for (int i = 1; i < dataPoints.length; i++) {
        if (dataPoints[i] < min) {
            min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
            max = dataPoints[i];
            }
        }

        //prints out the min and max
        System.out.print("The minimum value in the dataPoints array is= " + min);
        System.out.print("The maximum value in the dataPoints array is= " + max);

        // 9
        System.out.print("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Method for 9
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}