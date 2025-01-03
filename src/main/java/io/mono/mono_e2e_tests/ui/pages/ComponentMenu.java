package io.mono.mono_e2e_tests.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ComponentMenu {

    SelenideElement organizationalUnits = $(byText("Organizational Units"));
    SelenideElement financialManagement = $("a[href='/administration/financial-management']");
    SelenideElement replenishmentRequests = $("a[href='/administration/replenishment-requests']");
    SelenideElement managers = $("a[href='/administration/managers']");
    SelenideElement roles = $("a[href='/administration/roles']");
    SelenideElement exchangeModule = $("a[href='/administration/exchange-module']");
    SelenideElement clients = $("a[href='/users/clients']");
    SelenideElement transactions = $("a[href='/users/transactions']");
    SelenideElement invoices = $("a[href='/users/invoices']");
    SelenideElement processingBalance = $("a[href='/processing/balance']");
    SelenideElement processingPaymentOrders = $("a[href='/processing/payment-orders']");
    SelenideElement processingTransactions = $("a[href='/processing/transactions']");
    SelenideElement processingResources = $("a[href='/processing/resources']");
    SelenideElement activityLog = $("a[href='/system/activity-log']");
    SelenideElement firewall = $("a[href='/system/firewall']");

    public boolean successLogin() {
        return $("[role='menu']").shouldBe(Condition.visible).exists();
    }

    public UnitsPage openOrganizationalUnits() {
        organizationalUnits.click();
        return new UnitsPage();
    }


}
