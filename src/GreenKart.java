import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Path for driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait w= new WebDriverWait(d,5);

		// launch url
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	
		// give input in form of array
		String[] items = { "Cauliflower", "Carrot", "Tomato","Pumpkin" };
		//call method
		addItems(d, items);
		d.findElement(By.xpath("//img[@alt='Cart']")).click();
		d.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		d.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		d.findElement(By.xpath("//button[text()='Apply']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(d.findElement(By.xpath("//span[@class='promoInfo']")).getText());

		
		
		
	}
		
		
		
		public static void addItems(WebDriver d,String[] items) {
			
			// convert into array list
			List arrayList = Arrays.asList(items);
			// Find product xpath and put in Array
			List<WebElement> productName = d.findElements(By.xpath("//h4[@class='product-name']"));
			int j=0;
			for (int i = 0; i < productName.size(); i++) {
				String[] name = productName.get(i).getText().split("-");
				String formattedName = name[0].trim();
				// if(name.contains("cauli")) {

				if (arrayList.contains(formattedName)) {
					j++;
					d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == items.length)
						break;
				}

			}
			
		}
	}


