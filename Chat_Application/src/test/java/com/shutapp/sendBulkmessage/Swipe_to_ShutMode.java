/**
 * 
 */
package com.shutapp.sendBulkmessage;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
public class Swipe_to_ShutMode extends CreatePrivateGroup {

	@Test(priority = 5)
	public void ShutMode_Swipes() throws MalformedURLException, InterruptedException {

		TouchAction ts = new TouchAction(driver);
		WebElement firstelement = driver.findElementsByClassName("android.widget.LinearLayout").get(0);
		WebElement secondElemnt = driver.findElementsByClassName("android.widget.LinearLayout").get(1);
		ts.press(PointOption.point((Point) firstelement)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point((Point) secondElemnt)).release().perform();

	}
}
