package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch {
	
	WebDriver driver;
	
	@Given("^I am on the Google search page$")
	public void i_am_on_the_Google_search_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@When("^I enter any search keyword on search textbox$")
	public void i_enter_any_search_keyword_on_search_textbox() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		

	}

	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {

		driver.findElement(By.name("btnK")).click();
		
	}

	@Then("^I should be redirected to search results page$")
	public void i_should_be_redirected_to_search_results_page() throws Throwable {
		
		if(driver.findElement(By.id("result-stats")).getText().contains("results"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
		driver.quit();

	}


}
