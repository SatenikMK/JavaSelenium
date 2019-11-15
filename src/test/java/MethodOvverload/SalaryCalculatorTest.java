package MethodOvverload;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryCalculatorTest {
    @Test
    public void unitTest1(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        //salaryCalculator.calculator(150000);
        Assert.assertEquals(salaryCalculator.calculator(150000),110750.0, "errooooooooooooooooooooooor");
    }

}
