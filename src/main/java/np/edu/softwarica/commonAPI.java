package np.edu.softwarica;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class commonAPI {
    public WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\ProjectTesting\\.idea\\WebDriver\\MsEdge\\msedgedriver.exe");

        driver = new EdgeDriver();
        driver.get("https://softwarica.edu.np/");
        driver.manage().window().maximize();
    }



    //@After
    //public void tearDown() {
      //  if (driver != null) {
            //driver.quit();
        //}
    //}

    public WebDriver getDriver() {
        return driver;
    }
}
