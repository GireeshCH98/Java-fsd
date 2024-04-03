package phase1.PracticeProject29;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();
        int[] array = new int[numElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();

        int index = linearSearch(array, searchValue);

        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index: " + index);
        }
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
