package demo;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 0;

        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < number - 3; i++) {
            if (isTriangle(arr[i], arr[i + 1], arr[i + 2], arr[i + 3])) {
                System.out.println("Values: " + arr[i] + " " + arr[i + 1] + " " + arr[i + 2] + " " + arr[i + 3]);
                total++;
            }
        }

        System.out.println("Total result: " + total);
    }

    private static boolean isTriangle(int a, int b, int c, int d) {
        return a + b + c > d && a + c + d > b && a + d + b > c && b + c + d > a;
    }
}
