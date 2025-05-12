package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    By phoneno = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input");
    By upiField = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input");
    By payNowButton = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button");

    public void selectUPIMethod() {
        driver.findElement(phoneno).click();
    }

    public void enterUPI(String upi) {
        driver.findElement(upiField).sendKeys(upi);
    }

    public void clickPayNow() {
        driver.findElement(payNowButton).click();
    }

    //public boolean isOtpScreenDisplayed() {
    //    return driver.getPageSource().contains("OTP") || driver.getCurrentUrl().contains("otp");
    //}
    
    By continuebtn = By.xpath("By payNowButton = By.xpath(\"//*[@id=\\\"container\\\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button\");");
    By upi = By.xpath("By phoneno = By.xpath(\"//*[@id=\\\"container\\\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input\");");
    By upiblank = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[1]/div[2]/div/div/div[3]/label/div[2]/div/div[2]/div/div[1]/input");
    
    By finalbtn = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[1]/div[2]/div/div/div[3]/label/div[2]/div/div[2]/button");
    
    public void clickContinueNow() {
        driver.findElement(payNowButton).click();
        
     
    }
    
    public void selectupi() {
        driver.findElement(upi).click();
    }

    public void enterUPIid(String upi) {
        driver.findElement(upiblank).sendKeys(upi);
    }
    
    public void clickfinal() {
        driver.findElement(finalbtn).click();
        
     
    }
    
    
    
}
