package TC_04;

import TC_03.TC_03Elements;
import Utlity.BaseDriverGenel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_04 extends BaseDriverGenel {

    @Test
    public void patientRegistration() {
        TC_04Elements pR = new TC_04Elements();

        driver.get("https://openmrs.org/demo/");
        driver.manage().window().maximize();
        pR.dropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(pR.englishlang));
        pR.englishlang.click();

        wait.until(ExpectedConditions.elementToBeClickable(pR.entTheMRS2Demo));
        pR.entTheMRS2Demo.click();

        pR.userName.sendKeys("admin");
        pR.eye.click();
        pR.password.sendKeys("Admin123");
        pR.pharmacy.click();
        pR.login_Button.click();
        pR.regapatient.click();

        pR.givenName.sendKeys("Jane");
        pR.middleName.sendKeys("Annie");
        pR.familyName.sendKeys("Parker");
        pR.nxtButton.click();

        pR.femaleopt.click();
        pR.nxtButton.click();

        pR.birthdateDay.click();
        pR.birthdateDay.sendKeys("20");
        pR.birthdateMonth.click();
        WebElement birthdateMonth = driver.findElement(By.xpath("//select[@name='birthdateMonth']"));
        Select selectMonth= new Select(birthdateMonth);
        selectMonth.selectByValue("8");
        pR.birthdateYear.click();
        pR.birthdateYear.sendKeys("1985");
        pR.nxtButton.click();

        pR.address1.click();
        pR.address1.sendKeys("456 Oak St. Dallas, TX");
        pR.city.click();
        pR.city.sendKeys("Dallas");
        pR.state.click();
        pR.state.sendKeys("Texas");
        pR.country.click();
        pR.country.sendKeys("USA");
        pR.postalCode.click();
        pR.postalCode.sendKeys("45687");
        pR.nxtButton.click();

        pR.phoneNumber.click();
        pR.phoneNumber.sendKeys("5552345678");
        pR.nxtButton.click();

        pR.slctRelation.click();
        WebElement slctRelation = driver.findElement(By.xpath("//select[@id='relationship_type']"));
        Select selectRelationType = new Select(slctRelation);
        selectRelationType.selectByIndex(3);
        pR.personName.click();
        pR.personName.sendKeys("John Doe");
        pR.plusBtn.click();
        pR.slctRelation2.click();
        WebElement slctRelation2 = driver.findElement(By.xpath("//select[@id='relationship_type']"));
        Select selectRelationType2 = new Select(slctRelation2);
        selectRelationType.selectByIndex(7);
        pR.personName.click();
        pR.personName.sendKeys("Olivia Johnson");
        pR.nxtButton.click();

        pR.confirm.click();

        WebElement personName = driver.findElement(By.xpath("//h1[@class='mt-0 mb-2 name']"));
        Assert.assertTrue(personName != pR.prsnNameVerification, "Patient registration couldn't be made");

    }
}
