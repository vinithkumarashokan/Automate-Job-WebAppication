package NaukriAuto;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukri {
	static WebDriver driver;

@Test
public void naukriTest() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/nlogin/login");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("usernameField"));
	userName.sendKeys("vinithkumarashokan@gmail.com",Keys.ENTER); 
	WebElement userPass = driver.findElement(By.id("passwordField"));
	userPass.sendKeys("Vini@sneha7754",Keys.ENTER);
	
    //WebElement otpLog = driver.findElement(By.xpath("//button[text()='Use OTP to Login']"));
    //otpLog .click();
    //WebElement telNumber = driver.findElement(By.xpath("//input[@type='tel']"));
    //telNumber.sendKeys("9677573788",Keys.ENTER);
    //WebElement otp = driver.findElement(By.xpath("//input[@placeholder='Enter OTP sent on your mobile number'] "));
	//otp.sendKeys("268650",Keys.ENTER); 
	
	WebElement googleLog = driver.findElement(By.xpath("//a[@class='socialbtn google']"));
	googleLog.click();
	
	String par = driver.getWindowHandle();
	System.out.println(par);
	
	Set<String> all = driver.getWindowHandles();
    System.out.println(all);
    List <String> list = new LinkedList <String>();
    list.addAll(all);
    driver.switchTo().window(list.get(1));
    
	WebElement mailId = driver.findElement(By.xpath("//div[@data-identifier='vinithkumarashokan@gmail.com']"));
	mailId.click();;
	
}

}
