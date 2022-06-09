package HW4;

public class PhoneNumber {

    long num;
    String numType;

    public PhoneNumber() {
        numType = "";
    }

    public PhoneNumber(long num, String numType) {
        String s = String.valueOf(num);

        if (s.length() == 11 && s.indexOf('8') == 0) {
            this.num = Long.parseLong(s);
        } else {
            System.out.println("Num incorrect");
        }
        this.numType = numType;
    }

    public void print() {
        System.out.println(num + " " + numType);
    }

    public void changeType(String numType) {
        this.numType = numType;
    }

    public long getNum() {
        return num;
    }
}
