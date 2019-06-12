/**
 * 
 */
package com.shutapp.buttomnavbutton;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.shutapp.loginflow.AppiumServer;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class OpenGroup extends AppiumServer {

	public AndroidDriver<AndroidElement> mydriver;

	//@Test(priority = 5)

	public void OpenGroupSerach() throws MalformedURLException, InterruptedException {

		driver.findElementById("in.dbst.shutappv1.dev:id/action_main_group_search").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,288][1032,384]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 1");
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,480][1032,576]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 2");
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,672][1032,768]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 3");
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,864][1032,960]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 4");
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,1056][1032,1152]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 5");
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,1248][1032,1344]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 6");
		driver.findElementByXPath("//android.widget.FrameLayout[@bounds='[816,1440][1032,1536]']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.ImageButton[@bounds='[0,72][168,240]']").click();
		System.out.println("join 7");
	}
}