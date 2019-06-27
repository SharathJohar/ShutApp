/**
 * 
 */
package com.shutapp.bottomnavbutton;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shutapp.loginflow.AppiumServer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author SHARATH
 *
 * 
 */
public class InvitePage extends AppiumServer {

	public AndroidDriver<AndroidElement> mydriver;
	
	//@Test(priority = 5)
	public void Invite() throws MalformedURLException, InterruptedException {
		
		driver.findElementById("in.dbst.shutappv1.dev:id/action_main_bottomnav_contact").click();
		List<AndroidElement> list = driver.findElements(By.id("in.dbst.shutappv1.dev:id/invite_button"));
		System.out.println(list.size());
		list.get(5).click();
		driver.findElementByXPath("//android.widget.TextView[@text='WhatsApp']").click();
		//driver.findElementByXPath("//android:id/button_once[@text='JUST ONCE']").click();
		
	}
}
