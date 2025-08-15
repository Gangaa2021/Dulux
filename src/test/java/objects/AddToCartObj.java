package objects;

import configuration.JsonReader;
import configuration.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Wait;

public class AddToCartObj extends BasePageObj {

    TestData data = JsonReader.getTestData();

    private final By chooseProductBtn = By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[2]/button");
    private final By AllDuluxBtn = By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[3]/a");
    private final By interiorCheckbox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/section/div/div[2]/div[1]/div/div[2]/div[2]/form/div[1]/div/div/div/div/div[2]/div/label");
    private final By HallwayCheckbox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/section/div/div[2]/div[1]/div/div[2]/div[2]/form/div[2]/div/div/div/div/div[5]/div/label/div");
    private final By duluxColorTester = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/section/div/div[2]/div[2]/div[4]/div[1]/article/a");
    private final By selectColorBox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[3]/section/div/div[1]/div[2]/div/form/div[3]/a");
    private final By featherFlockBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/section/div[3]/div/div/div[2]/div/div[2]/div/div/div/div[38]/div/button[1]");
    private final By GoBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/section/div[3]/div/div/div[2]/div/div[2]/div/div/div/div[39]/div/div/div[2]/div/div/a");
    private final By addQuantityBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[3]/section/div/div[1]/div[2]/div/form/div[6]/div/div/label/span[2]/button[2]");
    private final By AddToCartBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[3]/section/div/div[1]/div[2]/div/form/div[9]/button");
    private final By cartBtn = By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div[2]/div[1]/div[2]/div[2]/ul/li[2]/a");
    private final By proceedToCheckoutBtn = By.xpath("(//button[@type='submit'])[1]");
    private final By firstNameField = By.xpath("//*[@id=\"shipAddressFirstname\"]");
    private final By lastNameField = By.xpath("//*[@id=\"shipAddressLastname\"]");
    private final By phoneNumberField = By.xpath("//*[@id=\"shipAddressPhone\"]");
    private final By houseNo = By.xpath("//*[@id='shipAddressHouseNumber']");
    private final By postCode = By.xpath("//*[@id='shipAddressZipcode']");
    private final By emailField = By.xpath("//*[@id=\"email\"]");
    private final By orderSummary = By.xpath("//*[@id=\"checkoutForm\"]/div[1]/div/div/div/section/div[1]/p");


    public void hoverOnChooseProduct() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(chooseProductBtn));
            WebElement element = driver.findElement(chooseProductBtn);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Failed to hover on 'Choose Product': " + e.getMessage());
        }
    }

    public void clickAllDulux() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(AllDuluxBtn));
            driver.findElement(AllDuluxBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'All Dulux' button: " + e.getMessage());
        }
    }

    public void clickInteriorOption() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(interiorCheckbox));
            driver.findElement(interiorCheckbox).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Interior Option' checkbox: " + e.getMessage());
        }
    }

    public void clickHallwayCheckbox() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(HallwayCheckbox));
            driver.findElement(HallwayCheckbox).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Hallway' checkbox: " + e.getMessage());
        }
    }

    public void clickDuluxColorTester() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(duluxColorTester));
            driver.findElement(duluxColorTester).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Dulux Color Tester': " + e.getMessage());
        }
    }

    public void clickSelectColorBox() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(selectColorBox));
            driver.findElement(selectColorBox).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Select Color Box': " + e.getMessage());
        }
    }

    public void setFeatherFlockBtn() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(featherFlockBtn));
            driver.findElement(featherFlockBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Feather Flock' button: " + e.getMessage());
        }
    }

    public void ClickGoBtn() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(GoBtn));
            driver.findElement(GoBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Go' button: " + e.getMessage());
        }
    }

    public void add3Quantity() {
        try {
            for (int i = 0; i < 2; i++) {
                Wait.waitForElementToBeVisible(driver, driver.findElement(addQuantityBtn));
                driver.findElement(addQuantityBtn).click();
            }
        } catch (Exception e) {
            System.out.println("Failed to add quantity: " + e.getMessage());
        }
    }

    public void clickAddToCartBtn() {
        try {
            Wait.waitForElementToBeClickable(driver, driver.findElement(AddToCartBtn));
            driver.findElement(AddToCartBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Add to Cart' button: " + e.getMessage());
        }
    }

    public void clickCartBtn() {
        try {
            Wait.waitForElementToBeClickable(driver, driver.findElement(cartBtn));
            driver.findElement(cartBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to click 'Cart' button: " + e.getMessage());
        }
    }

    public void setProceedToCheckoutBtn() {
        try {
            Wait.waitForElementToBeClickable(driver, driver.findElement(proceedToCheckoutBtn));
            driver.findElement(proceedToCheckoutBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to proceed to checkout: " + e.getMessage());
        }
    }

    public void setTypeAddress() {
        try {
            Wait.waitForElementToBeClickable(driver, driver.findElement(firstNameField));
            driver.findElement(firstNameField).sendKeys(data.getFirstName());
            driver.findElement(lastNameField).sendKeys(data.getLastName());
            driver.findElement(phoneNumberField).sendKeys(data.getPhoneNumber());
            driver.findElement(houseNo).sendKeys(data.getHouseNo());
            driver.findElement(postCode).sendKeys(data.getPostCode());
            driver.findElement(emailField).sendKeys(data.getEmail());
        } catch (Exception e) {
            System.out.println("Failed to set address details: " + e.getMessage());
        }
    }

    public void checkVisibleText() {
        try {
            Wait.waitForTextToBeVisible(driver, orderSummary, "Order Summary");
        } catch (Exception e) {
            System.out.println("Items Not Added To Cart" + e.getMessage());
        }
    }
}