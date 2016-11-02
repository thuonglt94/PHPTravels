package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToursPage {
	WebDriver driver;

	public ToursPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".go-right.active.active")
	private WebElement linkTours;

	@FindBy(css = ".go-right.col-md-2.col-sm-2.col-lg-1.col-xs-4.btn-action.row")
	private WebElement btnModify;

	@FindBy(name = "txtSearch")
	private WebElement txtSearchHotels;

	@FindBy(css = ".chevron.size14.fa.fa-chevron-down")
	private WebElement btnSelectDateCheckin;

	@FindBy(name = "adults")
	private WebElement txtGuests;

	@FindBy(id = "tourtype")
	private WebElement btnSelectTourType;
	
	@FindBy(css = "#tourtype option:nth-child(2)")
	private WebElement btnSelectTourTypeHolidays;

	@FindBy(css = "button.btn-primary")
	private WebElement btnSearch;

	public void clickLinkTours() {
		linkTours.click();
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

	public void enterGuestsTextbox(String text) {
		txtGuests.clear();
		txtGuests.sendKeys(text);

	}

	public void clickSelectTourTypeButton() {
		btnSelectTourType.click();
	}

	public void clickSearchHotelsButton() {
		btnSearch.click();
	}

}
