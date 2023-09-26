package executation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.pricesortingsection;

public class sprint1eecution extends pricesortingsection {
	
	WebDriver driver;
	@BeforeClass
	public void openapplicatio() throws Exception {
		driver=lunchUrl();	
	}
	
	@Test
	public void checkavalabityofpricesortiongsection() {
		clickElement(shop);
		Actions aa=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Kitchen Appliances' and @role='button']"));
		aa.moveToElement(ele);
		 WebElement refrigrator = driver.findElement(By.xpath("//a[@title='Kitchen Appliances' and @role='button']"));
		aa.moveToElement(refrigrator).perform();
		WebElement frenchrefrigrator = driver.findElement(By.xpath("//a[@title=\"French Door Refrigerators\"]"));

		frenchrefrigrator.click();
	}
}


