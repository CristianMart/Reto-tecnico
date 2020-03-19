package co.com.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/banitsmo_rate_page_option.feature",
				  tags = "@RunnerTags",
				  glue = {"co.com.test.stepdefinitions","co.com.test.util"},
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
