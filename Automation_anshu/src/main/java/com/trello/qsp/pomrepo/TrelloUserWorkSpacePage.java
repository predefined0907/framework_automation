package com.trello.qsp.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserWorkSpacePage {
WebDriver driver;
public TrelloUserWorkSpacePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//span[text()='Create new board']")
private WebElement createNewBoardOption;
public WebElement getCreateNewBoardOption() {
	return createNewBoardOption;
}
@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
private WebElement boardTitleField;
public WebElement getBoardTitleField() {
	return boardTitleField;
}

@FindBy(xpath = "//button[text()='Create']")
private WebElement createBoardButton;
public WebElement getCreateBoardButton() {
	return createBoardButton;
}

}
