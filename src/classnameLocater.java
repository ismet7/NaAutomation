import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classnameLocater {
    static WebDriver po;
    public static void main(String[] args) throws InterruptedException {

        thytest();
        po.get("http://www.flypgs.com");
        Thread.sleep(5000);
        po.findElement(By.className("hypeCookieExit")).click();
        Thread.sleep(4000);
        po.findElement(By.xpath("//label[@for='one_way']")).click();




    }

    public static void thytest (){

        System.setProperty("webdriver.gecko.driver","//Users//ismetpoyraz//Downloads//geckodriver");
        po = new FirefoxDriver();

    }

}
