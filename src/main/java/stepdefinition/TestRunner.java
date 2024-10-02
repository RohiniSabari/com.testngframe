package stepdefinition;

	




	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
		@CucumberOptions(glue ="stepdefinition",
		features = "src/main/java/features", monochrome = true,
		plugin = {"pretty","html:target/reports.html"} ,tags="@Factorialjava")



		public class TestRunner {


		}



