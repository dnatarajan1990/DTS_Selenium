package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import com.WebToolsPageObjects.ApplicationDataEnumsPageObjects.UserPageTableButtons;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by sciborek on 08.06.2017.
 */
public class UserPage extends BaseMethods {
    public UserPage(WebDriver driver) {
        super(driver);
    }

    public static int userCounter = 0;
    public static int copyUserCounter = 0;
    final String newUserForTest = "AutoT";
    final String copiedUserForTest = "A_C_Us";

    public static final String USER_LIST_LABEL = ".h2";
    public static final String ITEMS_BY_PAGE_DROPDOWN = "//select[contains(@ng-model,'$ctrl.itemsByPage')]";
    public static final String USER_NAME_CONTAINS_SEARCHBOX = "//input[contains(@st-search,'username')]";
    public static final String FULL_NAME_CONTAINS_SEARCHBOX = "//input[contains(@st-search,'fullName')]";
    public static final String SELECT_GROUP_DROPDOWN = "#selectedGroup";
    public static final String NEW_USER_BUTTON = "//button[contains(@ui-sref,'webtools.New-user')]";
    public static final String PREVIOUS_BUTTON = "//*[contains(text(),'Previous')]";
    public static final String FIRST_BUTTON = "//*[contains(text(),'First')]";
    public static final String LAST_BUTTON = "//a[@ng-click='selectPage(numPages)']";
    public static final String NR_ONE_BUTTON_FOR_RESULTS = "//*[text()='1'][//@class='ng-binding']";
    public static final String ANY_EDIT_BUTTON = "button.btn.btn-primary.btn-sm";
    public static final String ANY_ACCESS_LEVELS_BUTTON = "//*/button[contains(text(),'Access levels')]";
   // public static final String ANY_COPY_USER_BUTTON = "//button[@ui-sref='webtools.Copy-user({userName: row.username})']";
    public static final String ANY_COPY_USER_BUTTON = "//a[@id='copyLink']";
    public static final String ANY_REMOVE_BUTTON = "//a[@id='removeLink']";
    public static final String CONFIRM_DELETE = "//button[text()='OK']";
    public static final String USER_DELETED_ALERT = "//div[contains(@class,'alert')]/p";
    public static final String ANY_MORE_ACTIONS_BUTTON = "//button[text()='More actions']";
    public static final String NO_USER_ARE_CURRENTLY_DEFINED_ERROR_TXT = "//div[normalize-space(.) = 'No users are currently defined']";



    @FindBy(css = USER_LIST_LABEL)
    public WebElement userListLabel;

    @FindBy(xpath = ITEMS_BY_PAGE_DROPDOWN)
    public WebElement itemsByPageDropdown;

    @FindBy(xpath = USER_NAME_CONTAINS_SEARCHBOX)
    public WebElement userNameContainsSearchBox;

    @FindBy(xpath = FULL_NAME_CONTAINS_SEARCHBOX)
    public WebElement fullNameContainsSearchBox;

    @FindBy(css = SELECT_GROUP_DROPDOWN)
    public WebElement selectGroupDropdown;

    @FindBy(xpath = NEW_USER_BUTTON)
    public WebElement newUserButton;

    @FindBy(xpath = PREVIOUS_BUTTON)
    public WebElement previousButton;

    @FindBy(xpath = FIRST_BUTTON)
    public WebElement firstButton;

    @FindBy(xpath = LAST_BUTTON)
    public WebElement lastButton;

    @FindBy(xpath = NR_ONE_BUTTON_FOR_RESULTS)
    public WebElement nrOneButton;

    @FindBy(css = ANY_EDIT_BUTTON)
    public WebElement anyEditButton;

    @FindBy(xpath = ANY_ACCESS_LEVELS_BUTTON)
    public WebElement anyAccessLevelsButton;

    @FindBy(xpath = ANY_COPY_USER_BUTTON)
    public WebElement anyCopyUserButton;

    @FindBy(xpath = ANY_REMOVE_BUTTON)
    public WebElement anyRemoveButton;

    @FindBy(xpath = CONFIRM_DELETE)
    public WebElement confirmDeleteButton;

    @FindBy(xpath = USER_DELETED_ALERT)
    public WebElement userDeletedAlert;

    @FindBy(xpath = ANY_MORE_ACTIONS_BUTTON)
    public WebElement anyMoreActionsButton;

    @FindBy(xpath = NO_USER_ARE_CURRENTLY_DEFINED_ERROR_TXT)
    public WebElement noUserAreCurrentlyDefinedTxt;



    public WebElement getItemsByPageDropdown() {
        return itemsByPageDropdown;
    }

    public WebElement getUserNameContainsSearchBox() {
        return userNameContainsSearchBox;
    }

    public WebElement getFullNameContainsSearchBox() {
        return fullNameContainsSearchBox;
    }

    public WebElement getSelectGroupDropdown() {
        return selectGroupDropdown;
    }

    public WebElement getNewUserButton() {
        return newUserButton;
    }

    public WebElement getPreviousButton() {
        return previousButton;
    }

    public WebElement getFirstButton() {
        return firstButton;
    }

    public WebElement getLastButton() {
        return lastButton;
    }

    public WebElement getNrOneButton() {
        return nrOneButton;
    }

    public WebElement getAnyEditButton() {
        return anyEditButton;
    }

