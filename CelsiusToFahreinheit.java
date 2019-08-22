public class CelsiusToFahreinheit {
    public static double convertToFahrenheit(double temp){
        return (temp*5/9) + 32;
    }
    public static void main(String args []){
       double temp = 102;
        System.out.println(convertToFahrenheit(temp));
    }

}
