package runner;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class StepDef implements En {

        private WebDriver driver = null;

        public StepDef() {

                Before(()->{
                    String basedir = System.getProperty("user.dir");
                    System.setProperty("webdriver.chrome.driver",basedir+"/src/test/java/driverservers/chromedriver");
                    System.setProperty("webdriver.ie.driver",basedir+"/src/test/java/driverservers/IEDriverServer.exe");

                });

                After(()->{

                    driver.close();

                });

                Given("Login", ()-> {

                    driver = new ChromeDriver();
                    driver.get("https://www.google.com");


                });

        }

}
