package co.com.test.stepdefinitions;

import co.com.test.tasks.SelectTheTarifarioOptions;
import co.com.test.tasks.StartThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class BanitsmoPersonasPageStepDefinitions {

    @Given("^That Cristian wants to open the personas section at Banitsmo page$")
    public void thatCristianWantsToOpenThePersonasSectionAtBanitsmoPage() {
        OnStage.theActorCalled("Cristian").wasAbleTo(StartThe.banitsmoPersonasLandingPage());
    }

    @When("^he access the the banitsmo landing page named personas and get to the PDF document$")
    public void heAccessTheTheBanitsmoLandingPageNamedPersonasAndGetToThePDFDocument() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheTarifarioOptions.andClickTheLinks());

    }

    @Then("^he should see open a new file with the selected PDF$")
    public void he_should_see_open_a_new_file_with_the_selected_PDF() {
        
    }

}
