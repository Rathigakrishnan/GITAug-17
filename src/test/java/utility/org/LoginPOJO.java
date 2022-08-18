package utility.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends utility{

	public LoginPOJO(){
		
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	
	@FindBy(id="email")
	private WebElement emailtxt;
	
	@FindBy(name="pass")
	private WebElement passwordtxt;
	
	@FindBy(name="Login")
	private WebElement loginbtn;
	
	
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@placeholder='Email address or phone number']")

	})
	private WebElement txtuser;
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="password")
	})
	private WebElement txtpass;
	

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

 public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
