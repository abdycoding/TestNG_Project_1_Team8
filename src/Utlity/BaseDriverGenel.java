package Utlity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriverGenel {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Logger  addLog= LogManager.getLogger();
    public static JavascriptExecutor tx;
    @BeforeClass
    public void BaslangicIslemleri(){
       // System.out.println("Başlangıç işlemleri yapılıyor");
        addLog.info("The logging process is started");
        driver=new ChromeDriver();
        tx = (JavascriptExecutor) driver;
        addLog.info("THe driver is started");
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @AfterClass
    public void KapanisIslemleri(){
       // System.out.println("Kapanis işlemleri yapılıyor");

        Tools.Bekle(3);
        driver.quit();
        addLog.info("the logging process has finished");
    }


}
