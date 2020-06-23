package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class PortalHostDraftsPage extends BaseMethods {

    public PortalHostDraftsPage(WebDriver driver) {
        super(driver);
    }

    public static final String PORTAL_HOSTS = "//a[@data-target = '#collapsePH01']";
   // public static final String DRAFTS = "//div[@id='collapsePH01']/ul/li[@folder='Drafts']";
    public static final String DRAFTS = "//div[@id='collapseELNKTESTPH']/ul/li/a[contains(text(),'Drafts')]";
    public static final String DRAFT_DFLOW_CHECKBOX = "//input[contains(@ng-click,'selectRow')]";
    public static final String ACTION = "//button[contains(text(),'Action')]";
    public static final String SELECT_ALL_FILES_IN_FOLDER = "(//li[contains(@ng-click,'selectAll')])[1]";
    public static final String DESELECT_ALL_FILES_IN_FOLDER = "//li[contains(@ng-click,'deselectAll')]";
    public static final String MARK_AS_COMPLETE = "//a[text()=' Mark selected files as complete']";
    public static final String MARK_AS_INCOMPLETE = "//a[text()=' Mark selected files as incomplete']";
    public static final String EXTRACT_TO_CSV_AND_DOWNLOAD = "//a[contains(@aria-label,'CSV')]";
    public static final String EXTRACT_TO_ZIP_AND_DOWNLOAD = "//li[contains(@ng-click,'openZip')]";
    public static final String MOVE_TO_TRASH = "//li[contains(@ng-click,'Trash')]";
    public static final String UPLOAD_FILES = "//li[contains(@ng-click,'FileUpload')]";
    public static final String SELECT_FILES_FOR_UPLOAD = "//button[contains(@ng-model,'files')]";
    public static final String SUBMIT_UPLOAD = "//button[contains(@ng-click,'submit')]";
    public static final String CLOSE_UPLOAD_FORM = "//button[contains(@ng-click,'cancel')]";
    public static final String SUCCESS_UPLOAD = "//td[contains(@class,'succes')]";
    public static final String FAILED_UPLOAD = "//td[contains(@class,'danger')]";
    public static final String UPLOAD_FILENAME = "//tr[contains(@ng-repeat,'files')]/td";
    public static final String SEND_ALL_COMPLETED_FILES = "//li[contains(@ng-click,'move')]/a[contains(text(),'Send all')]";
    public static final String SEND_SELECTED_COMPLETED_FILES = "//li[contains(@ng-click,'move')]/a[contains(text(),'Send selected')]";
    public static final String COMPLETED_DRAFT_DFLOW = "//div[@class='list-group-item small hover-it ng-scope processed']";
    public static final String INCOMPLETED_DRAFT_DFLOW = "//div[contains(@class,'unprocessed')]";
    public static final String SEARCH_INPUT = "//input[contains(@ng-model,'searchText')]";
    public static final String FILES_IN_DRAFTS = "//div[contains(@ng-click,'select')]//strong[(contains(text(),'HI'))]";
    public static final String SELECT_FILES_DISPLAYED_LIMIT = "//select[contains(@ng-model,'limit')]";
    public static final String NEW_DRAFT_BUTTON = "//button[contains(@ng-click,'NewDraft')]";
    public static final String DISABLED_OPTIONS = "//a[@class='disabled']";
    public static final String SUCCESS_TOAST_MESSAGE = "//div[contains(@class,'toast') and @aria-label='Success']";
    public static final String EDIT_BUTTON = "//li[contains(@ng-click,'edit')]";

    @FindBy(xpath = PORTAL_HOSTS)
    public WebElement portal_hosts;

    @FindBy(xpath = DRAFTS)
    public WebElement drafts_folder;

    @FindBy(xpath = ACTION)
    public WebElement actionBtn;

    @FindBy(xpath = EDIT_BUTTON)
    public WebElement editBtn;

    @FindBy(xpath = SUCCESS_UPLOAD)
    public WebElement succUpload;

    @FindBy(xpath = FAILED_UPLOAD)
    public WebElement failedUpload;

    @FindBy(xpath = UPLOAD_FILENAME)
    public WebElement uploadFilename;

    @FindBy(xpath = SUCCESS_TOAST_MESSAGE)
    public WebElement succToastMsg;

    @FindBy(xpath = SUBMIT_UPLOAD)
    public WebElement submitUpload;

    @FindBy(xpath = SELECT_ALL_FILES_IN_FOLDER)
    public WebElement selectAllInFolderOption;

    @FindBy(xpath = DESELECT_ALL_FILES_IN_FOLDER)
    public WebElement deselectAllInFolderOption;

    @FindBy(xpath = EXTRACT_TO_CSV_AND_DOWNLOAD)
    public WebElement extractToCSVAndDownloadOption;

    @FindBy(xpath = EXTRACT_TO_ZIP_AND_DOWNLOAD)
    public WebElement extractToZIPAndDownloadOption;

    @FindBy(xpath = MOVE_TO_TRASH)
    public WebElement moveToTrashOption;

    @FindBy(xpath = UPLOAD_FILES)
    public WebElement uploadFilesOption;

    @FindBy(xpath = SELECT_FILES_FOR_UPLOAD)
    public WebElement selectFilesUpload;

    @FindBy(xpath = CLOSE_UPLOAD_FORM)
    public WebElement closeUploadForm;

    @FindBy(xpath = SEND_ALL_COMPLETED_FILES)
    public WebElement sendAllCompletedFilesOption;

    @FindBy(xpath = SEND_SELECTED_COMPLETED_FILES)
    public WebElement sendSelectedFilesOption;

    @FindBy(xpath = DRAFT_DFLOW_CHECKBOX)
    public List<WebElement> draftDflowCheckboxList;

    @FindBy(xpath = MARK_AS_COMPLETE)
    public WebElement markAsCompleteOption;

    @FindBy(xpath = MARK_AS_INCOMPLETE)
    public WebElement markAsIncompleteOption;

    @FindBy(xpath = COMPLETED_DRAFT_DFLOW)
    public List<WebElement> completedDraftDFlow;

    @FindBy(xpath = INCOMPLETED_DRAFT_DFLOW)
    public List<WebElement> incompletedDraftDFlow;

    @FindBy(xpath = NEW_DRAFT_BUTTON)
    public WebElement newDraftBtn;

    @FindBy(xpath = SEARCH_INPUT)
    public WebElement searchInput;

    @FindBy(xpath = SELECT_FILES_DISPLAYED_LIMIT)
    public WebElement selectFilesDisplayedLimit;

    @FindBy(xpath = DISABLED_OPTIONS)
    public List<WebElement> disabledOptions;

    @FindBy(xpath = FILES_IN_DRAFTS)
    public List<WebElement> draftFileIds;

    public void clickOnPortalHosts() {
        waitAndClick(portal_hosts);
    }

      public void clickOnAction() {
        waitAndClick(actionBtn);
    }

    public void clickOnDrafts() {
        waitAndClick(drafts_folder);
    }

    public void clickOnDraftsCheckbox(int checkboxIndex) {
        waitAndClick(draftDflowCheckboxList.get(checkboxIndex));
    }

    public void clickOnMarkAsComplete() {
        waitAndClick(markAsCompleteOption);
    }

    public void clickOnMarkAsIncomplete() {
        waitAndClick(markAsIncompleteOption);
    }

    public void clickOnSelectAllFilesInFolder() {
        waitAndClick(selectAllInFolderOption);
    }

    public void clickOnEdit() {
        waitAndClick(editBtn);
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

    public void clickOnMoveToTrash() {
        waitAndClick(moveToTrashOption);
    }

    public void clickOnUploadFiles() {
        waitAndClick(uploadFilesOption);
    }

    public void clickOnSelectFilesToUpload() {
        waitAndClick(selectFilesUpload);
    }

    public void clickOnSubmitUpload() {
        waitAndClick(submitUpload);
    }

    public void clickOnCloseUpload() {
        waitAndClick(closeUploadForm);
    }

    public void clickOnSendAllCompletedFiles() {
        waitAndClick(sendAllCompletedFilesOption);
    }

    public void clickOnSendSelectedFiles() {
        waitAndClick(sendSelectedFilesOption);
    }

    public void clickOnNew() {
        waitAndClick(newDraftBtn);
    }

    public void typeSearchQuery(String searchQuery) {
        waitAndType(searchInput, searchQuery);
    }

    public WebElement getPortalHost() {
        return portal_hosts;
    }

    public WebElement getDraftsFolder() {
        return drafts_folder;
    }

    public WebElement getActionsOption() {
        return actionBtn;
    }

    public List<WebElement> getDraftDflowCheckboxList() {
        return draftDflowCheckboxList;
    }

    public WebElement getMarkAsCompleteOption() {
        return markAsCompleteOption;
    }

    public WebElement getMarkAsIncompleteOption() {
        return markAsIncompleteOption;
    }

    public List<WebElement> getCompletedDraftDFlowList() {
        return completedDraftDFlow;
    }

    public List<WebElement> getIncompletedDraftDFlowList() {
        return incompletedDraftDFlow;
    }

    public String getUploadFilenameValue() {
        return uploadFilename.getText();
    }

    public int getDraftCheckboxesCount() {
        return draftDflowCheckboxList.size();
    }

    public int getDisabledOptionsCount() {
        return disabledOptions.size();
    }

    public void singleDraftChangeStatus() throws InterruptedException {
        getDraftDflowCheckboxList();
        waitForElement(getActionsOption());
        validateDisplayedElements(getActionsOption());
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        clickOnAction();
        waitForElement(getMarkAsCompleteOption());
        clickOnMarkAsComplete();
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        assertTrue("Single draft Dflow wasn't changed status to complete!", getCompletedDraftDFlowList().get(0).isDisplayed());
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        clickOnAction();
        waitForElement(getMarkAsIncompleteOption());
        clickOnMarkAsIncomplete();
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        assertTrue("Single draft Dflow wasn't changed status to incomplete!", getIncompletedDraftDFlowList().get(0).isDisplayed());
    }

    public void multipleDraftChangeStatus() throws InterruptedException {
        getDraftDflowCheckboxList();
        waitForElement(getActionsOption());
        validateDisplayedElements(getActionsOption());
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        waitForElement(getDraftDflowCheckboxList().get(1));
        clickOnDraftsCheckbox(1);
        clickOnAction();
        waitForElement(getMarkAsCompleteOption());
        clickOnMarkAsComplete();
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        waitForElement(getDraftDflowCheckboxList().get(1));
        clickOnDraftsCheckbox(1);
        assertTrue("Multiple draft dflows wasn't changed status to complete!", getCompletedDraftDFlowList().get(0).isDisplayed()
                && getCompletedDraftDFlowList().get(1).isDisplayed());
        clickOnDraftsCheckbox(0);
        waitForElement(getDraftDflowCheckboxList().get(1));
        clickOnDraftsCheckbox(1);
        clickOnAction();
        waitForElement(getMarkAsIncompleteOption());
        clickOnMarkAsIncomplete();
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        waitForElement(getDraftDflowCheckboxList().get(1));
        clickOnDraftsCheckbox(1);
        assertTrue("Multiple draft Dflows wasn't changed status to incomplete!", getIncompletedDraftDFlowList().get(0).isDisplayed()
                && getIncompletedDraftDFlowList().get(1).isDisplayed());
    }

    public void selectSingleFile() throws InterruptedException {
        getDraftDflowCheckboxList();
        waitForElement(getActionsOption());
        waitForElement(getDraftDflowCheckboxList().get(0));
        clickOnDraftsCheckbox(0);
        waitForElement(getActionsOption());
    }

    public void selectMultipleFiles(int filesCount) throws InterruptedException {
        getDraftDflowCheckboxList();
        waitForElement(getActionsOption());
        for (int i = 0; i < filesCount; i++) {
            waitForElement(getDraftDflowCheckboxList().get(i));
            clickOnDraftsCheckbox(i);
        }
        waitForElement(getActionsOption());
    }

    public void selectShowEntriesOption(int entriesCount) {
        waitAndSelect(selectFilesDisplayedLimit, "number:" + entriesCount);
    }

    public boolean isDraftFileIdExistsInDrafts(String fileId) {
        for (WebElement e : draftFileIds) {
            if (e.getText().equals(fileId))
                return true;
        }
        return false;
    }

    public void getdraftsFileIdsList() {
        for (WebElement e : draftFileIds) {
            e.getText();
        }
    }

    public boolean isDraftsListContainTypedQuery(String searchQuery) {
        for (WebElement e : draftFileIds) {
            if (e.getText().contains(searchQuery))
                return true;
        }
        return false;
    }

    public boolean isFileIdExistsInDraftsList(String movedFileId) {
        for (WebElement e : draftFileIds) {
            if (e.getText().equals(movedFileId))
                return true;
        }
        return false;
    }

    public void goToDrafts() {
        try {
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);", getDraftsFolder());
            waitForElement(getDraftsFolder());
            clickOnDrafts();
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }
}
