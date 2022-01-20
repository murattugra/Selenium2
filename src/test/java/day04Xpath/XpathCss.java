package day04Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathCss {

    // 1 ) Bir class oluşturun : Locators_css
//2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.



//    d. Locate signin button
//    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!
//NOT: cssSelector kullanarak elementleri locate ediniz.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));







    }






}
