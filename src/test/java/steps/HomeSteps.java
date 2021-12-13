package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomeSteps {

    /**
     * Page objects
     */
    private HomePage homePage;

    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    /**
     * Step definitions
     */
    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
        //homePage.waitForAppLoading();
        homePage.navigateToEnv();
    }

    @And("I click on the user account button")
    public void iClickOnTheUserAccountButton() {
    }

    @When("I click on the connection button")
    public void iClickOnTheConnectionButton() {
    }

    @And("I type in the email field my {string}")
    public void iTypeInTheEmailFieldMy(String email) {
    }

    @And("I type in the password field my {string}")
    public void iTypeInThePasswordFieldMy(String pwd) {
    }

    @And("I click on the button \"Me connecter\"")
    public void iClickOnTheButtonLogIn() {
    }

    @Then("A dialog box with the message {string} is displayed")
    public void aDialogBoxWithTheMessageIsDisplayed(String msg) {
    }
}
