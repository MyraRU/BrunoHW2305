package Hw2_2505;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");

        Scanner sc = new Scanner(System.in);
        int[] ints = new int[sc.nextInt()];
        int count = 0;

        for (int i = 0; i < ints.length ; i++) {
            System.out.println("Какое число вы хотите положить в ячейку массива под номером: " + i);

            int x = sc.nextInt();

            ints[i] = x;
            count += ints[i];
        }
        System.out.println("Сумма чисел в массиве: " + count);
    }
}
