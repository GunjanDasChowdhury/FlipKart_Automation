import omg.FlipkartPage;
import selenium.helper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.*;
import static selenium.helper.driver;



public class Testcases {

    @BeforeTest
    public void before() {
        helper.startDriver();
        driver.get("https://www.flipkart.com/");
    }

    @Test()
    public void VerifyUrl (){
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.flipkart.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test()
    public void UserLogin () {
        System.out.println("Inside flipkart");
        FlipkartPage FK = new FlipkartPage(driver);
        FK.loginFlipkart();
    }

    @Test()
    public void verifyHomePageTitle () {
        String expectedTitle = "Flipkart.com.Fashion top deals.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, actualTitle);
    }

    @Test()
    public void PinCodeChange() throws AWTException {
        FlipkartPage FK = new FlipkartPage(driver);
        FK.PinCode();
    }

    @Test()
    public void Currency (){
        FlipkartPage FK = new FlipkartPage(driver);
        FK.CurrencyChange();
    }

    @Test()
    public void FilterOut () {
        FlipkartPage FK = new FlipkartPage(driver);
        FK.Filter();
    }

    @Test()
    public void ShopBy () {
        FlipkartPage FK = new FlipkartPage(driver);
        FK.ShopBy();
    }

    @Test()
    public void Wishlist () {
        FlipkartPage FK = new FlipkartPage(driver);
        FK.WishList();
    }

    @Test()
    public void Cartadd () {
        FlipkartPage FK = new FlipkartPage(driver);
        FK.ManageCart();
    }

    @Test()
    public void PlaceOrder (){
        FlipkartPage FK = new FlipkartPage(driver);
        FK.CheckOut();
    }

    @Test()
    public void verifyCheckOutPageTitle () {
        String expectedTitle = "Select Shipping Addresses - Flipkart.com Checkout";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, actualTitle);
    }

    @AfterTest
    public void aftertest() {
        driver.quit();
    }

}


