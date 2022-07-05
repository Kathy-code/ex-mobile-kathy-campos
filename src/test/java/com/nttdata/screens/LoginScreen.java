package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Usuario\"]")
    private WebElement userNameInput;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Contraseña\"]")
    private WebElement userPasswordInput;

    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement loginButton;

}
