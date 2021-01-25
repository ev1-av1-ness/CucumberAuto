package cucumberSettings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
  //public method for public driver if you want to close it for all tests

  public static WebDriver driver;
  public static Properties prop;

  public static WebDriver getDriver() throws IOException {

    prop = new Properties();
    FileInputStream fis = new FileInputStream("C:\\Users\\Admin-PC\\Documents\\GitHub\\CucumberAuto\\src\\test\\java\\cucumberSettings\\global.properties");

    prop.load(fis);

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    //driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    return driver;
}




}
