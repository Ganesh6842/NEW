package ui;

import org.testng.annotations.Test;

import Scripts.Basetest_class;
import common.BaseTest;
import graphql.Assert;

public class ListenerDemoTest extends BaseTest{
	@Test
	public void launchApp() {
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}
	
	
}
