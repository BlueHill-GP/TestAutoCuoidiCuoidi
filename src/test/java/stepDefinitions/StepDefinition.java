package stepDefinitions;

import cucumber.api.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");
    @Given("^User navigates to Login page$")
    public void user_navigates_to_login_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\HanhTester\\Setup\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://13.54.229.100/");
        Thread.sleep(2000);
    }

    @When("^User enters valid email address (.+)$")
    public void user_enters_valid_email_address(String email) throws Throwable {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @And("^Enters valid password (.+)$")
    public void enters_valid_password(String password) throws Throwable {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("^Clicks on Login button$")
    public void clicks_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
        Thread.sleep(2000);
    }

    @And("^User enters invalid email address (.+)$")
    public void user_enters_invalid_email_address(String email) throws Throwable {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @And("^Enters invalid password (.+)$")
    public void enters_invalid_password(String password) throws Throwable {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Thread.sleep(2000);
    }

    @Then("^The message is displayed$")
    public void theMessageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Successfully execution");
    }




//    Register
    @Given("^User navigates to Register Account page$")
    public void user_navigates_to_register_account_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\HanhTester\\Setup\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://13.54.229.100/register");
        Thread.sleep(2000);
    }

    @When("^User enters valid name (.+)$")
    public void user_enters_valid_name(String name) throws Throwable {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
        Thread.sleep(2000);
    }

    @And("^User do not enter details into any fields$")
    public void user_do_not_enter_details_into_any_fields() throws Throwable {
        Thread.sleep(2000);
    }

    @And("^Enters valid email (.+)$")
    public void enters_valid_email(String email) throws Throwable {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        Thread.sleep(2000);
    }

    @And("^Enters valid phone_number (.+)$")
    public void enters_valid_phone_number(String phonenumber) throws Throwable {
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phonenumber);
        Thread.sleep(2000);
    }

    @And("^Enters valid the password (.+)$")
    public void enters_valid_the_password(String password) throws Throwable {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("^Choose the type of user$")
    public void choose_the_type_of_user() throws Throwable {
        try {
            Thread.sleep(2000);
            Select dropdown = new Select (driver.findElement(By.id("userType")));
            dropdown.selectByValue("photographer");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @And("^Clicks on SignUp button$")
    public void clicks_on_signup_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Đăng ký')]")).click();
        Thread.sleep(2000);
    }

//    End Register
//    Post

    @When("^Clicks on Profile page$")
    public void clicks_on_profile_page() throws Throwable {
        driver.findElement(By.xpath("//header/ul[1]/li[2]/a[1]")).click();
        Thread.sleep(2000);
    }
    @And("^User enter the valid content into content box$")
    public void user_enter_the_valid_content_into_content_box() throws Throwable {
        driver.findElement(By.xpath("//textarea[@id='description-input']")).sendKeys("Chụp ảnh ngoài cảnh");
        Thread.sleep(2000);
    }

    @And("^User click to choose the image$")
    public void user_click_to_choose_the_image() throws Throwable {
        driver.findElement(By.id("chooseImg")).sendKeys("D:\\Mỹ Hanh\\Images\\ngoaiCanh\\4.jpg");
        Thread.sleep(2000);
    }

    @And("^Click on the Post button$")
    public void click_on_the_Post_button() throws Throwable {
        driver.findElement(By.xpath("//button[contains(text(),'Xong')]")).click();
        Thread.sleep(2*5000);
    }
//    End Post
}
