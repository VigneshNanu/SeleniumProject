package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoProgramTest {

	@Test
	public void demo(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/maven-tutorials/what-is-maven");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
