package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import page.Page;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/sampleapp.feature",
        plugin = {"pretty", "html:target/report-html", "json:target/jsonReports/cucumber.json"},
        monochrome = false,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false)

public class Runner {

}
