package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailToFriendResultPage extends Utils {

    static String expectedEmailToFriendMessage = "Only registered customer can use email";
    static String expectedReferProductMessage = "Your message has been sent.";
    public void verifyUsersSendEmailFriendSuccessfully() {


        String actualMessage = getTextFromElement(By.xpath("//button[contains(@class,'button-1 send-email-a-friend-button')]"));
        System.out.println("My Message:" + actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage, expectedEmailToFriendMessage, "can't send email");
    }

    public void verifyUserSendEmailFriendSuccessfully() {

        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedReferProductMessage, "Successfully message send");

    }
}