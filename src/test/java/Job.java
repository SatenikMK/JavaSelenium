import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Job extends Driver {

    @Test
    public void test() {

        driver.get("https://staff.am");
        driver.manage().window().maximize();
        WebElement mainMenu = driver.findElement(By.id("menu-header"));
        WebElement jobs = mainMenu.findElements(By.tagName("li")).get(0);
        jobs.click();
        String expectedURL = "https://staff.am/en/jobs";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Wrong URL");
        driver.close();


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }

}
