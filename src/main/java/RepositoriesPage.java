import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class RepositoriesPage extends BasePage {
    private List<WebElement> repositories = driver.findElements(By.xpath("//a[@itemprop='name codeRepository']"));
    private final static String TITLE = "RepositoriesPage ";
    public RepositoriesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    @Step
    public List<String> getRepositories() throws InterruptedException {
        Thread.sleep(3000);
        List <String> repositoriesList = repositories.stream().map(rep -> rep.getText()).collect(Collectors.toList());
        return repositoriesList;
    }
}
