package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/popups.html");

		
		//Locate the Button and click it which will display the Alert
		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();
		
		//Slow test down as its too fast
		Thread.sleep(3000);
		
		//Switch Method
		driver.switchTo().alert().accept();
		
		//Switch Method - If alert has a cancel button use .dismiss(*)
//		driver.switchTo().alert().dismiss();
		
		
		
		
	

	}

}
