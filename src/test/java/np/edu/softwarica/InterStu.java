package np.edu.softwarica;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InterStu extends commonAPI{

    @Test
    public void InterStuClick() {
        WebElement aboutInterStu = driver.findElement(By.className("nav__links--link"));
        aboutInterStu.click();
        System.out.println("Click on International Button Success");
    }
}

