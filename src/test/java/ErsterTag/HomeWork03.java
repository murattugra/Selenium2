package ErsterTag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork03 {




    //3.  Bir password giriniz
    //4.  Login butonuna tiklayiniz
    //5.  "That email address doesn't exist." texti gorunur ise
    //6.  "kayit yapilamadi" yazdiriniz
    //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    //9.  Tum sayfalari kapatiniz



    public static void main(String[] args) {


   System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1.  https://app.hubspot.com/login sayfasina gidin

        driver.get("https://app.hubspot.com/login");

        //2.  Bir mail adersi giriniz













    }





}
