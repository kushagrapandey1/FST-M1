package testRunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
glue = {"stepDefinitions"},
tags = "@activity4",
plugin = {"html: test-report-Activity4"},
monochrome = true
)
public class ActivitiesRunner4 {
//empty
}
