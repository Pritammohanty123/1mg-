package com.onemg.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.onemg.base.Testbase;

public class Utils extends Testbase {
	
	public static int  PAGE_LOAD_TIMEOUT=15;
	public static int  implicity_wait=25;

	public static void takeScreenshotAtEndOfTest()
	{
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		try {
			FileHandler.copy(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//gets 
	//((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

}

	
