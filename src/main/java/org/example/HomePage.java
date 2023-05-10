package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils{

    //clickOnElement(By.className("ico-register"));

    private By _searchButton = By.cssSelector("button.search-box-button");

    private By _voteButton = By.cssSelector("button#vote-poll-1");

    private By _registerButton = By.className("ico-register");

    private By _selectCurrency = By.cssSelector("select#customerCurrency");

    private By _searchProduct = By.cssSelector("input#small-searchterms");

    private By _nopCommerceNewNewsRelease =By.partialLinkText("nopCommerce new release!");

    //private By _title =By.cssSelector("input.enter-comment-title");

    //private By _comment = By.cssSelector("textarea#AddNewComment_CommentText");

    //private By _submitNewComment =By.xpath("button-1 news-item-add-comment-button");

    private By _buildYourOwnComputer = By.xpath(("//a[contains(@href,'build-your-own-computer')]"));

    private By _facebookTab =By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    private By _welcomeMessage = By.cssSelector("div.topic-block-title h2");

    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);


        clickOnElement(_registerButton);
        }

        public void clickOnSearchButton(){

        clickOnElement(_searchButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please enter some search keyword");
        alert.accept();
        }

        public void clickOnVoteButton(){

        clickOnElement(_voteButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please select an answer");
        alert.accept();
        }

        public void selectCurrency() {

            selectElementByText(_selectCurrency, "US Dollar");

        }

        public void searchProductBrand(){

        typeText(_searchProduct,"adidas");

        clickOnElement(_searchButton);

        }
        public void selectNewRelease(){

           //selectElementByText(_nopCommerceNewNewsRelease, "nopCommerce new release!");
            clickOnElement(_nopCommerceNewNewsRelease);

    }
        public void verifyUserShouldBeBuildYourOwnComputer(){
        clickOnElement(_buildYourOwnComputer);
    }
        public void verifyUserShouldGoFacebookWindow(){
        String MainWindow = driver.getWindowHandle();
        clickOnElement(_facebookTab);
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }
       public void welcomeToOurStore () {
        String expectedWelcomeMessage = "Welcome to our store";
        String actualMessage = getTextFromElement(_welcomeMessage);
        System.out.println("get message on Homepage:" + actualMessage);
        //Close URL
        Assert.assertEquals(actualMessage, expectedWelcomeMessage, "Welcome Homepage");
    }
}


