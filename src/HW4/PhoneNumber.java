package HW4;

public class PhoneNumber {

    int num;
    String numType;

    public PhoneNumber() {
        numType = "";
    }

    public PhoneNumber(int num, String numType) {
        this.num = num;
        this.numType = numType;
    }

    public void print(){
        System.out.println(num + " " + numType);
    }

    public void changeType(String numType){
        this.numType = numType;
    }

    public int getNum(){
        return num;
    }



}
