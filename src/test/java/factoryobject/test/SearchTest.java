package factoryobject.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest{

    private String SEARCH_KEYWORD1 = "ASUS";
    private String SEARCH_KEYWORD2 = "canon d500";
    private String SEARCH_KEYWORD3 = "Samsung";
    private String EXPECTED_SEARCH_QUERY = "query=ASUS";

    @Test(priority = 1)
    public void checkThatUrlContainsQuery(){
       getHomePage().searchByKeyword(SEARCH_KEYWORD1);
       assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));

    }
    @Test
    public void checkHowManyElementsOnSearchPage() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD2);
        getHomePage().implicitWait(40);
        Assert.assertEquals(getSearchResultsPage().getSearchResultsCount(), 12);
    }
    @Test
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD3);
        for (WebElement webElement : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD3));
        }
    }

    @Test(priority = 3)
    public void checkHowManyElementsInCatalog() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnGadgetStoreButton();
        getGadgetPage().clickOnFitnessButton();
        Assert.assertEquals(getFitnessTrackerPage().getResultsCount(), 12);
        //Assert.assertEquals(getFitnessTrackerPage().getResultsCount(), 12);
    }
}
