package Simplilearn_Maven.Simplilearn_Maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink=driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		WebElement rememberMe=driver.findElement(By.className("rememberMe"));
		WebElement Username=driver.findElement(By.name("user_login"));
		WebElement Password=driver.findElement(By.id("password"));
		WebElement LoginBtn=driver.findElement(By.name("btn_login"));
		
		
		rememberMe.click();
		Username.sendKeys("abc@gmail.com");
		Password.sendKeys("123456");
		LoginBtn.click();
		
		WebElement LoginError=driver.findElement(By.id("msg_box"));
		String ActError=LoginError.getText();
		String ExpError="The email or password you have entered is invalid.";
		if(ActError.equals(ExpError)) {
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
		
		List<WebElement> links= driver.findElements(By.tagName("input"));
		System.out.println("total links" + links.size());
		
		driver.quit();
	}

}
