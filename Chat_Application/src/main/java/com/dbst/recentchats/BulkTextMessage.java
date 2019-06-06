/**
 * 
 */
package com.dbst.recentchats;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class BulkTextMessage extends BulkDocuments {

	public void BulkTextMessages() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = BulkDocument();
		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 5; i++) {
			Text.sendKeys(
					"\"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...\"");
			Send.click();
		}
		System.out.println("Text Messages sent Successfully");

	}

}
