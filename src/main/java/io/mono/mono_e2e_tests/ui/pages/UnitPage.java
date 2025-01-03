package io.mono.mono_e2e_tests.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class UnitPage {

    SelenideElement createPaymentOrderButton = $(byText("Create payment order"));

    // Create payment order Form
    SelenideElement payWayField = $("#createPayment_network");
    SelenideElement walletAddressField = $("#createPayment_walletAddress");
    SelenideElement amountField = $("[data-test='amount-input']");

    public void selectTransactionGroup (String transactionGroup) {
        $(byText("Select transaction group ")).click();
        // и все... не могу найти элемента
        //$(byText())
    }


}
