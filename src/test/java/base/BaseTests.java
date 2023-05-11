package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize(); // maximize the browser window
        driver.manage().window().fullscreen(); // full screen the browser window
        driver.manage().window().setSize(new Dimension(375, 812)); // set the browser window size
        System.out.println(driver.getTitle()); // get the page title
        driver.quit(); // close the browser
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
