import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AkademiaKoduTest extends TestCase {

    @Test
    public void testDofinansowania() throws InterruptedException {
        webDriver.navigate().to("http://www.akademiakodu.pl");
        WebElement webElement = webDriver.findElement(By.
                xpath("//a[contains(text(),'Dofinansowania')]"));
        // <a href
        // przegladarka wchodzi pod linka, ktory jest w znaczniku a
        webDriver.navigate().to(webElement.getAttribute("href"));
        assertTrue(webDriver.getPageSource().contains("Urząd Pracy"));
    }



}
