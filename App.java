import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    @Test
    public static void Test() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://eds_university.eleks.com/modules/3/products");
        Thread.sleep(2000);
        driver.findElement(By.className("btn login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("zkknazik@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("tUgVOc^xt");
        driver.findElement(By.className("btn login-button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}

