package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage extends BasePage{

 private By RokomariSignInButton = By.xpath("//a[normalize-space()='Sign in']");
 public void clickOnSignInButton(){
         clickElement(RokomariSignInButton);
        }
}
