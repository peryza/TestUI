import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
public class MainPage {
    private final SelenideElement selectBuild = $x(" //select[@name='selectBuild']");
    private final SelenideElement inputNumOne = $x("//input[@name='number1']");
    private final SelenideElement inputNumTwo = $x("//input[@name='number2']");
    private final SelenideElement selectOperation = $x("//select[@name='selectOperation']");
    private final SelenideElement buttonCalc = $x("//input[@value='Calculate']");
    private final SelenideElement inputAnswer = $x("//input[@name='numberAnswer']");
    public void openWebSite(String url){
      Selenide.open(url);
    }
    public void setSelectBuild(String text){
        selectBuild.selectOptionContainingText(text);
    }
    public void writeInputOne(String numberOne){
        inputNumOne.setValue(numberOne);
    }
    public void writeInputTwo(String numberTwo){
        inputNumTwo.setValue(numberTwo);
    }
    public void setSelectOperation(String text){
        selectOperation.selectOptionContainingText(text);
    }
    public void clickOnButton(){
        buttonCalc.click();
    }
    public String getInputAnswer(){
        return inputAnswer.getValue();
    }
}
