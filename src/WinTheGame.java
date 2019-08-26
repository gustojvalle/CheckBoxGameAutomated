
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Element;

import java.util.logging.Logger;


public class WinTheGame {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "D:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
        int checker=0;
        int d = 4;
        while(d<113) {

            driver.findElement(By.cssSelector(String.format("body > center:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > form:nth-child(3) > center:nth-child(1) > input:nth-child(%d)",d))).click();
            if (checker==9){
                d=d+2;
                checker=0;

            }else {
                d++;
                checker++;
            }
        }

    }
}