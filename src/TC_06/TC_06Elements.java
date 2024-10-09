package TC_06;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_06Elements {
    public TC_06Elements(){
        PageFactory.initElements(BaseDriverGenel.driver,this);
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

    @FindBy(css = ".form-control")
    public WebElement searchByBox;

    @FindBy(xpath = "//tbody[@role='alert']")
    public WebElement patientInfoBox;

    @FindBy(xpath = "//td[@class=''][2]")
    public WebElement infoNameBox;

    @FindBy(css = ".info-header")
    public List<WebElement> headers;

    @FindBy(xpath = "//td[contains(text(),'No matching')]")
    public WebElement noPatientRecordBar;
}
