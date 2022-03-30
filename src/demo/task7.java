package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        long num = 9876543210L;

        while (isNum(num, input)) {
            num++;
        }

        System.out.println(Math.sqrt(9876543210L));
        System.out.println(num);
    }

    public static boolean isNum(long num, int input) {
        return Math.sqrt(input) % 2 == 0 && unique(num);
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
