import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.text.html.parser.TagElement;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class GoogleTest extends TestCase {
    private WebDriver webDriver;

    /*
    przed klasą inicjalizujemy chrome driver
     */
    //odpalic google
    @Test
    public void testGoogle() {
        webDriver.navigate().to("https://google.pl");
        WebElement webElement = webDriver.findElement(By.name("btnK"));
        assertEquals("Szukaj w Google", webElement.getAttribute("aria-label"));
    }

    //zamkac przegladarke
    @Test
    public void testNBP() {
        webDriver.navigate().to("https://google.pl");
        WebElement input = webDriver.findElement(By.name("q"));
        input.sendKeys("kurs NBP");
        input.submit();
        assertTrue(webDriver.getTitle().contains("kurs NBP"));
    }

    @Test
    public void testMenu() {
        webDriver.navigate().to("https://www.akademiakodu.pl/");
        String[] titles = {"Facebook", "Darmowy kurs", "Youtube", "Grupa facebook", "Dofinansowania", "Książka"};
        List<WebElement> elementList = webDriver.findElements(By.xpath("//div[@class='menu-links']//a"));

        for (int i = 0; i < elementList.size(); i++) {
            assertEquals(elementList.get(i).getText(),titles[i]);
        }

    }


}
