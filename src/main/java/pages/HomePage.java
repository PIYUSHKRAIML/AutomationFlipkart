package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("q");
    
    By searchButton = By.cssSelector("button[type='submit']");
    
    //By firstProduct = By.cssSelector("a._1fQZEK"); // or use any available locator
    
    //By firstProduct = By.xpath("(//a[contains(@href, '/p/')])[1]");
    
    By firstProduct = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div");


    public void searchAndAddToCart(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();

        // Wait and click first product (simplified, should use WebDriverWait)
        try {
            Thread.sleep(2000); // Ideally use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(firstProduct).click();
        
        try {
            Thread.sleep(2000); // Ideally use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        
        
}
}
