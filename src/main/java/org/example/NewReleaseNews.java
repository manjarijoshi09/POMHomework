package org.example;

import org.openqa.selenium.By;

public class NewReleaseNews extends Utils{

    private By _title =By.cssSelector("input.enter-comment-title");

    private By _comment = By.cssSelector("textarea#AddNewComment_CommentText");

    private By _submitNewComment =By.xpath("//button[@name='add-comment']");

    private By _displayAllNewComment =By.className("comment-list");

 public void verifyUserShouldBeAbleToClickOnNewRelease(){
     typeText(_title,"good news");
     typeText(_comment, "happy customer");
     clickOnElement(_submitNewComment);
     //clickOnElement(_displayAllNewComment,"");


 }
}
