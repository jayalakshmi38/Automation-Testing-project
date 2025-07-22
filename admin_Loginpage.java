package Myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin_Loginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/HMS/backend/admin/index.php");
		Thread.sleep(2000);
		driver.findElement(By.name("ad_email")).sendKeys("admin@mail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("ad_pwd")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.name("admin_login")).click();
		driver.quit();
	}

}
