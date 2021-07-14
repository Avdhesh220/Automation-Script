package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class index {

    WebDriver driver;
    index(WebDriver driver){
        this.driver = driver;
    }

   By logout = By.partialLinkText("Logout");

     public void logout(){
         driver.findElement(logout);
     }






}
