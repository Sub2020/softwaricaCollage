package np.edu.softwarica;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Apply extends commonAPI {

    @Test
    public void ClickApply() {
        WebElement ButtonApply = driver.findElement(By.cssSelector("a.d-none.d-md-flex.btn.btn--primary"));
        ButtonApply.click();
        System.out.println("Click on Apply Success");
        String title = driver.getTitle();
        Assert.assertEquals("Application Form", title);
        System.out.println("Title Application Form displayed");

        WebElement CourseDropDown = driver.findElement(By.id("course_id"));
        Select select = new Select(CourseDropDown);
        select.selectByVisibleText("Bsc. (Hons) Computing");

        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());

        WebElement beginApplicationButton = driver.findElement(By.className("btn-course"));
        beginApplicationButton.click();
        System.out.println("Click on Application succcess");

        WebElement enterFristname = driver.findElement(By.id("first_name"));
        enterFristname.sendKeys("Rita");
        System.out.println("Enter first name success");

        WebElement enterLastname = driver.findElement(By.id("last_name"));
        enterLastname.sendKeys("Gautam");
        System.out.println("Enter last name success");

        WebElement enterEmail = driver.findElement(By.id("email"));
        enterEmail.sendKeys(" durgahamal@gmail.com");
        System.out.println("Enter email success");

        WebElement enterPhoneNo = driver.findElement(By.id("phone_number"));
        enterPhoneNo.sendKeys("9861882780");
        System.out.println("Enter phone No. success");

        // Locate the date of birth input field
        WebElement dobInput = driver.findElement(By.id("dob"));
        dobInput.click(); // Click on the input to open the date picker

        // Wait for the date picker to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".flatpickr-calendar")));

        // Select the year (1995)
        WebElement yearInput = driver.findElement(By.cssSelector("input.numInput.cur-year[type='number'][aria-label*='Year']"));
        yearInput.clear(); // Clear any existing value
        yearInput.sendKeys("1996");

        // Select the month (June)
        WebElement monthDropdown = driver.findElement(By.cssSelector("select.flatpickr-monthDropdown-months"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText("June");

        // Select the day (2)
        WebElement dayElement = driver.findElement(By.cssSelector(".flatpickr-day:not(.disabled)"));
        dayElement.click();

        // Close the date picker by clicking on the input again
        dobInput.click();

        // Verify the selected date
        String selectedDate = dobInput.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

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

        WebElement clickNextpage = driver.findElement(By.cssSelector("button.btn.btn--primary.nextStep.personalInfo"));
        clickNextpage.click();
        System.out.println("Click on Next Step");


        WebElement inputFatherName = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='father_name' and @class='form-control required']")));
        inputFatherName.sendKeys("Raju Raja Gautam");
        System.out.println("Input Father's name success");


        WebElement inputFatherContactNo = driver.findElement(By.xpath("//input[@id='father_contact']"));
        inputFatherContactNo.sendKeys("9814437698");
        System.out.println("Input father's contact no. success");

        WebElement inputMotherName = driver.findElement(By.xpath("//input[@id='mother_name']"));
        inputMotherName.sendKeys("Gita Maya Gautam");
        System.out.println("Input Mother's name success");

        WebElement inputMotherContactNo = driver.findElement(By.xpath("//input[@id='mother_contact']"));
        inputMotherContactNo.sendKeys("9813108732");
        System.out.println("Input mother's contact no. success");

        WebElement inputGuardianName = driver.findElement(By.xpath("//input[@id='guardian_name' and @class='form-control']"));
        inputGuardianName.sendKeys("Dil Kumar Gautam");
        System.out.println("Input Guardian's name success");

        WebElement clickDropDown = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("relation_type")));
        clickDropDown.click();

        WebElement selectFromDropDown = driver.findElement(By.xpath("//option[@value='husband']"));
        selectFromDropDown.click();


        WebElement inputGuarConNo = driver.findElement(By.xpath("//input[@id='guardian_number']"));
        inputGuarConNo.sendKeys("9874121789");
        System.out.println("Input Guardian no. success");

        WebElement nextStepButton = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn--primary.nextStep[data-step-target='#step3']")));
        nextStepButton.click();



    }
}
