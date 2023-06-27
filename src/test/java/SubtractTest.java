import org.junit.Assert;
import org.junit.Test;


public class SubtractTest extends BaseTest{
    private final static String BASE_URL="https://testsheepnz.github.io/BasicCalculator.html";
    @Test
    public void Subtract(){
        var resultExpected = "-1";
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.setSelectBuild("Prototype");
        mainPage.writeInputOne("2");
        mainPage.writeInputTwo("3");
        mainPage.setSelectOperation("Subtract");
        mainPage.clickOnButton();
        var resultActual = mainPage.getInputAnswer();
        Assert.assertEquals(resultExpected,resultActual);
    }
    @Test
    public void Concatenate(){
        var resultExpected = "gsbu";
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.writeInputOne("gs");
        mainPage.writeInputTwo("bu");
        mainPage.setSelectOperation("Concatenate");
        mainPage.clickOnButton();
        var resultActual = mainPage.getInputAnswer();
        Assert.assertEquals(resultExpected,resultActual);
    }

}
