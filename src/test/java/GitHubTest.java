import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({TextReportExtension.class})
public class GitHubTest extends BaseTest {

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        // or for fine-tuning:
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
    }
    @Test
    public void verifyThatLogoOnTheLoginPageIsDisplayed() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyThatLogoOnTheLoginPageIsDisplayed is starting");
       HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().getLogo().isDisplayed());
    }


    @Test
    public void verifyLoginIsSuccessful() {
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().loginSuccessful("test9874@ukr.net", "test9874@ukr.net")
                .getLogoOnTheMainPage().isDisplayed());

    }

    @Test
    public void verifyFailedLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().negativeLogin("1test9874@ukr.net", "test9874@ukr.net")
                .validateErrorMessage("Incorrect username or password.");
    }

    @Test
    @Description("verifyRepositoriesList test")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Repositories")
    public void verifyRepositoriesList() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        List<String> actualRepList = homePage.goToLoginPage().loginSuccessful("test9874@ukr.net", "test9874@ukr.net")
                .goToProfileForm().goToRepositoriesPage().getRepositories();
        List<String> expectedRepList = new ArrayList<>();
        expectedRepList.add("test2");
        expectedRepList.add("test1");
        expectedRepList.add("test5");
        Assertions.assertEquals(expectedRepList, actualRepList, "Actual Repositories list doesn't equal " +
                "to expected Repositories list");
        //logger.info("verifyRepositoriesList test passed successfully");
    }
}
