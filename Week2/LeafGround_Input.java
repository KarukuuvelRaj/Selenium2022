<<<<<<< HEAD
package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Input {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Raj");
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input")).sendKeys("Madurai");
		WebElement one = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		if(one.isEnabled()) {
			System.out.println("The field is enabled");
		}else System.out.println("The field is disabled");
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::input")).clear();
		String text = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input")).getAttribute("value");
		System.out.println("The retrieved text is: "+text);
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("abc@gmail.com",Keys.TAB);
		/*
		 * boolean enabled =
		 * driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).
		 * isEnabled();
		 * System.out.println("Does the cursor moved to next field: "+enabled);
		 */
		WebElement abtYours = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));
		if(abtYours.equals(driver.switchTo().activeElement())) {
			System.out.println("Cursor moved to next element");
		}else System.out.println("Cursor is not moved");
		abtYours.sendKeys("Trying to become an Automation Engineer");
		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::input)[2]")).sendKeys(Keys.ENTER);
		/*
		 * WebElement one1 =
		 * driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		 * if(one1.equals("Age is mandatory"))
		 */
	}

}
=======
package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround_Input {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Raj");
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input")).sendKeys("Madurai");
		WebElement one = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		if(one.isEnabled()) {
			System.out.println("The field is enabled");
		}else System.out.println("The field is disabled");
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::input")).clear();
		String text = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input")).getAttribute("value");
		System.out.println("The retrieved text is: "+text);
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("abc@gmail.com",Keys.TAB);
		/*
		 * boolean enabled =
		 * driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).
		 * isEnabled();
		 * System.out.println("Does the cursor moved to next field: "+enabled);
		 */
		WebElement abtYours = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));
		if(abtYours.equals(driver.switchTo().activeElement())) {
			System.out.println("Cursor moved to next element");
		}else System.out.println("Cursor is not moved");
		abtYours.sendKeys("Trying to become an Automation Engineer");
		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::input)[2]")).sendKeys(Keys.ENTER);
		/*
		 * WebElement one1 =
		 * driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		 * if(one1.equals("Age is mandatory"))
		 */
	}

}
>>>>>>> e621e9f965e68abdd61288c382776486f548a122
