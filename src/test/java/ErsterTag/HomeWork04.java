package ErsterTag;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HomeWork04 {

    //1. Bir class oluşturun: LocatorsIntro
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.




    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailBoxElement=driver.findElement(By.xpath("//input[@id='session_email']"));
        WebElement passwordBoxElement=driver.findElement(By.id("session_password"));
        WebElement signInElement=driver.findElement(By.xpath("//input[@value='Sign in']"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii.Password : Test1234!
        emailBoxElement.sendKeys("testtechproed@gmail.com");
        passwordBoxElement.sendKeys("Test1234!");
        signInElement.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
            String actualUserId=driver.findElement(By.xpath("//span[@class='navbar-text']")).getText();
            String expectedUserIdResult="testtechproed@gmail.com";
            if (actualUserId.equals(expectedUserIdResult)){
                System.out.println("userId Test PASS");
            }else {
                System.out.println("userId Test FAILED");
            }


        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement signInElement2=driver.findElement(By.linkText("Sign out"));
            WebElement adressElement=driver.findElement(By.linkText("Addresses"));

        System.out.println(signInElement2.isDisplayed()?"signIn Tets PASS":"signIn Test FAILED");
        System.out.println(adressElement.isDisplayed()?"adress Tets PASS":"adress Test FAILED");

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkler=driver.findElements(By.tagName("a"));
        System.out.println("sayfada "+linkler.size()+" tane link vardir" );

        //4.Linklerin yazisini nasil yazdirabiliriz
        for (WebElement each:linkler) {
            System.out.println(each.getText());
        }


        //5. driver i kapatin


        driver.close();

    }


}
