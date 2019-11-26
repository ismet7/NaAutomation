/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktexLocator {
     public static WebDriver isom;
     public static void main(String args[]) throws InterruptedException {

         String expectedValue = "Sizin İçin Buradayız!";
         invokeChromeBrowser();
         isom.manage().window().maximize();
         isom.get("http://www.flypgs.com");
         Thread.sleep(4000);
         isom.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
         Thread.sleep(4000);
         isom.findElement(By.linkText("BİZE YAZIN")).click();
         Thread.sleep(4000);
         System.out.println("Validation"+isTextrue(expectedValue));




     }


     public static void invokeChromeBrowser(){

         System.setProperty("webdriver.chrome.driver","//Users//ismetpoyraz//Downloads//chromedriver");
         isom =new ChromeDriver();

     }

     public static boolean isTextrue(String expectedValue){

         String resultValue = isom.findElement(By.xpath("//*[@id=\'sf-recase-query\']/h2")).getText();

         return resultValue.equals(expectedValue);
     }

    
}

 */
