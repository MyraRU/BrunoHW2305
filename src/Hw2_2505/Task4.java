package Hw2_2505;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите целое, положительное число:");

        Scanner sc = new Scanner(System.in);
        int[] ints = new int[sc.nextInt()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 11;
        }

        System.out.println(Arrays.toString(ints));
    }
}
