package objects;

import configuration.ConfigReader;
import configuration.Driver;
import org.openqa.selenium.*;
import utilities.Wait;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePageObj {

    static String url = ConfigReader.getProperty("url");
    protected static WebDriver driver;

    private final By acceptCookiesBtn = By.xpath("//button[@id='onetrust-accept-btn-handler']");


    public BasePageObj() {
        try {
            driver = Driver.getDriver();
        } catch (Exception e) {
            System.out.println("Failed to initialize driver: " + e.getMessage());
        }
    }

    public void navigateToUrl() {
        try {
            driver.get(url);
        } catch (Exception e) {
            System.out.println("Failed to navigate to URL: " + e.getMessage());
        }
    }

    public void acceptCookies() {
        try {
            Wait.waitForElementToBeVisible(driver, driver.findElement(acceptCookiesBtn));
            driver.findElement(acceptCookiesBtn).click();
        } catch (Exception e) {
            System.out.println("Failed to accept cookies: " + e.getMessage());
        }
    }

    public void takeScreenshot(String screenshotFolderPath, String fileNamePrefix) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destFile = new File(screenshotFolderPath + File.separator + fileNamePrefix + "_" + timestamp + ".png");

        try {
            Files.copy(srcFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
        }
    }

}
