package NaukriAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class foundIt {
	static WebDriver driver;

@Test
public void jobApply() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.foundit.in/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@id='heroSectionMobile-skillsAutoComplete--input']"));
	Actions a= new Actions(driver);
	a.moveToElement(search);
	search.sendKeys("software test engineer",Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
}

}
