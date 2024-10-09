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
        TC_04Elements lgo = new TC_04Elements();

        driver.get("https://openmrs.org/demo/");
        driver.manage().window().maximize();
        lgo.dropdown.click();
        wait.until(ExpectedConditions.elementToBeClickable(lgo.englishlang));
        lgo.englishlang.click();

        wait.until(ExpectedConditions.elementToBeClickable(lgo.entTheMRS2Demo));
        lgo.entTheMRS2Demo.click();

        lgo.userName.sendKeys("admin");
        lgo.eye.click();
        lgo.password.sendKeys("Admin123");
        lgo.pharmacy.click();
        lgo.login_Button.click();
        lgo.regapatient.click();

        lgo.givenName.sendKeys("Jane");
        lgo.middleName.sendKeys("Annie");
        lgo.familyName.sendKeys("Parker");
        lgo.nxtButton.click();

        lgo.femaleopt.click();
        lgo.nxtButton.click();

        lgo.birthdateDay.click();
        lgo.birthdateDay.sendKeys("20");
        lgo.birthdateMonth.click();
        WebElement birthdateMonth = driver.findElement(By.xpath("//select[@name='birthdateMonth']"));
        Select selectMonth= new Select(birthdateMonth);
        selectMonth.selectByValue("8");
        lgo.birthdateYear.click();
        lgo.birthdateYear.sendKeys("1985");
        lgo.nxtButton.click();

        lgo.address1.click();
        lgo.address1.sendKeys("456 Oak St. Dallas, TX");
        lgo.city.click();
        lgo.city.sendKeys("Dallas");
        lgo.state.click();
        lgo.state.sendKeys("Texas");
        lgo.country.click();
        lgo.country.sendKeys("USA");
        lgo.postalCode.click();
        lgo.postalCode.sendKeys("45687");
        lgo.nxtButton.click();

        lgo.phoneNumber.click();
        lgo.phoneNumber.sendKeys("5552345678");
        lgo.nxtButton.click();

        lgo.slctRelation.click();
        WebElement slctRelation = driver.findElement(By.xpath("//select[@id='relationship_type']"));
        Select selectRelationType = new Select(slctRelation);
        selectRelationType.selectByIndex(3);
        lgo.personName.click();
        lgo.personName.sendKeys("John Doe");
        lgo.plusBtn.click();
        lgo.slctRelation2.click();
        WebElement slctRelation2 = driver.findElement(By.xpath("//select[@id='relationship_type']"));
        Select selectRelationType2 = new Select(slctRelation2);
        selectRelationType.selectByIndex(7);
        lgo.personName.click();
        lgo.personName.sendKeys("Olivia Johnson");
        lgo.nxtButton.click();

        lgo.confirm.click();

        //Assert.assertTrue();

    }
}
