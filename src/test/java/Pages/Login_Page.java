package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Login_Page {

    WebDriver driver;

    Login_Page(WebDriver driver){
        this.driver = driver;
    }

    By username = By.xpath("//input[@class = \"un \"]");
    By pwd = By.xpath("//input[@class = \"pass\"]");
    By signin = By.xpath("//button[@class = \"submit\"]");
    By register = By.linkText("Register");


  public void setUsername(String username1){
      driver.findElement(username).sendKeys(username1);
  }

  public void setPwd(String pwd1){
      driver.findElement(pwd).sendKeys(pwd1);
  }

 public void Signin(){

      driver.findElement(signin).submit();
 }

 public void setRegister(){

      driver.findElement(register).click();
 }





}
