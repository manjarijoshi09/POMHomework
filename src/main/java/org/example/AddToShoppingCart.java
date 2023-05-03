package org.example;

import org.openqa.selenium.By;

public class AddToShoppingCart extends Utils{

    public class ShoppingCartPage extends Utils{
        private By _Electronics = By.linkText("Electronics");
        private  By _Cameraphoto = By.linkText("Camera & photo");
        private  By _LeicaTMirrorlessDigitalCamera =By.linkText("Leica T Mirrorless Digital Camera");
        private By _addtocartbutton16 =By.id("add-to-cart-button-16");
        private By _Shoppingcart =By.linkText("Shopping cart");
        public void VerifyDetailsOfAddProductInShoppingCart(){
            //click on the electronics
            clickOnElement(_Electronics);
            // click the camera & photo tab
            clickOnElement(_Cameraphoto);
            //click and select the product
            clickOnElement(_LeicaTMirrorlessDigitalCamera);
            //click on add button
            clickOnElement(_addtocartbutton16);
            //click on shopping cart button
            clickOnElement(_Shoppingcart);
        }
    }
}
