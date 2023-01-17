package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BTVFrames {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.findElement(By.xpath("//a[@class='grid-image']")).click();
		driver.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
		driver.findElement(By.id("wk_zipcode")).sendKeys("642001");	
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//button[@class='InitialMessageBubble__CloseButton-sc-1sz7s3c-2 fVrRGD']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@class='btn']")).click();	
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click(); 	
		driver.findElement(By.id("checkout")).click();	
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
