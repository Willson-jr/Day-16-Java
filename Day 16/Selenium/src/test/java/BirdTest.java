import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class BirdTest extends TestCase {

    @Test
    public void testBirds(){
        webDriver.navigate().to("https://jpetstore.cfapps.io/catalog");
        WebElement webElement = webDriver.findElement(By.xpath("//div[@id='Content']//a[5]"));
        webElement.click();
        WebElement header = webDriver.findElement(By.tagName("h2"));
                assertEquals("Birds", header.getText());
        //assertNotSame(0,webDriver.findElement(By.tagName("td")).getSize());
        assertNotSame(0,webDriver.findElements(By.tagName("td")).size());


        assertTrue(webDriver.getPageSource().contains("Birds"));
        assertTrue(webDriver.getPageSource().contains("td"));
        assertTrue(webDriver.getPageSource().contains("DOGS"));


    }

}
