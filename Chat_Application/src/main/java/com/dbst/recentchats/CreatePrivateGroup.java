/**
 * 
 */
package com.dbst.recentchats;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import com.dbst.createsession.ShutMode;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class CreatePrivateGroup extends ShutMode {

	public AndroidDriver<AndroidElement> CreateGroup() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = ShutModes();
		driver.findElementById("in.dbst.shutappv1.dev:id/new_chat").click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@resource-id='in.dbst.shutappv1.dev:id/private_group_create']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@text='Ajay ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Alok ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Amit ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Sagar ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ravi ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ravi Vijayawada'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Saourab ober'] ").click();
		System.out.println("Memebers addedd successfully");
		driver.findElementById("in.dbst.shutappv1.dev:id/create_group_next").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/input").sendKeys("Bulk Images Done");
		driver.findElementById("in.dbst.shutappv1.dev:id/group_name_next").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/add_image").click();
//		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_camera").click();
//		System.out.println("Camera selected");
//		driver.findElementByAccessibilityId("Shutter button").click();
//		System.out.println("Image captured");
//		driver.findElementByAccessibilityId("Done").click();
//		System.out.println("click on Done");
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
		System.out.println("Gallery selected");
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		System.out.println("Image uploading");
		Thread.sleep(4000);
		driver.findElementById("in.dbst.shutappv1.dev:id/create_group").click();
		System.out.println("Group successfully created");
		//////////////////////////////////////////////////////////

		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 5; i++) {
			Text.sendKeys("When you can’t find the sunshine, be the sunshine!");
			Send.click();
		}
		System.out.println("Text Messages sent Successfully");
		return driver;
	}
}