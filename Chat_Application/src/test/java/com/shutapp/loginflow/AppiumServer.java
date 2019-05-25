package com.shutapp.loginflow;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author SHARATH
 *
 * 
 */
public class AppiumServer {
	AndroidDriver<AndroidElement> driver;

	// This method will start Appium server through command prompt
	@BeforeSuite
	public void startServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(
					"cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
			Thread.sleep(10000);
			System.out.println("Appium server started successfully");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	// This method will Stop Appium server through command prompt
	@AfterSuite
	public void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
			runtime.exec("taskkill /F /IM cmd.exe");
			System.out.println("Appium server stopped successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void Capabilities() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "4da52af");
		cap.setCapability("deviceName", "Mi A2");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("platformName", "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.dbst.shutappv1.dev");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"in.dbst.shutappv1.ui.components.launcher.ActivityLauncher");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("ShutApp Launched");

	}

	@Test(priority = 1)
	public void MobileNumber() throws MalformedURLException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("in.dbst.shutappv1.dev:id/input").sendKeys("9901580697");
		WebElement next = driver.findElementById("in.dbst.shutappv1.dev:id/action_next");

		if (next.isEnabled()) {
			System.out.println("Next Button is Enabled");
			next.click();
		} else {
			System.out.println("Invalid Phone Number");
			System.out.println("Shutting Down App");
			driver.quit();
		}

	}

	@Test(priority = 2)
	public void EnterUserName() throws MalformedURLException, InterruptedException {

//		WebElement toastView = driver.findElementByXPath("//android.widget.Toast[1]");
//		String text = toastView.getAttribute("name");
//		System.out.println("Tost Message is : " + text);
		driver.findElementById("in.dbst.shutappv1.dev:id/user_name_text").sendKeys("Sharath");
		System.out.println("User Name Entered");
		Thread.sleep(3000);
		driver.findElementById("in.dbst.shutappv1.dev:id/profile_create_male_frame").click();
		System.out.println("Gender selected");
		driver.findElementById("in.dbst.shutappv1.dev:id/create_avatar_user_image").click();
		System.out.println("Clicked on Avatar");
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_camera").click();
		System.out.println("Camera selected");
//		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
//		System.out.println("Gallery selected");
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		System.out.println("Camera accessed");
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		System.out.println("Photos and media accessesd");
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='6']").click();
//		System.out.println("Image uploading");
		driver.findElementByAccessibilityId("Shutter button").click();
		System.out.println("Image captured");
		driver.findElementByAccessibilityId("Done").click();
		System.out.println("click on Done");
		Thread.sleep(5000);
		boolean flag = true;

		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions
					.invisibilityOfElementLocated(By.id("in.dbst.shutappv1.dev:id/dp_image_progressbar")));
			System.out.println("Image uploaded");
		} catch (TimeoutException e) {
			System.out.println("Image not uploaded in 60 sec");
		}

		WebElement next = driver.findElementById("in.dbst.shutappv1.dev:id/action_next");

		if (flag && next.isEnabled()) {
			System.out.println("Next Button is Enabled");
			next.click();
		} else {
			System.out.println("next button is not clickable");
		}

//		if (next.isEnabled()) {
//			System.out.println("Next Button is Enabled");
//			next.click();
//		} else {
//			System.out.println("Next Button not  Enabled");
//
//		}
//		if (driver.findElementById("in.dbst.shutappv1.dev:id/dp_image_progressbar").isDisplayed()
//				&& driver.findElementById("in.dbst.shutappv1.dev:id/action_next").isEnabled()) {
//			WebElement next = driver.findElementById("in.dbst.shutappv1.dev:id/action_next");
//			next.click();
//			System.out.println("Image Uploaded successfully");
//
//		} else {
//			System.out.println("Image not uploaded");
//		}

//		in.dbst.shutappv1.dev:id/dp_image_progressbar
//		android.widget.ProgressBar
//		in.dbst.shutappv1.dev
	}

	/**
	 * @return
	 */

	@Test(priority = 3)
	public void WelCome() throws MalformedURLException, InterruptedException {

		MobileElement welcome = driver.findElementByXPath("//android.widget.TextView[@text='WELCOME']");
		String isDisplayed = welcome.getText();
		System.out.println("PageName is: " + isDisplayed);
		MobileElement UserName = driver.findElementByXPath("//android.widget.TextView[@index='1']");
		String isDisplayed1 = UserName.getText();
		System.out.println("UserName is: " + isDisplayed1);
		MobileElement dp = driver.findElementById("in.dbst.shutappv1.dev:id/dp_img");
		boolean isDisplayed2 = dp.isDisplayed();
		System.out.println("DP is " + isDisplayed2);
		driver.findElementByXPath("//android.widget.Button[@text='Shut Modes']").click();
		System.out.println("Clicked on ShutMode");

	}

	@Test(priority = 4)
	public void ShutModes() throws MalformedURLException, InterruptedException {

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

	}

}
