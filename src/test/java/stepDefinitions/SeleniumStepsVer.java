package stepDefinitions;

import cucumberSettings.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;


public class SeleniumStepsVer extends Base{
  public WebDriver driver;
  HomePage homePageFirst;
  CheckOutPage checkOutPage;

  @Given("^User is on Greencart landing page$")
  public void user_is_on_greencart_landing_page() throws Throwable {
    driver = Base.getDriver();


  }

  @When("^User searches for (.+) Vegetables$")
  public void user_searches_for_vegetables(String name) throws Throwable {

    //  //tagname[@attribute='value']
    //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name);

    homePageFirst = new HomePage(driver);
    homePageFirst.getSearch().sendKeys(name);
    Thread.sleep(3000);

  }



  /*@Then("^\"([^\"]*)\" results are displayed$")
  public void something_results_are_displayed(String strArg1) throws Throwable {

    Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));

  }*/

  @Then("^verify selected (.+) is displayed in Checkout page$")
  public void verify_selected_is_displayed_in_checkout_page(String name) throws Throwable {

    checkOutPage = new CheckOutPage(driver);
    Assert.assertTrue(checkOutPage.getProductName().getText().contains(name));
  }


  @And("^User adds item to cart$")
  public void user_adds_item_to_cart() throws Throwable {

    driver.findElement(By.cssSelector("a.increment")).click();
    driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
  }

  @And("^User proceeded to Checkout page for purchase$")
  public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {

    driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
    driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
  }

}
