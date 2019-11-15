import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Trainings extends Driver {
    @Test
    public void clickOnTrainingsButton(){
        driver.get("https://staff.am");
        driver.manage().window().maximize();
        WebElement mainMenu = driver.findElement(By.id("menu-header"));
        WebElement projects = mainMenu.findElements(By.tagName("li")).get(1);
        projects.click();
        String expectedURL = "https://staff.am/en/trainings";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Wrong URL");

    }
}
