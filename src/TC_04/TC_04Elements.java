package TC_04;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC_04Elements {
    public TC_04Elements() {PageFactory.initElements(BaseDriverGenel.driver,this); }

    @FindBy(xpath = "//div[@class='gt-current-lang']")
    public WebElement dropdown;

    @FindBy (xpath = "//a[contains(text(),'English')]")
    public WebElement englishlang;

    @FindBy (xpath = "//span[contains(text(),'Enter the OpenMRS 2 Demo')]")
    public WebElement entTheMRS2Demo;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy (xpath = "//i[@class='fa fa-eye']")
    public WebElement eye;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Pharmacy")
    public WebElement pharmacy;

    @FindBy(id = "loginButton")
    public WebElement login_Button;

    @FindBy (xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    public WebElement regapatient;

    @FindBy (css = "[name='givenName']")
    public WebElement givenName;

    @FindBy (css = "[name='middleName']")
    public WebElement middleName;

    @FindBy (css = "[name='familyName']")
    public WebElement familyName;

    @FindBy (id = "next-button")
    public WebElement nxtButton;

    @FindBy (xpath = "//option[@value='F']")
    public WebElement femaleopt;

    @FindBy (xpath = "//input[@name='birthdateDay']")
    public WebElement birthdateDay;

    @FindBy (xpath = "//select[@name='birthdateMonth']")
    public WebElement birthdateMonth;

    @FindBy (xpath = "//input[@name='birthdateYear']")
    public WebElement birthdateYear;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "cityVillage")
    public WebElement city;

    @FindBy (id = "stateProvince")
    public WebElement state;

    @FindBy (id = "country")
    public WebElement country;

    @FindBy (id = "postalCode")
    public WebElement postalCode;

    @FindBy (name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy (xpath = "//select[@id='relationship_type']")
    public WebElement slctRelation;

    @FindBy (xpath = "//input[@placeholder='Person Name']")
    public WebElement personName;

    @FindBy (xpath = "//i[@class='icon-plus-sign edit-action']")
    public WebElement plusBtn;

    @FindBy (xpath = "//select[@id='relationship_type']")
    public WebElement slctRelation2;

    @FindBy (id = "submit")
    public WebElement confirm;

    @FindBy (xpath = "//h1[@class='mt-0 mb-2 name']")
    public WebElement prsnNameVerification;

}
