package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParametrizationDemo
{
	WebDriver driver=null;
	@Given("^User is open the application$")
	public void user_is_open_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("^User click on to signin link$")
	public void user_click_on_to_signin_link() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
		driver.findElement(By.name("Login")).click();
	   
	}

	@Then("^Message displayed login Successfully$")
	public void message_displayed_login_Successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	  
	}

}
