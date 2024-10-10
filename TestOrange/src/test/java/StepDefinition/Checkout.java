package StepDefinition;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {


    @Given("^Add product to cart as guest$")
    public void add_product_to_cart_as_guest() {
        System.out.println("Guest added product to cart");
    }

    @Given("^view checkout page$")
    public void view_checkout_page() {
        System.out.println("Checkout page displayed");
    }

    @When("^Enter payment details$")
    public void enter_payment_details() {
        System.out.println("Payment details added");
    }

    @Then("^Place order$")
    public void place_order() {
        System.out.print("Order placed successfully");
    }

}
