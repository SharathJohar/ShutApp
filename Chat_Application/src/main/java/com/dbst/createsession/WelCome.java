/**
 * 
 */
package com.dbst.createsession;

import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class WelCome extends EnterYourName {
	
	public static AndroidDriver<AndroidElement> WelCome() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = EnterUserName();
		MobileElement welcome = driver.findElementByXPath("//android.widget.TextView[@text='WELCOME']");
		String isDisplayed = welcome.getText();
		System.out.println("PageName is: "+isDisplayed);
		MobileElement UserName = driver.findElementByXPath("//android.widget.TextView[@index='1']");
		String isDisplayed1 = UserName.getText();
		System.out.println("UserName is: "+isDisplayed1);
		MobileElement dp =driver.findElementById("in.dbst.shutappv1.dev:id/dp_img");
		boolean isDisplayed2 = dp.isDisplayed();
		System.out.println("DP is "+isDisplayed2);
		driver.findElementByXPath("//android.widget.Button[@text='Shut Modes']").click();
		System.out.println("Clicked on ShutMode");
		return driver;
	}
}
