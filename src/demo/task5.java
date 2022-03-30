package demo;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    static Scanner sc = new Scanner(System.in);
    static int totalResult = 0;
    static int number = sc.nextInt();
    static int[] arr = new int[number];

    public static void main(String[] args) {
        for (int i = 0; i < number; i++) arr[i] = i + 1;
        permute(arr, 0);
        System.out.println(totalResult);
    }

    public static void permute(int[] arr, int k) {
        for (int i = k; i < arr.length; i++) {
            swap(arr, i, k);
            permute(arr, k + 1);
            swap(arr, k, i);
        }
        if (k == arr.length - 1) {
            if (isCorrect(arr, 1)) {
                System.out.println(Arrays.toString(arr) + " ");
                totalResult = totalResult + 1;
            }
        }
    }

    private static boolean isCorrect(int[] arr, int i) {
        if (i + 2 >= number) return true;
        if (arr[i] < arr[i + 2]) {
            return isCorrect(arr, i+2);
        }
        return false;
    }


    public static void swap(int[] arr, int numOne, int numTwo) {
        int t = arr[numOne];
        arr[numOne] = arr[numTwo];
        arr[numTwo] = t;
    }
}



