package Practice.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CreateOrgTest {
	
	@Test
	public void createOrg()
	{
		Reporter.log("Organization is Created",true);
	}
	

	@Test
	public void modifyOrg()
	{
		Reporter.log("Organization is modified",true);
	}
	
	@Test
	public void reviewOrg()
	{
		Reporter.log("Organization is reviewed",true);
	}
	
	@Test
	public void approveOrg()
	{
		Reporter.log("Organization is approved",true);
	}

}
