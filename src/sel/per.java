package sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class per
{
	@Test
	public void start() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","//home//tyss//Downloads//chromedriver");
		WebDriver  driver=new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Register.html");
//		File f=new File("/home/tyss/Desktop");
//		String s=f.getAbsolutePath();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		StringSelection s=new StringSelection("\\home\\tyss\\Desktop\\Manual Test Scenario-1.ods");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_V);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shruti");
		
		
		r.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_LEFT);
		
		r.keyRelease(KeyEvent.VK_LEFT);		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_LEFT);		Thread.sleep(2000);

		r.keyRelease(KeyEvent.VK_LEFT);		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//input[@type='tel']")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
	}
}
	
