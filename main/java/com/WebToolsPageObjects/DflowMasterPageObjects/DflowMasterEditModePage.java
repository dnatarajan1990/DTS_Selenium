package com.WebToolsPageObjects.DflowMasterPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class DflowMasterEditModePage extends BaseMethods {

    public DflowMasterEditModePage(WebDriver driver) {
        super(driver);
    }

    int counter = 0;

    public static final String FILE_ID_EDIT_HEADER = "//div[@class='tab-pane ng-scope active']//view-file[@class='ng-scope ng-isolate-scope']//div[@class='ng-isolate-scope']//div[@class='tab-content']//div[@class='tab-pane ng-scope active']//div[@class='row ng-scope']//div[@class='col-md-7 col-lg-6']//div//input[@id='DI_10001']";
    public static final String FILE_ID_EDIT_TITLE = "//strong";
    public static final String FILE_ID_EDIT_TITLE_LIST = "//strong";
    public static final String FILE_FORMAT_HEADER = "//h5";
    public static final String VARIABLE_FORMAT_BUTTON = "//label[contains(@uib-btn-radio,'ZHV')]";
    public static final String FIXED_FORMAT_BUTTON = "//label[contains(@uib-btn-radio,'ZHF')]";
    public static final String POOL_TRANSFER_FORMAT_BUTTON = "//label[contains(@uib-btn-radio,'ZHD')]";
    public static final String FILE_IDENTIFIER = "DI_10001";
    public static final String SENDER_ROLE = "DI_10003";
    public static final String SENDER_MPID = "DI_10004";
    public static final String RECEIVER_ROLE = "DI_10005";
    public static final String RECEIVER_MPID = "DI_10006";
    public static final String TEST_FLAG = "DI_10011";
    public static final String FILE_ID_INCREMENTER = "//span[contains(@ng-click,'setNextFileID')]";
    public static final String MARK_AS_COMPLETE = "//button[contains(@ng-click,'ctrl.toggleMarkedAsComplete()')]";
   // public static final String MARK_AS_COMPLETE = "fv-markas";
    public static final String PRINT_BUTTON = "fv-print";
    public static final String SAVE_BUTTON = "fv-save";
    public static final String SEND_BUTTON = "fv-send";
    public static final String CLOSE_BUTTON = "//a[contains(@class, 'closebtn')]";
    public static final String CLOSE_FLOW_BUTTON = "(//a[contains(@ng-click, 'closeFlow')])[1]";
    //public static final String ADD_CHILD_BUTTON = "(//button[contains(@ng-if, 'Children')])[1]";
    public static final String ADD_CHILD_BUTTON= "//div[@class='tab-pane ng-scope active']//view-file[@class='ng-scope ng-isolate-scope']//div[@class='col-md-12 ng-scope']//div[@class='pull-right']//div[1]//button[1]";
    //public static final String CHILD_KIND = "//ul[contains(@ng-if,'allowedChildren')]/li/a)[1]";
    public static final String CHILD_KIND = "//div[@class='btn-group dropup open']//a[@class='ng-binding']";
    public static final String DOWNLOAD_BUTTON = "fv-download";
    public static final String DELETE_GROUP_BUTTON = "(//button[contains(@ng-click,'deleteGroup')])";
    public static final String ZH_HEADER = "(//a[contains(@ng-click,'setSelected')])[1]";
    public static final String L1_GROUP_HEADER = "//a[contains(@ng-class,'L1Group')]";
    public static final String L2_GROUP_HEADER = "//a[contains(@ng-class,'L2Group')]";
    public static final String L3_GROUP_HEADER = "//a[contains(@ng-class,'L3Group')]";
    public static final String L1_GROUP_ERROR_MESSAGE = "//p[contains(@ng-show, 'groupEditForm.DI3.$error.required')]";
    //public static final String L2_GROUP_ERROR_MESSAGE = "//p[contains(@ng-show, 'groupEditForm.DI4.$error.required')]";
    public static final String L2_GROUP_ERROR_MESSAGE= "//a[contains(@ng-click,'ctrl.setSelected(L1Group)')]";
    public static final String L3_GROUP_ERROR_MESSAGE1 = "//p[contains(@ng-show, 'groupEditForm.DI10.$error.required')]";
    public static final String L3_GROUP_ERROR_MESSAGE2 = "//p[contains(@ng-show, 'groupEditForm.DI173.$error.required')]";
    public static final String L3_GROUP_ERROR_MESSAGE3 = "//p[contains(@ng-show, 'groupEditForm.DI1012.$error.required')]";
    public static final String TAB_NAME = "//uib-tab-heading";
    public static final String L1_MPAN_CORE = "DI_3";
    public static final String L1_MPAN_13_DIGITS = "//p[text()='MPAN must contain 13 digits']";
    public static final String L1_MPAN_CHECKSUM_FAILED = "//p[text()='The MPAN is invalid. Checksum failed.']";
    //public static final String L2_METER_ID = "DI_4";
    public static final String L2_METER_ID="//input[@id='DI_1036']";
    public static final String NOT_A_VALID_CHAR = "//p[contains(text(),'Not a valid CHAR')]";
    public static final String L3_METER_REGISTER_ID = "DI_10";
    public static final String L3_REASON_FOR_REQUEST = "DI_173";
    public static final String L3_DATE_FAULT_SUSP_DETECT = "//button[contains(@ng-click, 'datePicker')]";
    public static final String L3_CHOOSE_CURRENT_DATE_FAULT = "//button[contains(@class, 'active')]";
    public static final String SENDING_CONFIRMATION_BUTTON = "//button[contains(@ng-if,'sendOnly')]";
    public static final String OK_BUTTON = "//button[contains(text(),'OK')]";
    public static final String FROM_PORTAL_HOST = "//a[contains(text(),'From: PH01')]";
    public static final String DESTINATED_PORTAL_HOST = "//a[contains(text(),'To: ELNKTESTPH')]";
    public static final String SUCCESSFULL_SAVING_A_FILE = "//div[contains(@class,'toast-success')]";
    public static final String SENDING_INCOMPLETE_FILE_ERROR = "//p[contains(text(),'not marked as completed')]";
    public static final String DISABLED_FORMATS = "//label[@disabled]";
    public static final String BSC_VALIDATION_STATUS = "//select[@id='DI_22']";
    public static final String SELECT_SEND_OPTION ="//a[contains(text(),'From: ELNKTESTPH')]";



    @FindBy(xpath = SELECT_SEND_OPTION)
    public WebElement selectSendOption;

    @FindBy(xpath = BSC_VALIDATION_STATUS)
    public WebElement bscValidationStatus;

    @FindBy(xpath = FILE_ID_EDIT_HEADER)
    public WebElement fileIdEditHeader;

    @FindBy(xpath = FILE_FORMAT_HEADER)
    public WebElement fileFormatHeader;

    @FindBy(xpath = FILE_ID_EDIT_TITLE)
    public WebElement fileIdEditTitle;

    @FindBy(xpath = FILE_ID_EDIT_TITLE_LIST)
    public List<WebElement> fileIdEditTitleList;

    @FindBy(xpath = TAB_NAME)
    public WebElement tabName;

    @FindBy(xpath = VARIABLE_FORMAT_BUTTON)
    public WebElement variableFormatBtn;

    @FindBy(xpath = SENDING_INCOMPLETE_FILE_ERROR)
    public WebElement sendingIncomplFileErr;

    @FindBy(xpath = FIXED_FORMAT_BUTTON)
    public WebElement fixedFormatBtn;

    @FindBy(xpath = POOL_TRANSFER_FORMAT_BUTTON)
    public WebElement poolTransferFormatBtn;

    @FindBy(xpath = FILE_ID_INCREMENTER)
    public WebElement fileIdIncrementer;

    @FindBy(xpath = SENDING_CONFIRMATION_BUTTON)
    public WebElement sendingConfirmationBtn;

    @FindBy(xpath = MARK_AS_COMPLETE)
    public WebElement markAsCompleteBtn;

    @FindBy(id = SAVE_BUTTON)
    public WebElement saveBtn;

    @FindBy(id = PRINT_BUTTON)
    public WebElement printBtn;

    @FindBy(id = SEND_BUTTON)
    public WebElement sendBtn;

    @FindBy(xpath = CLOSE_BUTTON)
    public WebElement closeBtn;

    @FindBy(xpath = CLOSE_FLOW_BUTTON)
    public WebElement closeFlowBtn;

    @FindBy(id = DOWNLOAD_BUTTON)
    public WebElement downloadBtn;

    @FindBy(xpath = OK_BUTTON)
    public WebElement okBtn;

    @FindBy(xpath = ADD_CHILD_BUTTON)
    public WebElement addChildBtn;

    @FindBy(xpath = DELETE_GROUP_BUTTON)
    public WebElement deleteGroupBtn;

    @FindBy(xpath = CHILD_KIND)
    public WebElement childKind;

    @FindBy(xpath = ZH_HEADER)
    public WebElement zhHeader;

    @FindBy(xpath = L1_GROUP_HEADER)
    public WebElement l1GroupHeader;

    @FindBy(xpath = L2_GROUP_HEADER)
    public WebElement l2GroupHeader;

    @FindBy(xpath = L3_GROUP_HEADER)
    public WebElement l3GroupHeader;

    @FindBy(id = L1_MPAN_CORE)
    public WebElement l1MpanCore;

    @FindBy(xpath = L1_MPAN_13_DIGITS)
    public WebElement l1Mpan13Digits;

    @FindBy(xpath = L1_MPAN_CHECKSUM_FAILED)
    public WebElement l1MpanChecksumFailed;

    @FindBy(xpath = L2_METER_ID)
    public WebElement l2MeterId;

    @FindBy(xpath = NOT_A_VALID_CHAR)
    public WebElement notAValidChar;

    @FindBy(id = L3_METER_REGISTER_ID)
    public WebElement l3MeterRegisterId;

    @FindBy(id = L3_REASON_FOR_REQUEST)
    public WebElement l3ReasonForRequest;

    @FindBy(xpath = L3_DATE_FAULT_SUSP_DETECT)
    public WebElement l3DateFault;

    @FindBy(xpath = L3_CHOOSE_CURRENT_DATE_FAULT)
    public WebElement l3ChooseCurrentDateFault;

    @FindBy(id = FILE_IDENTIFIER)
    public WebElement fileIdentifier;

    @FindBy(id = SENDER_MPID)
    public WebElement senderMpid;

    @FindBy(id = RECEIVER_MPID)
    public WebElement receiverMpid;

    @FindBy(id = SENDER_ROLE)
    public WebElement senderRole;

    @FindBy(id = RECEIVER_ROLE)
    public WebElement receiverRole;

    @FindBy(id = TEST_FLAG)
    public WebElement testFlag;

    @FindBy(xpath = L1_GROUP_ERROR_MESSAGE)
    public WebElement l1ErrorMessage;

    @FindBy(xpath = L2_GROUP_ERROR_MESSAGE)
    public WebElement l2ErrorMessage;

    @FindBy(xpath = L3_GROUP_ERROR_MESSAGE1)
    public WebElement l3ErrorMessage1;

    @FindBy(xpath = L3_GROUP_ERROR_MESSAGE2)
    public WebElement l3ErrorMessage2;

    @FindBy(xpath = L3_GROUP_ERROR_MESSAGE3)
    public WebElement l3ErrorMessage3;

    @FindBy(xpath = DESTINATED_PORTAL_HOST)
    public WebElement destinatedPortalHost;

    @FindBy(xpath = FROM_PORTAL_HOST)
    public WebElement fromPortalHost;

    @FindBy(xpath = SUCCESSFULL_SAVING_A_FILE)
    public WebElement successfullSavingFile;

    @FindBy(xpath = DISABLED_FORMATS)
    public List<WebElement> disabledFormats;

    public WebElement getFileIdEditHeaderLabel() {
        return fileIdEditHeader;
    }

    public WebElement getFileIdEditTitleLabel() {
        return fileIdEditTitle;
    }

    public WebElement getSenderMpid() {
        return senderMpid;
    }

    public String getSenderMpidValue() {
        return senderMpid.getText();
    }

    public WebElement getReceiverMpid() {
        return receiverMpid;
    }

    public String getReceiverMpidValue() {
        return receiverMpid.getText();
    }

    public WebElement getSenderRole() {
        return senderRole;
    }

    public String getSenderRoleValue() {
        return senderRole.getText();
    }

    public WebElement getReceiverRole() {
        return receiverRole;
    }

    public String getReceiverRoleValue() {
        return receiverRole.getText();
    }

    public WebElement getTestFlag() {
        return testFlag;
    }

    public WebElement getSuccessfullToast() {
        return successfullSavingFile;
    }

    public String getTestFlagValue() {
        return testFlag.getText();
    }

    public String getFileFormatHeader() {
        return fileFormatHeader.getText();
    }

    public WebElement getFileIdentifier() {
        return fileIdentifier;
    }

    public WebElement getCloseBtn() {
        return closeBtn;
    }

    public WebElement getL1GroupHeader() {
        return l1GroupHeader;
    }

    public WebElement getL2GroupHeader() {
        return l2GroupHeader;
    }

    public WebElement getL3GroupHeader() {
        return l3GroupHeader;
    }

    public WebElement getL1ErrorMessage() {
        return l1ErrorMessage;
    }

    public WebElement getL2ErrorMessage() {
        return l2ErrorMessage;
    }

    public WebElement getL3ErrorMessage1() {
        return l3ErrorMessage1;
    }

    public WebElement getL3ErrorMessage2() {
        return l3ErrorMessage2;
    }

    public WebElement getL3ErrorMessage3() {
        return l3ErrorMessage3;
    }

    public String getFileIdentifierValue() {
        return fileIdentifier.getText();
    }

    public String getTabNameValue() {
        return tabName.getText();
    }

    public String getFileIdHeader() {
        return fileIdEditHeader.getText();
    }

    public String getFileIdTitle() {
        return fileIdEditTitle.getText();
    }

    public String getL1MpanCoreValue() {
        return l1MpanCore.getText();
    }

    public WebElement getL1MpanCore() {
        return l1MpanCore;
    }

    public String getL2MeterIdValue() {
        return l2MeterId.getText();
    }

    public WebElement getL2MeterId() {
        return l2MeterId;
    }

    public String getL3MeterRegisterIdValue() {
        return l3MeterRegisterId.getText();
    }

    public WebElement getL3MeterRegisterId() {
        return l3MeterRegisterId;
    }

    public String getL3ReasonForRequestValue() {
        return l3ReasonForRequest.getText();
    }

    public WebElement getL3ReasonForRequest() {
        return l3ReasonForRequest;
    }

    public String getL3DateFaultSuspDetectValue() {
        return l3DateFault.getText();
    }

    public WebElement getL3DateFault() {
        return l3DateFault;
    }

    public WebElement getDownloadBtn() {
        return downloadBtn;
    }

    public WebElement getPrintBtn() {
        return printBtn;
    }

    public WebElement getFileIdIncrementer() {
        return fileIdIncrementer;
    }

    public WebElement getMarkAsCompleteBtn() {
        return markAsCompleteBtn;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getSendBtn() {
        return sendBtn;
    }

    public WebElement getAddChildBtn() {
        return addChildBtn;
    }

    public WebElement getChildKind() {
        return childKind;
    }

    public WebElement getDestinatedPortalHost() {
        return destinatedPortalHost;
    }

    public void typeFileIdentifier(String fileId) {
        waitAndType(fileIdentifier, fileId);
    }

    public void typeL1MpanCore(String mpanCore) {
        waitAndType(l1MpanCore, mpanCore);
    }

    public void typeL2MeterId(String meterId) {
        waitAndType(l2MeterId, meterId);
    }

    public void typeL3MeterRegisterId(String meterRegisterId) {
        waitAndType(l3MeterRegisterId, meterRegisterId);
    }

    public void typeL3ReasonForRequest(String reasonForRequest) {
        waitAndType(l3ReasonForRequest, reasonForRequest);
    }

    public void selectBSC(int listIndex) {
        Select select= new Select(bscValidationStatus);
        List<WebElement> allBSCValues= select.getOptions();
        select.selectByVisibleText(allBSCValues.get(listIndex).getText());
        allBSCValues.get(listIndex).getText();
    }
    public void chooseBscValue() {
        waitAndClick(bscValidationStatus);
        if (counter >= 1) {
            selectBSC(1);
        } else {
            selectBSC(2);
        }
        counter++;
    }

    public void typeL3DateFault() {
        waitAndClick(l3DateFault);
        waitAndClick(l3ChooseCurrentDateFault);
    }

    public void clickOnZhHeader() {
        waitAndClick(zhHeader);
    }

    public void clickOnFileIdIncrementer() {
        waitAndClick(fileIdIncrementer);
    }

    public void clickOnMarkAsComplete() {
        waitAndClick(markAsCompleteBtn);
    }

    public void clickOnOk() {
        waitAndClick(okBtn);
    }

    public void clickOnSave() {
        waitAndClick(saveBtn);
    }

    public void clickOnPrint() {
        waitAndClick(printBtn);
    }

    public void clickOnSend() {
        waitAndClick(sendBtn);

    }

    public void clickOnSendConfirmation() {
        waitAndClick(sendingConfirmationBtn);
    }

    public void clickOnClose() {
        waitAndClick(closeBtn);
    }

    public void clickOnCloseFlow() {
        waitAndClick(closeFlowBtn);
    }

    public void clickOnChild() {
        waitAndClick(addChildBtn);
    }

    public void clickOnChildKind() throws InterruptedException {
        waitForElement(childKind);
        waitAndClick(childKind);
    }

    public void clickOnDownload() {
        waitAndClick(downloadBtn);
    }

    public void clickOnVariable() {
        waitAndClick(variableFormatBtn);
    }

    public void clickOnFixed() {
        waitAndClick(fixedFormatBtn);
    }

    public void clickOnPoolTransfer() {
        waitAndClick(poolTransferFormatBtn);
    }

    public void clickOnDeleteGroup() {
        waitAndClick(deleteGroupBtn);
    }

    public void clickOnDestinatedPortalHost() {
        waitAndClick(destinatedPortalHost);
    }

    public void clickOnFromPortalHost() {
        waitAndClick(fromPortalHost);
    }

    public void clickOnSuccToast() {
        waitAndClick(successfullSavingFile);
    }

    public void saveFileOnPH01() throws InterruptedException {
        clickOnSave();
        waitForElement(getDestinatedPortalHost());
        clickOnDestinatedPortalHost();
        Thread.sleep(1000);
       /* waitForElement(getSuccessfullToast());
        assertTrue("Invalid or no toast notification appears on the screen!", getSuccessfullToast().isDisplayed());
        Thread.sleep(4000);*/
    }

    public void markAsComplete() throws InterruptedException {
        clickOnMarkAsComplete();
        waitForElement(getSuccessfullToast());
        assertTrue("Invalid or no toast notification appears on the screen!", getSuccessfullToast().isDisplayed());
    }

    public int getDisabledFormatCount() {
        return disabledFormats.size();
    }

    public boolean isFileTitleMatches(String fileTitle) {
        for (WebElement e : fileIdEditTitleList) {
            if (e.getText().contains(fileTitle)) {
                return true;
            }
        }
        return false;
    }
}
