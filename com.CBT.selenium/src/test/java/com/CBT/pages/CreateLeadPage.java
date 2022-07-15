package com.CBT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateLeadPage {

	@FindBy(name = "property(saltName)")
	private WebElement salutationDropdown;

	public CreateLeadPage() {
		PageFactory.initElements(com.CBT.generalibrari.BaseTest.driver, this);
	}

	public WebElement getSalutationDropdown() {
		return salutationDropdown;

	}

}
