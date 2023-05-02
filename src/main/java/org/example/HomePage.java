package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    //clickOnElement(By.className("ico-register"));

    private By _registerButton = By.className("ico-register");

    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);


    }

}
