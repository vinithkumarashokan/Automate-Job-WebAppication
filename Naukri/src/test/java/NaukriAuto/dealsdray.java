package NaukriAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dealsdray {
	static WebDriver driver;

@Test
public void prexo() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.dealsdray.com/");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[1]"));
	userName.sendKeys("prexo.mis@dealsdray.com");
	WebElement userPass = driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]"));
	userPass.sendKeys("prexo.mis@dealsdray.com");
	WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
	logIn.click();
	Thread.sleep(3000);
	WebElement order = driver.findElement(By.xpath("(//div[@class='MuiBox-root css-70qvj9'])[2]"));
	order.click();
	WebElement orders = driver.findElement(By.xpath("(//span[@class='sidenavHoverShow MuiBox-root css-i9zxpg'])[2]"));
	orders.click();
	WebElement bulkorder = driver.findElement(By.xpath("(//span[@class='MuiTouchRipple-root css-w0pj6f'])[2]"));
	Actions a=new Actions (driver);
	a.moveToElement(bulkorder).perform();
	driver.findElement(By.xpath("//input[@aria-invalid='false']")).click();
	
	
	
	
	
	
}

}
