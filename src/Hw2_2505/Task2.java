package Hw2_2505;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));

        doubles[0] = 0.1;
        doubles[1] = 1.2;
        doubles[2] = 2.3;
        doubles[3] = 3.4;
        doubles[4] = 4.5;
        System.out.println(Arrays.toString(doubles));

        doubles[0] = 1.00001;
        doubles[4] = -0.189;
        System.out.println(Arrays.toString(doubles));
    }
}
