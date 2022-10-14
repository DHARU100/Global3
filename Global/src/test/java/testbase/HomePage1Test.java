/**
 *Testing created by Dharunya Karthy
 *Created on 12/10/22
 */
package testbase;
/**
 *Test Base containing the actions  for the UI class
 *
 */
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import pageui.HomePage1UI;

public class HomePage1Test {



	public static void login() throws InterruptedException {
		//Setting the path and opening firefox driver for testing 

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Driver\\Bin1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		//calling the methods for the short sleeved dress and performing actions to add them to the cart 
		
		HomePage1UI.addFadedShortSlee(driver).click();
		HomePage1UI.addingMedumSize(driver).click();
		HomePage1UI.selectColour(driver).click();
		HomePage1UI.addToCart(driver).click();
		Thread.sleep(5000);
		
		//calling the methods for the Summer Printed Dress and performing actions to add them to the cart 
		
		driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		HomePage1UI.eveningDress(driver).click();
		HomePage1UI.addingSize(driver).click();
		HomePage1UI.selectColourBeige(driver).click();
		HomePage1UI.addToCart2(driver).click();
		Thread.sleep(5000);
		
		//calling the methods for the Evening Dress and performing actions to add them to the cart 
		driver.navigate().to("http://automationpractice.com/index.php?id_category=3&controller=category");
		HomePage1UI.summerDress(driver).click();
		HomePage1UI.addingSize(driver).click();
		HomePage1UI.selectColourOrange(driver).click();
		HomePage1UI.addToCart3(driver).click();
		Thread.sleep(5000);
		
		//calling the methods for removing the Evening dress and adding one more Blue shirt 
		
		HomePage1UI.proceedCheckout(driver).click();
		HomePage1UI.editCheckout(driver).click();
		Thread.sleep(3000);
		HomePage1UI.editCheckout2(driver).click();
		
		
		// Assert checking the price .
		HomePage1UI.priceCheck(driver);
		driver.quit();
	}

}	