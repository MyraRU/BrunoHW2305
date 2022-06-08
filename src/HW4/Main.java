package HW4;

public class Main {
    public static void main(String[] args) {

        PhoneNumber phoneNumber1 = new PhoneNumber(8800333,"Личный");

        PhoneNumber phoneNumber2 = new PhoneNumber(85553535,"Рабочий");

        phoneNumber2.print();
        System.out.println(phoneNumber2.getNum());
        phoneNumber2.changeType("Домашний");
        phoneNumber2.print();

    }
}
