package ErsterTag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFinden {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement nameElement= driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("ipek");







    }
}
