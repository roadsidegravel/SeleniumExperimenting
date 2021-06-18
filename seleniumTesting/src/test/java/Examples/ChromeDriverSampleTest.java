package Examples;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

// werkt maar ge ziet geen fluit want google smijt elke keer de
// hoeveel cookies en tracking wilt ge in uw reet geramd krijgen

public class ChromeDriverSampleTest {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //if not specified, with setProperties, WebDriver will look in the PATH, see notes
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}

