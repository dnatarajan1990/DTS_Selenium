package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GatewayDetailsPage extends BaseMethods {

    @FindBy(xpath = "//input[@id='number']")
    private WebElement numberTextField;

    @FindBy(xpath = "//div[@class='form-group' and position() = 1]/div/label")
    private WebElement numberTextLabel;

    @FindBy(xpath = "//input[@id='gatewayName']")
    private WebElement nameTextField;

    @FindBy(xpath = "//div[@class='form-group' and position() = 2]/div/label")
    private WebElement nameTextLabel;

    @FindBy(xpath = "//input[@id='Description']")
    private WebElement descriptionTextField;

    @FindBy(xpath = "//select[@id='type']")
    private WebElement typeDropdown;

    @FindBy(xpath = "//input[@id='gatewayServer']")
    private WebElement serverTextField;

    @FindBy(xpath = "//button[@ng-click='$ctrl.save(form)' and contains(text(), 'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@ng-click='$ctrl.goToGatewayList()' and contains(text(), 'Cancel')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[@class='toast-message' and contains(text(), 'Field Num should be Integer Type')]")
    private WebElement errorToast;

    public GatewayDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewGatewayFormPresent() {
        return Arrays.asList(numberTextField, nameTextField, descriptionTextField, typeDropdown, serverTextField)
                .stream()
                .allMatch(this::isElementPresent);
    }

    public boolean isNewGatewayFormEmpty() {
        return Arrays.asList(numberTextField, nameTextField, descriptionTextField, serverTextField)
                .stream()
                .map(WebElement::getText)
                .allMatch(StringUtils::isEmpty);
    }

    public boolean isEditGatewayFormPresent() {
        return Arrays.asList(numberTextLabel, nameTextLabel, descriptionTextField, typeDropdown, serverTextField)
                .stream()
                .allMatch(this::isElementPresent);
    }

    public boolean isReadOnlyEditGatewayFormPresent() {
        boolean areLabelsPresent = Arrays.asList(numberTextLabel, nameTextLabel)
                .stream()
                .allMatch(this::isElementPresent);

        boolean areReadOnlyElementsPresent = Arrays.asList(descriptionTextField, typeDropdown, serverTextField)
                .stream()
                .allMatch(this::isReadOnlyElementPresent);

        return areLabelsPresent && areReadOnlyElementsPresent;
    }

    public List<String> isEditGatewayFormInitializedProperly(int num, String name, String description, String type, String server) {
        List<String> errors = new ArrayList<>();

        String numStr = Integer.toString(num);
        errors.addAll(areValuesEqual(numberTextLabel, numStr));
        errors.addAll(areValuesEqual(nameTextLabel, name));
        errors.addAll(areValuesEqual(descriptionTextField, description));
        errors.addAll(areValuesEqual(serverTextField, server));

        String selectedType = new Select(typeDropdown).getFirstSelectedOption().getText();
        if(!type.equals(selectedType)) {
            errors.add(type);
            errors.add(selectedType);
        }

        return errors;
    }

    public void fillNewGatewayForm(String num, String name, String description, String type, String server) {
        waitAndType(numberTextField, num);
        waitAndType(nameTextField, name);

        fillEditGatewayForm(description, type, server);
    }

    public void fillNewGatewayForm(int num, String name, String description, String type, String server) {
        fillNewGatewayForm(Integer.toString(num), name, description, type, server);
    }

    public void fillEditGatewayForm(String description, String type, String server) {
        waitAndType(descriptionTextField, description);
        waitAndSelect(typeDropdown, "string:" + type);
        waitAndType(serverTextField, server);
    }

    public void saveGatewayForm() {
        waitFor(saveButton);
        waitAndClick(saveButton);
    }

    public void cancelSavingGatewayForm() {
        waitFor(cancelButton);
        waitAndClick(cancelButton);
    }

    public boolean isSaveButtonPresent() {
        return isElementPresent(saveButton);
    }

    public boolean isNonIntegerIdErrorToastPresent() {
        return isElementPresent(errorToast);
    }
}
