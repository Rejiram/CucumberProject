package Common;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorLoader {

        public void reader() throws IOException {

            // Load the properties file
            Properties prop = new Properties();
            FileInputStream input = new FileInputStream("javaLoc.properties");
            prop.load(input);

            // Use locators from properties file
            String usernameLocator = prop.getProperty("login.username.xpath");
            String passwordLocator = prop.getProperty("login.password.xpath");
            String submitButtonLocator = prop.getProperty("login.submitButton.xpath");

            // Locate elements and interact with them
//            WebElement usernameField = driver.findElement(By.xpath(usernameLocator));
//            WebElement passwordField = driver.findElement(By.xpath(passwordLocator));
//            WebElement submitButton = driver.findElement(By.xpath(submitButtonLocator));
//
//            // Perform actions on the web elements
//            usernameField.sendKeys("yourUsername");
//            passwordField.sendKeys("yourPassword");
//            submitButton.click();
//
//            // Close the browser
//            driver.quit();
        }


}
