package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLDListElement;

import java.util.List;

public class Mosafer {

 @Test
 public static void main(String[] args) {
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
 String URL="https://www.almosafer.com/en";
  driver.navigate().to(URL);
  driver.manage().window().maximize();
  driver.findElement(By.className("cta__saudi")).click();
  driver.findElement(By.linkText("English")).click();
  driver.findElement(By.className("sc-cugefK fePbVT")).click();
  driver.findElement(By.cssSelector(".sc-fihHvN.eYrDjb")).isDisplayed();
  driver.findElement(By.id("AutoCompleteInput")).sendKeys("Search for hotels or places");



 






    }
}
