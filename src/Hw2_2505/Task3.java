package Hw2_2505;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите целое число:");

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        if (i > 0) {
            while (i > 0){
                System.out.println("Цикл while");
                i--;

            }
        } else {
            while (i < 0){
                System.out.println("Цикл while");
                i++;
            }
        }
    }
}
