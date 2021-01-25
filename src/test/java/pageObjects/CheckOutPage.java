package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {


    public WebDriver driver;

    //constructor
    public CheckOutPage (WebDriver driver) {
      this.driver = driver;

    }

  By listItem = By.cssSelector("h4.product-name");

  public WebElement getProductName(){

    return driver.findElement(listItem);


  }


}
