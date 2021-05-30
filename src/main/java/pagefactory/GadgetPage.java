package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GadgetPage extends BasePage{
    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'smart-chasyi-i-fitnes-trekeryi')]")
    private WebElement fitnessButton;

    public GadgetPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFitnessButton() {
        fitnessButton.click();
    }
}
