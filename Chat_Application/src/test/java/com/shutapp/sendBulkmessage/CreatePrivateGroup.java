/**
 * 
 */
package com.shutapp.sendBulkmessage;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

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
//		driver.findElementByXPath("//android.widget.TextView[@text='Saourab ober']").click();

		driver.findElementByXPath(
				"//android.widget.LinearLayout[@resource-id='in.dbst.shutappv1.dev:id/private_group_create']").click();
//		driver.findElementByXPath(
//				"//android.widget.LinearLayout[@resource-id='in.dbst.shutappv1.dev:id/open_group_create']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@text='A ShutApp 3'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ajay ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Alok ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Amit ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Sagar ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ravi ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ravi Vijayawada'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Saourab ober'] ").click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Vivek Shutapp\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='ShutApp 4'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Vijay ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Sharath Shet'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Vivek Shutapp'] ").click();
		System.out.println("Memebers addedd successfully");
		driver.findElementById("in.dbst.shutappv1.dev:id/create_group_next").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/input").sendKeys("Bulk Recieve Images");
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
		for (int i = 0; i < 60; i++) {
			Text.sendKeys("1");
			Send.click();
			Text.sendKeys("2");
			Send.click();
			Text.sendKeys("3");
			Send.click();
		}
		System.out.println("Text Messages sent Successfully");

	}

//	@Test(priority = 6)
	public void AnonymousBulkImages() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_mode_anonymous").click();
		for (int i = 0; i < 4; i++) {
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
			System.out.println("Anonymous Bulk sent Successfully");
		}

	}

//	@Test(priority = 6)
	public void BulkImage() throws MalformedURLException, InterruptedException {

		for (int i = 0; i < 4; i++) {
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
//			driver.findElementByXPath("//android.widget.LinearLayout[@index='15']").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/image_ok").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok").click();
		}
		System.out.println("Bulk Images sent Successfully");
	}

//	@Test(priority = 8)
	public void BulkVideo() throws MalformedURLException, InterruptedException {

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

	}

//	@Test(priority = 9)
	public void AutoDelete() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_mode_ttl_checkable").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/btn_ok").click();
		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 60; i++) {
			Text.sendKeys("Every next level of your life will demand a different you.!");
			Send.click();
		}
		Thread.sleep(25000);

		try {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_bubble_message_text");
			System.out.println("AutoDelete Not Working as Expected");

		} catch (Exception e) {

			System.out.println("AutoDelete Working as Expected");
		}

	}

//	@Test(priority = 6)
	public void BulkAudios() throws MalformedURLException, InterruptedException {

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
	}

}
