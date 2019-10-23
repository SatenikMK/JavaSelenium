public class Deposit {
    public static double finalAmount(double initialAmount, int days, double percent) {
        if (initialAmount < 0 || days < 0 || percent < 0) {
            System.out.println("Something went wrong");
            return 0;
        }
        double plusAmount = initialAmount * percent / 100 * days / 365;

        return initialAmount + plusAmount;
    }

    public static void main(Lesson[] args) {

        finalAmount(100, 16, 12);

    }
}
