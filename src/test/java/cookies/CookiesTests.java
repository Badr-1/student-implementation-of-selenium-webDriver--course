package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CookiesTests extends BaseTests {
    @Test
    public void testDeleteCookie() {
        var cookieManager = homePage.getCookieManager();
        Cookie cookie = new Cookie.Builder("optimizelyBuckets", "%7B%TD").isSecure(true).build();
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie is present");
    }
}
