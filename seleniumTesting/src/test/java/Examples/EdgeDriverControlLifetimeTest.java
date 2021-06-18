package Examples;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;

//edited to remove all the remote stuff

public class EdgeDriverControlLifetimeTest {
    private WebDriver driver;

    @Before
    public void setUpWebDriver() {
        System.setProperty("webdriver.edge.driver", "webdrivers/edgedriver_win64/msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @After   public void quitDriver() {
        driver.quit();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
    }
}
