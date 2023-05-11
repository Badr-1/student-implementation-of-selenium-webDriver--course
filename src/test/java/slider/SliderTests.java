package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void testSlider() {
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue("4");
        Assert.assertEquals(sliderPage.getSliderValue(), "4", "Slider value is incorrect");
    }
}
