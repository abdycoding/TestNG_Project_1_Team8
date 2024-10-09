package TC_06;

import Utlity.BaseDriverGenel;
import Utlity.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TC_06 extends BaseDriverGenel {
    @Test(priority = 1)
    public void PositivePatientInfoSearchFunctionality(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();

        TC_06Elements tc = new TC_06Elements();
        tc.userNameBox.sendKeys("admin");
        tc.passwordBox.sendKeys("Admin123");
        tc.registrationDeskButton.click();
        tc.loginButton.click();
        tc.findPatientButton.click();
        tc.searchByBox.sendKeys("Paul Walker");
        Assert.assertTrue(tc.infoNameBox.isDisplayed());
        Tools.Bekle(1);
        Assert.assertEquals(tc.infoNameBox.getText(),"Paul Walker");
        Tools.Bekle(1);
        tc.patientInfoBox.click();

        List<String> actualHeaders = new ArrayList<>();
        List<String> expectedHeaders = new ArrayList<>();
        for (int i = 0; i < tc.headers.size(); i++) {
            Assert.assertTrue(tc.headers.get(i).isDisplayed());
            actualHeaders.add(tc.headers.get(i).getText());
            expectedHeaders.add(tc.headers.get(i).getText());
        }
        Assert.assertEquals(actualHeaders,expectedHeaders);
    }

    @Test(priority = 2)
    public void NegativePatientSearch(){
        Tools.Bekle(1);
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();
        TC_06Elements tc = new TC_06Elements();
        Tools.Bekle(1);
        tc.findPatientButton.click();
        tc.searchByBox.sendKeys("Marcelo Garcia");
        Assert.assertEquals(tc.noPatientRecordBar.getText(),"No matching records found");
    }
}
