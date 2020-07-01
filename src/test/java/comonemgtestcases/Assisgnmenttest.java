package comonemgtestcases;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.onemg.base.Testbase;
import com.onemg.pages.Googlepage;
import com.onemg.pages.HaircarePage;
import com.onemg.pages.onemghomepage;

public class Assisgnmenttest extends Testbase
{
	
	Googlepage goolepage;
	HaircarePage haircarepage;
	onemghomepage onemghomepage;
	@BeforeClass
	public void launchbrowser() {
		Testbase.initialization();
	}
	@AfterClass
	public void closebrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	@Test(priority=1)
	public void googlesearchpage() {
		goolepage.enterkeyword("1mg");
		List<String> suggesstions= goolepage.getallsuggesstions();
		for(int i=0;i<suggesstions.size();i++)
		{
			System.out.println(suggesstions.get(i));
		}
		Actions builder = new Actions(driver);  
		builder.sendKeys(Keys.ENTER).build().perform();
		log.info("Enter button Pressed");
		
	}
	

}
