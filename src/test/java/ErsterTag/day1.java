package ErsterTag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        //ilk once path ve driver ismini giriyorum

        WebDriver driver=new ChromeDriver();
        // WebDriver objesi olusturuyorum
        //Bununla driver otomasyonunu kullanmak icin driverim var
        driver.get("https://linkein.com");
        //bununla girilen siteye git diyorum
        Thread.sleep(5000);
        // gidilen sitete ne kadar bekleyecegini bliliyorum
        driver.close();
        // driveri kapatiyorum

    }




}
