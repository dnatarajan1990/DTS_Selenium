package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by iwanicki on 13.11.2017.
 */
public class PortalHostTrashPage extends BaseMethods {

    public PortalHostTrashPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Created by iwanicki on 03.11.2017.
     */
    public static final String FLOW = "//select";
    public static final String TRASH = "//div[@id='collapseELNKTESTPH']/ul/li[@folder='Trash']";
    public static final String CREATE_BUTTON = "//button[contains(@class, 'btn-success')]";
    public static final String RESET_BUTTON = "//button[contains(@ng-click, 'clickOnReset')]";
    public static final String ACTIONS = "//button[contains(text(),'Action')]";
    public static final String SELECT_ALL_FILES_IN_FOLDER = "(//li[contains(@ng-click,'selectAll')])[1]";
    public static final String DESELECT_ALL_FILES_IN_FOLDER = "//li[contains(@ng-click,'deselectAll')]";
    public static final String EXTRACT_TO_CSV_AND_DOWNLOAD = "//a[contains(@aria-label,'CSV')]";
    public static final String EXTRACT_TO_ZIP_AND_DOWNLOAD = "//li[contains(@ng-click,'openZip')]";
    public static final String PERMANENTLY_DELETE_FILES = "//li[contains(@ng-click,'deleteSelected')]";
    public static final String DELETING_CONFIRMATION = "//button[contains(@ng-click,'ok')]";
    public static final String TRASH_DFLOW_CHECKBOX = "//input[contains(@ng-click,'selectRow')]";
    public static final String SEARCH_INPUT = "//input[contains(@ng-model,'searchText')]";
    public static final String FILES_IN_TRASH = "//div[contains(@ng-click,'select')]//strong[not(contains(text(),'HI'))]";
    public static final String SELECT_FILES_DISPLAYED_LIMIT = "//select[contains(@ng-model,'limit')]";

    @FindBy(xpath = FLOW)
    public WebElement flows;

    @FindBy(xpath = TRASH)
    public WebElement trash_folder;

    @FindBy(xpath = ACTIONS)
    public WebElement actionsBtn;

    @FindBy(xpath = SELECT_ALL_FILES_IN_FOLDER)
    public WebElement selectAllInFolderOption;

    @FindBy(xpath = DESELECT_ALL_FILES_IN_FOLDER)
    public WebElement deselectAllInFolderOption;

    @FindBy(xpath = EXTRACT_TO_CSV_AND_DOWNLOAD)
    public WebElement extractToCSVAndDownloadOption;

    @FindBy(xpath = EXTRACT_TO_ZIP_AND_DOWNLOAD)
    public WebElement extractToZIPAndDownloadOption;

    @FindBy(xpath = PERMANENTLY_DELETE_FILES)
    public WebElement permanentlyDeleteFilesOption;

    @FindBy(xpath = DELETING_CONFIRMATION)
    public WebElement deletingConfirmation;

    @FindBy(xpath = SEARCH_INPUT)
    public WebElement searchInput;

    @FindBy(xpath = SELECT_FILES_DISPLAYED_LIMIT)
    public WebElement selectFilesDisplayedLimit;

    @FindBy(xpath = TRASH_DFLOW_CHECKBOX)
    public List<WebElement> trashFileChckbxs;

    @FindBy(xpath = FILES_IN_TRASH)
    public List<WebElement> trashFileIds;


    public void clickOnTrash() {
        waitAndClick(trash_folder);
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
    public void clickOnTrashCheckbox(int checkboxIndex) {
        waitAndClick(getTrashCheckboxList().get(checkboxIndex));
    }
    public void clickExtractToCsvAndDownload() {
        waitAndClick(extractToCSVAndDownloadOption);
    }
    public void clickOnExtractToZIPAndDownload() {
        waitAndClick(extractToZIPAndDownloadOption);
    }
    public void permanentlyDeleteFile() throws InterruptedException{
        waitAndClick(permanentlyDeleteFilesOption);
        waitForElement(deletingConfirmation);
        waitAndClick(deletingConfirmation);
    }
    public void typeSearchQuery(String searchQuery){
        waitAndType(searchInput,searchQuery);
    }
    public int getInboxCheckboxesCount(){
        return trashFileChckbxs.size();
    }
    public List<WebElement> getTrashCheckboxList(){
        return trashFileChckbxs;
    }
    public void goToTrash(){
        try {
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);", trash_folder);
            waitForElement(trash_folder);
            clickOnTrash();
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }
    public boolean isTrashListContainTypedQuery(String searchQuery){
        for(WebElement e : trashFileIds) {
            if (e.getText().contains(searchQuery))
                return true;
        }
        return false;
    }
    public void selectShowEntriesOption(int entriesCount){
        waitAndSelect(selectFilesDisplayedLimit,"number:"+entriesCount);
    }

    public boolean isFileIdExistsInTrash(String fileId){
        for(WebElement e : trashFileIds) {
            if (e.getText().equals(fileId))
                return true;
        }
        return false;
    }

    public void selectSingleFile() throws InterruptedException{
        getTrashCheckboxList();
        waitForElement(actionsBtn);
        waitForElement(getTrashCheckboxList().get(0));
        clickOnTrashCheckbox(0);
        waitForElement(actionsBtn);
    }
    public void selectMultipleFiles(int filesCount)  throws InterruptedException{
        getTrashCheckboxList();
        waitForElement(actionsBtn);
        for(int i=0; i<filesCount; i++) {
            waitForElement(getTrashCheckboxList().get(i));
            clickOnTrashCheckbox(i);
        }
        waitForElement(actionsBtn);
    }
}

