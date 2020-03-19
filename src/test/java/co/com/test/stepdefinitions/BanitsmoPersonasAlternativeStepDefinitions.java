package co.com.test.stepdefinitions;

import co.com.test.tasks.SelectTheTarifarioOptionsAlternative;
import co.com.test.tasks.StartThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class BanitsmoPersonasAlternativeStepDefinitions {

    @Given("^That Cristian wants to create a category in the blog section$")
    public void thatCristianWantsToCreateACategoryInTheBlogSection() {
        OnStage.theActorCalled("Cristian").wasAbleTo(StartThe.banitsmoPersonasLandingPage());
    }

    @When("^he access the the banitsmo landing page named personas and get to a different PDF document$")
    public void heAccessTheTheBanitsmoLandingPageNamedPersonasAndGetToADifferentPDFDocument() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheTarifarioOptionsAlternative.andClickTheCarLendingLink());
    }

    @Then("^he should see the PDF file$")
    public void heShouldSeeThePDFFile() {

    }
}
