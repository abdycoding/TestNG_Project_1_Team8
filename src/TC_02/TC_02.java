package TC_02;

import TC_01.TC_01Elements;
import Utlity.BaseDriverGenel;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_02 extends BaseDriverGenel {

    @Test
    public void Test_02() {
        driver.get("https://openmrs.org");
        driver.manage().window().maximize();

        TC_02Elements tc=new TC_02Elements();

        tc.lang.click();
        wait.until(ExpectedConditions.elementToBeClickable(tc.eng)).click();

        tc.demo.click();
        tc.openMRS2.click();
//        tc.openMRS2Demo.click();
//        driver.switchTo().frame(tc.openMRS2Demo);
        wait.until(ExpectedConditions.elementToBeClickable(tc.openMRS2Demo)).click();

        tc.username.sendKeys("Admin");
        tc.password.sendKeys("Admin123");
        tc.inpatientWard.click();

        tc.login.click();

    }
}
