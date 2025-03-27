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

    @FindBy(xpath = "")
    public WebElement addBtn;

    @FindBy(xpath = "")
    public WebElement nameInput;

    @FindBy(xpath = "")
    public WebElement codeInput;

    @FindBy(xpath = "")
    public WebElement saveBtn;

    @FindBy(xpath = "")
    public WebElement successMsg;
}
