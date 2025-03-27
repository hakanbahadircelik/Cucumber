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
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("Techno2025.%");
        dc.loginBtn.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("web site is opened tested");
    }

}
