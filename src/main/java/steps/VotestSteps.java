package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;

public class VotestSteps {

    String key;
    @Given("x-api-key is already acquired.")
    public void x_api_key_is_already_acquired() {
        key = "8adf71fc-c27b-40ef-8662-19ab891129e3";
    }

    @When("I check number of votes for this {string}")
    public void i_check_number_of_votes_for_this(String sub_id) {

    }

    @Then("I see {string}")
    public void i_see(String string) {

    }

    @When("I will create one more vote")
    public void i_will_create_one_more_vote() {

    }


    @Then("I have numbers plus one votes for this {string}")
    public void i_have_numbers_plus_one_votes_for_this(String string) {

    }

}
