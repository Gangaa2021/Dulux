package configuration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CookieManager {
    private WebDriver driver;

    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }

    public void addCookie(String name, String value) {
        Cookie cookie = new Cookie(name, value);
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(String name) {
        driver.manage().deleteCookieNamed(name);
    }

    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }

    public Set<Cookie> getAllCookies() {
        return driver.manage().getCookies();
    }

    public Cookie getCookie(String name) {
        return driver.manage().getCookieNamed(name);
    }
}

