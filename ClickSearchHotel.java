package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ClickSearchHotel {
    @Test
    public void SearchHotel()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.almosafer.com/en/flights-home";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("cta__saudi")).click();
        boolean EnglishLangDisp = driver.findElement(By.linkText("العربية")).isDisplayed();
        Assert.assertTrue(EnglishLangDisp);
        driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).click();
        driver.findElement(By.className("sc-phbroq-2")).sendKeys("Amman");
        driver.findElement(By.xpath("(//button[@class='sc-jTzLTM hQpNle sc-1vkdpp9-6 iKBWgG js-HotelSearchBox__SearchButton btn btn-primary btn-block'])[1]")).click();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 String ActualText=driver.findElement(By.className("sc-iupvsZ")).getText();
Assert.assertEquals(ActualText,"Sort by :");
    }
}
