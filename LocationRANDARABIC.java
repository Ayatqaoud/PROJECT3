package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class LocationRANDARABIC {
    @Test
    public void LocationArab() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.almosafer.com/en/flights-home";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("cta__saudi")).click();
        driver.findElement(By.className("sc-gkFcWv")).click();
        boolean ArabLangDisp = driver.findElement(By.linkText("English")).isDisplayed();
        Assert.assertTrue(ArabLangDisp);
        driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).click();
        WebElement FillText = driver.findElement(By.className("sc-phbroq-2"));
        Random random = new Random();
        int City = random.nextInt(10);
        int even = (City / 2);
        int odd = (City / 3);

        if (odd > 0) {
            FillText.sendKeys("دبي");
            driver.findElement(By.cssSelector(".sc-12clos8-3.bgGHzu")).click();
            FillText.clear();
        }
        if (even > 0) {
            FillText.sendKeys("جده");

        }


}}



