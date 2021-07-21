package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class formularioPages extends basePage {
	
	WebDriver driver;

	public void getSwtchTheme(String theme) {

		Select optionTheme = new Select(driver.findElement(By.id("switch-version-select")));
		optionTheme.selectByVisibleText(theme);

		// String xpath = "//*[@id='switch-version-select']//option[contains(.,'" +
		// theme + "')]";
		// return driver.findElement(By.xpath(xpath));
	}

	public WebElement getBotao(String nomeBotao) {
		String xpath = "//a[contains(.,'" + nomeBotao + "')]";
		return driver.findElement(By.xpath(xpath));
	}

	@FindBy(id = "field-customerName")
	@CacheLookup
	private WebElement camposCustomerName;

	public WebElement getCamposCustomerName() {
		return camposCustomerName;
	}

	@FindBy(id = "field-contactLastName")
	@CacheLookup
	private WebElement ContactLastName;

	public WebElement getContactLastName() {
		return ContactLastName;
	}

	@FindBy(id = "field-contactFirstName")
	@CacheLookup
	private WebElement camposContactFirstName;

	public WebElement getCamposContactFirstName() {
		return camposContactFirstName;
	}

	@FindBy(id = "field-phone")
	@CacheLookup
	private WebElement camposPhone;

	public WebElement getCamposPhone() {
		return camposPhone;
	}

	@FindBy(id = "field-addressLine1")
	@CacheLookup
	private WebElement camposAddressLine1;

	public WebElement getCamposAddressLine1() {
		return camposAddressLine1;
	}

	@FindBy(id = "field-addressLine2")
	@CacheLookup
	private WebElement camposAddressLine2;

	public WebElement getCamposAddressLine2() {
		return camposAddressLine2;
	}

	@FindBy(id = "field-city")
	@CacheLookup
	private WebElement camposCity;

	public WebElement getCamposCity() {
		return camposCity;
	}

	@FindBy(id = "field-state")
	@CacheLookup
	private WebElement camposState;

	public WebElement getCamposState() {
		return camposState;
	}

	@FindBy(id = "field-postalCode")
	@CacheLookup
	private WebElement camposPostalCode;

	public WebElement getCamposPostalCode() {
		return camposPostalCode;
	}

	@FindBy(id = "field-country")
	@CacheLookup
	private WebElement camposCountry;

	public WebElement getCamposCountry() {
		return camposCountry;
	}

	@FindBy(id = "field-salesRepEmployeeNumber")
	@CacheLookup
	private WebElement camposSalesRepEmployeeNumber;

	public WebElement getCamposSalesRepEmployeeNumber() {
		return camposSalesRepEmployeeNumber;
	}

	@FindBy(id = "field-creditLimit")
	@CacheLookup
	private WebElement camposCreditLimit;

	public WebElement getCamposCreditLimit() {
		return camposCreditLimit;
	}

	@FindBy(id = "field-deleted")
	@CacheLookup
	private WebElement camposDeleted;

	public WebElement getCamposDeleted() {
		return camposDeleted;
	}

}
