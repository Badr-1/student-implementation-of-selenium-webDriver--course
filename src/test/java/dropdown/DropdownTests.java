package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption() {
        DropDownPage dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
