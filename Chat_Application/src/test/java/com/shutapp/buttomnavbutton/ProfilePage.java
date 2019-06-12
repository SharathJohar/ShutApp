/**
 * 
 */
package com.shutapp.buttomnavbutton;

import java.net.MalformedURLException;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.shutapp.sendBulkmessage.CreatePrivateGroup;

import io.appium.java_client.MobileElement;

import io.appium.java_client.PerformsTouchActions;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.touch.WaitOptions;

import io.appium.java_client.touch.offset.PointOption;

/**
 * @author SHARATH
 *
 * 
 */
public class ProfilePage extends CreatePrivateGroup {

	public AndroidDriver<AndroidElement> mydriver;
	public WebElement el;

	public static void SwipeScreen(WebElement el, WebDriver driver) throws InterruptedException {

		el = driver.findElement(By.id("in.dbst.shutappv1.dev:id/full_image"));
		WebElement Panel = el;
		Dimension dimension = Panel.getSize();

		int Anchor = Panel.getSize().getHeight() / 2;

		Double ScreenWidthStart = dimension.getWidth() * 0.9;
		int scrollStart = ScreenWidthStart.intValue();

		Double ScreenWidthEnd = dimension.getWidth() * 0.2;
		int scrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(scrollEnd, Anchor))
				.release().perform();

		Thread.sleep(3000);
	}

	@Test(priority = 12)

	public void AboutPage() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("in.dbst.shutappv1.dev:id/action_main_bottomnav_profile").click();
		MobileElement profile_user_name = driver.findElementByXPath("//android.widget.TextView[@index='1']");
		String username = profile_user_name.getText();
		System.out.println("UserName is: " + username);
		MobileElement self_profile = driver.findElementById("in.dbst.shutappv1.dev:id/self_profile_user_image_view");
		boolean user_image_view = self_profile.isDisplayed();
		System.out.println("DP is " + user_image_view);
		driver.findElementById("in.dbst.shutappv1.dev:id/edit_profile").click();
		MobileElement edit_user_name = driver.findElementById("in.dbst.shutappv1.dev:id/activity_profile_edit_user_name");
		String username_edit = edit_user_name.getText();
		System.out.println("UserName is: " + username_edit);
		MobileElement edit_self_profile = driver.findElementById("in.dbst.shutappv1.dev:id/edit_avatar_user_image");
		boolean edit_user_image_view = edit_self_profile.isDisplayed();
		System.out.println("DP is " + edit_user_image_view);
		driver.findElementById("in.dbst.shutappv1.dev:id/edit_avatar_user_image").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_camera").click();
		driver.findElementByXPath("//GLButton[@text='Shutter']").click(); // --Samsung--//
		System.out.println("Image captured");
		driver.findElementById("com.sec.android.app.camera:id/okay").click(); // --Samsung--//
		System.out.println("click on Done");
//		driver.findElementById("in.dbst.shutappv1.dev:id/chat_attachment_dialog_btn_gallery").click();
//		driver.findElementByXPath("//android.widget.LinearLayout[@index='3']").click();

		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions
					.invisibilityOfElementLocated(By.id("in.dbst.shutappv1.dev:id/dp_image_progressbar")));
			System.out.println("Image uploaded");
		} catch (TimeoutException e) {
			System.out.println("Image not uploaded in 60 sec");
		}
		driver.findElementById("in.dbst.shutappv1.dev:id/profile_edit_activity_about_btn").click();

		driver.findElementById("in.dbst.shutappv1.dev:id/profile_edit_about_edit_text")
				.sendKeys("Quality Means Doing it Right , When no one else is looking");
		driver.findElementById("in.dbst.shutappv1.dev:id/action_ok").click();
		driver.findElementById("in.dbst.shutappv1.dev:id/action_done").click();
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions
					.invisibilityOfElementLocated(By.id("in.dbst.shutappv1.dev:id/progress_bar_with_tv_frame")));
			System.out.println("About Feild Updated");
		} catch (TimeoutException e) {
			System.out.println("About Feild Not Updated in 60 sec");
		}
		driver.findElementByXPath("//android.widget.RelativeLayout[@index='0']").click();

		for (int i = 0; i < 15; i++) {
			SwipeScreen(el, driver);
		}
	}
}