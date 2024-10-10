package Common;

import gherkin.deps.net.iharder.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {
    protected WebDriver driver;
    private Properties locators;
//    private Properties properties = new Properties();
    public BaseClass(WebDriver driver) throws IOException {
        this.driver=driver;
//        locators = new Properties();
//        FileInputStream input = new FileInputStream("javaLoc.properties");
//        locators.load(input);
        PageFactory.initElements(driver, this);
//        PageFactory.initElements(driver,this);
//        Properties prop = new Properties();
//        FileInputStream input = new FileInputStream("javaLoc.properties");
//        prop.load(input);
//        String usernameLocator = prop.getProperty("userid");
//        String passwordLocator = prop.getProperty("login.password.xpath");
//        String submitButtonLocator = prop.getProperty("login.submitButton.xpath");
    }

    public String getLocator(String key) {
        return locators.getProperty(key);
    }
//     Dynamically override @FindBy elements by locator from properties file
    public void overrideFindBy(WebElement element, String key) {
        String locator = getLocator(key);
        if (locator != null && !locator.isEmpty()) {
            if (locator.startsWith("id=")) {
                element = driver.findElement(By.id(locator.substring(3)));
            } else if (locator.startsWith("xpath=")) {
                element = driver.findElement(By.xpath(locator.substring(6)));
            }
            // Extend this to handle CSS, name, etc., as needed
        }
    }
    public static String readConfigFile(String keyword) throws IOException {
        String fileInput = null;
        Properties prop = new Properties();
//            prop.load(fileInput);

        String propFileName = "javaLoc.properties";
        InputStream inputStream = new FileInputStream(propFileName);
        prop.load(inputStream);
        fileInput = prop.getProperty(keyword);
        return fileInput;
    }

}
