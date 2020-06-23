package com.WebToolsPageObjects.UserGroupPageObjects;


import com.CommonPages.BaseMethods;
import com.WebToolsPageObjects.ApplicationDataEnumsPageObjects.UserPageTableButtons;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class UserGroupPage extends BaseMethods {

    public UserGroupPage(WebDriver driver) {
        super(driver);
    }



    public final String NEW_GROUP_BUTTON = "//button[text()='New']";
    public final String ANY_MORE_ACTIONS_BUTTON = "//button[text()='More actions']";
    public final String ANY_ACCESS_LEVELS_BUTTON = "//*/button[contains(text(),'Access levels')]";

    public final String CONFIRM_DELETE_BUTTON = "//button[text()='OK']";



    @FindBy(xpath = NEW_GROUP_BUTTON)
    public WebElement newGroupButton;

    @FindBy(xpath = ANY_MORE_ACTIONS_BUTTON)
    public WebElement anyMoreActionsButton;

    @FindBy(xpath = ANY_ACCESS_LEVELS_BUTTON)
    public WebElement anyAccessLevelsButton;
    @FindBy(xpath = CONFIRM_DELETE_BUTTON)
    public WebElement confirmDeleteButton;

    public WebElement getNewGroupButton() {
        return newGroupButton;
    }

    public WebElement getAnyAccessLevelsButton() {
        return anyAccessLevelsButton;
    }

    public WebElement getAnyMoreActionsButton() {
        return anyMoreActionsButton;
    }

    public WebElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public void getAndClickMoreOptionsButton(String groupName, UserPageTableButtons button) throws InterruptedException {
        String buttonName = button.getName().replace("#", "");
        WebElement moreActionsButton = driver.findElement(By.xpath("//tr/td[normalize-space(.) = '" + groupName + "']//.." + ANY_MORE_ACTIONS_BUTTON));
        waitForElement(moreActionsButton);
        moreActionsButton.click();
        try {
            WebElement buttonToClick = driver.findElement(By.xpath("//tr/td[normalize-space(.) = '" + groupName + "']//..//a[@id='" + buttonName + "']"));
            waitForElement(buttonToClick);
            if (!verifyIsElementNotDisplayed(buttonToClick)) {
                buttonToClick.click();
            }
        } catch (InvalidSelectorException e) {
            e.printStackTrace();
        }
    }
    public String getUserDescription(String groupName){
        WebElement userDescription = driver.findElement(By.xpath("//*[text()='"+groupName+"']//..//./td[2]"));
        return userDescription.getText();
    }
    public boolean isGroupExisting(String groupName){
        try{
            WebElement group = driver.findElement(By.xpath("//*[text()='"+groupName+"']"));
            if (group.isDisplayed()){
                return true;
            }else {
                return false;
            }

        }catch (NoSuchElementException e){
            return false;
        }


    }
}
