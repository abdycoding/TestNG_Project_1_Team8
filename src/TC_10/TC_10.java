package TC_10;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_10 extends BaseDriverGenel {
    @Test
    public void Test10() {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();

        TC_10Elements tc = new TC_10Elements();

        tc.username.sendKeys("Admin");
        tc.password.sendKeys("Admin123");
        tc.inpatientWard.click();
        tc.loginButton.click();
        tc.appShcButton.click();
        tc.mngAppointmentButton.click();
        tc.patientSearch.sendKeys("100J27");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='patient-search-results-table']/tbody/tr/td[1]")));
        tc.getPatientSearch.click();
        wait.until(ExpectedConditions.visibilityOf(tc.getAssert));
        Assert.assertTrue(tc.getAssert.getText().contains("Your computer is not set to the right time zone. Please change to Coordinated Universal Time" +
                " and then close and restart your browser to assure proper scheduling functionality."),"Failed");

    }
}
