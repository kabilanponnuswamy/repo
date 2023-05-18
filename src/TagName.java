import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPONNU\\Desktop\\Dummy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (WebElement ele: allLinks)
		{
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
			
		}
List<WebElement> allImages = driver.findElements(By.tagName("img"));
		
		for (WebElement ele: allImages)
		{
			System.out.println("src"+ele.getAttribute("src"));
			
		}
	}

}

