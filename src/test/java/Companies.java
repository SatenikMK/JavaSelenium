import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Companies extends Driver {
    @Test
    public void clickOnCompaniesButton(){
        driver.get("https://staff.am/");
        driver.manage().window().maximize();
        WebElement mainMenu = driver.findElement(By.id("menu-header"));
        WebElement companies = mainMenu.findElements(By.tagName("li")).get(2);
        companies.click();
        String expectedURL = "https://staff.am/en/companies";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Wrong URL");
    }
}
