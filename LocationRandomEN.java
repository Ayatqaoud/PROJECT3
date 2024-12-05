package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;

public class LocationRandomEN {
    @Test
    public void location() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.almosafer.com/en/flights-home";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("cta__saudi")).click();
        boolean EnglishLangDisp = driver.findElement(By.linkText("العربية")).isDisplayed();
        Assert.assertTrue(EnglishLangDisp);
        driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).click();
        WebElement FillText = driver.findElement(By.className("sc-phbroq-2"));
        Random random = new Random();
        int City = random.nextInt(20);
        int even = (City / 2);
        int odd = (City / 3);

        if (odd > 0) {
            FillText.sendKeys("Dubai");
            driver.findElement(By.className("sc-12clos8-3")).click();
        }

        if (even > 0) {

            FillText.sendKeys("Jeddah");
            driver.findElement(By.className("sc-12clos8-3")).click();
        }

            FillText.sendKeys("Riyadh");


        }


}


