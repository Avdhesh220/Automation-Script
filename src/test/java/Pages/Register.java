package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

    WebDriver driver;
    Select s;
    Register(WebDriver driver){
        this.driver = driver;
    }


    By reg_name = By.xpath("//form/div[1][@class = 'form-group']/input[@class = 'form-control']");
    By reg_mail = By.xpath("//form/div[2][@class = 'form-group']/input[@class = 'form-control']");
    By reg_addr1 = By.xpath("//form/div[3][@class = 'form-group']/input[@class = 'form-control']");
    By reg_addr2 = By.xpath("//form/div[4][@class = 'form-group']/input[@class = 'form-control']");
    By reg_cntry = By.xpath("//form/div[5][@class = 'row']/div[1]/select");
    By reg_state = By.xpath("//form/div[5][@class = 'row']/div[2]/select");
    By reg_zip  = By.xpath("//form/div[5][@class = 'row']/div[3]/input[@type = 'text']");

    By primary_name = By.xpath("//form/div[6][@class = 'form-group']/input[@class = 'form-control']");
    By primary_mail = By.xpath("//form/div[7][@class = 'form-group']/input[@class = 'form-control']");
    By primary_addr1 = By.xpath("//form/div[8][@class = 'form-group']/input[@class = 'form-control']");
    By primary_addr2  = By.xpath("//form/div[9][@class = 'form-group']/input[@class = 'form-control']");
    By primary_cntry = By.xpath("//form/div[10][@class = 'row']/div[1]/select");
    By primary_state = By.xpath("//form/div[10][@class = 'row']/div[2]/select") ;
    By primary_zip = By.xpath("//form/div[10][@class = 'row']/div[3]/input[@type = 'text']");

    By register = By.xpath("//button[@type = 'submit']");


   // Methods for registration form
    public void setReg_name(String reg_name1){
        driver.findElement(reg_name).sendKeys(reg_name1);
    }

    public void setReg_mail(String reg_mail1){
        driver.findElement(reg_mail).sendKeys(reg_mail1);
    }


    public void setreg_addr1(String reg_addrline1){
        driver.findElement(reg_addr1).sendKeys(reg_addrline1);
    }

    public void setreg_addr2(String reg_addrline2){
        driver.findElement(reg_addr2).sendKeys(reg_addrline2);
    }

    public void setreg_cntry(String reg_cntry1){

       s  = new Select(driver.findElement(reg_cntry));
       s.selectByVisibleText(reg_cntry1);
    }

    public void setreg_state(String reg_state1){

        s  = new Select( driver.findElement(reg_state));
        s.selectByVisibleText(reg_state1);
    }

    public void setreg_zip(String reg_zip1){
        driver.findElement(reg_zip).sendKeys(reg_zip1);
    }

    //Methods for Priamary residence form

    public void setprimary_name(String reg_name1){
        driver.findElement(primary_name).sendKeys(reg_name1);
    }

    public void setprimary_mail(String reg_mail1){
        driver.findElement(primary_mail).sendKeys(reg_mail1);
    }


    public void setprimary_addr1(String reg_addrline1){
        driver.findElement(primary_addr1).sendKeys(reg_addrline1);
    }

    public void setprimary_addr2(String reg_addrline2){
        driver.findElement(primary_addr2).sendKeys(reg_addrline2);
    }

    public void setprimary_cntry(String reg_cntry1){
        s  = new Select(driver.findElement(primary_cntry));
        s.selectByVisibleText(reg_cntry1);
    }

    public void setprimary_state(String reg_state1){
        s  = new Select( driver.findElement(primary_state));
        s.selectByVisibleText(reg_state1);
    }

    public void setprimary_zip(String reg_zip1){
        driver.findElement(primary_zip).sendKeys(reg_zip1);
    }
























}
