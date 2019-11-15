import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Job extends Driver {

    @Test
    public void test() {

        /* System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver-windows-32bit.exe");*/

        //WebDriver driver = new ChromeDriver();

        driver.get("https://staff.am");
        driver.manage().window().maximize();
        WebElement mainMenu = driver.findElement(By.id("menu-header"));
        WebElement jobs = mainMenu.findElements(By.tagName("li")).get(0);
        jobs.click();
        String expectedURL = "https://staff.am/en/jobs";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Wrong URL");


    }

}
