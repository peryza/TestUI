import org.junit.Assert;
import org.junit.Test;


public class GameTest extends BaseTest {
    private final static String BASE_URL="https://testsheepnz.github.io/random-number.html";
    @Test
    public void TestGame(){
        var resultExpected = "string: Not a number!";
        GamePage gamePage = new GamePage();
        gamePage.openWebSite(BASE_URL);
        gamePage.setBuild("Demo");
        gamePage.clickButtonRTD();
        gamePage.setInputNum("string");
        gamePage.clickInputSubmit();
        var resultActual = gamePage.getValueLabel();
        Assert.assertEquals(resultExpected,resultActual);
    }
}
