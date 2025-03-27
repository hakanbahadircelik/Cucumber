package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

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
        dc.myClick(dc.addBtn);
        dc.mySendKeys(dc.nameInput,"tbilisi");
        dc.mySendKeys(dc.shortNameInput,"tbl");
        dc.myClick(dc.saveBtn);
    }

}
