package Hw1_2305;

public class Task2 {
    public static void main(String[] args) {

        int number = 1000;
        number = ((number+3) * 123 - number) * 45;

        if (number > 1_000_000){
            System.out.println("Большое число");
        } else {
            System.out.println("Небольшое число");
        }
    }
}
