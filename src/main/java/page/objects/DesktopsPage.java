package page.objects;

import java.util.List;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base{
	
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsite;
	
	@FindBy(xpath ="//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy(xpath ="//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//div[@class='image']//a//img")
	private List<WebElement> allItems;
	//locate one of the item images and wrap it with List<WebElement> in order to get a list of all items
	
	@FindBy(xpath ="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement hpLpAddToCart;
	
	@FindBy(xpath="//*[@id=\"input-quantity\"]")
	private WebElement qtyOne;
	
	@FindBy(xpath ="//button[text()='Add to Cart']")
	private WebElement buttonOne;
	
	@FindBy(xpath ="//*[@id=\"product-product\"]/div[1]")
	private WebElement messageOne;
	
	@FindBy(xpath ="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement canonAddToCart;
	
	@FindBy(xpath ="//select[@id='input-option226']")
	private WebElement clickSelectOption;
	
	@FindBy(xpath ="//select/option[@value='15']")
	private WebElement dropdownRed;
	
	@FindBy(xpath ="//*[@id=\"input-quantity\"]")
	private WebElement selectQtyOne;//NOt sure if it's click
	
	@FindBy(xpath ="//*[@id=\"button-cart\"]")
	private WebElement addToCartTwo;
	
	@FindBy(xpath ="//*[@id=\"product-product\"]/div[1]")
	private WebElement messageTwo;
	
	@FindBy(xpath ="//a[normalize-space()='Canon EOS 5D Camera']")
	private WebElement EOSCameraItem;
	
	@FindBy(xpath ="//a[text()='Write a review']")
	private WebElement reviewLink;
	
	@FindBy(xpath ="//input[@id='input-name']")
	private WebElement writeNameReview;
	
	@FindBy(xpath ="//textarea[@rows='5']")
	private WebElement yourReview;
	
	@FindBy(xpath ="//*[@id=\"form-review\"]/div[4]/div/input[1]")
	private WebElement ratingBad;
	
	@FindBy(xpath ="//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath ="//button[@id='button-review']")
	private WebElement ThankYouMessage;

	public boolean retailWebsiteDisplayed() {
		if(retailWebsite.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickDesktopsTab() {
		desktopsTab.click();
	}
	
	public void clickShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = allItems;
		return DesktopsItems;
	}
	
	public void clickHpLpAddToCart() {
		hpLpAddToCart.click();
	}
	
	public boolean qtyOneDisplayed() {
		if(qtyOne.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickButtonOne() {
		buttonOne.click();
	}
	
	public boolean messageOneDisplayed() {
		if(messageOne.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickCanonAddToCart() {
		canonAddToCart.click();
	}
	
	public void clickSelectOption() {
		clickSelectOption.click();
	}
	
	public void clickDropdownRed() {
		dropdownRed.click();
	}
	
	public boolean selectQtyOneDisplayed() {
		if(selectQtyOne.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickAddToCartTwo() {
		addToCartTwo.click();
	}
	
	public boolean messageTwoDisplayed() {
		if(messageTwo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickEOSCameraItem() {
		try {
			EOSCameraItem.click();
		}catch(org.openqa.selenium.TimeoutException e) {
			driver.navigate().refresh();
			EOSCameraItem.click();
		}
		
	}
	
	public void clickReviewLink() {
		reviewLink.click();
	}
	
	public void clickWriteNameReview(String name) {
		writeNameReview.sendKeys("Naser"); //comes under common stepDef
	}
	
	public void clickYourReview(String review) {
		yourReview.sendKeys("This is just a test review, not sure if it's working");//comes under common stepDef
	}
	
	public void clickRatingBad() {
		ratingBad.click();//comes under common stepDef
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public boolean ThankYouMessageDisplayed() {
		if(ThankYouMessage.isDisplayed())
			return true;
		else
			return false;
	}

}
