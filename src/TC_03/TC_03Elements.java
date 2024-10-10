package TC_03;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_03Elements {
    public TC_03Elements() {PageFactory.initElements(BaseDriverGenel.driver,this); }

    @FindBy (xpath = "//div[@class='gt-current-lang']")
    public WebElement dropdown;

    @FindBy (xpath = "//a[contains(text(),'English')]")
    public WebElement englishlang;

    @FindBy (xpath = "//span[contains(text(),'Enter the OpenMRS 2 Demo')]")
    public WebElement entTheMRS2Demo;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpationWard;

    @FindBy(id = "loginButton")
    public WebElement login_Button;

    @FindBy (xpath = "//span[@id='selected-location']")
    public WebElement inpWardverification;

    @FindBy (xpath = " //i[@class='icon-signout small']")
    public WebElement logOut;

}
