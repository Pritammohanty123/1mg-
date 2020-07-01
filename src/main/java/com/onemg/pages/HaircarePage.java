package com.onemg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onemg.base.Testbase;

public class HaircarePage extends Testbase {
	@FindBy(xpath="//a[@href='/otc/new-follihair-tablet-otc346330']/descendant::div[text()='New Follihair Tablet']")
	private WebElement newfolihairtablet;
	@FindBy(xpath="//a[@href='/otc/new-follihair-tablet-otc175648?qv=30&iv=1']")
	private WebElement buy10tablets;
	@FindBy(xpath="//div[@class=\"OtcPriceBox__price-box___p13HY\"]/descendant::div[@class='AddToCart__add-to-cart___39skL']")
    private WebElement Addtocartbutton;
	@FindBy(xpath="//span[@class='CartCounter__cart-alert___2fvyF']")
	private WebElement proceedtocart;
	@FindBy(xpath="//a[@href='/otc/new-follihair-tablet-otc346330']/descendant::div[@class='style__price-tag___cOxYc']/span[text()='513']")
	private WebElement printpriceofhairfoiltablet;
	
	public HaircarePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void selectnewfolihairtablet() {
		newfolihairtablet.click();
	}
	public void select10tablet() {
		buy10tablets.click();
		
	}
	public void addtocart() {
		Addtocartbutton.click();
	}
	
	
}
