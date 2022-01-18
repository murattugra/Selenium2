package ErsterTag;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LoginTest {


    //1. Bir class oluşturun: LoginTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.








    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //    a. http://a.testaddressbook.com adresine gidiniz.

        driver.navigate().to("http://a.testaddressbook.com");

        //    b. Sign in butonuna basin

        WebElement signInLoc=driver.findElement(By.id("sign-in"));
        signInLoc.click();

        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInLoc2=driver.findElement(By.name("commit"));

        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");


        Thread.sleep(2000);
        signInLoc2.click();

        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement userId=driver.findElement(By.className("navbar-text"));
        String extencedResult="testtechproed@gmail.com";

            if (userId.getText().equals("testtechproed@gmail.com")){

                System.out.println("userId Test PASS");
            }else {
                System.out.println("userId Test FAILED");
            }



        //    f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressWebelement=driver.findElement(By.linkText("Addresses"));
        WebElement signOutWebElement=driver.findElement(By.linkText("Sign out"));

        if (adressWebelement.isDisplayed()){
            System.out.println("Addresses test PASS");
        }else {
            System.out.println("Adresses Test FAILED");
        }

        if (signOutWebElement.isDisplayed()){
            System.out.println("SIGNoUT test PASS");
        }else {
            System.out.println("sINGOUT teST Test FAILED");
        }

    //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> LinklerListesi=driver.findElements(By.tagName("a"));

        System.out.println(LinklerListesi.size()+" kadar link var ");

driver.close();

    }
}
