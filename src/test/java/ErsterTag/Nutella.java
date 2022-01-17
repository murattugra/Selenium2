package ErsterTag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nutella {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        WebElement finder=driver.findElement(By.id("twotabsearchtextbox"));

        finder.click();
        finder.sendKeys("Nutella");

        WebElement submitAna= driver.findElement(By.id("nav-search-submit-button"));
        submitAna.click();








    }
}
