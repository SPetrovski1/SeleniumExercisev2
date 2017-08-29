import objects.Flight;
import objects.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import static junit.framework.TestCase.assertTrue;@SuppressWarnings("Duplicates")

public class TestFlights {

    private WebDriver driver;
    public TestFlights() throws Exception{}

    @Before
    public void setUp() throws Exception {
        String exePath = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

    }

    @Test
    public void searchFlight() throws Exception {
        Flight flight = new Flight();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
        driver.get("http://phptravels.net/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href*='flight']")).click();
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.partialLinkText("Searc"));
        search.click();

        Thread.sleep(2000);
        /*destination.sendKeys("Cairo");
        Thread.sleep(2000);*/
        String url=driver.getCurrentUrl();
        assertTrue(url.equals("http://www.phptravels.net"));


    }
}
