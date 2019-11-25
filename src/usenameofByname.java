import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usenameofByname {

    public static WebDriver iso2 ;
    public static void main( String args[]){

        ismettest23();
        iso2.get("http://facebook.com");
        iso2.findElement(By.name("firstname")).sendKeys("ismet ");
        iso2.findElement(By.name("lastname")).sendKeys("poyraz ");





    }

    public static void ismettest23 (){
        System.setProperty("webdriver.chrome.driver","//Users//ismetpoyraz//Downloads//chromedriver");
        iso2 =new ChromeDriver();


    }

}
