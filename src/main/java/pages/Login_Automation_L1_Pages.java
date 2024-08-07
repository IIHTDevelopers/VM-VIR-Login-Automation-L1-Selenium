package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Automation_L1_Pages extends StartupPage {
	
	// please write all locators here

	String pageName = this.getClass().getSimpleName();

	public Login_Automation_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method openTheLoginPanelByClickingOnLogin() 
	 * @param : null
	 * @description : open The Login Panel By Clicking On Login
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean openTheLoginPanelByClickingOnLogin() throws Exception {
		// write your logic here
		return false;
	}
	
	/**@Test2
	 * about this method clickOnLoginAndswitchToSigninIframe() 
	 * @param : null
	 * @description : click On Login And switch To Signin Iframe
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnLoginAndswitchToSigninIframe() throws Exception {
		// write your logic here
		return false;
	}
	
	/**@Test3
	 * about this method openLoginWithPasswordbox() 
	 * @param : null
	 * @description : open Login With Password box
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean openLoginWithPasswordbox() throws Exception {
		// write your logic here
		return false;
	}
	
	/**@Test4
	 * about this method enterEmailandPasswordInLoginBox() 
	 * @param : get the data from Map<String, String> expectedData using fields "emailId" and "password"
	 * @description : enter Email and Password In LoginBox
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterEmailandPasswordInLoginBox(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return null;
	}
	
	/**@Test5
	 * about this method clickOnLoginButton() 
	 * @param : null
	 * @description : click On Login Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnLoginButton() throws Exception {
		// write your logic here
		return false;
	}
	
	/**@Test6
	 * about this method checkforFailureLoginValidateTheErrorMessage() 
	 * @param : null
	 * @description : check for Failure Login Validate The Error Message(Check for failure Login and validate the error message)
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkforFailureLoginValidateTheErrorMessage() throws Exception {
		// write your logic here
		return null;	

	}
	
	/**@Test7
	 * about this method provideValidUserNameAndPasswordAndValidate() 
	 * @param : get the data from Map<String, String> expectedData using fields "ValidEmailId" and "validPassword"
	 * @description : provide Valid User Name And Password And Validate, Check for success Login
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean provideValidUserNameAndPasswordAndValidate(Map<String, String> expectedData) throws Exception {
		// write your logic here
		return false;
	}
	
	
}
