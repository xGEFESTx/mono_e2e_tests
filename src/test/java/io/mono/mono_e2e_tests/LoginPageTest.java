package io.mono.mono_e2e_tests;

import io.mono.mono_e2e_tests.ui.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;


public class LoginPageTest extends BaseTest {

    private String username = env.get("USERNAME");
    private String password = env.get("PASSWORD");

    @Test
    public void successLoginTest(){
        var loginPage = new LoginPage();
        boolean successLogin;

        successLogin = loginPage.open().loginedUser(username, password).successLogin();
        assertTrue(successLogin);
    }

    @ParameterizedTest(name = "login = {0}, password = {1}, errorMessage = {2}")
    @MethodSource("io.mono.dataProvider.DataProviderLoginPage#incorrectUserLogin")
    public void userCanNotLoginWithIncorrectCredentials(String login, String password, String expectedErrorMessage){
        var loginPage = new LoginPage();
        String error = loginPage.open().loginError(login, password);
        assertEquals(expectedErrorMessage, error);
    }

}
