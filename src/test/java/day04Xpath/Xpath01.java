package day04Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath01 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButon=driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButon.isDisplayed()){

            System.out.println("delete Buton test PASS");
        }else {
            System.out.println("delete Buton Test FAILED");
        }

        //4- Delete tusuna basin
        deleteButon.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveElement=driver.findElement(By.tagName("h3"));

        if (addRemoveElement.isDisplayed()){
            System.out.println("addRemoveElement Test PASS");
        }else{
            System.out.println("addRemoveElement Test FAILED");
        }

        driver.close();













    }









}
