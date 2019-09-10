package MethodOvverload;

public class OverloadMethods {
    public static double powerOf(int x, int y) {
        double num = 1;
        for (int i = 1; i <= y; i++) {
            num = num * x;
        }

        return num;
    }

    public static double powerOf(double x, int y) {
        double num = 1;
        for (int i = 1; i <= y; i++) {
            num = num * x;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(powerOf(2, 3));

    }
}
