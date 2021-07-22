import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//launch url
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='courses-iframe']")))
		;
	
		d.findElement(By.xpath("(//a[text()='Mentorship'])[3]")).click();
		
		
	}

}
