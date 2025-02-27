package Practice.ContactTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ContactTest {
	
	
	@Test
	public void createContact()
	{
		Reporter.log("Contact is Created",true);
	}
	

	@Test
	public void modifyContact()
	{
		Reporter.log("Contact is modified",true);
	}
	
	@Test
	public void reviewContact()
	{
		Reporter.log("Contact is reviewed",true);
	}
	
	@Test
	public void approveContact()
	{
		Reporter.log("Contact is approved",true);
	}


}
