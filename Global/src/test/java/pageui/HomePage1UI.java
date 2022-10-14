/**
 *Testing created by Dharunya Karthy
 *Created on 11/10/22
 */
package pageui;
/**
 *Home Page UI Class
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage1UI {
	// Creating a homepage UI

	WebElement element = null;

	public static WebElement addFadedShortSlee(WebDriver driver) throws InterruptedException {
		// Finding the webelement for ShortSleeve dress

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//ul[@id='homefeatured']//img[@class='replace-2x img-responsive' and @alt='Faded Short Sleeve T-shirts']"));
		return element;
	}

	public static WebElement addingMedumSize(WebDriver driver) throws InterruptedException {
		// Finding the webelement for mediumsize ShortSleeve dress 

		WebElement element = driver.findElement(By.xpath("//select[@id='group_1']//option[@value='2']"));
		return element;
	}

	public static WebElement selectColour(WebDriver driver) throws InterruptedException {
		// Finding the webelement for blue colour ShortSleeve dress

		WebElement element = driver.findElement(By.xpath("//a[@id='color_14']"));
		return element;


	}
	public static WebElement addToCart(WebDriver driver) throws InterruptedException {
		// Finding the webelement for adding the blue colour short sleeve dress to the cart

		WebElement element = driver.findElement(By.xpath("//button[@class='exclusive']"));
		return element;

	}
	public static WebElement eveningDress(WebDriver driver) throws InterruptedException {
		// Finding the webelement for Printed Dress
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(
				"//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-item-of-tablet-line first-item-of-mobile-line']//a[@class='product-name' and @title='Printed Dress']"));
		return element;
	}

	public static WebElement addingSize(WebDriver driver) throws InterruptedException {
		// Finding the webelement for size of the Printed Dress
		
		WebElement element = driver.findElement(By.xpath("//option[@title='S']"));
		return element;
	}

	public static WebElement selectColourBeige(WebDriver driver) throws InterruptedException {
		// Finding the webelement for colour of the Printed Dress
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Beige']"));
		return element;


	}
	public static WebElement addToCart2(WebDriver driver) throws InterruptedException {
		
		// Finding the webelement for adding Printed Dress
		
		WebElement element = driver.findElement(By.xpath("//button[@class='exclusive']"));
		return element;

	}

	public static WebElement summerDress(WebDriver driver) throws InterruptedException {
		// Finding the webelement for Printed Summer Dress

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath(
				"//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-item-of-tablet-line']//a[@class='product-name' and @title='Printed Summer Dress']"));
		return element;
	}

	public static WebElement Size(WebDriver driver) throws InterruptedException {
		// Finding the webelement for size of the Summer Dress
		
		WebElement element = driver.findElement(By.xpath("//select[@id='group_1']//option[@value='2']"));
        return element;
	}

	public static WebElement selectColourOrange(WebDriver driver) throws InterruptedException {
		// Finding the webelement for colour of the Printed Dress
		
		WebElement element = driver.findElement(By.xpath("//a[@id='color_13' and @title='Orange']"));
        return element;


	}
	public static WebElement addToCart3(WebDriver driver) throws InterruptedException {
		// Finding the webelement for adding Printed Dress
		
		WebElement element = driver.findElement(By.xpath("//button[@class='exclusive']"));
		return element;

	}
	public static WebElement proceedCheckout(WebDriver driver) throws InterruptedException {
		// Finding the webelement  to process checkout 
		
		WebElement element = driver.findElement(
				By.xpath("//a[@class='btn btn-default button button-medium' and @title='Proceed to checkout']"));

		return element;
	}
	public static WebElement editCheckout(WebDriver driver) throws InterruptedException {
		// Finding the webelement for removing the Evening wear
		
		WebElement element = driver.findElement(By.xpath("//tr[@id='product_4_16_0_0']//i[@class='icon-trash']"));
		return element;
	}
	public static WebElement editCheckout2(WebDriver driver) throws InterruptedException {
		// Finding the webelement for adding one more short sleeved dress
		
		WebElement element = driver.findElement(By.xpath("//a[@id='cart_quantity_up_1_4_0_0']//i[@class='icon-plus']"));
		return element;
	}

	public static WebElement priceCheck(WebDriver driver) throws InterruptedException {
		// Finding the webelement for asserting the price .
		
		String Expectedvalue = "65.53";
		WebElement value= driver.findElement(By.xpath("//td[@id='total_price_container' and @class='price']"));
		String ActualValue=value.getText();

		Assert.assertEquals(Expectedvalue, ActualValue,"The value is mismatched");
		return value;

	}
}




