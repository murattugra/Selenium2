package ErsterTag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ElementFinden {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement nameElement= driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("Murat");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("mrtekmasa@gmail.com");

        WebElement currentAdress = driver.findElement( new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAdress.click();
        currentAdress.sendKeys("Dneme");

        WebElement PermanenetAdress = driver.findElement(By.id("permanentAddress"));

        PermanenetAdress.click();
        PermanenetAdress.sendKeys("SonDenem dfasdfsd");


        WebElement SubmitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        SubmitButton.click();
        driver.close();



    }
}
