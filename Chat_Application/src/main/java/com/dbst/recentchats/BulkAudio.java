/**
 * 
 */
package com.dbst.recentchats;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class BulkAudio extends AutoDeleteMessages{

	
	public AndroidDriver<AndroidElement> BulkAudios() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = AutoDelete();
		for (int i = 0; i < 10; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_audio").click();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"09 Rise of Sultan (Shekhar Ravjiani) 320Kbps.mp3\").instance(0))");
			List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/songname"));
			list.get(1).click();
			list.get(2).click();
			list.get(3).click();
			list.get(4).click();
			list.get(5).click();
			list.get(6).click();
			list.get(7).click();
			list.get(8).click();
			driver.findElementById("in.dbst.shutappv1.dev:id/okBtn").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok").click();
		}
		System.out.println("Bulk Audios sent Successfully");
		return driver;
	}
	
}
