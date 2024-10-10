package TC_08;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_08Elements {

    public TC_08Elements() {

        PageFactory.initElements(BaseDriverGenel.driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//li[@id='Registration Desk']")
    public WebElement registrationDeskButton;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement findPatientButton;

    @FindBy(xpath = "//*[@id='patient-search-results-table_info']")
    public WebElement patientcountinfo;

    @FindBy(css = "[role='alert']>tr")
    public List<WebElement> rowcounts;



}
