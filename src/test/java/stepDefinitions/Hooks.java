package stepDefinitions;

import cucumberSettings.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
  @After("@RegressionTest")
  public void after_regression_test() {

    driver.close();

  }

  @After("@SmokeTest")
  public void after_smoke_test() {

    driver.close();

  }

  @Before("@MobileTest")
  public void before_validation() {

    System.out.println("Mobile before hook");

  }

  @After("@MobileTest")
  public void after_validation() {

    System.out.println("Mobile after hook");

  }

  @Before("@WebTest")
  public void before_web_validation() {

    System.out.println("Web before hook");

  }

  @After("@WebTest")
  public void after_web_validation() {

    System.out.println("Web after hook");

  }
}
