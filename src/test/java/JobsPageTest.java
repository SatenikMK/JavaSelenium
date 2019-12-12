import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

// TODO: Add test for Software Engineer position (more than one page)
// Write chocolate here:

public class JobsPageTest extends BaseTest {
    //TODO: Remove this variable
    private WebElement checkBoxContainer;

    @Test
    //TODO: Check if there is no pagination
    public void qualityAssuranceCategoryCount() {
        driver.get(homePage + "en/jobs");
        tryToClosePopUp();
        tickCheckBox("quality");
        int actualNumber = getOpenPositionsCountOfCategory();
        int expectedNumber = getCountInBraces("Quality");
        Assert.assertEquals(actualNumber, expectedNumber);

    }

    @Test
    public void tourismCategoryCount() {
        driver.get(homePage + "en/jobs");
        tryToClosePopUp();
        tickCheckBox("Tourism");
        int actualNumber = getOpenPositionsCountOfCategory();
        int expectedNumber = getCountInBraces("Tourism");
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    @Test
    public void SoftwareDevelopment() {
        driver.get(homePage + "en/jobs");
        tryToClosePopUp();
        tickCheckBox("development");
        scroll();
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        scroll();
        pagination();
        int actualNumber = getOpenPositionsCountOfCategory() +((pageNumber()-3)*50);
        int expectedNumber = getCountInBraces("development");
        Assert.assertEquals(actualNumber, expectedNumber);
    }


    private int getCountInBraces(String categoryName) {
        checkBoxContainer = driver.findElement(By.id("jobsfilter-category"));
        List<WebElement> listOfCheckBoxes = checkBoxContainer.findElements(By.tagName("en"));
        int index = -1;
        for (int i = 0; i < listOfCheckBoxes.size(); i++) {
            if (listOfCheckBoxes.get(i).getText().contains(categoryName)) {
                index = i;
                break;
            }
        }
        //TODO: Split code below in to separate method.
       /* List<WebElement> listOfSpans = checkBoxContainer.findElements(By.tagName("span"));
        String number = listOfSpans.get(index).getText().replace("(", "");
        number = number.replace(")", "");*/
        return numberInBraces(index);
    }

    private int numberInBraces(int index) {
        checkBoxContainer = driver.findElement(By.id("jobsfilter-category"));
        List<WebElement> listOfSpans = checkBoxContainer.findElements(By.tagName("span"));
        String number = listOfSpans.get(index).getText().replace("(", "");
        number = number.replace(")", "");
        return Integer.parseInt(number);
    }

    private int getOpenPositionsCountOfCategory() {
        Wait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("w0")));
        WebElement positionContainer = driver.findElement(By.id("w0"));
        List<WebElement> openPositionList = positionContainer.findElements(By.cssSelector("div.web_item_card.hs_job_list_item"));
        int numberOfOpenPositions = openPositionList.size();
        return numberOfOpenPositions;
    }

    private void pagination() {
        WebElement pageContainer = driver.findElement(By.className("pagination"));
        List<WebElement> pages = pageContainer.findElements(By.tagName("li"));
        int lastPageNumber = pages.size()-2;
        WebElement lastPage = pages.get(lastPageNumber);
        lastPage.click();

    }
    private int pageNumber(){
        WebElement pageContainer = driver.findElement(By.className("pagination"));
        List<WebElement> pages = pageContainer.findElements(By.tagName("li"));
        return pages.size();
    }

    private void scroll(){
        js.executeScript("window.scrollTo(0, 10000)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void tickCheckBox(String checkboxText) {
        checkBoxContainer = driver.findElement(By.id("jobsfilter-category"));
        List<WebElement> checkBoxList = checkBoxContainer.findElements(By.tagName("en"));
        checkboxText = checkboxText.toUpperCase();
        for (WebElement checkBox : checkBoxList) {
            String checkBoxUpperCaseText = checkBox.getText().toUpperCase();
            if (checkBoxUpperCaseText.contains(checkboxText)) {
                checkBox.click();
                break;
            }
        }
    }


    private void tryToClosePopUp() {
        try {
            driver.findElement(By.tagName("flashcard-close")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
