package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        //  owner of the page, no need to findElement anymore.
    }

    @FindBy(xpath = "//input[@formcontrolname='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[text()='Internship']")
    public WebElement txtInternship;

    // this locator can be usable on every navbar sites because the
    // addButton has 'ADD' inside of locator, so it's usable on all the therms
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMsg;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortNameInput;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    public void deleteItem(String deleteName)
    {
        mySendKeys(searchButton,deleteName);
        myClick(searchButton);

        //sayfa yenilenen kadar bekle, arama sonuçlanana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }


}
