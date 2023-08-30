package np.edu.softwarica;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class clickOnAboutUs extends commonAPI {

    @Test
    public void aboutUs(){
        // Find element using class and text
        WebElement aboutUsButton = driver.findElement(By.cssSelector("button.nav__links--link.sub-link"));
        aboutUsButton.click();
        System.out.println("click on About Us");

    }
}
