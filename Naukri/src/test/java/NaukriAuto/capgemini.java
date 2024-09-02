package NaukriAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class capgemini {
	static WebDriver driver;
	
@Test	
public void applyJob() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://career5.successfactors.eu/careers?site=&company=C0001123183P&clientId=jobs2web&lang=en_US&navBarLevel=JOB_MGMT&subNavBarLevel=JOB_ALERTS");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("vinithkumarashokan@gmail.com");
	WebElement userPass = driver.findElement(By.id("password"));
	userPass.sendKeys("Vini@sneha7754");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
	Thread.sleep(5000);
	WebElement captchaBtn = driver.findElement(By.cssSelector(".recaptcha-checkbox-borderAnimation"));
	Actions a =new Actions(driver);
	a.doubleClick(captchaBtn).perform();
	
	
}

}
