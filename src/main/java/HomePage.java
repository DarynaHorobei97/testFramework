import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage extends BasePage {

    private By signInButtonLocator = By.xpath("//a[contains(text(), \"Sign in\")]");
    private final static String TITLE = "Home page";

    public HomePage(WebDriver driver) {
        super(driver, TITLE);
    }

    @Step("Go to Login page")
    public LoginPage goToLoginPage(){
        webDriverWait.until(elementToBeClickable(driver.findElement(signInButtonLocator)));
        driver.findElement(signInButtonLocator).click();
        return new LoginPage(driver);
    }
}
