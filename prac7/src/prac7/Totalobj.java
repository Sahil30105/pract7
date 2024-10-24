package prac7;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Totalobj {
	static String driverpath = "D:\\SahilGupta\\tycs\\STQA\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe";

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver = new FirefoxDriver();
		String appurl = "https://www.google.co.in";
		driver.get(appurl);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		System.out.println("Total number of links:" + links.size());
	}
}
