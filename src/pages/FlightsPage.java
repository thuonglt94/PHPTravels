package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {
	WebDriver driver;

	public FlightsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a.active")
	private WebElement linkFlights;

	@FindBy(id = "departPlace")
	private WebElement txtFrom;

	@FindBy(id = "arrivePlace")
	private WebElement txtTo;

	@FindBy(id = "departDate")
	private WebElement btnSelectDateDepart;

	@FindBy(id = "returnDate")
	private WebElement btnSelectDateReturn;

	@FindBy(css = "button.btn-primary")
	private WebElement btnSearch;
	
	
}
