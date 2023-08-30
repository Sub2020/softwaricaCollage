package np.edu.softwarica;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Home extends commonAPI{

    @Test
    public void testLogin(){
        String title = driver.getTitle();
        Assert.assertEquals("Softwarica College of IT & E-Commerce", title);
    }

}