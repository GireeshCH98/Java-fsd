package phase1.PracticeProject31;

import java.util.Scanner;

public class ExponentialSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the sorted array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        int index = exponentialSearch(arr, target);

        if (index == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("Target value found at index: " + index);
        }
    }

    private static int exponentialSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int i = 1;
        while (i <= arr.length && arr[i - 1] < target) {
            i *= 2;
        }

        int start = Math.max(i / 2, 0);
        int end = Math.min(i, arr.length);

        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}