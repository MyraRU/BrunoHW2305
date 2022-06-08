package HW5;

public abstract class Plant implements Growing {
    double height;
    double wight;

    public Plant() {
    }

    public Plant(double height, double wight) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public void grow() {
        System.out.println("Я расту");
    }
}
