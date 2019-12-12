package Array;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class SalaryCalculatorTest  {
    SalaryCalculator tetsObject;

    @BeforeClass
    public void setUp(){
        tetsObject = new SalaryCalculator();
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BeforeMethod");

    }

    @Test
    public void salaryCalculatorTest_under500() {
        System.out.println("Test");
        double testNumber = 150_000;
        double expectedResult = 110_750;
        double actualResult = tetsObject.netSalary(testNumber);
        assertEquals(expectedResult, actualResult, "Incorect uotput");

    }

    @Test
    public void salaryCalculatorTest_600() {
        System.out.println("test");
        double testNumber = 600000;
        double expectedResult = 426000;
        double actualResult = tetsObject.netSalary(testNumber);
        assertEquals(expectedResult, actualResult, "Incorect uotput");

    }

    @AfterClass
    public void tearDown(){
        System.out.println("AfterClass");


    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("AfterMethod");




    }
}
