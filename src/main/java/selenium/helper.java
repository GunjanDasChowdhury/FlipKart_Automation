package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class helper {

    public static WebDriver driver;

    public static void startDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32105\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public static WebElement getElement(By myBy){
        WebElement element = null;
        double start = 0;
        double waitMax = 7000;
        int waitTime = 500;
        while (start < waitMax)
        {
            element = driver.findElement(myBy);
            if(element.isDisplayed() || element.isEnabled())
                return  element;
            else
            {
                sleep(waitTime);
                start = start + waitTime;
            }
        }
        return element;
    }

    public static void sleep(int wait){
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
