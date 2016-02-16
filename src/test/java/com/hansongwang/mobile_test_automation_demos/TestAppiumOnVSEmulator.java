package com.hansongwang.mobile_test_automation_demos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestAppiumOnVSEmulator {
	
	// create instance for Appium Driver
	@SuppressWarnings("rawtypes")
	AppiumDriver<WebElement> driver;
	
	@BeforeClass
	public void Setup() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "donatello");
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.hansongwang.android_apps_demos");
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "MainActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
  @Test
  public void AppiumTest() {
	  Assert.assertNotNull(driver.getContext());
  }
}
