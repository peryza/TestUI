import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class GamePage {
    private final SelenideElement selectBuildNum = $x("//select[@name='buildNumber']");
    private final SelenideElement ButtonRTD = $x("//input[@value='Roll the dice']");
    private final SelenideElement inputNumGuess = $x("//input[@name='numberGuess']");
    private final SelenideElement inputSubmit = $x("//input[@value='Submit']");
    private final SelenideElement label = $x("//label[@id='feedbackLabel']//font//b//i");
    public void openWebSite(String url){
        Selenide.open(url);
    }
    public void setBuild(String text){
        selectBuildNum.selectOptionContainingText(text);
        selectBuildNum.sendKeys(Keys.PAGE_DOWN);
    }
    public void clickButtonRTD(){
        ButtonRTD.click();
    }
    public void setInputNum(String text){
        inputNumGuess.setValue(text);
    }
    public void clickInputSubmit(){
        inputSubmit.click();
    }
    public String getValueLabel(){
        return label.getText();
    }

    public void scrollDown(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }



}
