/**
 * 
 */
package com.dbst.recentchats;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class BulkVideos extends Anonymous {

	public AndroidDriver<AndroidElement> BulkVideo() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = AnonymousBulkImages();
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_mode_anonymous").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_video").click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='3']").click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='4']").click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='5']").click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='6']").click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='8']").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/video_ok").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/ok_video").click();
		System.out.println(" Bulk videos sent Successfully");
		return driver;
	}

}
