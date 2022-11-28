package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static utilities.DriverSetup.getDriver;
import java.time.Duration;
import java.util.List;


public class BasePage   {

    public WebElement getElement (By locator){
        WebDriverWait wait  = new WebDriverWait(getDriver(), Duration.ofSeconds(205));
         return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickElement (By locator){
        getElement(locator).click();
    }

    public String getElementText(By locator){
        return  getElement(locator).getText();
    }

    public void writeText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public void Hover() {
        WebElement firstEle = getDriver().findElement(By.xpath("//a[@id='js--authors']"));

        Actions action = new Actions(getDriver());
           action.moveToElement(firstEle).perform();

       WebElement secondEle =getDriver().findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
      action.moveToElement(secondEle).build().perform();
      action.moveToElement(secondEle).click(secondEle).perform();
    }

    public void selectFilter(String filter) {
        List<WebElement> filters = getDriver().findElements(By.cssSelector("div.browse-page:nth-child(12) div.container-fluid.custom-container.px-0 div.d-flex.justify-content-start.align-items-start section.browse__sidebar form:nth-child(1) div.product-sort:nth-child(1) div.product-sort__content.filter > div.filter-list:nth-child(2)"));
        WebElement value = null;
        for (int i = 0; i < filters.size(); i++) {
            String key = filters.get(i).getText();
            if (key.equals(filter)) {
                value = filters.get(i).findElement(By.cssSelector("div.browse-page:nth-child(12) div.container-fluid.custom-container.px-0 div.d-flex.justify-content-start.align-items-start section.browse__sidebar div.product-sort:nth-child(1) div.product-sort__content.filter div.filter-list:nth-child(2) div.filter-list__content a.d-flex.align-items-center.category-link:nth-child(1) > span.d-block"));
            }
        }
        if (value != null) {
            value.click();
        }
    }

    public void scroll(){
        WebElement scrollNext = getDriver().findElement(By.xpath("//a[normalize-space()='Next']"));
        JavascriptExecutor js =(JavascriptExecutor)getDriver();
       // js.executeScript("window.scrollTo(0,6000);");
        js.executeScript("arguments[0].click();", scrollNext);
    }

   // private By NextPage = By.xpath("//a[contains(text(),'Next')]");
    public void nextOption(){
        getDriver().findElement(By.xpath("//a[normalize-space()='Next']")).click();
    }

    private By AddTocart = By.xpath("//p[contains(text(),'দেয়াল')]");
    private By CartIcon= By.xpath("//*[@id='cart-icon']");
    private By ShippingPage = By.xpath("//span[contains(text(),'Place Order')]");

    private  By AlterNumber = By.id("phone2");
    private By  SelectCountry = By.xpath("//select[@id='js--country']");
    private By ClickCountry = By.xpath("//select[@id='js--country']//option[@value='1'][normalize-space()='Bangladesh']");
    private By SelectCity = By.xpath("//select[@id='js--city']");
    private By ClickCity = By.xpath("//option[contains(text(),'খুলনা')]");
    private  By SelectArea = By.xpath("//select[@id='js--area']");
    private By ClickArea = By.xpath("//option[@value='583']");
    private By AddAddress = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
    private By Zone = By.xpath("//select[@id='js--zone']");
    private  By ClickZone = By.xpath("//option[@value='3063']");
    public void cartIcon(){

        clickElement(CartIcon);
    }
    public void shippingPage(){
        clickElement(ShippingPage);
    }

    public void addToCart(){
        clickElement(AddTocart);
    }

    public void alterNumber(String number){
        clickElement(AlterNumber);
       writeText(AlterNumber, number);
    }
    public void selectCountry(){
        clickElement(SelectCountry);
    }
    public void clickOnCountry(){
        clickElement(ClickCountry);
    }

    public void selectCity(){
        clickElement(SelectCity);
        clickElement(ClickCity);
    }

    public void selectArea(){
        clickElement(SelectArea);
        clickElement(ClickArea);
        clickElement(Zone);
        clickElement(ClickZone);
    }
    public void addAddress(String address){
        writeText(AddAddress, address);
    }

    public void payment(){

         WebElement scrollToNext = getDriver().findElement(By.xpath("//img[@alt='cod']"));
        JavascriptExecutor js =(JavascriptExecutor)getDriver();
          js.executeScript("arguments[0].click();", scrollToNext);

    }

}
