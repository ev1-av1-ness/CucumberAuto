package stepDefinitions;

import cucumberSettings.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.CheckOutPage;

import java.awt.*;
import java.util.List;

public class Steps {

  @Given("^Validate the browser$")
  public void validate_the_browser() throws Throwable {
    System.out.println("validate the browser");
  }

  @When("^Browser is triggered$")
  public void browser_is_triggered() throws Throwable {
    System.out.println("browser is triggered");
  }

  @Then("^Check if browser is started$")
  public void check_if_browser_is_started() throws Throwable {
    System.out.println("check if browser is started");
  }

  /*@Given("^User is on NetBanking landing page$")
  public void user_is_on_NetBanking_landing_page(){

    //code to user navigate to landing page
    //will be executed

  }

  @Given("^User is on NetBanking landing page$")
  public void user_is_on_landing_page(){

    //another code to user navigate to landing page

  }

  @When("^User login into application with username and password$")
  public void login_into(){

    //enter user name and password and click submit button

  } */

  @Given("^User is on NetBanking landing page$")
  public void user_is_on_netbanking_landing_page() throws Throwable {
    //code
    System.out.println("NetBanking landing page");

  }

  /*@When("^User login into application with username and password$")
  public void user_login_into_application_with_username_and_password() throws Throwable {
    //code
    System.out.println("login into");
  }*/

  @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    //for diff data
    System.out.println(strArg1);
    System.out.println(strArg2);

    //driver.findElement(By.xpath()).sendKeys(strArg1);
    //driver.findElement(By.xpath()).sendKeys(strArg2);
  }

  @Then("^Home page is populated$")
  public void home_page_is_populated() throws Throwable {
    //code
    System.out.println("Home page");
  }

  @And("^Cards displayed are \"([^\"]*)\"$")
  public void cards_displayed_are_something(String strArg1) throws Throwable {
    System.out.println(strArg1);
  }

  /*@And("^Cards are displayed$")
  public void cards_are_displayed() throws Throwable {
    //code
    System.out.println("Cards are displayed");
  }*/

    @When("^User sign up with following details$")
  public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    //code
    //extract data from table --> List
      List <String> obj = data.transpose().asList(String.class);
      System.out.println(obj.get(0));
      System.out.println(obj.get(1));
      System.out.println(obj.get(2));
      System.out.println(obj.get(3));
      System.out.println(obj.get(4));
  }

  /*You're trying to turn a data table into a list of strings. Because lists are vertical and because String can take up exactly one cell Cucumber expects that you have a table that has exactly one column.

| admin    |
| pass1234 |
But you can also transpose the data table:

List<String> list = dt.transpose().asList(String.class)
Or simply access the cells directly:

String username = dt.cell(0,0);
String password = dt.cell(0,1);*/

  @When("^User login into with (.+) and (.+)$")
  public void user_login_into_with_and(String username, String password) throws Throwable {
    System.out.println(username);
    System.out.println(password);
  }

}
