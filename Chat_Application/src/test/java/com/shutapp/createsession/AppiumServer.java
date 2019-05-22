package com.shutapp.createsession;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author SHARATH
 *
 * 
 */
public class AppiumServer {

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
	
	@BeforeClass
	public AndroidDriver<AndroidElement> Capabilities() throws IOException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "4da52af");
		cap.setCapability("deviceName", "Mi A2");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("platformName", "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.dbst.shutappv1.dev");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"in.dbst.shutappv1.ui.components.launcher.ActivityLauncher");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("ShutApp Launched");
		return driver;
		

	}
	
	@BeforeTest
	public void MobileNumber() throws IOException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
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
}
