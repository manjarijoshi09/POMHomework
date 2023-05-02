package org.example;

import org.openqa.selenium.By;

public class emailToFriendPage extends Utils {

    private By _emailafriend = By.className("email-a-friend");

    private By _friendEmailAddress = By.className("friend-email");

    private By _yourEmailAddress  = By.className("your-email");

    private By _sendEmail =By.name("send-email");

    public static void verifyUserSendEmailFriendSuccessfully() {
    }


    public void enterSendFriendDetails(){

        //clickonproduct
        clickOnElement(By.xpath("//div[contains(@class,'email-a-friend')]"));

        //clickon email a friend

        clickOnElement(_emailafriend);

        //enter email address
        typeText(_friendEmailAddress,"kumarpatel@gmail.com");

        typeText(_yourEmailAddress,"Suresh@gmail.com");



    }
}
