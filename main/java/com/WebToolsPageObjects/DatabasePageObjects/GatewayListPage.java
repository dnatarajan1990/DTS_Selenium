package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GatewayListPage extends BaseMethods {
    @FindBy(xpath = "//button[@title='Create New Gateway' and contains(text(), 'New')]")
    private WebElement newGatewayButton;

    @FindBy(xpath = "//div[@class='toast-message' and contains(text(), 'Gateway details saved.')]")
    private WebElement successToast;

    public GatewayListPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewButton() {
        waitFor(newGatewayButton);
        waitAndClick(newGatewayButton);
    }

    private WebElement findGatewayTr(int id) {
        return driver.findElement(By.xpath("//tr/td[position()=1 and contains(text(), '" + id + "')]/parent::tr"));
    }

    public void clickEditButton(int id) {
        WebElement editButton = findGatewayTr(id).findElement(By.xpath("td/button[@title='Edit Gateway']"));
        waitFor(editButton);
        waitAndClick(editButton);
    }

    public boolean isGatewayPresentOnList(int id) {
        boolean isGatewayPresent;

        try {
            WebElement gatewayTr = findGatewayTr(id);
            isGatewayPresent = isElementPresent(gatewayTr);
        } catch (NoSuchElementException e) {
            isGatewayPresent = false;
        }

        return isGatewayPresent;
    }

    public boolean isNewGatewayButtonPresent() {
        return isElementPresent(newGatewayButton);
    }

    public boolean isSuccessToastPresent() {
        return isElementPresent(successToast);
    }
}
