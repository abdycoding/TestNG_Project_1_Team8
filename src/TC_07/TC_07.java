package TC_07;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_07 extends BaseDriverGenel {

    @Test
    public void DeleteFromPatientRecord(){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        TC_07Elements tc=new TC_07Elements();

        tc.userNameBox.sendKeys("admin");
        tc.passwordBox.sendKeys("Admin123");
        tc.registrationDeskButton.click();
        tc.loginButton.click();
        tc.findPatientButton.click();
        tc.searchByBox.sendKeys("100LG8");
        wait.until(ExpectedConditions.elementToBeClickable(tc.id));
        tc.id.click();
        tc.deletebutton.click();
        tc.deletereasonBox.sendKeys("wrong informations");
        tc.confirmbutton.click();
        wait.until(ExpectedConditions.elementToBeClickable(tc.searchByBox));
        tc.searchByBox.sendKeys("100LG8");
        Assert.assertTrue(tc.message.isDisplayed(), "Bir hata var.");
    }
}
