import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

import java.util.List;

import static org.testng.AssertJUnit.*;

public class TestHovers extends TestCase {

    @Test
    public void musicTest(){
        webDriver.navigate().to("http://the-internet.herokuapp.com/hovers");
/*
findElements znajduje wszystkie elmenty, ktore maja klase o nazwie figure
WebElwment parentElement trzymamy element ktory zabiera w sobie:
-obrazek
-link
-h5
na pazczątku h5 i link są niewidoczne

 */
        List<WebElement> parentElements = webDriver.findElements(By.className("figure"));
        int i = 1;
        for (WebElement parentElement : parentElements) {
            WebElement image = parentElement.findElement(By.tagName("img")); //szukamy image

            Actions actions = new Actions(webDriver);

            actions.moveToElement(image).perform();//mysz dzwigamy na image

            WebElement h5 = parentElement.findElement(By.cssSelector(".figcaption h5")); //szukamy h5
            assertTrue(h5.isDisplayed()); // sprawdzanie czy sie pojawia
            assertEquals("name: user"+ i++,h5.getText()); // czy ma odpowiedni tekst

        }





//        WebElement a = parentElement.findElement(By.cssSelector(".figcaption a"));
//        for (int i = 1; i <=3 ; i++) {
//            actions.moveToElement(
//                    webElement
//                            .findElement(By.xpath("//div[@class='example']//div["+i+"]//img[1]")))
//                            .perform();
//            assertEquals("user"+i,webElement.findElement(By.xpath("//div[@class='example']//div["+i+"]//img[1]")).getText().contains("user"+i));
//        }


    }
}
