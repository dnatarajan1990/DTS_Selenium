package com.WebToolsPageObjects.AuditPageObjects;

import com.CommonPages.BaseMethods;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class AuditMsgsPage extends BaseMethods {

    public AuditMsgsPage(WebDriver driver) {
        super(driver);
    }

    private static final String LOCAL_GATEWAY = "//select[contains(@ng-model,'criteria.localGateway')]";
    private static final String OTHER_GATEWAY = "otherGateway";
    private static final String FORMAT = "format";
    private static final String MESSAGE_STATE = "messageState";
    private static final String LOCAL_HOST = "localHost";
    private static final String LOCAL_MPID = "localMpid";
    private static final String OTHER_MPID = "otherMpid";
    private static final String LOCAL_ROLE = "localRole";
    private static final String OTHER_ROLE = "otherRole";
    private static final String FILE_NAME = "fileName";
    private static final String MPAN = "//input[contains(@ng-model,'tracked')]";
    private static final String FLOW = "flow";
    private static final String FLOW_VERSION = "flowVersion";
    private static final String TEST_FLAG = "testFlagInput";
    private static final String FILE_ID = "userFileId";
    private static final String FROM_DATE = "fromDate";
    private static final String TO_DATE = "toDate";
    private static final String HEARTBEATS_CHECKBOX = "//input[contains(@ng-model,'heartbeat')]";
    private static final String SEARCH_BUTTON = "//button[contains(@ng-click,'search')]";
    private static final String SAVE_CRITERIA_BUTTON = "//button[contains(@ng-click,'saveCriteria')]";
    private static final String SAVE_CRITERIA_CONFIRMATION = "//button[contains(@ng-click,'ok')]";
    public static final String SUCCESSFULLY_SAVED_CRITERIA_TOAST_MESSAGE = "//div[@class='toast-message' and contains(text(),'criteria saved')]";
    public static final String SUCCESSFULLY_DOWNLOADED_FILE_TOAST_MESSAGE = "//div[contains(text(),'File downloaded successfully')]";
    public static final String MORE_THAN_2000_ROWS_WARNING = "//div[contains(@aria-label,'more than 2000 rows')]";
    private static final String EXTRACT_BUTTON = "//button[@data-toggle='dropdown' and contains(text(),'Extract')]";
    private static final String RECORDS_AND_VALIDATIONS_OPTION = "//a[contains(@ng-click,'extract')]";
    private static final String EXTRACT_AUDIT_RECORDS_BUTTON = "//button[contains(@ng-click,'AuditRecords')]";
    private static final String EXTRACT_VALIDATION_RESULTS_BUTTON = "//button[contains(@ng-click,'ValidationResults')]";
    private static final String VALIDATION_EXTACT_TYPE_ON_LIST = "//td[text()='validation']";
    private static final String AUDIT_EXTACT_TYPE_ON_LIST = "//td[text()='audit']";
    //public static final String VALIDATION_EXTRACT_STATUS = "(//td[text()='validation']/../td)[5]";
    public static final String VALIDATION_EXTRACT_STATUS = "//td[contains(text(),'Pending')]";
    public static final String AUDIT_EXTACT_STATUS = "(//td[text()='audit']/../td)[5]";
    private static final String VALIDATION_RESULTS_DOWNLOAD_BUTTON = "//td[text()='validation']/../td/button";
    private static final String AUDIT_RECORDS_DOWNLOAD_BUTTON = "//td[text()='audit']/../td/button";
    private static final String DOWNLOAD_FLOWS_OPTION = "//a[contains(@ng-click,'exportZip')]";
    private static final String DOWNLOAD_ACKNOWLEDGEMENTS_OPTION = "//a[contains(@ng-click,'exportAcks')]";
    private static final String DISABLED_OPTIONS = "//li[contains(@class,'disabled')]";
    private static final String SAVE_TO_HOST_BUTTON = "fv-save";
    private static final String SHOW_ENTRIES_SELECT = "//select[contains(@ng-model,'itemsByPage')]";
    private static final String MESSAGES_COUNT = "//span[contains(text(),'messages')]";
    private static final String TABLE_QUERY = "//table[@table-search='query']";
    private static final String TABLE_QUERY_HEADER_LIST = "//th";
    private static final String GATEWAY_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[2]";
    private static final String DATE_TIME_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[3]";
    private static final String DIRECTION_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[5]";
    private static final String FILE_ID_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[6]";
    private static final String FLOW_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[7]";
    private static final String FLOW_VERSION_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[8]";
    private static final String TEST_FLAG_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[9]";
    private static final String FROM_MPID_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[10]";
    private static final String FROM_ROLE_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[11]";
    private static final String TO_MPID_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[12]";
    private static final String TO_ROLE_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[13]";
    private static final String STATE_SEARCH_RESULTS_LIST = "//table[@table-search='query']//td[16]";
    private static final String AUDIT_MESSAGES_CHECKBOX_LIST = "//input[contains(@ng-click,'row.selected')]";
    public static final String FIRST_ACTIONS_BUTTON = "(//td[@class='col-btn']/div/button[@data-toggle='dropdown'])[1]";
    private static final String SHOW_MESSAGE_DETAILS_BUTTON = "//table[@class='table table-striped table-bordered table-hover table-condensed margin-bottom-10 ng-isolate-scope']//li[1]";
    private static final String MPAN_UPRN_LIST_BUTTON = "(//li[contains(@ng-click,'viewTracked')])[1]";
    private static final String MPAN_UPRN_LIST_HEADER = "//table[contains(@ng-show,'loadedData')]//th";
    private static final String MPAN_UPRN_LIST_MPAN_VALUE = "//tr[contains(@ng-repeat,'$index')]";
    private static final String DOWNLOAD_ACKNOWLEDGEMENT_BUTTON = "(//a[contains(@ng-click,'downloadFlow')])[2]";
    private static final String DOWNLOAD_FLOW_BUTTON = "(//a[contains(@ng-click,'downloadFlow')])[1]";
    private static final String MODAL_CLOSE_BUTTON = "//button[contains(@ng-click,'cancel')]";
    private static final String MODAL_DOWNLOAD_BUTTON = "//a[contains(@ng-click,'download')]";
    private static final String MODAL_DOWNLOAD_BUTTON2 = "//button[contains(@ng-click,'download')]";
    private static final String MODAL_TITLE = "//h3[@class='modal-title']";
    private static final String MESSAGE_DETAILS_FILE_NAME = "//div[contains(@class,'filename')]";
    private static final String MESSAGE_DETAILS_MPAN_FILE_ID = "//strong[text()='File ID:']/../../div[2]";
    private static final String MESSAGE_DETAILS_FROM_MPID_ROLE = "//strong[text()='From MPID/Role:']/../../div[2]";
    private static final String MESSAGE_DETAILS_TO_MPID_ROLE = "//strong[text()='To MPID/Role:']/../../div[4]";
    private static final String MESSAGE_DETAILS_MESSAGE_STATE = "//strong[text()='Msg State:']/../../div[2]";
    private static final String MESSAGE_DETAILS_FROM_GATEWAY_HOST = "//strong[text()='From Gateway/Host:']/../../div[2]";
    private static final String MESSAGE_DETAILS_TO_GATEWAY_HOST = "//strong[text()='To Gateway/Host:']/../../div[4]";
    private static final String MESSAGE_DETAILS_MPAN_FLOW_F_VERSION = "//strong[text()='Flow/Version:']/../../div[2]";
    private static final String MESSAGE_DETAILS_TEST_FLAG = "//strong[text()='TestFlag:']/../../div[4]";
    private static final String BOTH_DIRECTIONS_RADIO_BUTTON = "direction-0";
    private static final String SEND_DIRECTION_RADIO_BUTTON = "direction-1";
    private static final String RECEIVED_DIRECTION_RADIO_BUTTON = "direction-2";
    private static final String RESET_BUTTON = "//button[contains(@ng-click,'clearForm')]";
    private static final String ENTRIES_BUTTON="//select[contains(@ng-change,'itemsByPageList')]";
    private static final String CHECKBOX_SELECT= "//input[contains(@ng-click,'checkAll')]";



    @FindBy(xpath = CHECKBOX_SELECT)
    public WebElement checkboxSeclet;

    @FindBy(xpath = LOCAL_GATEWAY)
    public WebElement localGateway;

    @FindBy(xpath = ENTRIES_BUTTON)
    public WebElement entriesButton;

    @FindBy(id = OTHER_GATEWAY)
    public WebElement otherGateway;

    @FindBy(id = FORMAT)
    public WebElement format;

    @FindBy(id = MESSAGE_STATE)
    public WebElement messageState;

    @FindBy(id = LOCAL_HOST)
    public WebElement localHost;

    @FindBy(id = LOCAL_MPID)
    public WebElement localMpid;

    @FindBy(id = OTHER_MPID)
    public WebElement otherMpid;

    @FindBy(id = LOCAL_ROLE)
    public WebElement localRole;

    @FindBy(id = OTHER_ROLE)
    public WebElement otherRole;

    @FindBy(id = FILE_NAME)
    public WebElement fileName;

    @FindBy(xpath = MPAN)
    public WebElement mpan;

    @FindBy(id = FLOW)
    public WebElement flow;

    @FindBy(id = FLOW_VERSION)
    public WebElement flowVersion;

    @FindBy(id = TEST_FLAG)
    public WebElement testFlag;

    @FindBy(id = FILE_ID)
    public WebElement fileId;

    @FindBy(id = FROM_DATE)
    public WebElement fromDate;

    @FindBy(id = TO_DATE)
    public WebElement toDate;

    @FindBy(xpath = SHOW_ENTRIES_SELECT)
    public WebElement showEntriesSelect;

    @FindBy(xpath = HEARTBEATS_CHECKBOX)
    public WebElement heartbeatsChkbx;

    @FindBy(xpath = FIRST_ACTIONS_BUTTON)
    public WebElement firstActionsBtn;

    @FindBy(xpath = SHOW_MESSAGE_DETAILS_BUTTON)
    public WebElement showMsgDetailsOption;

    @FindBy(xpath = MPAN_UPRN_LIST_BUTTON)
    public WebElement mpanUprnListOption;

    @FindBy(xpath = MPAN_UPRN_LIST_HEADER)
    public WebElement mpanUprnListHeader;

    @FindBy(xpath = MPAN_UPRN_LIST_MPAN_VALUE)
    public WebElement mpanUprnListMpanValue;

    @FindBy(xpath = DOWNLOAD_FLOW_BUTTON)
    public WebElement downloadFlowButton;

    @FindBy(xpath = DOWNLOAD_ACKNOWLEDGEMENT_BUTTON)
    public WebElement downloadAckButton;

    @FindBy(xpath = MODAL_CLOSE_BUTTON)
    public WebElement modalCloseBtn;

    @FindBy(xpath = MODAL_DOWNLOAD_BUTTON)
    public WebElement modalDownloadBtn;

    @FindBy(xpath = MODAL_DOWNLOAD_BUTTON2)
    public WebElement modalDownloadBtn2;

    @FindBy(xpath = MODAL_TITLE)
    public WebElement modalTitle;

    @FindBy(xpath = MESSAGE_DETAILS_MPAN_FILE_ID)
    public WebElement messageDetailsMpanFileId;

    @FindBy(xpath = MESSAGE_DETAILS_FILE_NAME)
    public WebElement messageDetailsFileName;

    @FindBy(xpath = MESSAGE_DETAILS_MPAN_FLOW_F_VERSION)
    public WebElement messageDetailsMpanFlowVersion;

    @FindBy(xpath = MESSAGE_DETAILS_TEST_FLAG)
    public WebElement messageDetailsTestFlag;

    @FindBy(xpath = MESSAGE_DETAILS_FROM_GATEWAY_HOST)
    public WebElement messageDetailsFromGatewayHost;

    @FindBy(xpath = MESSAGE_DETAILS_TO_GATEWAY_HOST)
    public WebElement messageDetailsToGatewayHost;

    @FindBy(xpath = MESSAGE_DETAILS_FROM_MPID_ROLE)
    public WebElement messageDetailsFromMpidRole;

    @FindBy(xpath = MESSAGE_DETAILS_TO_MPID_ROLE)
    public WebElement messageDetailsToMpidRole;

    @FindBy(xpath = MESSAGE_DETAILS_MESSAGE_STATE)
    public WebElement messageDetailsMessageState;

    @FindBy(id = BOTH_DIRECTIONS_RADIO_BUTTON)
    public WebElement bothRadioBtn;

    @FindBy(id = SEND_DIRECTION_RADIO_BUTTON)
    public WebElement sendRadioBtn;

    @FindBy(id = RECEIVED_DIRECTION_RADIO_BUTTON)
    public WebElement receivedRadioBtn;

    @FindBy(xpath = MESSAGES_COUNT)
    public WebElement messagesCount;

    @FindBy(xpath = TABLE_QUERY)
    public WebElement tableQuery;

    @FindBy(xpath = DISABLED_OPTIONS)
    public List<WebElement> disabledOptionsList;

    @FindBy(xpath = TABLE_QUERY_HEADER_LIST)
    public List<WebElement> tableQueryHdrList;

    @FindBy(xpath = AUDIT_MESSAGES_CHECKBOX_LIST)
    public List<WebElement> auditMsgsCheckboxList;

    @FindBy(xpath = GATEWAY_SEARCH_RESULTS_LIST)
    public List<WebElement> gatewaySearchResultsList;

    @FindBy(xpath = DATE_TIME_SEARCH_RESULTS_LIST)
    public List<WebElement> dateTimeSearchResultsList;

    @FindBy(xpath = DIRECTION_SEARCH_RESULTS_LIST)
    public List<WebElement> directionSearchResultsList;

    @FindBy(xpath = FILE_ID_SEARCH_RESULTS_LIST)
    public List<WebElement> fileIdSearchResultsList;

    @FindBy(xpath = FLOW_SEARCH_RESULTS_LIST)
    public List<WebElement> flowSearchResultsList;

    @FindBy(xpath = FLOW_VERSION_SEARCH_RESULTS_LIST)
    public List<WebElement> flowVersionSearchResultsList;

    @FindBy(xpath = TEST_FLAG_SEARCH_RESULTS_LIST)
    public List<WebElement> testFlagSearchResultsList;

    @FindBy(xpath = FROM_MPID_SEARCH_RESULTS_LIST)
    public List<WebElement> fromMpidSearchResultsList;

    @FindBy(xpath = FROM_ROLE_SEARCH_RESULTS_LIST)
    public List<WebElement> fromRoleSearchResultsList;

    @FindBy(xpath = TO_MPID_SEARCH_RESULTS_LIST)
    public List<WebElement> toMpidSearchResultsList;

    @FindBy(xpath = TO_ROLE_SEARCH_RESULTS_LIST)
    public List<WebElement> toRoleSearchResultsList;

    @FindBy(xpath = STATE_SEARCH_RESULTS_LIST)
    public List<WebElement> stateSearchResultsList;

    @FindBy(xpath = SEARCH_BUTTON)
    public WebElement searchBtn;

    @FindBy(xpath = SAVE_CRITERIA_BUTTON)
    public WebElement saveCriteriaBtn;

    @FindBy(xpath = SAVE_CRITERIA_CONFIRMATION)
    public WebElement saveCriteriaConfirmation;

    @FindBy(xpath = SUCCESSFULLY_SAVED_CRITERIA_TOAST_MESSAGE)
    public WebElement succSavedCritToastMsg;

    @FindBy(xpath = SUCCESSFULLY_DOWNLOADED_FILE_TOAST_MESSAGE)
    public WebElement succDownloadedFileToastMsg;

    @FindBy(xpath = MORE_THAN_2000_ROWS_WARNING)
    public WebElement moreThan2000RowsWarningMsg;

    @FindBy(xpath = EXTRACT_BUTTON)
    public WebElement extractBtn;

    @FindBy(xpath = RECORDS_AND_VALIDATIONS_OPTION)
    public WebElement recAndValidOption;

    @FindBy(xpath = EXTRACT_AUDIT_RECORDS_BUTTON)
    public WebElement extractAuditRecordsBtn;

    @FindBy(xpath = EXTRACT_VALIDATION_RESULTS_BUTTON)
    public WebElement extractValidationResultsBtn;

    @FindBy(xpath = VALIDATION_EXTACT_TYPE_ON_LIST)
    public WebElement validationExtractType;

    @FindBy(xpath = AUDIT_EXTACT_TYPE_ON_LIST)
    public WebElement auditExtractType;

    @FindBy(xpath = VALIDATION_EXTRACT_STATUS)
    public WebElement validationExtractStatus;

    @FindBy(xpath = AUDIT_EXTACT_STATUS)
    public WebElement auditExtractStatus;

    @FindBy(xpath = VALIDATION_RESULTS_DOWNLOAD_BUTTON)
    public WebElement validationResultsDownloadBtn;

    @FindBy(xpath = AUDIT_RECORDS_DOWNLOAD_BUTTON)
    public WebElement auditRecordsDownloadBtn;

    @FindBy(xpath = DOWNLOAD_FLOWS_OPTION)
    public WebElement downloadFlowsOption;

    @FindBy(xpath = DOWNLOAD_ACKNOWLEDGEMENTS_OPTION)
    public WebElement downloadAckOption;

    @FindBy(id = SAVE_TO_HOST_BUTTON)
    public WebElement saveToHostBtn;

    @FindBy(xpath = RESET_BUTTON)
    public WebElement resetBtn;



    public int getMessagesCountValue() {
        return Integer.parseInt(messagesCount.getText().substring(0, messagesCount.getText().lastIndexOf("m") - 1));

           }

    public String getMsgDetailsMessageStateValue() {
        return messageDetailsMessageState.getText();
    }

    public String getMsgDetailsFileName() {
        return messageDetailsFileName.getText();
    }

    public String getMsgDetailsMpanFileId() {
        return messageDetailsMpanFileId.getText();
    }

    public String getMsgDetailsTestFlag() {
        return messageDetailsTestFlag.getText();
    }

    public String getMsgDetailsMpanFlowVersion() {
        return messageDetailsMpanFlowVersion.getText();
    }

    public String getMsgDetailsFromGatewayHost() {
        return messageDetailsFromGatewayHost.getText();
    }

    public String getMsgDetailsToGatewayHost() {
        return messageDetailsToGatewayHost.getText();
    }

    public String getMsgDetailsFromMpidRole() {
        return messageDetailsFromMpidRole.getText();
    }

    public String getMsgDetailsToMpidRole() {
        return messageDetailsToMpidRole.getText();
    }

    public String getMpanUprnListMpanValue() {
        return mpanUprnListMpanValue.getText();
    }

    public String getValidationExtractTypeValue() {
        return validationExtractType.getText();
    }

    public String getValidationExtractStatusValue() {
        return validationExtractStatus.getText();
    }

    public String getAuditExtractTypeValue() {
        return auditExtractType.getText();
    }

    public String getAuditExtractStatusValue() {
        return auditExtractStatus.getText();
    }

    public String getLocalGatewayValue() {
        return localGateway.getAttribute("value");
    }

    public String getOtherGatewayValue() {
        return otherGateway.getAttribute("value");
    }

    public String getLocalHostValue() {
        return localHost.getAttribute("value");
    }

    public String getLocalMpidValue() {
        return localMpid.getAttribute("value");
    }

    public String getOtherMpidValue() {
        return otherMpid.getAttribute("value");
    }

    public String getLocalRoleValue() {
        return localRole.getAttribute("value");
    }

    public String getOtherRoleValue() {
        return otherRole.getAttribute("value");
    }

    public String getFlowValue() {
        return flow.getAttribute("value");
    }

    public String getFlowVersionValue() {
        return flowVersion.getAttribute("value");
    }

    public String getTestFlagValue() {
        return testFlag.getAttribute("value");
    }

    public String getFormatValue() {
        return format.getAttribute("value");
    }

    public String getFileNameValue() {
        return fileName.getAttribute("value");
    }

    public String getMpanValue() {
        return mpan.getAttribute("value");
    }

    public String getFileIdValue() {
        return fileId.getAttribute("value");
    }

    /*public String getMessageStateValue() {
       // return messageState.getAttribute("value");
    }
*/
    public int getDisabledOptionsCount() {
        return disabledOptionsList.size();
    }

    public void clickOnSaveCriteria() throws InterruptedException {
        waitAndClick(saveCriteriaBtn);
        waitForElement(saveCriteriaConfirmation);
        waitAndClick(saveCriteriaConfirmation);
    }

    public boolean isGatewayValuesMatchesToSearchQuery(String gatewayQuery) {
        for (WebElement e : gatewaySearchResultsList) {
            if (!(e.getText().equals(gatewayQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isDirectionValuesMatchesToSearchQuery(String directionQuery) {
        for (WebElement e : directionSearchResultsList) {
            if (!(e.getText().equals(directionQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFileIdValuesMatchesToSearchQuery(String fileIdQuery) {
        for (WebElement e : fileIdSearchResultsList) {
            if (!(e.getText().equals(fileIdQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFlowValuesMatchesToSearchQuery(String flowQuery) {
        for (WebElement e : flowSearchResultsList) {
            if (!(e.getText().equals(flowQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFlowVersionValuesMatchesToSearchQuery(String flowVersionQuery) {
        for (WebElement e : flowVersionSearchResultsList) {
            if (!(e.getText().equals(flowVersionQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isTestFlagValuesMatchesToSearchQuery(String testFlagQuery) {
        for (WebElement e : testFlagSearchResultsList) {
            if (!(e.getText().equals(testFlagQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFromMpidValuesMatchesToSearchQuery(String fromMpidQuery) {
        for (WebElement e : fromMpidSearchResultsList) {
            if (!(e.getText().equals(fromMpidQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFromRoleValuesMatchesToSearchQuery(String fromRolesQuery) {
        for (WebElement e : fromRoleSearchResultsList) {
            if (!(e.getText().equals(fromRolesQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isToMpidValuesMatchesToSearchQuery(String toMpidQuery) {
        for (WebElement e : toMpidSearchResultsList) {
            if (!(e.getText().equals(toMpidQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isToRoleValuesMatchesToSearchQuery(String toRolesQuery) {
        for (WebElement e : toRoleSearchResultsList) {
            if (!(e.getText().equals(toRolesQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStateValuesMatchesToSearchQuery(String stateQuery) {
        for (WebElement e : stateSearchResultsList) {
            if (!(e.getText().equals(stateQuery))) {
                return false;
            }
        }
        return true;
    }

    public void clickOnAuditMsgsListCheckbox(int checkboxIndex) {
        waitAndClick(auditMsgsCheckboxList.get(checkboxIndex));
    }

    public void getLocalGateway() {
        Select select=new Select(localGateway);
        select.selectByValue("8");
    }

    public void setEntriesButton() {
        Select select=new Select(showEntriesSelect);
        select.selectByValue("number:45");
    }
    public void getMessageStateValue() {
        Select select=new Select(messageState);
        select.selectByValue("number:500");

    }
    public void clickOnSaveToHost() {
        waitAndClick(saveToHostBtn);
    }

    public void clickOnSearch() {
        waitAndClick(searchBtn);
    }

    public void clickOnActions() {
        waitAndClick(firstActionsBtn);
    }

    public void clickOnShowMessageDetails() {
        waitAndClick(showMsgDetailsOption);
    }

    public void clickOnCloseModal() {
        waitAndClick(modalCloseBtn);
    }

    public void clickOnDownloadModal() {
        waitAndClick(modalDownloadBtn);
    }

    public void clickOnDownloadModal2() {
        waitAndClick(modalDownloadBtn2);
    }

    public void clickOnMpanUprnList() {
        waitAndClick(mpanUprnListOption);
    }

    public void clickOnDownloadFlow() {
        waitAndClick(downloadFlowButton);
    }

    public void clickOnDownloadAcknowledgement() {
        waitAndClick(downloadAckButton);
    }

    public void clickOnSendRadio() {
        waitAndClick(sendRadioBtn);
    }

    public void clickOnReceivedRadio() {
        waitAndClick(receivedRadioBtn);
    }

    public void clickOnBothRadio() {
        waitAndClick(bothRadioBtn);
    }

    public void clickOnHeartbeatCheckbox() {
        waitAndClick(heartbeatsChkbx);
    }

    public void clickOnExtract() {
        waitAndClick(extractBtn);
    }

    public void clickOnReset() {
        waitAndClick(resetBtn);
    }

    public void clickOnExtractAuditRecords() {
        waitAndClick(extractAuditRecordsBtn);
    }

    public void clickOnExtractValidationResults() {
        waitAndClick(extractValidationResultsBtn);
    }

    public void clickOnDownloadAuditRecords() {
        waitAndClick(auditRecordsDownloadBtn);
    }

    public void clickOnDownloadValidationResults() {
        waitAndClick(validationResultsDownloadBtn);
    }

    public void goToRecordsAndValidations() throws InterruptedException {
        waitAndClick(extractBtn);
        waitForElement(recAndValidOption);
        waitAndClick(recAndValidOption);
    }

    public void goToDownloadFlows() throws InterruptedException {
        waitAndClick(extractBtn);
        waitForElement(downloadFlowsOption);
        waitAndClick(downloadFlowsOption);
    }

    public void goToDownloadAcknowledgements() throws InterruptedException {
        waitAndClick(extractBtn);
        waitForElement(downloadAckOption);
        waitAndClick(downloadAckOption);
    }

    public void selectDisplayMoreEntries() {
        waitAndSelect(showEntriesSelect, "number:45");
    }

    public void typeSearchCriteria( String flowVal, String flowVersionVal, String localMpidVal, String otherMpidVal,  String testFlagVal,
                                   String localRoleVal, String otherRoleVal,  String fileIdVal,  String fromDateVal, String toDateVal) {
       // waitAndSelect(localGateway, localGatewayVal);
       // waitAndSelect(otherGateway, otherGatewayVal);
        waitAndType(flow, flowVal);
        waitAndType(flowVersion, flowVersionVal);
        waitAndType(localMpid, localMpidVal);
        waitAndType(otherMpid, otherMpidVal);
       // waitAndSelect(format, formatVal);
        waitAndType(testFlag, testFlagVal);
        waitAndType(localRole, localRoleVal);
        waitAndType(otherRole, otherRoleVal);
       // waitAndSelect(localHost, localHostVal);
        waitAndType(fileId, fileIdVal);
        //waitAndSelect(messageState, messageStateVal);
        waitAndType(fromDate, fromDateVal);
        waitAndType(toDate, toDateVal);
    }

    public void typeDates(String fromDateVal, String toDateVal) {
        waitAndType(fromDate, fromDateVal);
        waitAndType(toDate, toDateVal);
    }

    public void typeFlow(String flowVal) {
        waitAndType(flow, flowVal);
    }

    public void typeFileId(String fileIdVal) {
        waitAndType(fileId, fileIdVal);
    }

    public void validateTableQueryHeaderListComplete() {
        assertTrue("Gateway header isn't displayed", tableQueryHdrList.get(1).getText().contains("Gateway"));
        assertTrue("Date/Time header isn't displayed", tableQueryHdrList.get(2).getText().contains("Date/Time"));
        assertTrue("EMS header isn't displayed", tableQueryHdrList.get(3).getText().contains("E"));
        assertTrue("Direction header isn't displayed", tableQueryHdrList.get(4).getText().contains("D"));
        assertTrue("User File Id header isn't displayed", tableQueryHdrList.get(5).getText().contains("User File ID"));
        assertTrue("Flow header isn't displayed", tableQueryHdrList.get(6).getText().contains("Flow"));
        assertTrue("Flow Version header isn't displayed", tableQueryHdrList.get(7).getText().contains("Vn"));
        assertTrue("Test Flag header isn't displayed", tableQueryHdrList.get(8).getText().contains("TF"));
        assertTrue("From MPID header isn't displayed", tableQueryHdrList.get(9).getText().contains("From\nMPID"));
        assertTrue("From Role header isn't displayed", tableQueryHdrList.get(10).getText().contains("From\nRole"));
        assertTrue("To MPID header isn't displayed", tableQueryHdrList.get(11).getText().contains("To\nMPID"));
        assertTrue("To Role header isn't displayed", tableQueryHdrList.get(12).getText().contains("To\nRole"));
        assertTrue("Error header isn't displayed", tableQueryHdrList.get(13).getText().contains("#E"));
        assertTrue("Warning header isn't displayed", tableQueryHdrList.get(14).getText().contains("#W"));
        assertTrue("Message state header isn't displayed", tableQueryHdrList.get(15).getText().contains("State"));
        assertTrue("Actions header isn't displayed", tableQueryHdrList.get(16).getText().contains("Actions"));
    }

    public void typeFileName(String flName) {
        waitAndType(fileName, flName);
    }

    public void typeMpan(String mPan) {
        waitAndType(mpan, mPan);
    }

    public void sortByGateway() throws InterruptedException {
        tableQueryHdrList.get(1).click();
        Thread.sleep(2000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : gatewaySearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(1).click();
        Thread.sleep(2000);
        List<String> descendDates = new ArrayList<>();
        for (WebElement e : gatewaySearchResultsList) {
            descendDates.add(e.getText());
        }
        Collections.reverse(descendDates);
        assertTrue("Search result list are not properly sorted by gateway",
                ascendSorting.equals(descendDates));
    }

    public void sortByDate() throws InterruptedException {
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : dateTimeSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(2).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : dateTimeSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by dates",
                ascendSorting.equals(descendSorting));
    }

    public void sortByFileId() throws InterruptedException {
        tableQueryHdrList.get(5).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : fileIdSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(5).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : fileIdSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by file ids",
                ascendSorting.equals(descendSorting));
    }

    public void sortByFlow() throws InterruptedException {
        tableQueryHdrList.get(6).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : flowSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(6).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : flowSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by flows",
                ascendSorting.equals(descendSorting));
    }

    public void sortByFlowVersion() throws InterruptedException {
        tableQueryHdrList.get(7).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : flowVersionSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(7).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : flowVersionSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by flow versions",
                ascendSorting.equals(descendSorting));
    }

    public void sortByTestFlag() throws InterruptedException {
        tableQueryHdrList.get(8).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : testFlagSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(8).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : testFlagSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by test flags",
                ascendSorting.equals(descendSorting));
    }

    public void sortByFromMpid() throws InterruptedException {
        tableQueryHdrList.get(9).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : fromMpidSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(9).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : fromMpidSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by from Mpids",
                ascendSorting.equals(descendSorting));
    }

    public void sortByFromRole() throws InterruptedException {
        tableQueryHdrList.get(10).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : fromMpidSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(10).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : fromMpidSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by from roles",
                ascendSorting.equals(descendSorting));
    }

    public void sortByToMpid() throws InterruptedException {
        tableQueryHdrList.get(11).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : toMpidSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(11).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : toMpidSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by to mpids",
                ascendSorting.equals(descendSorting));
    }

    public void sortByToRole() throws InterruptedException {
        tableQueryHdrList.get(12).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : toRoleSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(12).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : toRoleSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by to roles",
                ascendSorting.equals(descendSorting));
    }

    public void sortByMessageState() throws InterruptedException {
        tableQueryHdrList.get(15).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : stateSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(15).click();
        waitForElement(firstActionsBtn);
        assertTrue("Search results wasn't displayed!",firstActionsBtn.isDisplayed());
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : stateSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by message state",
                ascendSorting.equals(descendSorting));
    }

    public void selectActionsButton(String gateway,String userFileId, String messageState) throws InterruptedException {
        WebElement actionsButton= driver.findElement(By.xpath("//td[text()='"+gateway+"']//..//td[text()='"+userFileId+"']//td[text()='"+messageState+"']//..//button[contains(@data-toggle,'dropdown')]"));
        waitForElement(actionsButton);
        actionsButton.click();
    }
  public void getFileId(String fileIdValue) {
        waitAndType(fileId,fileIdValue);
  }
}