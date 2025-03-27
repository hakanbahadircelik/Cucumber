package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password click login button")
    public void enter_username_and_password_click_login_button() {

//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("Techno2025.%");
//        dc.loginBtn.click();

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "Techno2025.%");
        dc.myClick(dc.loginBtn);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.verifyContainsText(dc.txtInternship,"internship");
    }

}
