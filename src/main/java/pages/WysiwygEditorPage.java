package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    private By decreaseIndentButton = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public String getTextArea(){
        driver.switchTo().frame(editorIframeId);
        var text = driver.findElement(textArea).getText();
        driver.switchTo().parentFrame();
        return text;
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
}
