package com.BrowserLaunch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_URL {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/Face.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		System.out.println("Url closed");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Browser closed");
	}
}	
//	public static void printScreen(String filename, TakesScreenshot driver) throws IOException {
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File(
//				"C:\\Users\\User"
//				+ "\\eclipse-workspace\\MavenProject\\Screenshots\\" + filename + ".png");
//		FileUtils.copyFile(src, des);
//	}

	


