package com.comcast.crm.objectrepositoryutilityOrg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {
       
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgmodul;
	
	@FindBy(xpath="//img[@title=\"Create Organization...\"]")
	private WebElement createOrg;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy(name="button")
	private WebElement saveorg;
	
public CreateOrganization(WebDriver driver) {
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

public WebElement getSaveorg() {
	return saveorg;
}

public void setSaveorg(WebElement saveorg) {
	this.saveorg = saveorg;
}
	


}
