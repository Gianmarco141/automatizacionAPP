package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;

public class LoginSteps {

    LoginScreen loginScreen;
    //ProductsScreen productsScreen;

    public void login(String user, String password){
        loginScreen.banner();
        loginScreen.labelLogin();
        loginScreen.enterUser(user);
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }
   /* public void loginSuccess(){
        Assert.assertTrue("No se mostro el titulo products",productsScreen.isProductDisplayed());
    }*/
}
