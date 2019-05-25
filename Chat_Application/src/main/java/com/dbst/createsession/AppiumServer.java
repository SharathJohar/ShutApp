/**
 * 
 */
package com.dbst.createsession;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author SHARATH
 *
 * 
 */
public class AppiumServer {

	/**
	 * @param args
	 */
	@BeforeSuite
	//This will Start Appium Automatically
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

//	@AfterSuite
	//	This will Stop Appium Automatically
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

}
