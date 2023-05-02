package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;

public class CommunityPoll extends Utils{

 private By _pollanswers2 = By.id("pollanswers-2");

 private By _votepoll1 = By.id("vote-poll-1");

 public void userShouldAbleToClickOnVote() {

        //click on good button
        clickOnElement(_pollanswers2);
        //Click on vote button
        clickOnElement(_votepoll1);
        //Use the selenium wait
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //get the text message for web element
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"poll-vote-error\"]")));
    }
}