package TC_05;

import TC_10.TC_10Elements;
import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05 extends BaseDriverGenel {
    @Test
    public void Test10() {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();

        TC_05Elements tc = new TC_05Elements();

        tc.username.sendKeys("Admin");
        tc.password.sendKeys("Admin123");
        tc.inpatientWard.click();
        tc.loginButton.click();
        Actions actions = new Actions(BaseDriverGenel.driver);
        Action action = actions.moveToElement(tc.icon).build();
        action.perform();
        wait.until(ExpectedConditions.visibilityOf(tc.iconLink));
        Assert.assertTrue(tc.iconLink.getText().equals("My Account"), "Failed");
        tc.iconLink.click();

        WebElement clickableElement1 = wait.until(ExpectedConditions.elementToBeClickable(tc.changePassword));
        Assert.assertTrue(clickableElement1.isDisplayed() && clickableElement1.isEnabled() &&
                tc.changePassword.getText().contains("Change Password"));

        WebElement clickableElement2 = wait.until(ExpectedConditions.elementToBeClickable(tc.myLanguages));
        Assert.assertTrue(clickableElement2.isDisplayed() && clickableElement2.isEnabled() &&
                tc.myLanguages.getText().contains("My Languages"));

    }
}
