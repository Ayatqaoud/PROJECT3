package FinalAutomationProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class MosaferFlightCheck {
    @Test
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String URL="https://www.almosafer.com/en";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("cta__saudi")).click();
        driver.findElement(By.cssSelector(".sc-iHhHRJ.sc-kqlzXE.blwiEW")).click();
        driver.findElement(By.className("DayPicker-Day--end")).isSelected();
        driver.findElement(By.className("DayPicker-Day--today")).isSelected();
        driver.findElement(By.cssSelector(".sc-gMcBNU.sc-iLVFha.jnilZN")).click();
        driver.findElement(By.cssSelector("div[aria-label='Wed Oct 23 2024']")).isSelected();
        driver.findElement(By.cssSelector("div[aria-label='Thu Oct 24 2024']")).isSelected();
        driver.findElement(By.cssSelector("div[aria-label='Fri Oct 25 2024']")).isSelected();


    }}
