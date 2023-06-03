package Demo.D;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.DemoBase;

public class D_Locators extends DemoBase {
	WebDriver driver;
@Test
	public void locators() throws IOException {
	 driver=initializeDriver();
	 
	 WebElement nav = driver.findElement(By.id("navbar"));
	 String navText = nav.getText();
	 System.out.println(navText);
	 
	 WebElement col=driver.findElement(By.className("Cross-Column"));
	 String colText=col.getText();
	 System.out.println(colText);
	 
	 
	 
	 
	
}
		
	

	
		
		

	

}
