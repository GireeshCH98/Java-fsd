//Write a program in Java to right rotate an array by 5 steps
package phase1.PracticeProject20;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array: " + Arrays.toString(array));

        int rotateSteps = 5;
        rightRotate(array, rotateSteps);

        System.out.println("Array after right rotation by " + rotateSteps + " steps: " + Arrays.toString(array));
    }

    public static void rightRotate(int[] arr, int steps) {
        int length = arr.length;
        steps %= length; // Ensure steps is less than array length

        // Create a temporary array to store the rotated elements
        int[] temp = new int[steps];

        // Copy the last 'steps' elements to temp array
        for (int i = 0; i < steps; i++) {
            temp[i] = arr[length - steps + i];
        }

        // Shift the remaining elements to the right by 'steps' positions
        for (int i = length - steps - 1; i >= 0; i--) {
            arr[i + steps] = arr[i];
        }

        // Copy the elements from temp array to the beginning of the original array
        for (int i = 0; i < steps; i++) {
            arr[i] = temp[i];
        }
    }
}

