package TC_03;


import Utlity.BaseDriverGenel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03 extends BaseDriverGenel {
    @Test
    public void logOut()
    {
        TC_03Elements lgo = new TC_03Elements();

        driver.get("https://openmrs.org/tr/demo/");
        driver.manage().window().maximize();
        lgo.dropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(lgo.englishlang));
        lgo.englishlang.click();

        wait.until(ExpectedConditions.elementToBeClickable(lgo.entTheMRS2Demo));
        lgo.entTheMRS2Demo.click();

        lgo.userName.sendKeys("admin");
        lgo.password.sendKeys("Admin123");
        lgo.inpationWard.click();
        lgo.login_Button.click();

        WebElement inpWardverification = driver.findElement(By.xpath("//span[@id='selected-location']"));
        Assert.assertTrue(inpWardverification.isDisplayed(),"Seçilen lokasyon bulunamadı");

        lgo.logOut.click();

    }
}
