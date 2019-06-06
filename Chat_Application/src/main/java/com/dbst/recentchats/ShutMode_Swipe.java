/**
 * 
 */
package com.dbst.recentchats;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

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
public class ShutMode_Swipe extends BulkDocuments {

	public void ShutMode_Swipes() throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = BulkDocument();
		TouchAction ts = new TouchAction(driver);
		WebElement firstelement = driver.findElementsByClassName("android.widget.LinearLayout").get(0);
		WebElement secondElemnt = driver.findElementsByClassName("android.widget.LinearLayout").get(1);
		ts.press(PointOption.point((Point) firstelement)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point((Point) secondElemnt)).release().perform();

	}
}
