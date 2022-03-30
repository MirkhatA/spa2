package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int
    }

    public static boolean unique(long num) {
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        while (num > 0) {
            int tempVal = (int) (num % 10);
            set.add(tempVal);
            num = num / 10;
            count++;
        }

        if (count == set.size()) return true;
        else return false;
    }
}


