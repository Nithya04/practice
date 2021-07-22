import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SecondClass {

	public SecondClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//dropdown
		WebElement e= d.findElement(By.id("dropdown-class-example"));
				Select dropdown= new Select(e);
				dropdown.selectByIndex(2);
				String output=dropdown.getFirstSelectedOption().getText();
				System.out.println(output);
				
				
		
		

	}

}
