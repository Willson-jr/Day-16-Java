import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {
    protected WebDriver webDriver;

    @BeforeClass
    public void beforeTests() {
        System.setProperty("webdriver.chrome.driver", "C:\\Intellij\\Day 16\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @AfterClass
    public void closeChrome() {
        webDriver.close();
        webDriver.quit();
    }




}
