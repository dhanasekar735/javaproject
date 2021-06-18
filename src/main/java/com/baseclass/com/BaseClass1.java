package com.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverAction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass1 {

	public static WebDriver driver;
	
	
	
	
	

	// 1.Browser launch
	public static WebDriver browseLaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\selenium jars and drivers\\drivers\\chrome driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("name", "location");
				driver = new FirefoxDriver();
			}

			else {
				System.out.println("Invalid browser");

			}
			driver.manage().window().maximize();
		} catch (Exception e) {

		}
		return driver;

	}



	// 2.Close the browser
	public static void close() {

		try {
			driver.close();
		} catch (Exception e) {

		}

	}

	// 3. Quit the browser
	public static void quit() {

		try {
			driver.quit();
		} catch (Exception e) {

		}

	}

	// 4.Navigate to
	public static void navigateTo(String url) {
		try {
			driver.navigate().to("");
		} catch (Exception e) {

		}

	}

	// 5.Navigate to back
	public static void navigateback() {
		try {
			driver.navigate().back();
		} catch (Exception e) {

		}

	}

	// 6.Navigate to forward
	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {

		}

	}

	// 7.Navigate Refresh
	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {

		}
	}

	// 8.Get URL
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {

		}
	}

	// 9.simple_Alert
	public static void simplealert(WebElement element) {
		try {
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
		} catch (Exception e) {

		}

	}

	// 9.confirm Alert
	public static void confirmAlert(WebElement element) {
		try {
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.accept();
		} catch (Exception e) {

		}

	}

	// 9. promptAlert
	public static void promptAlert(WebElement element) {
		try {
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.accept();
		} catch (Exception e) {

		}

	}

	// 10.Action
	public static void action(WebElement element) {
		Actions act = new Actions(driver);

	}

	// 11.Frames
	public static void frames(WebElement iframe) {
		// iframe.click();
		driver.switchTo().frame(0);

	}

	// 12.Robot
	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

	// 13.WindowHanles
	public static void windowHandling() {
		
		try {
			driver.getWindowHandles();
		} catch (Exception e) {
			
		}

	}

	// 14.DropDown

	public static void dropdown(WebElement element, String value, String i) {
		Select s = new Select(element);
		if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));
		} else if (value.equals("value")) {
			s.selectByValue(value);
		} else if (value.equals("text")) {
			s.selectByVisibleText(value);
		}

	}

	// 15.CheckBox
	public static void checkbox(WebElement element) {

	}

	// 16.IsEnabled
	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {

		}
	}

	// 17.IsDisplayed
	public static void isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {

		}

	}

	// 18.IsSlected
	public static void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {

		}
	}

	// 19.GetOptions

	public static void getOptions(WebElement element) {

	}

	// 20.GetTitle

	public static void getTitle() {
		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {

		}

	}

	// 21.GetCurrentUrl

	public static void getCurrentUrl(WebElement element) {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {

		}
	}

	// 22.GetText
	public static void getTxt(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	// 23.GetAttribute
	public static void getAttribute(By bySearchButton) {
		WebElement element = driver.findElement(bySearchButton);
		System.out.println(element);
	}

	// 24.implicitWait
     
	@SuppressWarnings("deprecation")
	public static void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			
		}
		
		

	}
	
	// 24.explicitWait
    
		@SuppressWarnings("deprecation")
		public static void explicitWait(long seconds, WebElement element) {
			try {
				WebDriverWait wait =  new WebDriverWait(driver, seconds);
				wait.until(ExpectedConditions.visibilityOf(element));
			} catch (Exception e) {
				
			}
			
			
			
			

		}
	
	
	
	// 25.TakeScreenshot

	public static void takeScreenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(path);
	}

	// 26.Scroll Up and Down
	public static void scrollUpAndDown() {
		
	}

	// 27.SendKeys
	public static void inputText(WebElement element, String inputValues) {

		element.sendKeys(inputValues);

	}

	// 28.GetSelected 
	public static void getSelected() {
		Select select= new Select(driver.findElement(By.xpath("//select")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);


	}

	// 30.IS Multiple
	public static void isMultiple(WebElement element) {

	}

	// 31.Click
	public static void clickOnElement1(WebElement element) {
		element.click();

	}

	// 32.Clear
	public static void clear(WebElement element) {
		element.clear();

	}

	public static void dropDownSelection(WebElement element, String option, String input) {
		Select s = new Select(element);
		if (option.equals("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		} else if (option.equals("value")) {
			s.selectByValue(input);
		} else if (option.equals("text")) {
			s.selectByVisibleText(input);
		}
	}

	// 33.dragAndDrop

	public static void dragDrop(WebElement element, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}
	

}