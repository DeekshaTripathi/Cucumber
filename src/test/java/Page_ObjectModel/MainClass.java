package Page_ObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException
	{
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\Browser_Drivers\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
    // pageClass pobject=new pageClass(driver);
     driver.get("http://demowebshop.tricentis.com");
     driver.manage().window().maximize();
    // pobject.clicklink();
     String username=null;
   //  pobject.typeusername(username);
     String password=null;
    // pobject.typepassword(password);
   //  pobject.clickloginlink();
     Thread.sleep(100);
   //  String logout=null;
  //   pobject.clicklogoutlink();
     System.out.println("the title of the page is "+driver.getTitle());
	}

}
