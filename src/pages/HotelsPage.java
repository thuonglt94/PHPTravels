package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage {
	WebDriver driver;

	public HotelsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "li.go-right:nth-child(2) > a:nth-child(1)")
	private WebElement linkHotels;

	@FindBy(css = ".go-right.col-md-2.col-sm-2.col-lg-1.col-xs-4.btn-action.row")
	private WebElement btnModify;

	@FindBy(name = "txtSearch")
	private WebElement txtSearchHotels;

	@FindBy(css = ".chevron.size14.fa.fa-chevron-down")
	private WebElement btnSelectDateCheckin;

	@FindBy(css = ".chevron.size14.fa.fa-chevron-up")
	private WebElement btnSelectDateCheckout;

	@FindBy(name = "adults")
	private WebElement txtAdults;

	@FindBy(name = "child")
	private WebElement txtChild;

	@FindBy(css = "button.btn-primary")
	private WebElement btnSearch;

	public void clickLinkHotels() {
		linkHotels.click();
	}

	public void clickModifyButton() {
		btnModify.click();
	}

	public void enterSearchHotelsTextbox(String text) {
		txtSearchHotels.clear();
		txtSearchHotels.sendKeys(text);

	}

	public void clickSelectDateCheckin() {
		btnSelectDateCheckin.click();
	}

	public void clickSelectDateCheckout() {
		btnSelectDateCheckout.click();
	}

	public void enterAdultsTextbox(String text) {
		txtAdults.clear();
		txtAdults.sendKeys(text);

	}

	public void enterChildTextbox(String text) {
		txtChild.clear();
		txtChild.sendKeys(text);

	}

	public void clickSearchHotelsButton() {
		btnSearch.click();
	}

}
