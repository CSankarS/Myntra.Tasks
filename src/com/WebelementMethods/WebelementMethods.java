package com.WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("sankar123@gmail.com");
		mail.clear();
		Thread.sleep(3000);
	
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("abcdefgh");
		String text = password.getAttribute("id");
		System.out.println(text);
		
		WebElement log = driver.findElement(By.name("login"));
		boolean enabled = log.isEnabled();
		System.out.println(enabled);
		log.click();
		Thread.sleep(3000);
		
		//driver.navigate().back();
		//driver.close();		
		
	}

}
