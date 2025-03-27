package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _07_DataTableExample {

    @When("write username {string}")
    public void writeUsername(String userName) {
        System.out.println("userName = " + userName);
    }

    @And("Write username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String userName, String password) {
        System.out.println("userName = " + userName);
        System.out.println("password = " + password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable users) {
        List<String> listUsers = users.asList(String.class);

        for (String user : listUsers)
            System.out.println("user = " + user);
    }



}
