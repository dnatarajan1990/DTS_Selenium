package com.WebToolsPageObjects.DflowMasterPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class DFlowMasterEditorPage extends BaseMethods {

    public DFlowMasterEditorPage(WebDriver driver) {
        super(driver);
    }


    public static final String FILE_ID = "userFileRef";
    public static final String INCREMENT_FILE_ID_BUTTON = "//button[contains(@ng-click, 'setNextFileId')]";
    public static final String FROM_MPID = "fromMpidInput";
    public static final String FROM_ROLE = "fromRoleInput";
    public static final String FROM_ROLE_OPTION = "(//label[@for='fromRoleInput']/../div/ul/li)[1]";
    public static final String TO_MPID = "toMpidInput";
    public static final String TO_ROLE = "toRoleInput";
    public static final String TO_ROLE_OPTION = "(//label[@for='toRoleInput']/../div/ul/li)[1]";
    public static final String TEST_FLAG = "testFlagInput";
    public static final String FLOW = "//select";
    public static final String CREATE_BUTTON = "//button[contains(@class, 'btn btn-success')]";
    public static final String RESET_BUTTON = "//button[contains(@ng-click, 'reset')]";
    public static final String VIEW_OPENED_FILES_BUTTON = "//button[contains(@ng-click, 'showOverlay')]";
    public static final String OPEN_FILE_FROM_PC_BUTTON = "//button[contains(@ng-click,'openFileModal')]";
    public static final String OPEN_FILE_CONFIRMATION_BUTTON = "//button[contains(@ng-click, 'ok')]";
    public static final String SELECT_FILES_BUTTON = "//button[contains(@ng-model,'files')]";
    public static final String OPENED_FILES_SECTION_POPUP = "//tr[contains(@ng-repeat,'files')]";
    public static final String REQUIRED_ERROR = "//p[contains(text(),'Required')]";
    public static final String READONLY_FIELDS = "//input[@readonly='readOnly']|//select[@readonly='readOnly']";


    int counter = 0;

    @FindBy(id = FILE_ID)
    public WebElement fileIdInput;

    @FindBy(xpath = INCREMENT_FILE_ID_BUTTON)
    public WebElement incrementFileIdBtn;

    @FindBy(xpath = VIEW_OPENED_FILES_BUTTON)
    public WebElement viewOpenedFilesBtn;

    @FindBy(xpath = OPEN_FILE_FROM_PC_BUTTON)
    public WebElement openFileFromPCBtn;

    @FindBy(xpath = OPEN_FILE_CONFIRMATION_BUTTON)
    public WebElement openFileOkBtn;

    @FindBy(xpath = OPENED_FILES_SECTION_POPUP)
    public WebElement openedFilesPopupSection;

    @FindBy(xpath = SELECT_FILES_BUTTON)
    public WebElement selectFilesBtn;

    @FindBy(xpath = FLOW)
    public WebElement flows;

    @FindBy(id = FROM_MPID)
    public WebElement fromMPIDInput;

    @FindBy(id = FROM_ROLE)
    public WebElement fromRoleInput;

    @FindBy(xpath = FROM_ROLE_OPTION)
    public WebElement fromRoleOption;

    @FindBy(id = TO_MPID)
    public WebElement toMPIDInput;

    @FindBy(id = TO_ROLE)
    public WebElement toRoleInput;

    @FindBy(xpath = TO_ROLE_OPTION)
    public WebElement toRoleOption;

    @FindBy(id = TEST_FLAG)
    public WebElement testFlagInput;

    @FindBy(xpath = CREATE_BUTTON)
    public WebElement createBtn;

    @FindBy(xpath = RESET_BUTTON)
    public WebElement resetBtn;

    @FindBy(xpath = REQUIRED_ERROR)
    public List<WebElement> requiredErr;

    @FindBy(xpath = READONLY_FIELDS)
    public List<WebElement> readOnlyFields;

    public void clickAndTypeFileId(String fileId) {
        waitAndType(fileIdInput, fileId);
    }

    public void clickFlow() {
        waitAndClick(flows);
    }

    public void eraseFileIdField() {
        fileIdInput.click();
        fileIdInput.clear();
    }

    public void clickAndTypeFromMpid(String fromMpid) {
        waitAndType(fromMPIDInput, fromMpid);
    }

    public void clickAndTypeFlowId(String flowid) { waitAndType(flows,flowid);}

    public void clickAndTypeFromRole(String fromRole) {
        waitAndType(fromRoleInput, fromRole);
        waitAndClick(fromRoleOption);
    }

    public void clickAndTypeToMpid(String toMpid) {
        waitAndType(toMPIDInput, toMpid);
    }

    public void clickAndTypeToRole(String toRole) {
        waitAndType(toRoleInput, toRole);
        waitAndClick(toRoleOption);
    }

    public void clickAndTypeTestFlag(String testFlag) {
        waitAndType(testFlagInput, testFlag);
    }

    public void clickCreateButton() {
        waitAndClick(createBtn);
    }

    public void clickResetButton() {
        waitAndClick(resetBtn);
    }

    public void clickIncrementFileIdButton() {
        waitAndClick(incrementFileIdBtn);
    }

    public void clickViewOpenedFiles() {
        waitAndClick(viewOpenedFilesBtn);
    }

    public void clickOpenFileFromPC() {
        waitAndClick(openFileFromPCBtn);
    }

    public void clickOpenFileConfirmation() {
        waitAndClick(openFileOkBtn);
    }

    public void clickOnSelectFiles() {
        waitAndClick(selectFilesBtn);
    }

    public String getFileId() {
        return fileIdInput.getText();
    }

    public String getFromMpid() {
        return fromMPIDInput.getText();
    }

    public String getToMpid() {
        return toMPIDInput.getText();
    }

    public String getFromRole() {
        return fromRoleInput.getText();
    }

    public String getToRole() {
        return toRoleInput.getText();
    }

    public String getTestFlagText() {
        return testFlagInput.getText();
    }

    public String getFileIdValue() {
        return fileIdInput.getAttribute("value");
    }

    public String getFromMpidValue() {
        return fromMPIDInput.getAttribute("value");
    }

    public String getToMpidValue() {
        return toMPIDInput.getAttribute("value");
    }

    public String getFromRoleValue() {
        return fromRoleInput.getAttribute("value");
    }

    public String getToRoleValue() {
        return toRoleInput.getAttribute("value");
    }

    public String getTestFlagTextValue() {
        return testFlagInput.getAttribute("value");
    }

    public WebElement getFileIdField() {
        return fileIdInput;
    }

    public WebElement getFlowField() {
        return flows;
    }

    public WebElement getFromMpidField() {
        return fromMPIDInput;
    }

    public WebElement getToMpidField() {
        return toMPIDInput;
    }

    public WebElement getToRoleField() {
        return toRoleInput;
    }

    public WebElement getFromRoleField() {
        return fromRoleInput;
    }

    public WebElement getTestFlag() {
        return testFlagInput;
    }

    public WebElement getResetBtn() {
        return resetBtn;
    }

    public WebElement getCreateBtn() {
        return createBtn;
    }

    public WebElement getViewOpenedFilesBtn() {
        return viewOpenedFilesBtn;
    }

    public void selectDflow(int listIndex) {
        WebElement selectDflowElement = driver.findElement(By.xpath("//select"));
        Select select = new Select(selectDflowElement);
        List<WebElement> allDFlows = select.getOptions();
        select.selectByVisibleText(allDFlows.get(listIndex).getText());
        //for(int counter=0; counter<allDFlows.size();counter++){
        //    System.out.println(allDFlows.get(counter).getText());
        //}
        allDFlows.get(listIndex).getText();
    }

    public void chooseDflow() {
        waitAndClick(flows);
        if (counter >= 1) {
            selectDflow(51);
        } else {
            selectDflow(51);
        }
        counter++;
    }

    public void typeAllFieldsOnDFlowEditor(String validFileId, String validFromMpid, String validFromRole,
                                           String validToMpid, String validToRole, String testFlag) throws InterruptedException {
        //assertTrue("FileID value doesn't match to the regex for that field!",dFlowMasterEditorPage.verifyRegexp(FILE_ID_REGEX,VALID_FILE_ID));
        //assertTrue("FileID value doesn't match to the regex for that field!",dFlowMasterEditorPage.verifyRegexp(FILE_ID_REGEX,INVALID_FILE_ID));
        waitForElement(getFileIdField());
        assertTrue("File ID field isn't displayed!", getFileIdField().isDisplayed());
        assertTrue("Flow field isn't displayed!", getFlowField().isDisplayed());
        assertTrue("From MPID field isn't displayed!", getFromMpidField().isDisplayed());
        assertTrue("To MPID field isn't displayed!", getToMpidField().isDisplayed());
        assertTrue("From role field isn't displayed!", getFromRoleField().isDisplayed());
        assertTrue("To role field isn't displayed!", getToRoleField().isDisplayed());
        assertTrue("Test flag field isn't displayed!", getTestFlag().isDisplayed());
        clickAndTypeFileId(validFileId);
        waitForElement(getFlowField());
        chooseDflow();
         waitForElement(getFromMpidField());
        clickAndTypeFromMpid(validFromMpid);
        waitForElement(getToMpidField());
        clickAndTypeToMpid(validToMpid);
        waitForElement(getFromRoleField());
        clickAndTypeFromRole(validFromRole);
        waitForElement(getToRoleField());
        clickAndTypeToRole(validToRole);
        waitForElement(getTestFlag());
        clickAndTypeTestFlag(testFlag);
    }

    public int getRequiredErrorsCount() {
        return requiredErr.size();
    }

    public int getReadOnlyFieldsCount() {
        return readOnlyFields.size();
    }
}
