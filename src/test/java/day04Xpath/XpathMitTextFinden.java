package day04Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathMitTextFinden {

    // Asagidaki testi text’leri kullanarak locate edin
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButon=driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButon.click();

        WebElement deleteButton=driver.findElement(By.xpath("//button[text()='Delete']"));

        if (deleteButton.isDisplayed()){
            System.out.println("deleteButton test PASS");
        }else {
            System.out.println("deleteButton test FAILED");
        }

        deleteButton.click();

        WebElement addRemoveElement= driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));

       if (addRemoveElement.isDisplayed())
       {
           System.out.println("adRemoveButton testPASS");
       }else {
           System.out.println("adRemoveButton test FAILED");
       }



    }













}
