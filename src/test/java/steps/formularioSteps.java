package steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formularioSteps {

	WebDriver driver;

	@Before
	public void BeforeClass() throws IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}

	@After
	public void AfterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
	}

	@When("que acesso a pagina {string}")
	public void que_acesso_o_sistema(String url) {
		driver.get(url);
	}

	@When("seleciono Switch theme {string}")
	public void seleciono_Switch_theme(String theme) {
		System.out.println("Theme: " + theme);
		Select optionTheme = new Select(driver.findElement(By.id("switch-version-select")));
		optionTheme.selectByVisibleText(theme);
	}

	@When("clico no link {string}")
	public void clico_no_link(String nomeLink) {
		driver.findElement(By.xpath("//a[contains(.,'" + nomeLink + "')]")).click();
	}

	@When("preencho os campos do formulario {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void preencho_os_campos_do_formulario(String name, String lastName, String contactFirstName, String phone,
			String addressLine1, String addressLine2, String city, String state, String postalCode, String country,
			String fromEmployeer, String creditLimit) {
		System.out.println("Name: " + name);
		driver.findElement(By.id("field-customerName")).sendKeys(name);
		driver.findElement(By.id("field-contactLastName")).sendKeys(lastName);
		driver.findElement(By.id("field-contactFirstName")).sendKeys(contactFirstName);
		driver.findElement(By.id("field-phone")).sendKeys(phone);
		driver.findElement(By.id("field-addressLine1")).sendKeys(addressLine1);
		driver.findElement(By.id("field-addressLine2")).sendKeys(addressLine2);
		driver.findElement(By.id("field-city")).sendKeys(city);
		driver.findElement(By.id("field-state")).sendKeys(state);
		driver.findElement(By.id("field-postalCode")).sendKeys(postalCode);
		driver.findElement(By.id("field-country")).sendKeys(country);
		driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys(fromEmployeer);
		driver.findElement(By.id("field-creditLimit")).sendKeys(creditLimit);

	}

	@When("clico no botao {string}")
	public void clico_no_botao(String nomeBotao) {
		System.out.println("Botão: " + "//button[contains(.,'" + nomeBotao + "')]");
		driver.findElement(By.xpath("//button[contains(.,'" + nomeBotao + "')]")).click();
	}

	@Then("devera apresentar mensagem {string}")
	public void devera_apresentar_mensagem(String mensagem) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Mensagem: " + mensagem);
		String retorno = driver.findElement(By.xpath("//*[@id='report-success']/p")).getText();
		Assert.assertTrue(retorno.contains(mensagem));
	}

	private String customerName;

	public String getName() {
		return customerName;
	}

	public String setBinNumber(String name) {
		return this.customerName = name;
	}

	@Then("filtro por CustomerName")
	public void filtro_por_CustomerName() {
		driver.findElement(By.xpath("//*[@id='gcrud-search-form']//tr[2]//td[3]/input")).sendKeys("Teste Sicredi");
	}

}
