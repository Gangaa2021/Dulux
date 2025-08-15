package StepDefinitions;

import configuration.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objects.AddToCart2Obj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddToCart2 {

    private static final Logger logger = LogManager.getLogger(AddToCart2.class);
    static String screenshotPath = ConfigReader.getProperty("screenshotPath");

    AddToCart2Obj cart2Page = new AddToCart2Obj();

    @Given("The user 2 navigates to url")
    public void theUser2NavigatesToPage() {
        cart2Page.navigateToUrl();
        logger.info("The user navigates to url");
    }

    @When("Accept 2 Cookies")
    public void accept2Cookies() {
        cart2Page.acceptCookies();
        logger.info("Accepted Cookies");
    }
}
