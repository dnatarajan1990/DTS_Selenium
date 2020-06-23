package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class PortalHostFailedPage extends BaseMethods {

    public PortalHostFailedPage(WebDriver driver) {
        super(driver);
    }

    public static final String FLOW = "//select";
    public static final String FAILED = "//div[@id='collapseELNKTESTPH']/ul/li[@folder='Failed']";
    public static final String CREATE_BUTTON = "//button[contains(@class, 'btn-success')]";
    public static final String RESET_BUTTON = "//button[contains(@ng-click, 'clickOnReset')]";
    public static final String ACTIONS = "//button[contains(text(),'Action')]";
    public static final String SELECT_ALL_FILES_IN_FOLDER = "(//li[contains(@ng-click,'selectAll')])[1]";
    public static final String DESELECT_ALL_FILES_IN_FOLDER = "//li[contains(@ng-click,'deselectAll')]";
    public static final String EXTRACT_TO_CSV_AND_DOWNLOAD = "//a[contains(@aria-label,'CSV')]";
    public static final String EXTRACT_TO_ZIP_AND_DOWNLOAD = "//li[contains(@ng-click,'openZip')]";
    public static final String FAILED_DFLOW_CHECKBOX = "//input[contains(@ng-click,'selectRow')]";
    public static final String SEARCH_INPUT = "//input[contains(@ng-model,'searchText')]";
    public static final String FILES_IN_FAILED = "//div[contains(@ng-click,'select')]//strong[not(contains(text(),'D0'))]";
    public static final String SELECT_FILES_DISPLAYED_LIMIT = "//select[contains(@ng-model,'limit')]";
    private static final String MARK_AS_RESOLVED_OPTION = "//i[contains(@class,'thumbs-up')]/..";
    private static final String MARK_AS_UNRESOLVED_OPTION = "//i[contains(@class,'thumbs-down')]/..";
    private static final String COPY_FILES_TO_DRAFTS = "//li[contains(@ng-click,'copy')]";
    private static final String MARK_AS_TO_BE_ACTIONED_OPTION = "(//li[contains(@ng-click,'ToBeActioned')])[1]";
    private static final String MARK_AS_NOT_TO_BE_ACTIONED = "(//li[contains(@ng-click,'ToBeActioned')])[2]";
    private static final String RESOLVED_FILES_LIST = "//div[@class='list-group-item small hover-it ng-scope processed']";
    private static final String UNRESOLVED_FILES_LIST = "//div[@class='list-group-item small hover-it ng-scope unprocessed']";
    private static final String TO_BE_ACTIONED_FLAG_LIST = "//span[contains(@class,'flag')]";
    public static final String TOAST_MESSAGE = "//div[contains(@ng-click,'tapToast')]";
    public static final String EMPTY_FOLDER = "//div[contains(@class, 'alert') and contains(@ng-if, '$ctrl.files.length === 0')]/p[contains(text(), 'Folder has no files younger than')]";

    @FindBy(xpath = FLOW)
    public WebElement flows;

    @FindBy(xpath = FAILED)
    public WebElement failed_folder;

    @FindBy(xpath = ACTIONS)
    public WebElement actionsBtn;

    @FindBy(xpath = SELECT_ALL_FILES_IN_FOLDER)
    public WebElement selectAllInFolderOption;

    @FindBy(xpath = DESELECT_ALL_FILES_IN_FOLDER)
    public WebElement deselectAllInFolderOption;

    @FindBy(xpath = SEARCH_INPUT)
    public WebElement searchInput;

    @FindBy(xpath = COPY_FILES_TO_DRAFTS)
    public WebElement copyFileToDraftsOption;

    @FindBy(xpath = MARK_AS_RESOLVED_OPTION)
    public WebElement markAsResolvedOption;

    @FindBy(xpath = MARK_AS_UNRESOLVED_OPTION)
    public WebElement markAsUnresolvedOption;

    @FindBy(xpath = MARK_AS_TO_BE_ACTIONED_OPTION)
    public WebElement markAsToBeActionedOption;

    @FindBy(xpath = MARK_AS_NOT_TO_BE_ACTIONED)
    public WebElement markAsNotToBeActionedOption;

    @FindBy(xpath = EXTRACT_TO_CSV_AND_DOWNLOAD)
    public WebElement extractToCSVAndDownloadOption;

    @FindBy(xpath = EXTRACT_TO_ZIP_AND_DOWNLOAD)
    public WebElement extractToZIPAndDownloadOption;

    @FindBy(xpath = SELECT_FILES_DISPLAYED_LIMIT)
    public WebElement selectFilesDisplayedLimit;

    @FindBy(xpath = TOAST_MESSAGE)
    public WebElement toastMsg;

    @FindBy(xpath = RESOLVED_FILES_LIST)
    public List<WebElement> resolvedFilestList;

    @FindBy(xpath = UNRESOLVED_FILES_LIST)
    public List<WebElement> unresolvedFilesList;

    @FindBy(xpath = TO_BE_ACTIONED_FLAG_LIST)
    public List<WebElement> toBeActionedFlagList;

    @FindBy(xpath = FAILED_DFLOW_CHECKBOX)
    public List<WebElement> failedFileChckbxs;

    @FindBy(xpath = FILES_IN_FAILED)
    public List<WebElement> failedFileIds;

    @FindBy(xpath = EMPTY_FOLDER)
    public WebElement emptyFolder;

    public void clickOnFailed() {
        waitAndClick(failed_folder);
    }

    public void clickOnAction() {
        waitAndClick(actionsBtn);
    }

    public void clickOnSelectAllFilesInFolder() {
        waitAndClick(selectAllInFolderOption);
    }

    public void clickOnDeselectAllFilesInFolder() {
        waitAndClick(deselectAllInFolderOption);
    }

    public void clickExtractToCsvAndDownload() {
        waitAndClick(extractToCSVAndDownloadOption);
    }

    public void clickOnExtractToZIPAndDownload() {
        waitAndClick(extractToZIPAndDownloadOption);
    }

    public void clickOnMarkAsResolved() {
        waitAndClick(markAsResolvedOption);
    }

    public void clickOnMarkAsUnresolved() {
        waitAndClick(markAsUnresolvedOption);
    }

    public void clickOnMarkAsToBeActioned() {
        waitAndClick(markAsToBeActionedOption);
    }

    public void clickOnMarkAsNotToBeActioned() {
        waitAndClick(markAsNotToBeActionedOption);
    }

    public void clickOnCopyFilesToDrafts() {
        waitAndClick(copyFileToDraftsOption);
    }

    public void typeSearchQuery(String searchQuery) {
        waitAndType(searchInput, searchQuery);
    }

    public List<WebElement> getResolvedFilestList() {
        return resolvedFilestList;
    }

    public List<WebElement> getUnresolvedFilesList() {
        return unresolvedFilesList;
    }

    public List<WebElement> getToBeActionedFlagList() {
        return toBeActionedFlagList;
    }

    public int getFailedCheckboxesCount() {
        return failedFileChckbxs.size();
    }

    public WebElement getActionsOption() {
        return actionsBtn;
    }

    public List<WebElement> getFailedCheckboxList() {
        return failedFileChckbxs;
    }

    public void goToFailed() {
        try {
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);", failed_folder);
            waitForElement(failed_folder);
            clickOnFailed();
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void clickOnFailedCheckbox(int checkboxIndex) {
        waitAndClick(getFailedCheckboxList().get(checkboxIndex));
    }

    public void selectSingleFile() throws InterruptedException {
        getFailedCheckboxList();
        waitForElement(actionsBtn);
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        waitForElement(actionsBtn);
    }

    public void selectMultipleFiles(int filesCount) throws InterruptedException {
        getFailedCheckboxList();
        waitForElement(actionsBtn);
        for (int i = 0; i < filesCount; i++) {
            waitForElement(getFailedCheckboxList().get(i));
            clickOnFailedCheckbox(i);
        }
        waitForElement(actionsBtn);
    }

    public boolean isFailedListContainTypedQuery(String searchQuery) {
        for (WebElement e : failedFileIds) {
            if (e.getText().contains(searchQuery))
                return true;
        }
        return false;
    }

    public void selectShowEntriesOption(int entriesCount) {
        waitAndSelect(selectFilesDisplayedLimit, "number:" + entriesCount);
    }

    public boolean isFailedFileIdExistsInFailed(String fileId) {
        for (WebElement e : failedFileIds) {
            if (e.getText().equals(fileId))
                return true;
        }
        return false;
    }

    public void singleFailedChangeStatus() throws InterruptedException {
        getFailedCheckboxList();
        waitForElement(getActionsOption());
        validateDisplayedElements(getActionsOption());
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        clickOnAction();
        waitForElement(markAsResolvedOption);
        clickOnMarkAsResolved();
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        waitForElement(getResolvedFilestList().get(0));
        assertTrue("Single failed Dflow wasn't changed status to resolved!", getResolvedFilestList().get(0).isDisplayed());
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        clickOnAction();
        waitForElement(markAsUnresolvedOption);
        clickOnMarkAsUnresolved();
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        assertTrue("Single failed Dflow wasn't changed status to unresolved!", getUnresolvedFilesList().get(0).isDisplayed());
    }

    public void multipleFailedChangeStatus() throws InterruptedException {
        getFailedCheckboxList();
        waitForElement(getActionsOption());
        validateDisplayedElements(getActionsOption());
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        waitForElement(getFailedCheckboxList().get(1));
        clickOnFailedCheckbox(1);
        clickOnAction();
        waitForElement(markAsResolvedOption);
        clickOnMarkAsResolved();
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        waitForElement(getFailedCheckboxList().get(1));
        clickOnFailedCheckbox(1);
        waitForElement(getResolvedFilestList().get(0));
        assertTrue("Multiple failed dflows wasn't changed status to resolved!", getResolvedFilestList().get(0).isDisplayed()
                && getResolvedFilestList().get(1).isDisplayed());
        clickOnFailedCheckbox(0);
        waitForElement(getFailedCheckboxList().get(1));
        clickOnFailedCheckbox(1);
        clickOnAction();
        waitForElement(markAsUnresolvedOption);
        clickOnMarkAsUnresolved();
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        waitForElement(getFailedCheckboxList().get(1));
        clickOnFailedCheckbox(1);
        waitForElements(getFailedCheckboxList());
        assertTrue("Multiple failed Dflows wasn't changed status to unresolved!",
                getUnresolvedFilesList().get(0).isDisplayed() && getUnresolvedFilesList().get(1).isDisplayed());
    }

    public void selectOptionToBeActionedOrNotToActioned() throws InterruptedException {
        getFailedCheckboxList();
        waitForElement(getActionsOption());
        validateDisplayedElements(getActionsOption());
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        clickOnAction();
        waitForElement(markAsToBeActionedOption);
        clickOnMarkAsToBeActioned();
        waitForElement(searchInput);
        Thread.sleep(3000);
        waitForElement(getFailedCheckboxList().get(0));
        waitForElement(getToBeActionedFlagList().get(0));
        clickOnFailedCheckbox(0);
        assertTrue("Failed Dflow wasn't changed status to To be actioned!", getToBeActionedFlagList().get(0).isDisplayed());
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        clickOnAction();
        waitForElement(markAsNotToBeActionedOption);
        clickOnMarkAsNotToBeActioned();
        waitForElement(getFailedCheckboxList().get(0));
        clickOnFailedCheckbox(0);
        waitForElements(getFailedCheckboxList());
        Thread.sleep(2000);
        assertEquals("Failed Dflow wasn't changed status to NOT to be actioned!", 0, getToBeActionedFlagList().size());
    }
}

