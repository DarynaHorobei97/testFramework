import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileForm extends BasePage{
    private final static String TITLE = "ProfileForm ";
    private By yourRepositoriesLocator = By.xpath("//span[contains(text(), \"Your repositories\")]");
    public ProfileForm(WebDriver driver) {
        super(driver, TITLE);
    }

   @Step("Go to Repositories page")
    public RepositoriesPage goToRepositoriesPage() throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(driver.findElement(yourRepositoriesLocator).isDisplayed());
        driver.findElement(yourRepositoriesLocator).click();
        return new RepositoriesPage(driver);
    }
}
