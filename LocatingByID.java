package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		//Finding the element of Button one and clicking the button
		driver.findElement(By.id("btn_one")).click();
	}

}
