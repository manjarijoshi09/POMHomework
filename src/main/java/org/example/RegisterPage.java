package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    private By _firstName = By.xpath("//input[contains(@id,'FirstName')]");
    private By _lastName = By.xpath("//input[contains(@id,'LastName')]");


    private By _dayOfBirth =By.xpath("//select[contains(@name,'DateOfBirthDay')]");
    private By _monthOfBirth = By.xpath("//select[contains(@name,'DateOfBirthMonth')]");

    private By _birthYear =By.xpath("//select[@name='DateOfBirthYear']");


    private By _Email = By.name("Email");
    private By _password = By.xpath("//input[contains(@type,'password')]");
    private By _confirmPassword = By.xpath("//input[contains(@id,'ConfirmPassword')]");
    private By _registerButton = By.id("register-button");


    public void enterRegisterDetails() {

        typeText(_firstName, "TestFirstname");
        //type last name
        typeText(_lastName, "TestLastname");

        selectElementByValue(_dayOfBirth, "21");

        selectElementByText(_monthOfBirth,"June");

        selectElementByValue(_birthYear, "2014");


        //type email address
        typeText (_Email,"testEmail+" + timestamp() + "@gmail.com");
        //type password
        typeText(_password, "test123456");
        //type confirm password
        typeText(_confirmPassword, "test123456");
        //click on register submit button
        clickOnElement(_registerButton);

    }




}