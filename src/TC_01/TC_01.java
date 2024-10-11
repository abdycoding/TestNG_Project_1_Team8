package TC_01;

import Utlity.BaseDriver;
import Utlity.BaseDriverGenel;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC_01 extends BaseDriverGenel {

    @Test
    public void Test01(){
        TC_01Elements tc=new TC_01Elements();
        driver.get("https://openmrs.org");

        driver.manage().window().maximize();

        wait.until(ExpectedConditions.elementToBeClickable(tc.lang)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tc.eng)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tc.demo)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tc.openMRS2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tc.openMRS2Demo)).click();

        tx.executeScript("arguments[0].click();",tc.openMRS2Demo);
        wait.until(ExpectedConditions.urlContains("login"));

    }

    @Test(dataProvider = "userData", dependsOnMethods = {"Test01"})
    public void Test_01(String userName, String password){

        TC_01Elements tc=new TC_01Elements();
        if (!tc.username.getText().isEmpty() )
            tc.username.clear();
        else
            tc.username.sendKeys(userName);
        tc.password.clear();
        tc.password.sendKeys(password);

        tc.login.click();   tc.inpatientWard.click();
        wait.until(ExpectedConditions.urlContains("error"));
        WebElement ekranYazi = driver.findElement(By.xpath("//*[@id='sessionLocationError']"));
        Assert.assertEquals(ekranYazi.getText(), "You must choose a location!!");



    }

    @DataProvider
    Object[][] userData() {

        Object[][] userdata ={
                {" ", " "},
                {"techno", " "},
                {" ", "123"},
                {"techno", "123"},
                {"Admin", "123"},
                {"techno", "Admin123"},
        };
        return userdata;
    }

}


