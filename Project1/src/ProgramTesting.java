

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ProgramTesting {


    public static void main(String[] args) {
        
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Multimedia\\Downloads\\geckodriver-v0.29.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

       
        driver.get(baseUrl);

         actualTitle = driver.getTitle();

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
       
        driver.close();
       
    }

}


