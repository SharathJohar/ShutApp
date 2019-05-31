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
public class BulkImages extends CreatePrivateGroup {

	public AndroidDriver<AndroidElement> BulkImage() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = CreateGroup();
		
		for (int i = 0; i < 1; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
			driver.findElementByXPath("//android.widget.ImageView[@bounds='[12,180][358,534]']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='3']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='4']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='5']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='6']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='7']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='8']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='9']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='10']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='11']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='12']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='13']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='14']").click();
			driver.findElementByXPath("//android.widget.LinearLayout[@index='15']").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/image_ok").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok").click();
			System.out.println("Bulk Images sent Successfully");
		}
		return driver;
	}
}
