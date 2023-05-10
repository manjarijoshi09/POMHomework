package org.example;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSuit01 extends BaseTest {
    //call object of all the class
    //HomePage homePage = new HomePage();

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CommunityPoll communityPoll = new CommunityPoll();
    CommunityPollResult communityPollResult = new CommunityPollResult();

    EmailToFriendPage emailToFriendPage=new EmailToFriendPage();
    EmailToFriendResultPage emailToFriendResultPage = new EmailToFriendResultPage();
    CompareProduct compareProduct = new CompareProduct();
    CompareResultPage compareResultPage =new CompareResultPage();

    NewReleaseNews newReleaseNews =new NewReleaseNews();
    NewReleaseNewsResultPage newReleaseNewsResultPage =new NewReleaseNewsResultPage();
    BuildYourOwnComputerDetailsPage buildYourOwnComputerDetailsPage =new BuildYourOwnComputerDetailsPage();
    BuildYourOwnComputerResultPage buildYourOwnComputerResultPage =new BuildYourOwnComputerResultPage();
    CheckOutAsGuest checkOutAsGuest =new CheckOutAsGuest();
    OrderConformationPage orderConformationPage = new OrderConformationPage();
    FacebookLogin facebookLogin = new FacebookLogin();


    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
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
         //result page
         registerResultPage.verifyUserRegisterSuccessfully();

//         loginPage.enterLoginDetails();

         emailToFriendPage.verifyUserSendEmailFriendSuccessfully();
         //verify user should send email
         emailToFriendResultPage.verifyUserSendEmailFriendSuccessfully();
     }
     @Test
    public void verifyUserShouldAbleToVote(){
         homePage.clickOnRegisterButton();
         //enter registration details
         registerPage.enterRegisterDetails();
         //result page
         registerResultPage.verifyUserRegisterSuccessfully();
         //enter details
//         loginPage.enterLoginDetails();
         communityPoll.userShouldAbleToClickOnVote();
         communityPollResult.verifyUserVotesSuccessfully();

     }

    // @Test
    //public void printProductList(){
        //homePage.

     //}

     @Test
    public void verifySearchAlertText(){
        homePage.clickOnSearchButton();
     }

     @Test
    public void clickOnVoteButton(){
        homePage.clickOnVoteButton();
     }

     @Test
    public void selectCurrency(){
        homePage.selectCurrency();
     }

     @Test
    public void searchProductBrand(){
        homePage.searchProductBrand();
        homePage.clickOnSearchButton();

     }

     @Test
    public void verifyUserShouldBeAbleToSelectOnNewRelease(){

       homePage.selectNewRelease();
       newReleaseNews.verifyUserShouldBeAbleToClickOnNewRelease();

     }
    @Test
    public void verifyUserShouldBeAbleToSeeLatestComment(){
        homePage.selectNewRelease();
        newReleaseNews.verifyUserShouldBeAbleToClickOnNewRelease();
        newReleaseNewsResultPage.verifyUserShouldBeAbleToSeeLatestComment();
    }

    @Test
    public void VerifyUserShouldBeAbleToBuildYourOwnComputer(){
        homePage.verifyUserShouldBeBuildYourOwnComputer();
        buildYourOwnComputerDetailsPage.verifyUserShouldEnterAllDetailsOfBuildYourOwnComputer();
        buildYourOwnComputerResultPage.productInShoppingCart();
        buildYourOwnComputerResultPage.checkOut();
        checkOutAsGuest.CheckOutAsGuestSuccessfully();
        checkOutAsGuest.BillingAddress();
        checkOutAsGuest.PaymentInformation();
        orderConformationPage.verityUserShouldSeeOrderConformation();


    }

    @Test
    public void VerifyUserShouldBeAbleToOpenFacebookWindow(){
        homePage.verifyUserShouldGoFacebookWindow();
        facebookLogin.verifyUserShouldFacebookWindowOpen();
        homePage.welcomeToOurStore();

    }


}





