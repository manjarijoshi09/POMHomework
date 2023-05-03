package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommunityPollResult extends Utils {

    static String expectedCommunityPollVoteMessage = "Only registered users can vote.";
    static String expectedAbleToVoteMessage = "registered user can vote";
    public void VerifyUserShouldBeAbleToVote() {


        String actualMessage = getTextFromElement(By.xpath("//div[contains(@id,'block-poll-vote-error-1']"));
        System.out.println("My message:" + actualMessage);
        //text message is disappearing
        Assert.assertEquals(actualMessage, expectedCommunityPollVoteMessage, "Error message is disappearing.");


    }

    public void VerifyUserShouldAbleToVote() {


        String actualMessage = getTextFromElement(By.xpath("//div[contains(@id,'block-poll-vote-error-1']"));
        System.out.println("My message:" + actualMessage);
        //text message is disappearing
        Assert.assertEquals(actualMessage, expectedCommunityPollVoteMessage, "Error message is disappearing.");
    }

    public void verifyUserVotesSuccessfully() {
        String actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedAbleToVoteMessage, "Total Votes are wrong");
    }
}