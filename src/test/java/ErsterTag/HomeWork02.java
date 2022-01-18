package ErsterTag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {


    public static void main(String[] args) {

 /*
        1-driver olusturalim
        2-java class'imiza chromedriver.exe'yi tanitalim
        3-driver'in tum ekrani kaplamasini saglayalim





     */


    System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // 4-https://github.com/ adresine gidelim
       driver.get("https://github.com/");

        //5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
        driver.navigate().to(" https://www.hepsiburada.com/");

        // 6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
        String actualTitle=driver.getTitle();
        String actualUrl=driver.getCurrentUrl();

        String extencedResult="burada";

        if (actualTitle.contains(extencedResult)){
            System.out.println(" titel tes PASS");
        }else {
            System.out.println("titel test FAILED");
        }

        if (actualUrl.contains(extencedResult)){
            System.out.println(" titel tes PASS");
        }else {
            System.out.println("titel test FAILED");
        }

        //  7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim

        driver.navigate().back();


       // 8-Son adim olarak butun sayfalarimizi kapatmis olalim

        driver.quit();







    }










}
