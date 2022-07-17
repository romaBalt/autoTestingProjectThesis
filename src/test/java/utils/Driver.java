package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() { return driver.get();}

   public static void  setDriver(){

       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();

       driver.set(new ChromeDriver(options));
       driver.get().manage().window().setSize(new Dimension(1080, 2000 ));

   }
  public static void closeDriver(){
        driver.get().quit();
        driver.remove();
  }
}



