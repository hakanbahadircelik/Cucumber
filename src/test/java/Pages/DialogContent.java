package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent {

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

    public void click(WebElement element){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }

    public void sendKeys(WebElement element, String written){

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));

        element.clear();
        element.sendKeys(written);
    }

}