    public WebElement getAnyAccessLevelsButton() {
        return anyAccessLevelsButton;
    }

    public WebElement getAnyCopyUserButton() {
        return anyCopyUserButton;
    }

    public WebElement getAnyRemoveButton() {
        return anyRemoveButton;
    }

    public WebElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public WebElement getUserDeletedAlert() {
        return userDeletedAlert;
    }

    public WebElement getAnyMoreActionsButton() {
        return anyMoreActionsButton;
    }

    public WebElement getNoUserAreCurrentlyDefinedTxt() {
        return noUserAreCurrentlyDefinedTxt;
    }



    public void getAndClickMoreOptionsButton(String userName, UserPageTableButtons button) throws InterruptedException {
        String buttonName = button.getName().replace("#", "");
        getUserNameContainsSearchBox().clear();
        selectVisibleOptionFromMenu("[All]", getSelectGroupDropdown());
        waitAndType(getUserNameContainsSearchBox(), userName);
        WebElement moreActionsButton = driver.findElement(By.xpath("//tr/td[normalize-space(.) = '" + userName + "']//.." + ANY_MORE_ACTIONS_BUTTON));
        waitForElement(moreActionsButton);

        moreActionsButton.click();

        try {
            WebElement buttonToClick = driver.findElement(By.xpath("//tr/td[normalize-space(.) = '" + userName + "']//..//a[@id='" + buttonName + "']"));
            waitForElement(buttonToClick);
            if (!verifyIsElementNotDisplayed(buttonToClick)) {
                buttonToClick.click();
            }
        } catch (InvalidSelectorException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String userName) throws InterruptedException {
        getAndClickMoreOptionsButton(userName, UserPageTableButtons.Remove);
        waitForElement(getConfirmDeleteButton());
        getConfirmDeleteButton().click();
        assertFalse(verifyIsElementNotDisplayed(getUserDeletedAlert()));
        waitForElement(getUserDeletedAlert());
        assertTrue("Deleted user information don't contains userName or other problem", getUserDeletedAlert().getText().contains(userName));

    }

    public void getAccessLevelsButtonForUser(String userName) throws InterruptedException {
        getUserNameContainsSearchBox().clear();
        selectVisibleOptionFromMenu("[All]", getSelectGroupDropdown());
        waitAndType(getUserNameContainsSearchBox(), userName);
        try {

            if (!verifyIsElementNotDisplayed(getAnyAccessLevelsButton())) {
                getAnyAccessLevelsButton().click();
            }
        } catch (InvalidSelectorException e) {
            e.printStackTrace();
        }

    }

    public String getTextOfFullNameForUserName(String userName) {
        WebElement fullName = driver.findElement(By.xpath("//tr/td[normalize-space(.) = '" + userName + "']//..//td[2]"));
        return fullName.getText();
    }

    public String getTextOfDescriptionForUserName(String userName) {
        WebElement desc = driver.findElement(By.xpath("//tr/td[normalize-space(.) = '" + userName + "']//..//td[3]/span"));
        return desc.getText();
    }

    public boolean verifyUserGroupTextIsDisplayedForUser(String userName, String groupText) {
        getUserNameContainsSearchBox().clear();
        selectVisibleOptionFromMenu("[All]", getSelectGroupDropdown());
        waitAndType(getUserNameContainsSearchBox(), userName);
        String path = "//span[text() = '" + groupText + "']";
        try {
            return driver.findElement(By.xpath(path)).isDisplayed();
        } catch (NullPointerException e) {
            return false;
        }
    }

    public String getNewUserForTest()
    {
        String newuser=newUserForTest;
        return newuser;
    }
    public String incrementNewUser() {
        String incUser = newUserForTest ;
        return incUser;
    }

    public String getIncrementedUser() {
        String user = newUserForTest + String.valueOf(userCounter);
        return user;
    }

    public String incrementCopyUser() {
        copyUserCounter++;
        String user = copiedUserForTest + String.valueOf(copyUserCounter);
        return user;
    }

    public String getCopyUser() {
        String copyUser = copiedUserForTest + String.valueOf(copyUserCounter);
        return copyUser;
    }

    public void clearAllUsersUsingForTests() {
        int deleteUserCounter = 0;
        int deleteCopyCounter = 0;
        waitAndType(getUserNameContainsSearchBox(), newUserForTest);
        try {
            while (!verifyIsElementNotDisplayed(getAnyMoreActionsButton())&& deleteUserCounter <= 100) {
                deleteUserCounter++;
                getAnyMoreActionsButton().click();
                getAnyRemoveButton().click();
                waitForElement(getConfirmDeleteButton());
                getConfirmDeleteButton().click();
            }
            getUserNameContainsSearchBox().clear();
            waitAndType(getUserNameContainsSearchBox(), copiedUserForTest);
            while (!verifyIsElementNotDisplayed(getAnyMoreActionsButton()) && deleteCopyCounter <= 100) {
                deleteCopyCounter++;
                getAnyMoreActionsButton().click();
                getAnyRemoveButton().click();
                waitForElement(getConfirmDeleteButton());
                getConfirmDeleteButton().click();
            }
            getUserNameContainsSearchBox().clear();
        } catch (InterruptedException e) {
            System.out.println("Something wrong with clearAllUsersUsingForTests()");
            e.printStackTrace();
        }
    }


}
