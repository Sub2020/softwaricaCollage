package np.edu.softwarica;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.events.Event;

public class ClickOnCourse extends commonAPI{

    @Test
    public void courses(){
        WebElement SuccessCourse = driver.findElement(By.cssSelector("button.nav__links--link.sub-link"));
        SuccessCourse.click();
        System.out.println("click on Course Success");
    }
}
