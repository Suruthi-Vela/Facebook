package org.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	WebDriver c= new ChromeDriver();
	c.manage().window().setSize(new Dimension(400, 450));
	c.manage().window().setPosition(new Point(600, 200));
	c.get("https://www.facebook.com/");
	WebElement usrname = c.findElement(By.name("email"));
	String text = usrname.getTagName();
	System.out.println("Text"+text);
	usrname.sendKeys("hello@gmail.com");
	String attribute = usrname.getAttribute("value");
	System.out.println("Attribute"+attribute);
	WebElement pwd=c.findElement(By.id("pass"));
	pwd.sendKeys("12345");
	WebElement loginbtn = c.findElement(By.xpath("//button[@value='1']"));
	loginbtn.click();
	
}
}
