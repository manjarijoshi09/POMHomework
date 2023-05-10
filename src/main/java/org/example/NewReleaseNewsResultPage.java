package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseNewsResultPage extends Utils {
    static String expectedGuestMsg = "News comment is successfully added.";
    static String getExpectedGuestMessage = "Guest window";

    public void verifyUserShouldBeAbleToSeeLatestComment() {

        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedGuestMsg, "News comment is successfully added.");//"Guest Window");

        String actualMessage1 = getTextFromElement(By.className("comment-list"));
        System.out.println("My message:" + actualMessage1);
        Assert.assertEquals(actualMessage1, getExpectedGuestMessage, "Guest window");
    }
}

