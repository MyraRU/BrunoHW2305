package HW4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneNumber phoneNumber1 = new PhoneNumber(9312902018L,"Личный");

        PhoneNumber phoneNumber2 = new PhoneNumber(89210968968L,"Рабочий");


        phoneNumber1.print();
        phoneNumber2.print();
//        System.out.println(phoneNumber2.getNum());
//        phoneNumber2.changeType("Домашний");
//        phoneNumber2.print();

    }
}
