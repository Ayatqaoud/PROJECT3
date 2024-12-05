package FinalAutomationProject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstElementClick {
   
    @Test
    public void FirstElement() throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       String URL = "https://www.almosafer.com/en/flights-home";
       driver.navigate().to(URL);
       driver.manage().window().maximize();
       driver.findElement(By.className("cta__saudi")).click();
       boolean EnglishLangDisp = driver.findElement(By.linkText("العربية")).isDisplayed();
       Assert.assertTrue(EnglishLangDisp);
       driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).click();
        driver.findElement(By.className("sc-phbroq-2")).sendKeys("Amm");
    driver.findElement(By.xpath("(//ul[@class='sc-phbroq-4 gGwzVo AutoComplete__List'])[1]"));
    driver.findElement(By.className("eHzKAl")).click();


}}