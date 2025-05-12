package tests;

import base.BaseTest;
//import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.CartPage;
import pages.PaymentPage;

public class PaymentFlowTest extends BaseTest {
    @Test
    public void testPaymentTillOtp() {
        HomePage home = new HomePage(driver);
        home.searchAndAddToCart("toys");
        
        
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        
        

        CartPage cart = new CartPage(driver);
        
        cart.addToCart();
        
        
        cart.proceedToCheckout();
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        
        
        

        PaymentPage payment = new PaymentPage(driver);
        payment.selectUPIMethod();
        
        try {
            Thread.sleep(2000); // Ideally use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        
        payment.enterUPI("7479490642");
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        
        
        payment.clickPayNow();
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        payment.clickContinueNow();
        
        
        
        
        
        payment.selectupi();
        
        try {
            Thread.sleep(2000); // Ideally use WebDriverWait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        payment.enterUPIid("piyush@123");
        
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        payment.clickfinal();
        
        
        
        

        //Assert.assertTrue(payment.isOtpScreenDisplayed(), "OTP screen not reached!");
    }
}
