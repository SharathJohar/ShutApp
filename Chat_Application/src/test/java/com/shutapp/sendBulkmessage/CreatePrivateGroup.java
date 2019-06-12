/**
 * 
 */
package com.shutapp.sendBulkmessage;

import java.net.MalformedURLException;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

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
		try {
				WebElement toastView = driver.findElementByXPath("//android.widget.Toast[1]");
				String text = toastView.getAttribute("name");
				System.out.println("Tost Message is : " + text);
				System.out.println("Contatcs Updated");
			
		} catch (Exception e) {
			System.out.println("Contatcs Not Updated");
		}
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@resource-id='in.dbst.shutappv1.dev:id/private_group_create']").click();
//		driver.findElementByXPath(
//				"//android.widget.LinearLayout[@resource-id='in.dbst.shutappv1.dev:id/open_group_create']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@text='A ShutApp 3'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ajay ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Alok ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Amit ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ravi Dbst'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Ravi ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Sagar Dbst'] ").click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Vivek Shutapp\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='Saurabh Omer'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Sharath'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='ShutApp 4'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Vijay ShutApp'] ").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Vivek Shutapp'] ").click();
		System.out.println("Memebers addedd successfully");
		driver.findElementById("in.dbst.shutappv1.dev:id/create_group_next").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/input").sendKeys("Go!");
		driver.findElementById("in.dbst.shutappv1.dev:id/group_name_next").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/add_image").click();
////	driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_camera").click();
////	System.out.println("Camera selected");
////	driver.findElementByAccessibilityId("Shutter button").click();
////	System.out.println("Image captured");
////	driver.findElementByAccessibilityId("Done").click();
////	System.out.println("click on Done");
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
		System.out.println("Gallery selected");
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		System.out.println("Image uploading");
		Thread.sleep(4000);
		driver.findElementById("in.dbst.shutappv1.dev:id/create_group").click();
		System.out.println("Group successfully created");
	}

	@Test(priority = 6)
	public void BulkTextMessage() throws MalformedURLException, InterruptedException {

		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 10; i++) {
			Text.sendKeys("Change the world by being yourself.");
			Send.click();
		}
		System.out.println("Text Messages sent Successfully");
	}

	@Test(priority = 7)
	public void AutoDelete() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_mode_ttl_checkable").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/btn_ok").click();
		WebElement Text = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_text_box_input");
		WebElement Send = driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_send_fab");
		for (int i = 0; i < 10; i++) {
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
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_mode_ttl_checkable").click();
		driver.findElementByXPath("//android.widget.Button[@text='off']").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/btn_ok").click();
	}

	@Test(priority = 11)
	public void BulkImage() throws MalformedURLException, InterruptedException {

		for (int i = 0; i < 2; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
			List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/imageView"));
			list.get(0).click();
			list.get(1).click();
			list.get(2).click();
			list.get(3).click();
			list.get(4).click();
			list.get(5).click();
			list.get(6).click();
			list.get(7).click();
			list.get(8).click();
			list.get(9).click();
			list.get(10).click();
			list.get(11).click();
			list.get(12).click();
			list.get(13).click();
			list.get(14).click();
			driver.findElementById("in.dbst.shutappv1.dev:id/image_ok").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok").click();
		}
		System.out.println("Bulk Images sent Successfully");
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElementById("in.dbst.shutappv1.dev:id/back_btn").click();
	}

	@Test(priority = 9)
	public void AnonymousBulkImages() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_mode_anonymous").click();
		for (int i = 0; i < 2; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
			List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/imageView"));
			list.get(0).click();
			list.get(1).click();
			list.get(2).click();
			list.get(3).click();
			list.get(4).click();
			list.get(5).click();
			list.get(6).click();
			list.get(7).click();
			list.get(8).click();
			list.get(9).click();
			list.get(10).click();
			list.get(11).click();
			list.get(12).click();
			list.get(13).click();
			list.get(14).click();
			driver.findElementById("in.dbst.shutappv1.dev:id/image_ok").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok").click();
		}
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_mode_anonymous").click();
		System.out.println("Anonymous Bulk Images sent Successfully");
	}

	@Test(priority = 10)
	public void BulkVideo() throws MalformedURLException, InterruptedException {

		for (int i = 0; i < 1; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_video").click();
			List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/imageView"));
			list.get(0).click();
			list.get(1).click();
			list.get(2).click();
			list.get(3).click();
			list.get(4).click();
			list.get(5).click();
			list.get(6).click();
			list.get(7).click();
			list.get(8).click();
			list.get(9).click();
			list.get(10).click();
			list.get(11).click();
			list.get(12).click();
			list.get(13).click();
			list.get(14).click();
			driver.findElementById("in.dbst.shutappv1.dev:id/video_ok").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok_video").click();
		}
		System.out.println("Bulk Videos sent Successfully");
	}

	@Test(priority = 8)
	public void BulkAudios() throws MalformedURLException, InterruptedException {

		for (int i = 0; i < 1; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_audio").click();
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"[iSongs.info] 10 - Climax Theme Song.mp3\").instance(0))");
			List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/songname"));
			list.get(0).click();
			list.get(1).click();
			list.get(2).click();
			list.get(3).click();
			list.get(4).click();
			list.get(5).click();
			list.get(6).click();
			list.get(7).click();
			driver.findElementById("in.dbst.shutappv1.dev:id/okBtn").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/ok").click();
		}
		System.out.println("Bulk Audios sent Successfully");
	}

	// @Test(priority = 12)
	public void BulkDocument() throws MalformedURLException, InterruptedException {

		for (int i = 0; i < 1; i++) {
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_attachments").click();
			driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_document").click();
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

	}
}