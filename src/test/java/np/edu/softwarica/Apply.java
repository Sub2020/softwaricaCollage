package np.edu.softwarica;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Apply extends commonAPI{

    @Test
    public void ClickApply() {
        WebElement ButtonApply = driver.findElement(By.cssSelector("a.d-none.d-md-flex.btn.btn--primary"));
        ButtonApply.click();
        System.out.println("Click on Apply Success");
        String title = driver.getTitle();
        Assert.assertEquals("Application Form", title);
        System.out.println("Title Application Form displayed");

        //WebDriverWait wait = new WebDriverWait(driver, "10");

        WebElement CourseDropDown = driver.findElement(By.id("course_id"));
        Select select = new Select(CourseDropDown);
        select.selectByVisibleText("Bsc. (Hons) Computing");

        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());

        WebElement beginApplicationButton = driver.findElement(By.className("btn-course"));
        beginApplicationButton.click();
        System.out.println("Click on Application succcess");

        WebElement enterFristname = driver.findElement(By.id("first_name"));
        enterFristname.sendKeys("Sita");
        System.out.println("Enter first name success");

        WebElement enterLastname = driver.findElement(By.id("last_name"));
        enterLastname.sendKeys("Gautam");
        System.out.println("Enter last name success");

        WebElement enterEmail = driver.findElement(By.id("email"));
        enterEmail.sendKeys(" piyushrl26@gmail.com");
        System.out.println("Enter email success");

        WebElement enterPhoneNo = driver.findElement(By.id("phone_number"));
        enterPhoneNo.sendKeys("5183363");
        System.out.println("Enter phone No. success");

        WebElement dobInput = driver.findElement(By.id("dob"));
        dobInput.click();

        WebElement calendar = driver.findElement(By.className("flatpickr-calendar"));

        WebElement dayDropdown = calendar.findElement(By.className("flatpickr-day"));
        dayDropdown.click();
        WebElement day = calendar.findElement(By.xpath("//span[text()='15']"));
        day.click();

        WebElement monthDropdown = calendar.findElement(By.className("flatpickr-month"));
        monthDropdown.click();
        WebElement month = calendar.findElement(By.xpath("//span[text()='May']"));
        month.click();

        WebElement yearDropdown = calendar.findElement(By.className("flatpickr-year"));
        yearDropdown.click();
        WebElement year = calendar.findElement(By.xpath("//span[text()='1995']"));
        year.click();

        WebElement applyButton = calendar.findElement(By.className("flatpickr-confirm"));
        applyButton.click();

        String selectedDate = dobInput.getAttribute("value");
        Assert.assertEquals("1995-05-15", selectedDate);


        WebElement fileInput = driver.findElement(By.id("profile_image"));
        String imagePath = "C:\\Users\\Devraj\\Downloads\\gautam.jfif";
        fileInput.sendKeys(imagePath);
        System.out.println("Image upload success");

        WebElement SelectBloodGrp = driver.findElement(By.id("blood_group"));
        Select select1 = new Select(SelectBloodGrp);
        select1.selectByVisibleText("A Positive");

        WebElement SelectBloodGroup = select1.getFirstSelectedOption();
        System.out.println("Selected option: " + SelectBloodGroup.getText());

        WebElement emergencyPhoneNo = driver.findElement(By.id("emergency_contact"));
        emergencyPhoneNo.sendKeys("9841276975");
        System.out.println("Enter Emergency no. success");



    }
}

