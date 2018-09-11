package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class GoogleSecondSearchResultPage extends BasePage{

    @FindBy(xpath = "//div[@class='g']")
    private List<WebElement> searchBlock;

    @FindBy(xpath = "//div[@id='res']")
    private WebElement searchTable;

    @FindBy(xpath = "//td[@class='cur']")
    private WebElement pageTwoButton;

    public GoogleSecondSearchResultPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
        waitUntilElementIsVisible(searchTable, 10);
    }

    public int getSearchResultsCount() {

        return searchBlock.size();
    }

    public List<String> getSearchResultsList() {
        List<java.lang.String> searchResultsList = new ArrayList<java.lang.String>();
        for (WebElement searchResult: searchBlock) {
            ((JavascriptExecutor)browser).executeScript("arguments[0].scrollIntoView();", searchResult);
            searchResultsList.add(searchResult.getText());
        }
        return searchResultsList;
    }

    public boolean isLoaded() {
        return searchTable.isDisplayed()
                && getCurrentPageTitle().contains("Google Search") || getCurrentPageTitle().contains("Selenium - Google zoeken") || getCurrentPageTitle().contains("Selenium - Пошук Google")
                && getCurrentPageUrl().contains("www.google.com/search?q=");
    }
}
