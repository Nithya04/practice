import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//launch url
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement from=d.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']"));
		from.click();
		WebElement currency=d.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		WebElement s=d.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
//		WebElement to=d.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_destinationStation1']"));
//		Select dropdown=new Select(from);
//		from.click();
//		dropdown.selectByIndex(4);
//		to.click();
//		Select dropdown1=new Select(to);
//		dropdown1.selectByIndex(6);
		
		Select a=new Select(s);
		Thread.sleep(4000);
		a.selectByIndex(2);
		
		
		
		
	}

}
