package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
@Test
public void test01(){
	System.setProperty("webdriver.driver.chrome","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/Offline%20Website/index.html");
	String headingLabel = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
	Assert.assertEquals(headingLabel, "Java By Kiran");
}
}
