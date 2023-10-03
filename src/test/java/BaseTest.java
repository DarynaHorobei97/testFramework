import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected Logger logger;

   @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\daryn\\Downloads\\testFrameworkNew\\testFramework\\src\\main\\resources\\drivers\\chromedriver1.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Logger logger = LogManager.getLogger();
        logger.info("Chrome driver object creation is starting");
        driver = new ChromeDriver(options);
       logger.info("Chrome driver object creation is successful");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://github.com");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
