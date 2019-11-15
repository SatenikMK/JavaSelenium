import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver driver;

    public WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver-windows-32bit.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public Driver() {
        this.driver = getDriver();
    }
}
