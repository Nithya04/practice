	import java.util.List;
	
import org.testng.Assert;




	import org.openqa.selenium.By;

	import org.openqa.selenium.Keys;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveDropDown {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		Assert.assertEquals(0, 0);
		
	
//		//li[@class="ui-menu-item"]/a-xpath
		
		//List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for(WebElement option :options)
		{
		   if(option.getText().equalsIgnoreCase("India"))
		{

		  option.click();

		break;

		}

		}

	}

	}
	
	
	
	
	
	
	