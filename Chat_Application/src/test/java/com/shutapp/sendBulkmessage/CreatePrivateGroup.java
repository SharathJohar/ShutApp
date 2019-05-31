/**
 * 
 */
package com.shutapp.sendBulkmessage;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

import com.shutapp.loginflow.*;

/**
 * @author SHARATH
 *
 * 
 */
public class CreatePrivateGroup extends AppiumServer {

	public AndroidDriver<AndroidElement> mydriver;

	@Test(priority = 5)

	public void CreateGroup() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = fetch_driver();

		driver.findElementById("in.dbst.shutappv1.dev:id/new_chat").click();
		Thread.sleep(3000);

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
		driver.findElementById("in.dbst.shutappv1.dev:id/input").sendKeys("Biggi Buggi");
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
		for (int i = 0; i < 10; i++) {
			Text.sendKeys("Hello World! Don't Panik");
			Send.click();
		}
		System.out.println("Text Messages sent Successfully");

	}

	@Test(priority = 6)
	public void AutoDelete() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_mode_ttl_checkable").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/btn_ok").click();
		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 10; i++) {
			Text.sendKeys("Hello ShutApp Team!");
			Send.click();
		}

		MobileElement AutoDelete_Message = driver
				.findElementByXPath("//android.widget.TextView[@text='Hello ShutApp Team!']");
		String TTL = AutoDelete_Message.getText();
		System.out.println("text is: " + TTL);
		Thread.sleep(25000);

		try {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_bubble_message_text");
			System.out.println("AutoDelete Not Working as Expected");

		} catch (Exception e) {

			System.out.println("AutoDelete Working as Expected");
		}

	}

}
