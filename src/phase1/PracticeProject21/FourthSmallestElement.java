//Write a program in Java to find the fourth smallest element in an unsorted list
package phase1.PracticeProject21;

import java.util.Arrays;
import java.util.*;

public class FourthSmallestElement {
    public static void main(String[] args) {
        //int[] array = {5, 3, 8, 2, 9, 1, 6, 4, 10, 7}; // Sample unsorted array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
          array[i] = scanner.nextInt();
        }

        // print the array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
          System.out.print(array[i] + " ");
        }
        int fourthSmallest = findFourthSmallest(array);
        
        System.out.println("\nArray after sort: " + Arrays.toString(array));
        System.out.println("Fourth Smallest Element: " + fourthSmallest);
    }

    public static int findFourthSmallest(int[] arr) {
        if (arr.length < 4) {
            System.out.println("Array size is less than 4");
            return -1; // Return -1 if array size is less than 4
        }

        Arrays.sort(arr); // Sort the array

        return arr[3]; // Fourth smallest element (index 3 after sorting)
    }
}

