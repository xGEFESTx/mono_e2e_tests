package io.mono.mono_e2e_tests;

import io.mono.mono_e2e_tests.ui.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.mono.utils.utils.generateRandomString;
import static org.junit.jupiter.api.Assertions.*;

public class UnitsPageTest extends BaseTest{

    private String username = env.get("USERNAME");
    private String password = env.get("PASSWORD");
    LoginPage login;

    @BeforeEach
    public void setup() {
        login = new LoginPage();
    }

    @Test
    public void canSearchUnitTest(){
        String unitName = "btc";
        boolean isSearchUnit = login.loginedUser(username, password)
                .openOrganizationalUnits()
                .searchUnit(unitName)
                .checkUnitExists(unitName);
        assertTrue(isSearchUnit);
    }

    @Test
    public void canCreateUnitTest(){
        String unitName = generateRandomString(10);
        boolean isCreatedUnit = login.loginedUser(username, password)
                .openOrganizationalUnits()
                .createUnit(unitName, unitName)
                .checkUnitExists(unitName);
        assertTrue(isCreatedUnit);
    }
}
