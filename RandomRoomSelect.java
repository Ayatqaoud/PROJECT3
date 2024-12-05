package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class RandomRoomSelect {
    @Test
    public void RoomSelect() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    String URL = "https://www.almosafer.com/en/flights-home";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("cta__saudi")).click();
        boolean EnglishLangDisp = driver.findElement(By.linkText("العربية")).isDisplayed();
        Assert.assertTrue(EnglishLangDisp);
        driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).click();
         driver.findElement(By.className("sc-tln3e3-1")).click();
        Random random = new Random();
        int ROOM = random.nextInt(6);
        int even = (ROOM / 2);
        int odd = (ROOM / 3);

        if (odd ==1) {

            driver.findElement(By.cssSelector("option[value='A']")).click();     }
        if (even ==1) {


            driver.findElement(By.xpath("//option[@value='B']")).click();
}}}
