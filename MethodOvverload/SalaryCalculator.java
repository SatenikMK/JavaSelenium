package MethodOvverload;

public class SalaryCalculator {
    public final int level1 = 150000;
    public final int level2 = 2000000;

    public double calculator(int grosSalary) {
        double tax;
        if (grosSalary <= level1) {
            tax = grosSalary * 23 / 100;
        } else if (grosSalary < level2) {
            tax = 34500 + (grosSalary - level1) * 28 / 100;
        } else {
            tax = 552500 + (grosSalary - level2) * 36 / 100;
        }
        double socialFee = socTax(grosSalary);
        return grosSalary - tax - socialFee - 1000;


    }

    public double socTax(double grosSalary) {
        double socialFee = grosSalary * 2.5 / 100;
        if (socialFee > 12500) {
            socialFee = 12500;
        }
        return socialFee;
    }

    public double calculator(int grosSalary, boolean privilege) {
        double tax = grosSalary * 10 / 100;
        double socialFee = socTax(grosSalary);
        return grosSalary - tax - socialFee - 1000;
    }


    public static void main(String[] args) {
        SalaryCalculator salary = new SalaryCalculator();
        System.out.println(salary.calculator(300000));
        //System.out.println(salary.calculator(300000, true));
    }
}
