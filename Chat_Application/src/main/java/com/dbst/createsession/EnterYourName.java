/**
 * 
 */
package com.dbst.createsession;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class EnterYourName extends AddPhoneNumber {

	public static AndroidDriver<AndroidElement> EnterUserName() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = MobileNumber();

		WebElement toastView = driver.findElementByXPath("//android.widget.Toast[1]");
		String text = toastView.getAttribute("name");
		System.out.println("Tost Message is : " + text);
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
		return driver;

//		in.dbst.shutappv1.dev:id/dp_image_progressbar
//		android.widget.ProgressBar
//		in.dbst.shutappv1.dev
	}

	/**
	 * @return
	 */

}
