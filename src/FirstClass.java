import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inovoke driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//launch url
		d.get("https://www.selenium.dev/downloads/");
		//title
		String title=d.getTitle();
		System.out.println(title);
		//currentUrl
		String currentUrl=d.getCurrentUrl();
		System.out.println(currentUrl);
		//navigate
		d.get("https://chromedriver.storage.googleapis.com/index.html?path=91.0.4472.101/");
		String currentUrl1=d.getCurrentUrl();
		System.out.println(currentUrl1);
		d.navigate().back();
		String currentUrl2=d.getCurrentUrl();
		System.out.println(currentUrl2);
		
		d.close();

		
		
	}

}
