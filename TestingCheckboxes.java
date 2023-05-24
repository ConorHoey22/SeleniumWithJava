package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingCheckboxes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/dropdown.html");


		//Finding the element By CSS Selector to check if the Red checkbox is selected.
		System.out.println(driver.findElement(By.cssSelector("[name='cb_red']")).isSelected());
		
		
		//Finding the element By CSS Selector to check if the Green checkbox is selected.
		System.out.println(driver.findElement(By.cssSelector("[name='cb_green']")).isSelected());
				
	}

}
