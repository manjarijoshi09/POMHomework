package org.example;

import org.openqa.selenium.By;

public class EmailToFriendPage extends Utils {

    private By _emailafriend = By.className("email-a-friend");

    private By _friendEmailAddress = By.className("friend-email");

    private By _yourEmailAddress  = By.className("your-email");

    private By _sendEmail =By.name("send-email");

    public void verifyUserSendEmailFriendSuccessfully() {
        clickOnElement(By.xpath("//a[@ href=\"/apple-macbook-pro-13-inch\"]"));
        //click on email a friend
        clickOnElement(_emailafriend );
        //Enter friend email
        typeText(_friendEmailAddress, "mohit01@gmail.com");
        //Enter your email
        typeText(_yourEmailAddress, "testEmail+\" + timestamp() + \"@gmail.com");
        //click on send email button
        clickOnElement(_sendEmail);
    }


    public void enterSendFriendDetails(){

        //click on product
        clickOnElement(By.xpath("//div[contains(@class,'email-a-friend')]"));

        //click on email a friend

        clickOnElement(_emailafriend);

        //enter email address
        typeText(_friendEmailAddress,"kumarpatel@gmail.com");

        typeText(_yourEmailAddress,"Suresh@gmail.com");

        //click on send email button
        clickOnElement(_sendEmail);

    }
}
