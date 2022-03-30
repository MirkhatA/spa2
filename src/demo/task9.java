package demo;

import java.util.Arrays;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 0;

        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < number - 2; i++) {
            if (isTriangle(arr[i], arr[i + 1], arr[i + 2])) {
                System.out.println("Values: " + arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
                total++;
            }
        }

        System.out.println("Total result: " + total);
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
