/**
 * 
 */
package com.dbst.createsession;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class AddPhoneNumber extends CreateDriver {

	/**
	 * @param args
	 */
	public static AndroidDriver<AndroidElement> MobileNumber() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//This will Enter Valid Phone Number and Click on Submit Button
		driver.findElementById("in.dbst.shutappv1.dev:id/input").sendKeys("9901580697");
		WebElement next = driver.findElementById("in.dbst.shutappv1.dev:id/action_next");
//		driver.findElementById("paste element").click();
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

		if (next.isEnabled()) {
			System.out.println("Next Button is Enabled");
			next.click();
		} else {
			System.out.println("Invalid Phone Number");
			System.out.println("Shutting Down App");
			driver.quit();
		}
		return driver;

	}
}
