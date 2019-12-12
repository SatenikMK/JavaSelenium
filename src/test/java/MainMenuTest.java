import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class MainMenuTest extends BaseTest {


    @BeforeMethod
    public void setUpMethod() {
        driver.get("https://staff.am/");
    }

    @Test
    public void jobsButtonTest() {
        clickMenuButton("Jobs");
        String expectedUrl = homePage + "en/jobs";
        String actualUrl = driver.getCurrentUrl();
        String errorMessage = "FAIL: After pressing jobs button the url has not changed";
        assertEquals(actualUrl, expectedUrl, errorMessage);
    }

    @Test
    public void trainingsTabTest() {
        clickMenuButton("Trainings");
        String expectedUrl = homePage + "/en/trainings";
        String actualUrl = driver.getCurrentUrl();
        String errorMessage = "FAIL: After pressing jobs button the title has not changed";
        assertEquals(actualUrl, expectedUrl, errorMessage);
    }

    @Test
    public void companiesButtonTest() {
        clickMenuButton("Companies");
        String expectedUrl = homePage+"/en/companies";
        String actualUrl = driver.getCurrentUrl();
        String errorMessage = "FAIL: After pressing companies button the url has not changed";
        assertEquals(actualUrl, expectedUrl, errorMessage);
    }

    @Test
    public void publicSectorTabTest() {
        clickMenuButton("Public Sector");
        String expectedUrl = "https://staff.am/en/goverment";
        String actualUrl = driver.getCurrentUrl();
        String errorMessage = "FAIL: After pressing jobs button the title has not changed";
        assertEquals(actualUrl, expectedUrl, errorMessage);
    }


    @Test
    public void blogSectorTabTest() {
        clickMenuButton("BloG");
        String expectedUrl = "https://staff.am/blog/";
        String actualUrl = driver.getCurrentUrl();
        String errorMessage = "FAIL: After pressing blog button the title has not changed";
        assertEquals(actualUrl, expectedUrl, errorMessage);
    }


    // Helper methods
    private void clickMenuButton(String buttonName) {
        WebElement mainMenu = driver.findElement(By.id("menu-header"));
        buttonName = buttonName.toUpperCase();
        List<WebElement> list = mainMenu.findElements(By.tagName("li"));
        switch (buttonName) {
            case "JOBS":
                list.get(0).click();
                break;
            case "TRAININGS":
                list.get(1).click();
                break;
            case "COMPANIES":
                list.get(2).click();
                break;
            case "PUBLIC SECTOR":
                list.get(3).click();
                break;
            case "BLOG":
                list.get(4).click();
        }
    }
}

//add default case vor asi sxal argument es tvel
//href ic get anel url u concat anel expected i het tesnel chisht href a drac



