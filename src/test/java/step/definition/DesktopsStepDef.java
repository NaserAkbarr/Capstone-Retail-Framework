package step.definition;

import java.util.List;
import java.util.Map;


import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;

public class DesktopsStepDef extends Base{
	
	DesktopsPage desktops = new DesktopsPage();
	
	@Given("User is on Retail website two")
	public void user_is_on_retail_website_two() {
		Assert.assertTrue(desktops.retailWebsiteDisplayed());
		logger.info("user is on Retail website two");
	}
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktops.clickDesktopsTab();
		logger.info("user click on Desktops tab");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktops.clickShowAllDesktops();
		logger.info("user click on show all desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> items = desktops.elements();
		for (WebElement element : items) {
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("alt") + " is present in this page");
	}
}
	@When("User click ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String string) {
	    desktops.clickHpLpAddToCart();
	    logger.info("user click add to cart option on item");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	    Assert.assertTrue(desktops.qtyOneDisplayed());
	    logger.info("user select quantity one");
	}

	@When("User click add to Cart button one")
	public void user_click_add_to_cart_button_one() {
	    desktops.clickButtonOne();
	    logger.info("user click add to cart button one");
	}
	
	@When("User should see a message one {string}")
	public void user_should_see_a_message_one(String string) {
		Assert.assertTrue(desktops.messageOneDisplayed());
		logger.info("user should see a message one");
	}

	@When("User click ADD TO CART option onn {string} item")
	public void user_click_add_to_cart_option_onn_item(String string) {
	    desktops.clickCanonAddToCart();
	    logger.info("user click add to cart option onn item");
	}

	@When("User select color from dropdown {string}")
	public void user_select_color_from_dropdown(String string) {
		desktops.clickSelectOption();
		desktops.clickDropdownRed();//didn't select Red
	    logger.info("user select color from dropdown red");
	    
	}
	
	@When("User select quantityy {int}")
	public void user_select_quantityy(Integer int1) {
		Assert.assertTrue(desktops.selectQtyOneDisplayed());
		logger.info("user select quantityy one");
	}
	
	@When("User click add to Cart button two")
	public void user_click_add_to_cart_button_two() {
	    desktops.clickAddToCartTwo();
	    logger.info("user click add to cart button two");
	}
	
	@When("User should see a message two {string}")
	public void user_should_see_a_message_two(String string) {
		Assert.assertTrue(desktops.messageTwoDisplayed());
		logger.info("user should see a message two displayed");
	}
	

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws TimeoutException, InterruptedException {
		Thread.sleep(5000);
	    desktops.clickEOSCameraItem();
	    logger.info("user click on Canon EOS 5D item");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    desktops.clickReviewLink();
	    logger.info("user click on write a review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> reviewInfo = dataTable.asMaps(String.class, String.class);
	    desktops.clickWriteNameReview(reviewInfo.get(0).get("Naser"));
	    desktops.clickYourReview(reviewInfo.get(0).get("This is just a test review, not sure if it's working"));
	    desktops.clickRatingBad();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    desktops.clickContinueButton();
	    logger.info("user click on Continue button");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	    
		Assert.assertTrue(desktops.ThankYouMessageDisplayed());
	    logger.info("user should see a message with thank you");
	}

}
