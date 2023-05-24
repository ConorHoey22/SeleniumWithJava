package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDataToForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// TODO Auto-generated method stub
		//Key and location of ChromeDriver
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Conor\\OneDrive\\Documents\\FD\\Portfolio\\Web Automation\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/contactForm.html");
		

		//Finding the element By CSS Selector to insert a first_name value into the contact form 
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("This is my first name , I have sent");
		 
		//Finding the element By CSS Selector to insert a Message value into the contact form 
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("This is the Message , I have sent.");
		
		
	}

}
