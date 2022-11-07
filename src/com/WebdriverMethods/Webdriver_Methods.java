package com.WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		//property setting
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//browser launching
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		Thread.sleep(3000);
		
		driver.navigate().to("https://accounts.google.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);		
		Thread.sleep(3000);
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println(title3);		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		String currentUrl3 = driver.getCurrentUrl();	
		System.out.println(currentUrl3);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
