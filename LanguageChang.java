package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Name;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class LanguageChang {

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.almosafer.com/";
        driver.navigate().to(URL);
        driver.findElement(By.className("cta__saudi")).click();
        List<WebElement> Language=driver.findElements(By.id("Header__LanguageSwitch"));
        WebElement Arabic=driver.findElement(By.linkText("العربية"));
       // WebElement English=driver.findElement(By.linkText("English"));
        Random random = new Random();
        int lan = random.nextInt(10);
        int  LANG=(lan/2);
          if (LANG>2)
         Arabic.click();



    }}
