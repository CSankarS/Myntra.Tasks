package com.Frames;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		//parent frame
		WebElement parent = driver.findElement(By.id("first Fr"));
		driver.switchTo().frame(parent);
		driver.findElement(By.name("fname")).sendKeys("Sankar");
		driver.findElement(By.name("lname")).sendKeys("Subramaniyan");;
		//child frame
		WebElement child = driver.findElement(By.xpath("//iframe[@class = 'has-background-while']"));
		driver.switchTo().frame(child);
		driver.switchTo().frame(1); //using index
		driver.findElement(By.name("email")).sendKeys("csankars@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).clear();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch Tutorial")).click();
		//Thread.sleep(1000);
		driver.navigate().back();
			
}
}
