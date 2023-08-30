package np.edu.softwarica;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Career extends commonAPI{

    @Test
    public void ClickCareer(){
        WebElement ClickCar = driver.findElement(By.className("nav__links--link"));
        ClickCar.click();
        System.out.println("Click on Career Success");
    }
}
