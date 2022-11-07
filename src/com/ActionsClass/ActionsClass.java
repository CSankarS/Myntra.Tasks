package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		WebElement cross = driver.findElement(By.xpath("//button[.='✕']"));
		act.click(cross).build().perform();
		WebElement log = driver.findElement(By.xpath("//a[.='Login']"));
		act.moveToElement(log).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(dc).build().perform();
		//Thread.sleep(3000);
		
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rc).build().perform();
		//Thread.sleep(3000);
		
		WebElement ck = driver.findElement(By.xpath("//button[.=Click Me']"));
		act.click(ck).build().perform();
		//Thread.sleep(3000);
		
	}

}
