package StepDefinitions;

import io.cucumber.java.en.*;

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("website opened");
    }

    @When("Enter username and password click login button")
    public void enter_username_and_password_click_login_button() {
        System.out.println("username and password written");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("user logged in successfully");
    }

}
