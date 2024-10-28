package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@name='username']")
	private WebElement Username;
	@FindBy(xpath="//*[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	private WebElement Login_btn;
	@FindBy(xpath="//*[contains(text(),'Log Out')]")
	private WebElement Logout;
	
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	public WebElement getLogout() {
		return Logout;
	}
}
