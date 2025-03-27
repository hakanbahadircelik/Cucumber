package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _04_CitizenShip {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to citizenship")
    public void navigateToCitizenship() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
        ln.myClick(ln.citizenship);
    }

    @When("Create a citizenship")
    public void createACitizenship() {
        String citizenshipName = RandomStringUtils.randomAlphanumeric(8);
        String citizenshipShortCode = RandomStringUtils.randomAlphanumeric(4);

        dc.myClick(dc.addBtn);
        dc.mySendKeys(dc.nameInput, citizenshipName);
        dc.mySendKeys(dc.shortNameInput, citizenshipShortCode);
        dc.myClick(dc.saveBtn);
    }

    @When("Create a citizenship name as {string} short name as {string}")
    public void createACitizenshipNameAsShortNameAs(String name, String shortName) {
        dc.myClick(dc.addBtn);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.shortNameInput, shortName);
        dc.myClick(dc.saveBtn);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.alreadyExist,"already");
    }


    @When("user delete name as {string}")
    public void userDeleteNameAs(String name) {
        dc.deleteItem(name);
    }

}
