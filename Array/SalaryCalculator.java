package Array;

public class SalaryCalculator {
    public double netSalary(double grossSalary) {
        double militaryFee = 1000;
        double pensionFee;
        double tax;
        if(grossSalary < 500_000) {
            pensionFee = grossSalary * 0.025;
        } else {
            pensionFee = 12_500;
        }

        if(grossSalary < 150_000) {
            tax = grossSalary * 0.23;
        } else if( grossSalary < 2_000_000) {
            tax = (grossSalary - 150_000) * 0.28 + 34_500;
        } else {
            tax = (grossSalary - 2_000_000) * 0.36 + 522_500;
        }

        return grossSalary - militaryFee - pensionFee - tax;
    }
}
