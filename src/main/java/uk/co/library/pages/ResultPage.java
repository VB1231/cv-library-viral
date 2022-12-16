package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void verifyTheResults(String expected){
        Reporter.log("verify text"+resultText.toString());
         Assert.assertTrue(getTextFromElement(resultText).contains(expected));
       // CustomListeners.test.log(Status.PASS,"text"+resultText);
    }

}
