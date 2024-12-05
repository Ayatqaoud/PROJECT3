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



public class LowestPriceSorting {
    @Test
    public void LowestPrice (){
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
        driver.findElement(By.xpath("//button[normalize-space()='Lowest price']")).click();
        WebElement tabel=driver.findElement(By.className("sc-sPYgB"));
        List<WebElement> price = (List<WebElement>) tabel.findElements(By.className("Price__Value"));
        for (int i = 0; i<price.size(); i=i+1)
            { Select select=new Select((WebElement) driver.findElements(By.className("Price__Value")));
                select.selectByIndex(i);
                System.out.println(price.get(i).getText());


        }
      String  FirstPrice=price.get(1).getText();
        String lastPrice=price.get(51).getText();
Assert.assertEquals(FirstPrice,"94");
Assert.assertEquals(lastPrice,"1,689");
    }}