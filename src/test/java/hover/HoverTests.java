package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1() {
        var hoverPage = homePage.clickHover();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
