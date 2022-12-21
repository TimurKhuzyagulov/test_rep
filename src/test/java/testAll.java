import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testAll {
    public static WebDriver driver;


    @Test
public void test1(){
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ya.ru");

    }
}
