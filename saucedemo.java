package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class saucedemo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Gupta");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
