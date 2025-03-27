package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
        //  owner of the page, no need to findElement anymore.
    }

    @FindBy(xpath = "")
    public WebElement setup;

    @FindBy(xpath = "")
    public WebElement parameters;

    @FindBy(xpath = "")
    public WebElement countries;

}
