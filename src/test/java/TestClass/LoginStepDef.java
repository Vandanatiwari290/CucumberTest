package TestClass;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepDef {
WebDriver driver;

   @Given("^User is already on login page$")
    public void user_is_already_on_login_page() throws Throwable {

        System.setProperty("webdriver.chrome.driver","/home/vandanatiwari/Downloads/seleniumJars/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        throw new PendingException();
    }

    @When("^title of the page is facebook$")
    public void title_of_the_page_is_facebook() throws Throwable {
        String title=driver.getTitle();
        Assert.assertEquals("Facebook",title);
        throw new PendingException();
    }

    @Then("^user enter username and enter password$")
    public void user_enter_username_and_enter_password() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("vandut12055@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123");
        throw new PendingException();
    }

    @Then("^user user clicks on login button$")
    public void user_user_clicks_on_login_button() throws Throwable {
        driver.findElement(By.id("loginbutton")).click();
        throw new PendingException();
    }


}
