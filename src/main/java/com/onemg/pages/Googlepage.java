package com.onemg.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onemg.base.Testbase;

public class Googlepage extends Testbase {
	
	@FindBy(name="q")
	private WebElement googlesearchbox;
	@FindAll(@FindBy(xpath="//ul[@class='erkvQe']/li"))
	private List<WebElement> suggesstions;
	@FindBy(xpath="//a[@href='https://www.1mg.com/']/h3[@class='LC20lb DKV0Md']")
	private WebElement onemglink;
	public Googlepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterkeyword(String keyword) {
		
		googlesearchbox.sendKeys("1 mg");
	}
	public List<String> getallsuggesstions() {
		List<String> names=new ArrayList<String>();
		for(int i=0;i<=suggesstions.size();i++) {
			names.add(suggesstions.get(i).getText());
			return name;
		
	}
	}
	
	public void clickon1mglink() {
		onemglink.click();
		
	}
}
