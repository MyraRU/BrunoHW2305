package Hw2_2505;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите целое число:");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i >= 1 && i <= 100 || i >= -1000 && i <= -100){
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
