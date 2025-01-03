package io.mono.mono_e2e_tests.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private SelenideElement loginField = $("#login_email");
    private SelenideElement passwordField = $("#login_password");
    private SelenideElement enterButton = $("[data-test='login-button']");
    private SelenideElement errorMessage = $(".ant-alert-message");

    public LoginPage open(){
        Selenide.open("/login");
        return this;
    }

    public ComponentMenu loginedUser(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password);
        enterButton.click();
        return new ComponentMenu();
    }

    public String loginError(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password);
        enterButton.click();
        return errorMessage.getText();
    }
}
