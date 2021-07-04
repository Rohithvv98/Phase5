package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SignUp=driver.findElement(By.xpath("//*[text()='Create New Account']"));
		
		SignUp.click();
		
		WebElement Month=driver.findElement(By.xpath("//*[@id='month']"));
		Select MonthDropDown=new Select(Month);
		MonthDropDown.selectByVisibleText("Jan");
		
		WebElement Year=driver.findElement(By.xpath("//*[@id='year']"));
		Select YearDropDown=new Select(Year);
		YearDropDown.selectByVisibleText("1999");
		
		WebElement Date=driver.findElement(By.xpath("//*[@id='day']"));
		Select DateDropDown=new Select(Date);
		DateDropDown.selectByVisibleText("4");
		
		WebElement Gender=driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
		Gender.click();
		
	}

}
