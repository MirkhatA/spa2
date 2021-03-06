package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task7 {
    public static void main(String[] args) {
        long num = 9876543210L;

        while (!isNum(num)) {
            num--;
        }

        System.out.println(num);
        System.out.println(Math.sqrt(num) % 2 == 0);
    }

    public static boolean isNum(long num) {
        return Math.sqrt(num) % 2 == 0 && unique(num);
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
