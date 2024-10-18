package Org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;

public class OrgCreateWithType extends BaseClass{
   
	@Test
	  public void sampleTest() throws Throwable {
		 String Orgname=eLib.getDataFromExcel("org", 4, 2);
		 String value=eLib.getDataFromExcel("org", 4, 4);
		    orgwithtype.getOrgmodul().click();
		    orgwithtype.getCreateOrg().click();;
		    orgwithtype.getOrgname().sendKeys(Orgname);
		    
		    web.selectbyvalue(orgwithtype.getOrgtype(), value);
		    
		    Thread.sleep(8000);
		    orgwithtype.getSaveorg();
		
		       
	  }
}
