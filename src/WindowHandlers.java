import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nithya\\Documents\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        d.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
        //Window Handles
        Set<String> handles=d.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String parentid=it.next();
        String childid=it.next();
        d.switchTo().window(childid);
        System.out.println(d.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
        d.switchTo().window(parentid);//switch to parent window
        System.out.println(d.getTitle());

	}

}
