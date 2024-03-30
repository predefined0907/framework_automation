package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloJailerPage {
WebDriver driver;
public TrelloJailerPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//button[@aria-label='Open member menu']")
private WebElement menuOption;
public WebElement getMenuOption() {
	return menuOption;
}
	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logOutOption;
	public WebElement getLogOutOption() {
		return logOutOption;
	}
}

