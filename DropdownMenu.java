package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/dropdown.html");

	
		//Select menu
		Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
		
//		selectByVisibleText Example
//		menuItem.selectByVisibleText("Honda");
		
		menuItem.selectByValue("jeep");
		
		

				
	}
	
	
}
