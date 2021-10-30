package com.listnerdemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.config.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Mylistener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		/*
		 * System.out.println("onTestFailure"); BaseClass base = new BaseClass(); String
		 * dir = System.getProperty("user.dir");// current working directory File src =
		 * base.driver.getScreenshotAs(OutputType.FILE);//can directly write
		 * BaseClass.driver try { FileUtils.copyFile(src, new File(dir +
		 * "/screenshots/image.jpg")); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		String dir = System.getProperty("user.dir");
		AShot ashot = new AShot();
		ShootingStrategy start = null;
		start = ShootingStrategies.viewportPasting(2000);
		ashot.shootingStrategy(start);

		Screenshot sc = ashot.takeScreenshot(BaseClass.driver);
		BufferedImage image = sc.getImage();
		try {
			ImageIO.write(image, "png", new File(dir + "/screenshot/image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}
