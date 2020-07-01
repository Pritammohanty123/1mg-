package com.onemg.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onemg.base.Testbase;

public class onemghomepage extends Testbase {
	@FindBy(xpath="//span[@class='container-3PFIa u-userColor minimizeButton-31FRu Icon--dash']")
	private WebElement chatpopup;
	@FindBy(xpath="//div[@class=\"styles__category-links___iU2im\"]/descendant::span[text()='Personal Care']")
	private WebElement Personalcare;
	@FindBy(xpath="//span[text()='Hair Growth Supplements']")
	private WebElement hairgrowthsuppliment;
	@FindBy(xpath="//span[@class='style__close___1l-EN']")
	private WebElement closepopup;
	
	
	public onemghomepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void quitchatpopup() {
		chatpopup.click();
		
	}
	public void closebrowserpopup() {
		closepopup.click();
	}
	
	public void movetohaircarepage() {
		Actions action = new Actions(driver);
		action.moveToElement(hairgrowthsuppliment).build().perform();
	}

}
