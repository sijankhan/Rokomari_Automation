package websites;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.SignUpPage;
import utilities.DriverSetup;
import static org.testng.Assert.assertEquals;

public class LoginMainTest extends DriverSetup {
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    BasePage basePage = new BasePage();

    @Test
    public void LoginURLTest(){
        getDriver().get("https://www.rokomari.com/book");
        assertEquals(getDriver().getCurrentUrl(), "https://www.rokomari.com/book");

    }
    @Test
    public void HomePageGetTitle(){
        getDriver().get("https://www.rokomari.com/book");
        assertEquals(getDriver().getTitle(), "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com");
    }

     @Test
    public void signText() throws InterruptedException {

        getDriver().get("https://www.rokomari.com/book");
        homePage.clickOnSignInButton();
      //  signUpPage.clickSignUpBotton();
     //   signUpPage.userName("Nahid Hassn");
      //  signUpPage.emailAddress("nibirmon8@gmail.com");
       // signUpPage.phoneNumber("1871931303");
      //  signUpPage.passWord("nibirmon8");
       // signUpPage.createAccount();
        // signUpPage.verification("");
         signUpPage.signInEmail("nibirmon8@gmail.com");
         signUpPage.singInPassword("nibirmon8");
         signUpPage.signInClickButton();
         basePage.Hover();
         basePage.selectFilter("সমকালীন উপন্যাস");
         basePage.scroll();
        // basePage.nextOption();
        //  basePage.addToCart();
           basePage.cartIcon();
           basePage.shippingPage();
           basePage.alterNumber("01763043074");
           basePage.selectCountry();
           basePage.clickOnCountry();
           basePage.selectCity();
           basePage.selectArea();
           basePage.addAddress("H-K/1, Shamol chaiya ,R-45");
           basePage.payment();






    }
}
