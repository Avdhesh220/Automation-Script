package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_successfull {

    WebDriver driver;
     Registration_successfull(WebDriver driver){
        this.driver = driver;
    }

    By login = By.partialLinkText("Click");

     public void Login(){
         driver.findElement(login).click();
     }


}
