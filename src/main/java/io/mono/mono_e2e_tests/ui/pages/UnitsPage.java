package io.mono.mono_e2e_tests.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class UnitsPage extends ComponentMenu{

    private SelenideElement searchField = $(".ant-input-group > [placeholder=\"Search...\"]");
    private SelenideElement createUnitButton = $(byText("Create unit"));
    //  create unit form
    private SelenideElement unitNameField = $("#name");
    private SelenideElement descriptionField = $("#description");
    private SelenideElement saveButton = $(byText("Save"));

    public UnitsPage searchUnit(String unitName) {
        searchField.setValue(unitName);
        return this;
    }

    public UnitsPage createUnit(String unitName, String description) {
        unitNameField.setValue(unitName);
        descriptionField.setValue(description);
        saveButton.click();
        return this;
    }

    public boolean checkUnitExists(String unitName) {
        return $(byText(unitName)).exists();
    }

    public UnitPage openUnit (String unitName){
        $(byText(unitName)).click();
        return new UnitPage();
    }

}
