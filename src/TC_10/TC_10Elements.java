package TC_10;

import Utlity.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_10Elements {


    public TC_10Elements() {
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

    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    public WebElement appShcButton;

    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement mngAppointmentButton;

    @FindBy(id = "patient-search")
    public WebElement patientSearch;

    @FindBy(xpath ="//*[@id='patient-search-results-table']/tbody/tr/td[1]")
    public WebElement getPatientSearch;

    @FindBy(xpath ="//*[@id='time-zone-warning']/div/div/p")
    public WebElement getAssert;

}
