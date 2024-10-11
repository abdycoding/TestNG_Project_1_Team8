package TC_02;
import Utlity.BaseDriver;
import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_02Elements  {
    public TC_02Elements(){
        PageFactory.initElements(BaseDriverGenel.driver, this);
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

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy(xpath="//*[@id='loginButton']")
    public WebElement login;


}
