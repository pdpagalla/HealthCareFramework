import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions
        (
                features = {"src/test/resources/featureFiles/patient_data.feature"},
                glue = {"stepDefs"},
//                tags = "@booking",
                dryRun = false,
                plugin = {"pretty","html:target/report.html"}

        )

@RunWith(Cucumber.class)
public class TestRunner
{

}



