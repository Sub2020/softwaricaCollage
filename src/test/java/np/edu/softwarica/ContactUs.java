package np.edu.softwarica;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactUs extends commonAPI{

    @Test
    public void ClickContactUs(){
        WebElement ClickConButton = driver.findElement(By.className("nav__links--link"));
        ClickConButton.click();
        System.out.println("Click on Contact Us Success");
    }
}
