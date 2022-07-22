import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResult.class)
public class BaseTest  {

    static WebDriver driver;


    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.kitapyurdu.com/") ;
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){

        driver.quit();
    }

}

