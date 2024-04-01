//Write a program in Java to find the sum of n number of elements in the range of L and R where 0 <= L <= R <= n-1
package phase1.PracticeProject22;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of L (0 <= L <= n-1): ");
        int L = scanner.nextInt();

        System.out.print("Enter the value of R (0 <= R <= n-1): ");
        int R = scanner.nextInt();

        if (L < 0 || R >= n || L > R) {
            System.out.println("Invalid range");
        } else {
            int sum = 0;
            for (int i = L; i <= R; i++) {
                sum += array[i];
            }
            System.out.println("Sum of elements in the range of L and R: " + sum);
        }

        scanner.close();
    }
}

