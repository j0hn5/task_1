package Factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public WebDriver makeDriver(String browser)
    {
        if(browser.toLowerCase().equals("chrome")){
            return new ChromeDriver();
        }else{
            System.out.println("Invalid Browser");
            return null;
        }
    }

}
