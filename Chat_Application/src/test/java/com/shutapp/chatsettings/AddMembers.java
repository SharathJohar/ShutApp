/**
 * 
 */
package com.shutapp.chatsettings;

import java.net.MalformedURLException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.shutapp.sendBulkmessage.CreatePrivateGroup;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class AddMembers extends CreatePrivateGroup {

	@Test(priority = 6)
	public void AddGroupMembers() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/chat_message_box_action_settings_icon").click();
		Thread.sleep(3000);
		driver.findElementById("in.dbst.shutappv1.dev:id/action_add_user").click();
		List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/friend_list_name"));
		list.get(0).click();
		list.get(1).click();
		list.get(2).click();
		list.get(3).click();
		driver.findElementById("in.dbst.shutappv1.dev:id/add_members").click();
		MobileElement MembersList = driver.findElementById("in.dbst.shutappv1.dev:id/user_list_size");
		String Members_List = MembersList.getText();
		System.out.println("Toatal Group Members are: " + Members_List);
	}

	// @Test(priority = 7)
	public void BlockUsers() throws MalformedURLException, InterruptedException {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sharath\"));");
		List<AndroidElement> Block = driver.findElements(By.xpath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']"));
		Block.get(0).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Block.get(1).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Block.get(2).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Block.get(3).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Block.get(4).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
		Block.get(5).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();
	}

	// @Test(priority = 8)
	public void UnblockUser() throws MalformedURLException, InterruptedException {
		List<AndroidElement> Unblock = driver.findElements(By.id("in.dbst.shutappv1.dev:id/group_member_more_option"));
		Unblock.get(0).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		Unblock.get(1).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		Unblock.get(2).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		Unblock.get(3).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		Unblock.get(4).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		Unblock.get(5).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
	}

	@Test(priority = 9)
	public void RemoveUser() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']")
				.click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']")
				.click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']")
				.click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']")
				.click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']")
				.click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
		driver.findElementByXPath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']")
				.click();
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();
	}

	@Test(priority = 10)
	public void MakeGroupAdmins() throws MalformedURLException, InterruptedException {
		
		driver.findElementById("in.dbst.shutappv1.dev:id/action_add_user").click();
		List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/friend_list_name"));
		list.get(0).click();
		list.get(1).click();
		list.get(2).click();
		driver.findElementById("in.dbst.shutappv1.dev:id/add_members").click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Vivek Shutapp\"));");
		List<AndroidElement> list1 = driver.findElements(By.xpath(
				"//android.widget.LinearLayout[@index='0']//android.widget.LinearLayout[@index='1']//android.widget.FrameLayout[@index='1']"));
//		list1.get(0).click();
//		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		list1.get(1).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		list1.get(2).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
		list1.get(3).click();
//		Thread.sleep(2000);
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
//		list1.get(4).click();
//		Thread.sleep(2000);
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
//		list1.get(5).click();
//		Thread.sleep(2000);
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='0']").click();
	}
}