package Runner;

import Common.BaseClass;
import Common.Common;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.testng.annotations.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json", "html:target/default-html-reports"},
//        features = "src/test/java/Feature/Login.feature",
//        glue = {"StepDefinition/TestStepDef","src/main/java/org/example"})
public class TestRunner {
    WebDriver driver;
@BeforeClass
public void launch() {
driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}
@AfterClass
public void Close() {
        driver.close();
    }
//@AfterClass
//    public void quitBrowser(){
//    driver.quit();
//}
@Test
    public void verify_user_login() throws InterruptedException, IOException {
    Common com=new Common(driver);
    com.setUserName();
    com.setPassWord();
    }
    public void verify_user_logout(){

    }

}
