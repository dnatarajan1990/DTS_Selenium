package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MpanPrefixDetailsPage extends BaseMethods {

    @FindBy(id = "prefix")
    private WebElement prefixTextField;

    @FindBy(id = "prefixOwner")
    private WebElement prefixOwnerTextField;

    @FindBy(xpath = "//button[@ng-click='$ctrl.save()' and contains(text(), 'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@ng-click='$ctrl.goToMpanPrefix()' and contains(text(), 'Cancel')]")
    private WebElement cancelButton;

    public MpanPrefixDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMpanPrefixFormPresent() {
        return Arrays.asList(prefixTextField, prefixOwnerTextField)
                .stream()
                .allMatch(this::isElementPresent);
    }

    public boolean isMpanPrefixFormEmpty() {
        return Arrays.asList(prefixTextField, prefixOwnerTextField)
                .stream()
                .map(WebElement::getText)
                .allMatch(StringUtils::isEmpty);
    }

    public void fillMpanPrefixForm(int prefix, String prefixOwner) {
        fillMpanPrefixForm(Integer.toString(prefix), prefixOwner);
    }

    public void fillMpanPrefixForm(String prefix, String prefixOwner) {
        waitAndType(prefixTextField, prefix);
        waitAndType(prefixOwnerTextField, prefixOwner);
    }

    public List<String> isEditMpanPrefixFormInitializedProperly(int prefix, String prefixOwner) {
        List<String> errors = new ArrayList<>();

        errors.addAll(areValuesEqual(prefixTextField, Integer.toString(prefix)));
        errors.addAll(areValuesEqual(prefixOwnerTextField, prefixOwner));

        return errors;
    }

    public void saveMpanPrefixForm() {
        waitFor(saveButton);
        waitAndClick(saveButton);
    }

    public void cancelSavingMpanPrefixForm() {
        waitFor(cancelButton);
        waitAndClick(cancelButton);
    }

    public boolean isSaveButtonEnabled() {
        return isElementPresent(saveButton);
    }
}
