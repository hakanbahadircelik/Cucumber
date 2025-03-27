package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to country")
    public void navigateToCountry() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
        dc.myClick(dc.addBtn);
        dc.mySendKeys(dc.nameInput,"baha55");
        dc.mySendKeys(dc.codeInput,"055");
        dc.myClick(dc.saveBtn);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyText(dc.successMsg,"successfully");
    }

}
