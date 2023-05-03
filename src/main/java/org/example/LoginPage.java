package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    private By _acontainsclassicologin =By.xpath("//a[contains(@class,'ico-login')]");
    private By _inputcontainsclassemail =By.xpath("//input[contains(@class,'email')]");
    private By _inputcontainsclasspassword =By.xpath("//input[contains(@class,'password')]");
    private By _buttonstartswithclassbutton1loginbutton =By.xpath("//button[starts-with(@class,'button-1 login-button')]");


    public void enterLoginDetails() {
        //click on login button
        //clickOnElement( _acontainsclassicologin);
        clickOnElement(_acontainsclassicologin);
        //Type  email address
        typeText(( _inputcontainsclassemail),"mohit01@gmail.com");
        //Type password
        typeText((_inputcontainsclasspassword),"1234567");
        //click on LOG IN button
        clickOnElement(_buttonstartswithclassbutton1loginbutton);
    }
}
