package TC_08;

import TC_07.TC_07Elements;
import Utlity.BaseDriverGenel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_08 extends BaseDriverGenel {

    @Test
    public void PatientList(){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        TC_08Elements tc=new TC_08Elements();

        tc.userNameBox.sendKeys("admin");
        tc.passwordBox.sendKeys("Admin123");
        tc.registrationDeskButton.click();
        tc.loginButton.click();
        tc.findPatientButton.click();

        // Find Z in the "Showing X to Y of Z entries
        String[] totalrowinfo=tc.patientcountinfo.getText().split(" ");
        int totalrow=Integer.parseInt(totalrowinfo[3]);

        //rowcounts=satır sayısı
        Assert.assertTrue(tc.rowcounts.size()==totalrow, "Test Başarısız: Tablo satır sayısı toplam giriş sayısıyla eşleşmiyor.");

    }
}
