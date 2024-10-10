package TC_07;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_07Elements {

    public TC_07Elements(){

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

    @FindBy(xpath = "//*[text()='100LAL']")
    public WebElement id;

    @FindBy(xpath = "(//*[@class='col-11 col-lg-10'])[8]")
    public WebElement deletebutton;

    @FindBy(xpath = "//*[@id='delete-reason']")
    public WebElement deletereasonBox;

    @FindBy(xpath = "(//*[text()='Confirm'])[4]")
    public WebElement confirmbutton;

    @FindBy(xpath = "//*[@class='dataTables_empty']")
    public WebElement message;


}
