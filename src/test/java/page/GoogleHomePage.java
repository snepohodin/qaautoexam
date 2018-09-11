package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage {
    @FindBy(xpath = "//input[@name='q']")
    private WebElement queryField;

    @FindBy(xpath = "//input[@name='btnK']")
    private WebElement submitButton;

    @FindBy(xpath = "//img[@id='hplogo']")
    private WebElement logo;

    public GoogleHomePage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
        waitUntilElementIsVisible(logo, 10);
    }

    public boolean isLoaded() {
        return logo.isDisplayed()
                && getCurrentPageTitle().contains("Google")
                && getCurrentPageUrl().contains("www.google.com");
    }

    public GoogleSearchResultPage search(String searchTerm) {
        queryField.sendKeys(searchTerm);
        submitButton.click();
        return new GoogleSearchResultPage(browser);
    }
}
