package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FitnessTrackerPage extends BasePage {
    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductsListText;

    public FitnessTrackerPage(WebDriver driver) {
        super(driver);
    }
    public int getResultsCount() {
        return getSearchResultsList().size();
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }
}
