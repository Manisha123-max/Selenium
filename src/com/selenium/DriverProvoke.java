package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvoke {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing tools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.javatpoint.com/");  
	}
}