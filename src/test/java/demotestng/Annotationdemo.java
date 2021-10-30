package demotestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Annotationdemo {
	ChromeDriver driver;

	@BeforeMethod// Annotation of TestNG
	public void runBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void VerifyListOfCourses() {

		Actions action = new Actions(driver);
		WebElement courses = driver.findElement(By.xpath("//a[contains(text(),'Courses')]"));
		action.moveToElement(courses).perform();
		List<WebElement> crses = driver.findElements(
				By.xpath("//a[contains(text(),'Courses')]/following-sibling::ul/li[contains(@id,'menu-item')]"));
		for (WebElement webElement : crses) {
			System.out.println(webElement.getText());
		}
	}

	@Test
	public void verifyUserRedirectedonRecentPlacementpage() {

		driver.findElement(By.xpath("//a[contains(text(),'Recent Placements')]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
