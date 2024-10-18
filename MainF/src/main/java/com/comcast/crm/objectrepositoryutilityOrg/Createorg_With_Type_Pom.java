package com.comcast.crm.objectrepositoryutilityOrg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createorg_With_Type_Pom {

	
//	@FindAll({
//		@FindBy(name="cds"),
//		@FindBy(id="ds"),
//		@FindBy(id="ds")
//	})
	
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgmodul;
	
	@FindBy(xpath="//img[@title=\"Create Organization...\"]")
	private WebElement createOrg;
	
	@FindBy(name="accountname")
	private WebElement orgname;

	@FindBy(name="accounttype")
	private WebElement orgtype;
	
	
	@FindBy(name="button")
	private WebElement saveorg;
	
public Createorg_With_Type_Pom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getOrgmodul() {
	return orgmodul;
}

public void setOrgmodul(WebElement orgmodul) {
	this.orgmodul = orgmodul;
}

public WebElement getCreateOrg() {
	return createOrg;
}

public void setCreateOrg(WebElement createOrg) {
	this.createOrg = createOrg;
}

public WebElement getOrgname() {
	return orgname;
}

public void setOrgname(WebElement orgname) {
	this.orgname = orgname;
}

public WebElement getOrgtype() {
	return orgtype;
}

public void setOrgtype(WebElement orgtype) {
	this.orgtype = orgtype;
}

public WebElement getSaveorg() {
	return saveorg;
}

public void setSaveorg(WebElement saveorg) {
	this.saveorg = saveorg;
}	


}
