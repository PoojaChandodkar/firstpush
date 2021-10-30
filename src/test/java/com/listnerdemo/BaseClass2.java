package com.listnerdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {


	public static RemoteWebDriver driver;
	@BeforeMethod
public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://testingshastra.com/");
		}
	
}

