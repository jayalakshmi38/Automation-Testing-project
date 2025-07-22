package Myproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://localhost/HMS/");
		Thread.sleep(5000);
		
		 
		driver.findElement(By.name("patient_name")).sendKeys("Jai");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("jai@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("contact_number")).sendKeys("987654323");
		Thread.sleep(2000);
		driver.findElement(By.name("age")).sendKeys("23");
		Thread.sleep(2000);
		driver.findElement(By.name("appointment_date")).sendKeys("16.08.2025");
		Thread.sleep(2000);
		driver.findElement(By.name("appointment_time")).sendKeys("10.00");
		Thread.sleep(2000);
		driver.findElement(By.name("address")).sendKeys("chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-doc-id='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='InPatient']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.quit();
		
	
	}

}
