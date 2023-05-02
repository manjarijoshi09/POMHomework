package org.example;

import org.testng.annotations.Test;

public class TestSuit01 extends BaseTest {
    //call object of all the class
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CommunityPoll communityPoll = new CommunityPoll();
    CommunityPollResult communityPollResult = new CommunityPollResult();
    EmailToFriendResultPage emailToFriendResultPage = new EmailToFriendResultPage();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        //registerPage.enterRegisterDetails();
        registerPage.enterRegisterDetails();
        //result page
        registerResultPage.verifyUserRegisterSuccessfully();
    }

    @Test
    public void userShouldAbleToClickOnVote() {
        //click on good button
        communityPoll.userShouldAbleToClickOnVote();
        //click on vote button
        communityPollResult.VerifyUserShouldBeAbleToVote();
    }

    @Test
    public void verifyUserSendEmailFriendSuccessfully() {
        //click on email
        emailToFriendPage.verifyUserSendEmailFriendSuccessfully();
        //verify user should send email
        emailToFriendResultPage.verifyUserSendEmailFriendSuccessfully();
    }

}


