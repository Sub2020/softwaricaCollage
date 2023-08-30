package np.edu.softwarica;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StuCenter extends commonAPI{

    @Test
    public void ClickOnStuCenter(){
        WebElement ClickButton = driver.findElement(By.className("nav__links--link"));
        ClickButton.click();
        System.out.println("Click on Student Center Success");
    }
}
