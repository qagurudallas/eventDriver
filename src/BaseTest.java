
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest  {
	EventFiringWebDriver edriver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		edriver = new EventFiringWebDriver(driver);
		
		edriver.get("http://www.aa.com");
	}
	@Test
	public void getTitle() {
		WebElement element = edriver.findElement(By.id("flightSearchForm.button.reSubmit"));
		 element.click();
		 
		
	}
}
