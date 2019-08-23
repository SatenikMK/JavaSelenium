public class Deposit {
    public static void finalAmount(double initialAmount, int days, double percent) {
        double plusAmount = initialAmount * percent / 100 * days / 365;
        if (plusAmount < 0) {
            System.out.println("Please add valid values");
        } else {
            System.out.println(initialAmount + plusAmount);
        }
    }
    public static void main(String args []){

        finalAmount(100,16,12);

    }
}
