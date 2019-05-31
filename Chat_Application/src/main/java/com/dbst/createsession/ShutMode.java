/**
 * 
 */
package com.dbst.createsession;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class ShutMode extends WelCome {
	@Test
	public AndroidDriver<AndroidElement> ShutModes() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = WelCome();
		MobileElement ShutMode = driver.findElementByXPath("//android.widget.TextView[@text='Shut Mode']");
		String Shut = ShutMode.getText();
		MobileElement PersonnelSapce = driver
				.findElementByXPath("//android.widget.TextView[@text='For your personal space']");
		String PerSpace = PersonnelSapce.getText();
		System.out.println("PageName is: " + Shut + PerSpace + "  is Launched");
		driver.findElementById("in.dbst.shutappv1.dev:id/welcome_modes_fragment_normal_mode_btn").click();
		MobileElement NormalMode = driver.findElementByXPath("//android.widget.TextView[@text='Normal Mode']");
		System.out.println("Clicked on NormalMode");
		String Normal = NormalMode.getText();
		MobileElement BetterExperience = driver
				.findElementByXPath("//android.widget.TextView[@text='Better Experience']");
		String BetterExp = BetterExperience.getText();
		System.out.println("PageName is: " + Normal + BetterExp + "  is Launched");
		driver.findElementByXPath("//android.widget.Button[@text='Shut Modes']").click();
		System.out.println("Clicked on ShutMode");
		driver.findElementByXPath(
				"//android.widget.Button[@resource-id='in.dbst.shutappv1.dev:id/welcome_modes_fragment_btn_setlock']")
				.click();
		System.out.println("Clicked on Set Lock");

		driver.findElementById("in.dbst.shutappv1.dev:id/shut_mode_activity_pin_input_show").sendKeys("1111");
		driver.hideKeyboard();
		driver.findElementById("in.dbst.shutappv1.dev:id/tb_dialpad_done").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/shut_mode_activity_pin_input_show").sendKeys("1111");
		driver.hideKeyboard();
		driver.findElementById("in.dbst.shutappv1.dev:id/tb_dialpad_done").click();
//		WebElement toastView = driver.findElementByXPath("//android.widget.Toast[1]");
//		String text = toastView.getAttribute("name");
//		System.out.println("Tost Message is : " + text);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		System.out.println("Welcome to ShutApp Recent Chats");
		return driver;
		
	}

}
