import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CardOrderTest {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void shouldSubmitRequest() throws InterruptedException {
        driver.get("http://localhost:9999");
//        WebElement form = driver.findElement(By.cssSelector("[.form form_size_m form_theme_alfa-on-white]"));
//        form.findElement(By.cssSelector("[data-test-id=name] input__top")).sendKeys("Иванов Петр");
//        form.findElement(By.cssSelector("[data-test-id=phone] input__top")).sendKeys("+79101234567");
//        form.findElement(By.cssSelector("[data-test-id=agreement]")).click();
//        form.findElement(By.cssSelector("[data-test-id=submit]")).click();
//        String text = driver.findElement(By.className("order-success")).getText();
//        assertEquals("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", text.trim());
    }

}




