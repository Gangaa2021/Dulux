package configuration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AddToCart.feature"},
        monochrome = true,
        glue = {"StepDefinitions"})

public class AddToCartRunner {

}
