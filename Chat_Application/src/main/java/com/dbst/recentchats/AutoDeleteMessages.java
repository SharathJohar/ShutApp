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
	@Test

	public void AutoDelete() throws MalformedURLException, InterruptedException {
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
		MobileElement welcome = driver.findElementByXPath("//android.widget.TextView[@index='0']");
		String ttl = welcome.getText();
		System.out.println("text is: " + ttl);
	}

}
