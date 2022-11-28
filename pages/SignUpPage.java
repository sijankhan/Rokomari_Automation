package pages;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage{

    private By ClickOnSignUpBotton = By.xpath("//p[@class='js--registration-form-btn text-uppercase']");
    private By UserName = By.xpath("//input[@id='nm']");
    private By EmailAddress = By.xpath("//input[@id='js-email']");
    private By PhoneNumber = By.xpath("//input[@id='js-phone']");
    private By PassWord = By.xpath("//input[@id='pwd']");
    private By CreateAccount = By.xpath("//button[contains(text(),'Create Account')]");
    private By VerificationCode = By.xpath("//input[@placeholder='Verification Code']");

    //For SignIn..........
    private By SignInUserEmail = By.xpath("//input[@id='j_username']");
    private By SignInPassword = By.xpath("//input[@id='j_password']");

    private By SigInClickButton = By.xpath("//button[contains(text(),'Sign In')]");

    public void clickSignUpBotton(){
        clickElement(ClickOnSignUpBotton);
    }

    public void userName (String username){
        writeText(UserName, username);
    }
    public void emailAddress(String email){
        writeText(EmailAddress, email);
    }

    public void phoneNumber(String phoneNumber){
        writeText(PhoneNumber, phoneNumber);
    }

    public void passWord(String password){
        writeText(PassWord, password);
    }

    public void createAccount(){
        clickElement(CreateAccount);
    }

    public void verification(String verify){
        writeText(VerificationCode, verify);
    }

    public void signInEmail(String email){
        writeText(SignInUserEmail, email);
    }

    public void singInPassword(String password){
        writeText(SignInPassword, password);
    }

    public void signInClickButton(){
        clickElement(SigInClickButton);
    }


}
