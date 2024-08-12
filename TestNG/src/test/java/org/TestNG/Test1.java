package org.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	
	@org.testng.annotations.Test
	public void google() {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Dominos.in",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();	
	}
    
	@Test
	public void faceook() {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.co.in/");
		driver.findElement(By.xpath("//button[text()='ORDER ONLINE NOW']")).click();
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		//driver.quit();	
	}
}
