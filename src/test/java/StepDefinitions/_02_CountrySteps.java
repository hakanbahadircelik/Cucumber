package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

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
        String countryName = RandomStringUtils.randomAlphanumeric(8); // 8 letter
        String countryCode = RandomStringUtils.randomAlphanumeric(4); // 4 number

        dc.myClick(dc.addBtn);
        dc.mySendKeys(dc.nameInput, countryName);
        dc.mySendKeys(dc.codeInput, countryCode);
        dc.myClick(dc.saveBtn);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyText(dc.successMsg, "successfully");
    }

}
