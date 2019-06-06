/**
 * 
 */
package com.dbst.recentchats;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class AutoDeleteMessages extends BulkVideos {

	public AndroidDriver<AndroidElement> AutoDelete() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = BulkVideo();
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_mode_ttl_checkable").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/btn_ok").click();
		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 10; i++) {
			Text.sendKeys("Blah Blah Blah");
			Send.click();
		}
		Thread.sleep(25000);
		try {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_bubble_message_text");
			System.out.println("AutoDelete Not Working as Expected");

		} catch (Exception e) {

			System.out.println("AutoDelete Working as Expected");
		}
		return driver;
	}

}
