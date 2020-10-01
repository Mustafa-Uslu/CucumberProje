package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        // tags = {"@tag1" , "@tag2" , "@tag3"}
        //tags = {"@koalapalace", "@hotelreservationnegativetest1", "@hotelreservationnegativetests"},
        //tags = "@hotelsearch",
        //tags = "@hotelroomsearch",
        //tags = "@hotelsearchnegative01",
        tags = "@hotelreservationsearch",
        dryRun = false
)

public class KoalaPalaceRunner {
    //Hamza Yılmaz  https://github.com/hamzatechproed/CucumberProje.git
}