package Myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class doc_Loginpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/HMS/backend/doc/index.php");
		Thread.sleep(2000);
		driver.findElement(By.name("doc_number")).sendKeys("DOC1");
		Thread.sleep(2000);
		driver.findElement(By.name("doc_pwd")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.name("doc_login")).click();
		
		driver.switchTo().alert().accept();
	}

}
