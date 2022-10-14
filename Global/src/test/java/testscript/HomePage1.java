/**
 *Testing created by Dharunya Karthy
 *Created on 11/10/22
 */
package testscript;
/**
 *Home Page and Exection class using TestNG
 *
 */
import org.testng.annotations.Test;

import testbase.HomePage1Test;
public class HomePage1 {
	
	@Test
	public void home() throws InterruptedException
	{
	testbase.HomePage1Test obj = new testbase.HomePage1Test();
	
	obj.login();
	
	
}
}