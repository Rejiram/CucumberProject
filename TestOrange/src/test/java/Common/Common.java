package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Common extends BaseClass {
    LocatorLoader lo=new LocatorLoader();
    ReadFileData rf = new ReadFileData();
    //    static Locator loc=new Locator();
//    public static WebDriver driver;
//    WebDriver driver;
//    Properties prop = new Properties();
    public Common(WebDriver driver) throws IOException {

        super(driver);
//        overrideFindBy(usernameField, "userid");
//        overrideFindBy(passwordField, "pwd");
//        overrideFindBy(submitButton, "login.submitButton.id");
    }
    // WebElements defined with @FindBy, but these locators will be overridden dynamically
    @FindBy(id = LocatorIn.userid) // This is just a placeholder
    private WebElement usernameField;

    @FindBy(id = LocatorIn.pwd) // Placeholder
    private WebElement passwordField;

    @FindBy(id = "submit") // Placeholder
    private WebElement submitButton;
//    @FindBy(xpath = "usernameLocator")
//    WebElement userName;
//    @FindBy(name = "password")
//    WebElement passWord;
//    @FindBy(name = "fdsf")
//    WebElement sdsfd;




//    public static void main(String[] args) throws InterruptedException {
////        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chrome.exe");
////        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//driver.manage().window().maximize();
//Thread.sleep(5000);
//WebElement username =driver.findElement();
//
//        username.sendKeys("Admin");
//
//        driver.findElement(loc.userName).sendKeys("admin123");
//        driver.getTitle();
//    }
//    public Common() {
//        this.driver = driver;
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "src/main/resources/driver/chrome.exe");
//        this.driver = new ChromeDriver();
//        driver.get("url");
//    }

//    public void Close() {
//        driver.close();
//    }

    public void setUserName() throws InterruptedException {
        Thread.sleep(1000);
        Thread.sleep(5000);
        usernameField.sendKeys("admin");
        rf.readData();
    }

    public void setPassWord() {
        passwordField.sendKeys("admin123");

    }

}
