package com.listnerdemo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException {
	Date currentdate= new Date();
	System.out.println(currentdate);
	String dir = System.getProperty("user.dir");
	String screenshotfilename=currentdate.toString().replace("", "-").replace(":","-" );
	System.out.println(screenshotfilename);
	System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://testingshastra.com/");
	File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotfile, new File(dir + "/screenshots/image.jpg"));
}
}
