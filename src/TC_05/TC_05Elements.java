package TC_05;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_05Elements {

    public TC_05Elements() {
        PageFactory.initElements(BaseDriverGenel.driver, this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/i[1]")
    public WebElement icon;

    @FindBy(xpath = "//*[@id='user-account-menu']/li/a")
    public WebElement iconLink;

    @FindBy(xpath = "//*[@id='tasks']/a[1]/div")
    public WebElement changePassword;

    @FindBy(xpath = "//*[@id='tasks']/a[2]/div")
    public WebElement myLanguages;

}
