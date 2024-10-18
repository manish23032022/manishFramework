package Org;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;

public class CreateOrgWithName extends BaseClass{
	
	@Test
	public void sampleTest() throws Throwable {
		  String Orgname=eLib.getDataFromExcel("org", 1, 2);
		  createorg.getOrgmodul().click();
		  createorg.getCreateOrg().click();
		  createorg.getOrgname().sendKeys(Orgname);
		  createorg.getSaveorg().click();
	}

}
