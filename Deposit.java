public class Deposit {
    public static double finalAmount(double initialAmount, int days, double percent){
        double plusAmount = initialAmount*percent/100*days/365;
        return initialAmount+plusAmount;
    }
    public static void main(String args []){
        System.out.println(finalAmount(100,16,12));

    }
}
