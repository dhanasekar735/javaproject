package practiceMavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.com.BaseClass1;

public class PracticeAdactin extends BaseClass1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium jars and drivers\\drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	driver.get("https://adactinhotelapp.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		
		
		userName.sendKeys("dhanasekar735");
		password.sendKeys("chennai@3");
		login.click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s= new Select(location);
		s.selectByVisibleText("London");
		
		
		
		
		
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		selectdropdown(hotel , "Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		
		WebElement noOfRoom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		WebElement adultsPerRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		WebElement childranPerRoom = driver.findElement(By.xpath("//select[@id='child_room']"));
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		
	
		selectdropdown(hotel , "Hotel Sunshine");

	selectdropdown(roomType , "Super Deluxe");
	selectdropdown(noOfRoom , "Three");
	
	
		
		
		
		
		
		
		
		
		
	}

	

}
