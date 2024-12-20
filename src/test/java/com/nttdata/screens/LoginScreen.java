package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"View menu\"]")
    private WebElement banner;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Log In\"]")
    private WebElement labelLogin;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    private WebElement txtUsername;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]")
    private WebElement txtPassword;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]")
    private WebElement btnLogin;

    public void banner(){
        banner.click();
    }
    public void labelLogin(){
        labelLogin.click();
    }
    public void enterUser(String user){
        txtUsername.sendKeys(user);
    }
    public void enterPassword(String password){
        txtUsername.sendKeys(password);
    }
    public void clickLogin(){
        btnLogin.click();
    }
}
