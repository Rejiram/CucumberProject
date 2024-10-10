package StepDefinition;

import Common.Common;
import gherkin.lexer.Th;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.Driver;

public class TestStepDef {
//    @Given("View PLP")
//    public void viewPLP() throws Throwable{
//        System.out.println("PLP displayed");
//        throw new PendingException();
//    }
    WebDriver driver;
Common ds=new Common(driver);

    public TestStepDef() throws IOException {
    }

    @When("Enter user name {string}")
    public void enterUserName(String userName) {
        System.out.println(userName);
    }

    @And("Enter password {string}")
    public void enterPassword(String pwd) {
        System.out.println(pwd);
    }

    @Then("Validate my account page")
    public void validateMyAccountPage() throws Throwable {
        System.out.println("My account page displayed");
        throw new PendingException();
    }

//    @When("Click on Product")
//    public void clickOnProduct() throws Throwable{
//        System.out.println("Product listed");
//        throw new PendingException();
//    }

//    @And("Click on Add to Cart")
//    public void clickOnAddToCart() throws Throwable {
//        System.out.println("Add to Cart button displayed");
//        throw new PendingException();
//    }

//    @Then("Validate cart page")
//    public void validateCartPage() throws Throwable {
//        System.out.println("Product added to cart page");
//        throw new PendingException();
//    }

    @Given("Access login page")
    public void accessLoginPage() throws InterruptedException {
        ds.setUserName();
        ds.setPassWord();
    }

    @Given("^View PLP$")
    public void view_PLP() throws Throwable {
        System.out.println("PLP displayed");

    }

    @When("^Click on Product$")
    public void click_on_Product()  {
        System.out.println("Product listed");

    }

    @When("^Click on Add to Cart$")
    public void click_on_Add_to_Cart()  {
        System.out.println("Add to Cart button displayed");

    }

    @Then("^Validate cart page$")
    public void validate_cart_page()  {
        System.out.println("Product added to cart page");

    }
}
