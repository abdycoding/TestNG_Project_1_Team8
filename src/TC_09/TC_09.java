package TC_09;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TC_09 extends BaseDriverGenel {

    @Test
    public void Test_09() {
        driver.get("https://demo.openmrs.org/");
        driver.manage().window().maximize();


        TC_09Elements tc = new TC_09Elements();

        tc.username.sendKeys("Admin");
        tc.password.sendKeys("Admin123");
        tc.inpatient_Ward.click();
        tc.login_Button.click();

        tc.register_Patient.click();
        tc.given_name.sendKeys("Laurel");
        tc.middle_name.sendKeys("Eric");
        tc.family_name.sendKeys("Paulson");
        tc.next_Button.click();
        Select select = new Select(tc.select_gender);
        select.selectByIndex(1);
        tc.next_Button.click();
        tc.day.sendKeys("23");
        Select selectMonth = new Select(tc.month);
        selectMonth.selectByIndex(3);
        tc.year.sendKeys("1980");
        tc.next_Button.click();
        tc.adres1.sendKeys("7779 Barrows Cape Suite 944, New HampShire");
        tc.city.sendKeys("New Hampshire");
        tc.state.sendKeys("New Hampshire");
        tc.country.sendKeys("USA");
        tc.postalcode.sendKeys("52206");
        tc.next_Button.click();

        tc.phoneNumber.sendKeys("6879625846369");
        tc.next_Button.click();

        Select relative = new Select(tc.relationship);
        relative.selectByVisibleText("Parent");
        tc.person_Name.sendKeys("Paul");
        tc.next_Button.click();
        tc.confirm.click();

        List<String> idler = new ArrayList<>();
        idler.add(tc.patient_id.getText());

        tc.home.click();

        tc.register_Patient.click();
        tc.given_name.sendKeys("Patrick");
        tc.middle_name.sendKeys("Jake");
        tc.family_name.sendKeys("Evra");
        tc.next_Button.click();
        Select select2 = new Select(tc.select_gender);
        select2.selectByIndex(0);
        tc.next_Button.click();
        tc.day.sendKeys("31");
        Select selectMonth2 = new Select(tc.month);
        selectMonth2.selectByIndex(1);
        tc.year.sendKeys("1988");
        tc.next_Button.click();
        tc.adres1.sendKeys("154th street Orlando, NewYork");
        tc.city.sendKeys("Orlando");
        tc.state.sendKeys("New York");
        tc.country.sendKeys("USA");
        tc.postalcode.sendKeys("65320");
        tc.next_Button.click();

        tc.phoneNumber.sendKeys("66689523645");
        tc.next_Button.click();

        Select relative2 = new Select(tc.relationship);
        relative2.selectByVisibleText("Sibling");
        tc.person_Name.sendKeys("Jake");
        tc.next_Button.click();
        tc.confirm.click();
        idler.add(tc.patient_id.getText());

        tc.home.click();

        tc.dataManagement.click();
        tc.merge.click();

        tc.patient_id1.sendKeys(idler.get(0));
        tc.patient_id2.sendKeys(idler.get(1) + Keys.ENTER);


        wait.until(ExpectedConditions.elementToBeClickable(tc.continueButton));
        tc.continueButton.click();
        tc.firstPatient.click();

        Assert.assertTrue(tc.headline1.getText().contains("Merging cannot be undone!"));

        tc.confirm_Button.click();

        Assert.assertEquals(tc.patient_ids.get(0).getText(), idler.get(0), "The ids are not equal");
        Assert.assertEquals(tc.patient_ids.get(1).getText(), idler.get(1), "The ids are not equal");
    }
}
