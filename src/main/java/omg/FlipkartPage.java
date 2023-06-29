package omg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.helper;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FlipkartPage {

    WebDriver driver;

    By loginEl1 = By.xpath("_1_3w1N");
    By loginEl2 = By.xpath("_2IX_2- VJZDxU");
    By loginEl3 = By.xpath("_2IX_2- _3mctLh VJZDxU");
    By loginEl4 = By.xpath("_2KpZ6l _2HKlqd _3AWRsL");



    public FlipkartPage(WebDriver driver){
        this.driver=driver;
    }

    public void loginFlipkart() {
        helper.getElement(loginEl1).click();
        helper.getElement(loginEl2).sendKeys("gdc123@gmail.com");
        helper.getElement(loginEl3).sendKeys("ertyd");
        helper.getElement(loginEl4).click();
    }

    By EarEl1 = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[1]/span/a/div");
    By EarEl2 = By.xpath("//*[@id=\"a-autoid-11-announce\"]/div/div[1]/img");
    By EarEl3 = By.xpath("//*[@id=\"dropdown_selected_size_name\"]/span/span/span");
    By EarEl4 = By.xpath("//*[@id=\"native_dropdown_selected_size_name_2\"]");
    By EarEl5 = By.xpath("add-to-wishlist-button-submit");
    By EarEl6 = By.xpath("//*[@id=\'continue-shopping\']");

    public void EarringsSelection() {
        helper.getElement(EarEl1).click();
        helper.getElement(EarEl2).click();
        helper.getElement(EarEl3).click();
        helper.getElement(EarEl4).click();
        helper.getElement(EarEl5).click();
        helper.getElement(EarEl6).click();
    }

    By ShEl1 = By.xpath("av-hamburger-menu");
    By ShEl2 = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a[1]/div");
    By ShEl3 = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[6]/a");
    By ShEl4 = By.xpath("//*[@id=\"hmenu-content\"]/ul[13]/li[4]/a");

    public void ShopBy() {
        helper.getElement(ShEl1).click();
        helper.getElement(ShEl2).click();
        helper.getElement(ShEl3).click();
        helper.getElement(ShEl4).click();
    }

    By CurEl1 = By.xpath("//*[@id=\"icp-nav-flyout\"]/span");
    By CurEl2 = By.xpath("icp-currency-dropdown-selected-item-prompt");
    By CurEl3 = By.xpath("//*[@id=\"icp-currency-dropdown_44\"]");
    By CurEl4 = By.xpath("//*[@id=\"icp-save-button\"]");
    public void CurrencyChange() {
        helper.getElement(CurEl1).click();
        helper.getElement(CurEl2).click();
        helper.getElement(CurEl3).click();
        helper.getElement(CurEl4).click();
    }

    By FiEl1 = By.xpath("//*[@id=\"p_n_feature_eighteen_browse-bin/21451213011\"]/span/a");
    By FiEl2 = By.xpath("//*[@id=\"p_89/BOSS\"]/span/a/span");
    public void Filter() {
        helper.getElement(FiEl1).click();
        helper.getElement(FiEl2).click();

    }

    By PinEl1 = By.xpath("//*[@id=\"glow-ingress-line2\"]");
    By PinEl2 = By.xpath("//*[@id=\"GLUXCountryListDropdown\"]/span/span");
    By PinEl3 = By.xpath("//*[@id=\"GLUXCountryList_106\"]");

    public void PinCode() throws AWTException {
        helper.getElement(PinEl1).click();
        helper.getElement(PinEl2).click();
        helper.getElement(PinEl3).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    public void WishList() {
        Actions act = new Actions(driver);
        WebElement ele=   driver.findElement(By.xpath("//*[@id=\"accountList\"]/span/span"));
        act.moveToElement(ele).perform();
        WebElement el = driver.findElement(By.cssSelector("#nav-wl-items > div > a:nth-child(1) > span"));
        act.moveToElement(el).click().build().perform();
    }

    By AddChEl1 = By.xpath("//*[@id=\"I1OFRCRPDCUGQ7\"]/span/a");
    By AddChEl2 = By.xpath("//*[@id=\"pab-I1ZN29QCACNG41\"]/span/a");
    By AddChEl3 = By.xpath("//*[@id=\"pab-YUYUTDGhuji9K0IE\"]/span/a");

    public void AddToCart() {
        helper.getElement(AddChEl1).click();
        helper.getElement(AddChEl2).click();
        helper.getElement(AddChEl3).click();
    }

    By ManChEl1 = By.xpath("//*[@id=\"nav-cart\"]");
    public void ManageCart() {
        helper.getElement(ManChEl1).click();
    }

    By ChOutEl1 = By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");
    By ChOutEl2 = By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a");
    public void CheckOut(){
        helper.getElement(ChOutEl1).click();
        helper.getElement(ChOutEl2).click();
    }


}
