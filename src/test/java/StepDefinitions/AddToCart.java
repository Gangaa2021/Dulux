package StepDefinitions;

import configuration.ConfigReader;
import io.cucumber.java.en.When;
import objects.AddToCartObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddToCart {

    private static final Logger logger = LogManager.getLogger(AddToCart.class);
    static String screenshotPath = ConfigReader.getProperty("screenshotPath");

    AddToCartObj cartPage = new AddToCartObj();

    @Given("The user navigates to url")
    public void theUserNavigatesToPage() {
        cartPage.navigateToUrl();
        logger.info("The user navigates to url");
    }

    @When("Accept Cookies")
    public void acceptCookies() {
        cartPage.acceptCookies();
        logger.info("Accepted Cookies");
    }

    @Then("click All Dulux")
    public void clickAllDulux() {
        cartPage.hoverOnChooseProduct();
        cartPage.clickAllDulux();
        logger.info("clicked All Dulux");
    }

    @Then("click Color Tester")
    public void clickColorTester() {
        cartPage.clickInteriorOption();
        cartPage.clickHallwayCheckbox();
        cartPage.clickDuluxColorTester();
        logger.info("clicked Color Tester");
    }

    @Then("click Color of Product")
    public void clickColorOfProduct() {
        cartPage.clickSelectColorBox();
        cartPage.setFeatherFlockBtn();
        cartPage.ClickGoBtn();
        logger.info("clicked Color of Product");
    }

    @Then("Add Quantity")
    public void addQuantity() {
        cartPage.add3Quantity();
        logger.info("Added Quantity");
    }

    @Then("Add To Cart")
    public void addToCart() {
        cartPage.clickAddToCartBtn();
        logger.info("Added To Cart");
    }

    @When("Proceed To Checkout")
    public void ProceedToCheckout() {
        cartPage.clickCartBtn();
        cartPage.setProceedToCheckoutBtn();
        logger.info("Proceed To Checkout");
    }

    @Then("Order Summary is displayed")
    public void OrderSummaryDisplayed() {
        cartPage.checkVisibleText();
        logger.info("Order Summary is displayed");
    }

    @Then("Take a screenshot")
    public void takeScreenshotStep() {
        cartPage.takeScreenshot(screenshotPath, "AddToCart");
        logger.info("Screenshot taken");
    }

}

