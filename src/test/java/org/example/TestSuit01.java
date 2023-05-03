package org.example;

import org.testng.annotations.Test;

public class TestSuit01 extends BaseTest {
    //call object of all the class
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CommunityPoll communityPoll = new CommunityPoll();
    CommunityPollResult communityPollResult = new CommunityPollResult();

    EmailToFriendPage emailToFriendPage=new EmailToFriendPage();
    EmailToFriendResultPage emailToFriendResultPage = new EmailToFriendResultPage();
    CompareProduct compareProduct = new CompareProduct();
    CompareResultPage compareResultPage =new CompareResultPage();

    LoginPage loginPage =new LoginPage();


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
    public void verifyUserShouldSendEmailFriendSuccessfully() {
        //click on email
        emailToFriendPage.verifyUserSendEmailFriendSuccessfully();
        //verify user should send email
        emailToFriendResultPage.verifyUsersSendEmailFriendSuccessfully();
    }
     @Test
    public void VerifyUserShouldCompareProduct(){
        compareProduct.VerifyToDetailsOfCompareProduct();
        //verify the product
         compareResultPage.VerifyToCompareProductsSuccessfully();
     }

     @Test
     public void VerifyUserShouldReferProductToFriend(){
         homePage.clickOnRegisterButton();
         //enter registration details
         //registerPage.enterRegisterDetails();
         registerPage.enterRegisterUpdatedDetails();
         //result page
         registerResultPage.verifyUserRegisterSuccessfully();

         loginPage.enterLoginDetails();

         emailToFriendPage.verifyUserSendEmailFriendSuccessfully();
         //verify user should send email
         emailToFriendResultPage.verifyUserSendEmailFriendSuccessfully();
     }
     @Test
    public void verifyUserShouldAbleToVote(){
         homePage.clickOnRegisterButton();
         //enter registration details
         //registerPage.enterRegisterDetails();
         registerPage.enterRegisterUpdatedDetails();
         //result page
         registerResultPage.verifyUserRegisterSuccessfully();
         //enter details
         loginPage.enterLoginDetails();
         communityPoll.userShouldAbleToClickOnVote();
         communityPollResult.verifyUserVotesSuccessfully();

     }
}



