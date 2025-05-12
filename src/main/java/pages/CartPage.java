package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;

public class CartPage {
    WebDriver driver;
    //private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBtn = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
    By checkoutBtn = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span");
    
    //By addToCartBtn = By.xpath("//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'add to cart')]");
    //By checkoutBtn = By.xpath("//*[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'place order')]");



    public void addToCart() {
        driver.findElement(addToCartBtn).click();
        
        try {
            Thread.sleep(2000); // Ideally use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    

    public void proceedToCheckout() {
        driver.findElement(checkoutBtn).click();
        
        
        try {
            Thread.sleep(2000); // Ideally use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
    }
    
    
   /* public void addToCart() {
        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        // Scroll into view in case it's off-screen
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
        addBtn.click();
    }

    /**
     * Clicks the "Place Order" button on the cart page to proceed to checkout.
     */
    /*public void proceedToCheckout() {
        
		WebElement checkoutBtn = wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutBtn);
        checkoutBtn.click();
    }*/
}



/*package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    By addToCartBtn = By.cssSelector("button._QqFHMw vslbG+ In9uk2");
    By checkoutBtn = By.cssSelector("button._QqFHMw vslbG+ _3Yl67G _7Pd1Fp");
    
    //By addToCartBtn = By.xpath("//button[contains(text(),'Add to cart')]");
    //By checkoutBtn = By.xpath("//button[contains(text(),'Place Order')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addToCart() {
        try {
            WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
            addBtn.click();
        } catch (Exception e) {
            System.out.println("Add to Cart button not found or not clickable.");
        }
    }

    public void proceedToCheckout() {
        try {
            WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkout);
            checkout.click();
        } catch (Exception e) {
            System.out.println("Checkout button not found or not clickable.");
        }
    }
}*/

