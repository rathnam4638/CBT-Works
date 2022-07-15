package com.CBT.leads;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CBT.generalibrari.BaseTest;

public class CreateLeadsTest extends BaseTest{

	@Test
	public void createLeads()
	{
		Reporter.log("Home Page is Displayed",true);
		Reporter.log("Leads Page is Displayed",true);
	}
}
