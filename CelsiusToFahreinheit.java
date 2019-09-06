public class CelsiusToFahreinheit {
    public static double convertToFahrenheit(double temp) {
        return (temp * 9 / 5) + 32;
    }

    public static void main(Lesson args[]) {
        double temp = 110;
        System.out.println(convertToFahrenheit(temp));
    }

}
