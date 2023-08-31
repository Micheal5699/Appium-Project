package testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestAPIDemos {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		File app = new File("./app/base.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
	
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "co.tractionapp.traction.debug");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "co.tractionapp.traction.onboarding.intro.IntroActivityHost");
		
		
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.findElement(By.id("co.tractionapp.traction.debug:id/tv_sign_in")).click();
		driver.findElement(By.id("co.tractionapp.traction.debug:id/email_field")).sendKeys("oluwatobif@tractionapps.co");
		driver.findElement(By.id("co.tractionapp.traction.debug:id/password")).sendKeys("Bamikole1@");
		driver.findElement(By.id("co.tractionapp.traction.debug:id/text_input_end_icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("co.tractionapp.traction.debug:id/text_input_end_icon")).click();
		driver.findElement(By.id("co.tractionapp.traction.debug:id/signIn")).click();
		//driver.findElement(AppiumBy.accessibilityId("3")).click();
		
		Thread.sleep(2000); 
		
		//driver.quit();
	}

}
