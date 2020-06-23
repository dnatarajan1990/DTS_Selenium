package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MpanPrefixListPage extends BaseMethods {

    @FindBy(xpath = "//button[@title='Create New MPAN' and contains(text(), 'New')]")
    private WebElement newButton;

    @FindBy(xpath = "//div[@class='toast-message' and contains(text(), 'Host details saved.')]")
    private WebElement mpanPrefixSavedSuccessToast;

    @FindBy(xpath = "//div[@class='toast-message' and contains(text(), 'MPAN deleted')]")
    private WebElement mpanPrefixDeletedSuccessToast;

    @FindBy(xpath = "//div[contains(@class, 'modal-dialog')]/div[contains(@class, 'modal-content')]/div[contains(@class, 'modal-footer')]/button[@ng-click = '$close()' and contains(text(), 'OK')]")
    private WebElement deleteMpanPrefixOkButton;

    @FindBy(xpath = "//div[contains(@class, 'modal-dialog')]/div[contains(@class, 'modal-content')]/div[contains(@class, 'modal-footer')]/button[@ng-click = '$dismiss()' and contains(text(), 'Cancel')]")
    private WebElement deleteMpanPrefixCancelButton;

    public MpanPrefixListPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewButton() {
        waitFor(newButton);
        waitAndClick(newButton);
    }

    private WebElement findMpanPrefixTr(int prefix) {
        return driver.findElement(By.xpath("//tr/td[position()=1 and contains(text(), '" + prefix + "')]/parent::tr"));
    }

    public void clickEditButton(int prefix) {
        WebElement editButton = findMpanPrefixTr(prefix).findElement(By.xpath("td/button[@title='Edit MPAN']"));
        waitFor(editButton);
        waitAndClick(editButton);
    }

    public void clickDeleteButton(int prefix) {
        WebElement deleteButton = findMpanPrefixTr(prefix).findElement(By.xpath("td/button[@title='Delete MPAN']"));
        waitFor(deleteButton);
        waitAndClick(deleteButton);
    }

    public boolean isMpanPrefixPresentOnList(int prefix) {
        boolean isMpanPrefixPresent;

        try {
            WebElement mpanPrefixTr = findMpanPrefixTr(prefix);
            isMpanPrefixPresent = isElementPresent(mpanPrefixTr);
        } catch (NoSuchElementException e) {
            isMpanPrefixPresent = false;
        }

        return isMpanPrefixPresent;
    }

    public void confirmMpanPrefixDeletion() {
        waitFor(deleteMpanPrefixOkButton);
        waitAndClick(deleteMpanPrefixOkButton);
    }

    public void cancelMpanPrefixDeletion() {
        waitFor(deleteMpanPrefixCancelButton);
        waitAndClick(deleteMpanPrefixCancelButton);
    }

    public boolean isMpanPrefixSavedSuccessToastPresent() {
        return isElementPresent(mpanPrefixSavedSuccessToast);
    }

    public boolean isMpanPrefixDeletedSuccessToastPresent() {
        return isElementPresent(mpanPrefixDeletedSuccessToast);
    }
}
