package TC_01;

import Utlity.BaseDriver;
import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Utlity.BaseDriverGenel.driver;


public class TC_01Elements {
    public TC_01Elements(){
        PageFactory.initElements(driver, this);
    }
    //https://openmrs.org/  https://demo.openmrs.org/openmrs/login.htm

    @FindBy(xpath="//*[@class='gt-current-lang']")
    public WebElement lang;

    @FindBy(xpath="//*[@class='nturl'][1]")
    public WebElement eng;

    @FindBy(xpath="//*[@class='zak-button']")
    public WebElement demo;//

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement openMRS2;

    @FindBy(css = "a[href='https://demo.openmrs.org/openmrs/login.htm']")
    public WebElement openMRS2Demo;

    @FindBy(xpath="//*[@id='username']")
    public WebElement username;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;

    @FindBy(xpath="//*[@id='loginButton']")
    public WebElement login;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;



}
