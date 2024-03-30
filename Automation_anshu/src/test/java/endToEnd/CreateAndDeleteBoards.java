package endToEnd;

import static org.testng.Assert.expectThrows;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.trello.qsp.genericutility.BaseClass;
import com.trello.qsp.pomrepo.TrelloHomePage;
import com.trello.qsp.pomrepo.TrelloJailerPage;
import com.trello.qsp.pomrepo.TrelloLogOutPage;
import com.trello.qsp.pomrepo.TrelloLoginPage;
import com.trello.qsp.pomrepo.TrelloLoginToContinuePage;
import com.trello.qsp.pomrepo.TrelloUserWorkSpacePage;

public class CreateAndDeleteBoards extends BaseClass{
@Test
public void oneEndToEndUponTrello() throws IOException, InterruptedException {
	TrelloHomePage homepage = new TrelloHomePage(driver);
	homepage.getLoginOption().click();
	
	Thread.sleep(2000);
	
	TrelloLoginPage loginpage = new TrelloLoginPage(driver);
	loginpage.getEmailTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("email"));
	loginpage.getContinueButton().submit();
	
	TrelloLoginToContinuePage LoginToContinuePage = new TrelloLoginToContinuePage(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	LoginToContinuePage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
	LoginToContinuePage.getLoginContinueButton().submit();
	
	TrelloUserWorkSpacePage UserWorkSpacePage = new TrelloUserWorkSpacePage(driver);
	UserWorkSpacePage.getCreateNewBoardOption().click();
	
	UserWorkSpacePage.getBoardTitleField().sendKeys(fileUtils.readTheDataFromPropertyFile("boardtitle"));
	wait.until(ExpectedConditions.elementToBeClickable(UserWorkSpacePage.getCreateBoardButton()));
	
	if(UserWorkSpacePage.getCreateBoardButton().isEnabled()) {
		UserWorkSpacePage.getCreateBoardButton().click();
	}
	Thread.sleep(1000);
	TrelloJailerPage JailerPage = new TrelloJailerPage(driver);
	JailerPage.getMenuOption().click();
	JailerPage.getLogOutOption().click();
	
	TrelloLogOutPage LogOutPage = new TrelloLogOutPage(driver);
	LogOutPage.getLogOutButton().click();
		
}
}
