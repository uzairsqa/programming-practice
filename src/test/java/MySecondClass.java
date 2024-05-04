import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MySecondClass
{
    // driver
    static ChromeDriver driver;
    static String url;

    //re data get
    String re;

// To open Chrome Browser first
    @Test(priority = 1)
    public void createObjectOnly() throws InterruptedException {
        driver = new ChromeDriver();

    }

    // To navigate SauceDemo website

    @Test(priority = 2)
    public void navigateToSauceDemo() {
        // bad approach
        //driver.get("https://www.google.com/");

        // good approach while learning java
        url = "https://www.saucedemo.com/v1/";
        driver.get(url);
    }

     // Validate that current URL and the url given in variable is same

    @Test(priority = 3)
    public void validateState() {
        System.out.println(driver.getCurrentUrl());
        // bad approach
        //Assert.assertEquals("https://www.google.com/", driver.getCurrentUrl());

        Assert.assertEquals(url, driver.getCurrentUrl());
    }

}
