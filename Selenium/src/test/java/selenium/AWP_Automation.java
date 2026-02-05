package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AWP_Automation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// open the url
		driver.get("https://automationwithpiyush.vercel.app/");

		// click on prctice button
		driver.findElement(By.linkText("Practice")).click();

		// Locators section

		// click on locator section
		driver.findElement(By.xpath("//h4[text()='Locators']")).click();

		// Enter username
		driver.findElement(By.id("email")).sendKeys("Admin");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("Admin@123");

		// click on check box
		driver.findElement(By.id("terms_checkbox")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Navigate backword
		driver.navigate().back();

		// Web-Elements section

		// click on webelements section
		driver.findElement(By.xpath("//h4[text()='Web Elements']")).click();

		// enter firstname
		driver.findElement(By.id("firstName")).sendKeys("Aditya");

		// enter lastname
		driver.findElement(By.id("lastName")).sendKeys("Dhurvey");

		// enter email
		driver.findElement(By.id("userEmail")).sendKeys("aditya123@gmain.com");

		// Gender click
		driver.findElement(By.xpath("//span[text()='Male']/..//input")).click();

		// submit button click
		driver.findElement(By.id("submitBtn")).click();

		// Navigate backword
		driver.navigate().back();

		// Dropdowns

		// Dropdown section click
		driver.findElement(By.xpath("//h4[text()='Dropdowns']")).click();

		// Single select
		WebElement ss = driver.findElement(By.id("single-select"));
		Select sel = new Select(ss);
		Thread.sleep(500);
		sel.selectByIndex(2);
		sel.selectByValue("PAR");
		sel.selectByVisibleText("London, UK");

		WebElement multisel = driver.findElement(By.id("multi-select"));
		Select mulsel = new Select(multisel);
		mulsel.selectByIndex(2);
		mulsel.selectByIndex(3);
		mulsel.selectByIndex(5);
		mulsel.deselectAll();

		// Navigate backword
		driver.navigate().back();

		driver.findElement(By.xpath("//h4[text()='Actions Class']")).click();

		Actions act = new Actions(driver);

		WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Hover')]"));

		act.moveToElement(hover).build().perform();

		WebElement leftclick = driver.findElement(By.id("click-text"));
		act.click(leftclick).build().perform();

		WebElement rightclick = driver.findElement(By.id("right-click-area"));
		act.contextClick(rightclick).build().perform();

		WebElement doubleclick = driver.findElement(By.id("double-click-area"));
		act.doubleClick(doubleclick).build().perform();

		WebElement clickandhold = driver.findElement(By.id("click-hold"));
		act.clickAndHold(clickandhold).pause(Duration.ofSeconds(3)).perform();

		WebElement laptop = driver.findElement(By.id("prod-laptop"));
		WebElement Drop = driver.findElement(By.id("cart-zone"));
		act.dragAndDrop(laptop, Drop).build().perform();

		act.scrollByAmount(0, 500).build().perform();

		driver.quit();

	}

}
