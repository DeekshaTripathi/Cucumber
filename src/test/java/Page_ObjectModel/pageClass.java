package Page_ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageClass 
{
	WebDriver driver;
	@FindBy(how =How.LINK_TEXT,using="Log in") WebElement login;
	@FindBy(how=How.ID,using="Email")WebElement username;
	@FindBy(how=How.NAME,using="Password") WebElement password;
	//By lin=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement log;
	//By logou=By.linkText("Log out");
	@FindBy(how=How.LINK_TEXT,using="Log out") WebElement logout;
	public pageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginMethod(String uid,String pwd)
	{
		login.click();
		username.sendKeys(uid);
		password.sendKeys(pwd);
		log.click();
		logout.click();
	}
	/*public void clicklink()
	{
		driver.findElement(lnc).click();
	}
	public void typeusername(String username)
	{
		driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void clickloginlink()
	{
		driver.findElement(lin).click();
	}
	public void clicklogoutlink()
	{
		driver.findElement(logou).click();
	}*/
	

}
