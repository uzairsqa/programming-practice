import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ObjectE {

    // driver
    static ChromeDriver driver;
    static String url;

    //re data get
    String re;


    @Test(priority = 1)
    public void createObjectOnly() throws InterruptedException {
        driver = new ChromeDriver();

    }

    @Test(priority = 2)
    public void navigateToSauceDemo() {
        // bad approach
        //driver.get("https://www.google.com/");

        // good approach while learning java
        url = "https://www.google.com/";
        driver.get(url);
    }


    @Test(priority = 3)
    public void validateState() {
        System.out.println(driver.getCurrentUrl());
        // bad approach
        //Assert.assertEquals("https://www.google.com/", driver.getCurrentUrl());

        Assert.assertEquals(url, driver.getCurrentUrl());
    }


}
