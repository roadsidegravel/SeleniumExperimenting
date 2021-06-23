package Examples.guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitAndClose {
   public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver","webdrivers/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.popuptest.com/popuptest2.html");
    // this falls flat atm because the pop ups dont open, but
       // that's unrelated to the driver, it's firefox that stops them
    driver.close(); //using CLOSE only the current browser closes
    //driver.quit();  // using QUIT all windows will close
}
}
