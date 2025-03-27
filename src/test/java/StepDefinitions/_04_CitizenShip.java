package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
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

}
