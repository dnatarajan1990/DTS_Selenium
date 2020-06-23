package com.WebToolsPageObjects.RecollectResubmitPageObjects;


import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class RequestPage extends BaseMethods {

    public RequestPage(WebDriver driver) {
        super(driver);
    }

    private static final String FROM_DATE = "//date-picker[contains(@model,'dateFrom')]/div/input";
    private static final String TO_DATE = "//date-picker[contains(@model,'dateTo')]/div/input";
    private static final String SEARCH_BUTTON = "//button[contains(@ng-click,'findRequests')]";
    private static final String RESET_BUTTON = "//button[contains(@ng-click,'reset')]";
    private static final String REQUEST_SELECTED_BUTTON = "(//button[contains(@ng-click,'selectedRequests')])[1]";
    private static final String REQUEST_ALL_BUTTON = "(//button[contains(@ng-click,'allFromCurrent')])[2]";
    private static final String FILE_ID = "//input[contains(@ng-model,'fileId')]";
    private static final String GATEWAY = "//select[contains(@ng-model,'localGateway')]";
    private static final String HOST = "//select[contains(@ng-model,'localHost')]";
    private static final String RECEIVED_MPID = "//input[contains(@ng-model,'remoteMPID')]";
    private static final String RECEIVED_ROLE = "//input[contains(@ng-model,'remoteRole')]";
    private static final String SENDER_MPID = "//input[contains(@ng-model,'localMPID')]";
    private static final String SENDER_ROLE = "//input[contains(@ng-model,'localRole')]";
    private static final String FLOW = "//input[contains(@ng-model,'flow')]";
    private static final String FLOW_VERSION = "//input[contains(@ng-model,'version')]";
    private static final String FILE_NAME = "//input[contains(@ng-model,'Filename')]";
    private static final String TEST_FLAG = "//select[contains(@ng-model,'testFlag')]";
    private static final String STATE = "//select[contains(@ng-model,'state')]";
    private static final String EXCLUDE_PROCESSED_CHECKBOX = "//input[contains(@ng-model,'excludeRsmFiles')]";
    private static final String TABLE_QUERY_HEADER_LIST = "//th";
    private static final String TABLE_QUERY = "//table[contains(@class,'table')]";
    private static final String REQUEST_COUNT = "//ng-pluralize";
    private static final String REQUEST_ALL= "//div[@class='col-md-12']//button[@class='btn btn-default btn-sm'][contains(text(),'Request all')]";
    private static final String SELECTED_COUNT = "//div[contains(text(),'|')]";
    private static final String REQUESTS_CHECKBOX_LIST = "//input[contains(@ng-click,'toggleSingle')]";
    private static final String GATEWAY_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[1]";
    private static final String FILE_ID_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[3]";
    private static final String FLOW_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[4]";
    private static final String FLOW_VERSION_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[5]";
    private static final String TEST_FLAG_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[6]";
    private static final String FROM_MPID_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[7]";
    private static final String FROM_ROLE_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[8]";
    private static final String TO_MPID_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[9]";
    private static final String TO_ROLE_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[10]";
    private static final String STATE_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[11]";
    private static final String SUBMIT_FILENAME_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[13]";
    private static final String COLLECT_FILENAME_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[12]";
    private static final String REQUEST_MODAL_TITLE = "modal-title";
    private static final String REQUEST_REASON = "//textarea";
    private static final String NUMBER_OF_FILES_TO_REQUEST = "(//b)[1]";
    private static final String CONFIRM_BUTTON = "//button[text()='Confirm']";
    private static final String REQUEST_SUCCESSFULLY_PROCESSED_MESSAGE = "//p[contains(@ng-bind-html,'message.text')]";
    private static final String TOTAL_NUMBER_OF_FILES="//div[@id='modal-body']/p[text()='Number of files to be recollected: ']//following-sibling::b[@class='ng-binding']";

    @FindBy(id = REQUEST_MODAL_TITLE)
    public WebElement requestModalTitle;

    @FindBy(xpath = REQUEST_REASON)
    public WebElement requestReason;

    @FindBy(xpath = FROM_DATE)
    public WebElement fromDate;

    @FindBy(xpath = TO_DATE)
    public WebElement toDate;

    @FindBy(xpath = SEARCH_BUTTON)
    public WebElement searchBtn;

    @FindBy(xpath = RESET_BUTTON)
    public WebElement resetBtn;

    @FindBy(xpath = CONFIRM_BUTTON)
    public WebElement confirmBtn;

    @FindBy(xpath = REQUEST_SELECTED_BUTTON)
    public WebElement requestSelectedBtn;

    @FindBy(xpath = REQUEST_SUCCESSFULLY_PROCESSED_MESSAGE)
    public WebElement successfullyRequestMessage;

    @FindBy(xpath = REQUEST_ALL)
    public WebElement requestAll;

    @FindBy(xpath = REQUEST_ALL_BUTTON)
    public WebElement requestAllBtn;

    @FindBy(xpath = REQUEST_COUNT)
    public WebElement requestCount;

    @FindBy(xpath = SELECTED_COUNT)
    public WebElement selectedCount;

    @FindBy(xpath = FILE_ID)
    public WebElement fileId;

    @FindBy(xpath = GATEWAY)
    public WebElement gateway;

    @FindBy(xpath = NUMBER_OF_FILES_TO_REQUEST)
    public WebElement filesToRequestCount;

    @FindBy(xpath = HOST)
    public WebElement host;

    @FindBy(xpath = TABLE_QUERY)
    public WebElement tableQuery;

    @FindBy(xpath = REQUESTS_CHECKBOX_LIST)
    public List<WebElement> requestsChkbxList;

    @FindBy(xpath = TABLE_QUERY_HEADER_LIST)
    public List<WebElement> tableQueryHdrList;

    @FindBy(xpath = GATEWAY_SEARCH_RESULTS_LIST)
    public List<WebElement> gatewaySearchResultsList;

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

    @FindBy(xpath = SUBMIT_FILENAME_SEARCH_RESULTS_LIST)
    public List<WebElement> submitFileNameSearchResultsList;

    @FindBy(xpath = COLLECT_FILENAME_SEARCH_RESULTS_LIST)
    public List<WebElement> collectFileNameSearchResultsList;

    @FindBy(xpath = RECEIVED_MPID)
    public WebElement receivedMpid;

    @FindBy(xpath = RECEIVED_ROLE)
    public WebElement receivedRole;

    @FindBy(xpath = SENDER_MPID)
    public WebElement senderMpid;

    @FindBy(xpath = SENDER_ROLE)
    public WebElement senderRole;

    @FindBy(xpath = TEST_FLAG)
    public WebElement testFlagg;

    @FindBy(xpath = FLOW)
    public WebElement flow;

    @FindBy(xpath = FLOW_VERSION)
    public WebElement flowVersion;

    @FindBy(xpath = FILE_NAME)
    public WebElement fileName;

    @FindBy(xpath = STATE)
    public WebElement state;

    @FindBy(xpath = EXCLUDE_PROCESSED_CHECKBOX)
    public WebElement excludeProcessedChbx;

    @FindBy(xpath = TOTAL_NUMBER_OF_FILES)
    public WebElement retotalNoOfFiles;

    public void getRequestAllCount()  {
        waitAndClick(requestAll);


    }

    public void clickOnSearch() {
        waitAndClick(searchBtn);
    }

    public void clickOnReset() {
        waitAndClick(resetBtn);
    }

    public void clickOnConfirm() {
        waitAndClick(confirmBtn);
    }

    public void clickOnRequestSelected() {
        waitAndClick(requestSelectedBtn);
    }

    public void clickOnRequestAll() {
        waitAndClick(requestAllBtn);
    }

    public int getSelectedCount() {
        int selectCount = Integer.parseInt(selectedCount.getText().substring(
                selectedCount.getText().lastIndexOf("d") + 2, selectedCount.getText().lastIndexOf("/"+getRequestsCountValue())));
        return selectCount;
    }

    public void typeDates(String fromDateVal, String toDateVal) {
        waitAndType(fromDate, fromDateVal);
        waitAndType(toDate, toDateVal);
    }

    public boolean isSuccessfullReqestMessageProcessedDisplayed(){
        String reqMessageProcessed = successfullyRequestMessage.getText();
        if(reqMessageProcessed.contains("Requests recorded")){
            return true;
        }
        return false;
    }
    public void waitMiliseconds(long milisecond) {
        try {
            Thread.sleep(milisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int getRequestsCountValue() {
        int requestCountValue = Integer.parseInt(requestCount.getText().substring(0, requestCount.getText().lastIndexOf("m") - 1));
        return requestCountValue;
    }

    public int getFilesToRequestsCountValue() {
        int filesToRequestCountValue = Integer.parseInt(filesToRequestCount.getText());
        return filesToRequestCountValue;
    }

    public void isTableQueryHeaderListComplete() {
        assertTrue("Gateway header isn't displayed", tableQueryHdrList.get(4).getText().contains("Gateway"));
        assertTrue("Date/Time header isn't displayed", tableQueryHdrList.get(5).getText().contains("Date/Time"));
        assertTrue("File Id header isn't displayed", tableQueryHdrList.get(6).getText().contains("User File ID"));
        assertTrue("Flow header isn't displayed", tableQueryHdrList.get(7).getText().contains("Flow"));
        assertTrue("Flow Version header isn't displayed", tableQueryHdrList.get(8).getText().contains("Vn"));
        assertTrue("Test flag header isn't displayed", tableQueryHdrList.get(9).getText().contains("TF"));
        assertTrue("From MPID header isn't displayed", tableQueryHdrList.get(10).getText().contains("MPID"));
        assertTrue("From Role header isn't displayed", tableQueryHdrList.get(11).getText().contains("Role"));
        assertTrue("To MPID header isn't displayed", tableQueryHdrList.get(12).getText().contains("MPID"));
        assertTrue("To Role header isn't displayed", tableQueryHdrList.get(13).getText().contains("Role"));
        if (tableQueryHdrList.get(14).getText().contains("State")) {
            assertTrue("State header isn't displayed", tableQueryHdrList.get(14).getText().contains("State"));
            assertTrue("RCOL header isn't displayed", tableQueryHdrList.get(15).getText().contains("RCOL"));
            assertTrue("Filename header isn't displayed", tableQueryHdrList.get(16).getText().contains("Filename"));
        } else {
            assertTrue("RCOL header isn't displayed", tableQueryHdrList.get(14).getText().contains("RCOL"));
            assertTrue("Filename header isn't displayed", tableQueryHdrList.get(15).getText().contains("Filename"));
        }

    }

    public void typeFileId(String fileIdVal) {
        waitAndType(fileId, fileIdVal);
    }

    public void typeFileName(String fileNameVal) {
        waitAndType(fileName, fileNameVal);
    }

    public void typeFlowValues(String flowVal, String flowVersionVal) {
        waitAndType(flow, flowVal);
        waitAndType(flowVersion, flowVersionVal);
    }

    public void typeReceiverValues(String receiverMpidVal, String receiverRoleVal) {
        waitAndType(receivedMpid, receiverMpidVal);
        waitAndType(receivedRole, receiverRoleVal);
    }

    public void typeSenderValues(String senderMpidVal, String senderRoleVal) {
        waitAndType(senderMpid, senderMpidVal);
        waitAndType(senderRole, senderRoleVal);
    }

    public void typeRequestReason(String reqReason) {
        waitAndType(requestReason, reqReason);
    }

    public void selectTestFlag(String testFlagVal) {
        waitAndSelect(testFlagg, testFlagVal);
    }

    public void chooseGateway(String gatewayVal) {
        waitAndSelect(gateway, gatewayVal);
    }

    public void chooseState(String stateVal) {
        waitAndSelect(state, stateVal);
    }

    public void clickOnExcludedCheckbox() {
        waitAndClick(excludeProcessedChbx);
    }

    public void selectRequestFromList(int index) {
        if (!(requestsChkbxList.get(index).isSelected())) {
            requestsChkbxList.get(index).click();
        }
    }

    public String getFileId(int index) {
        if (requestsChkbxList.get(index).isSelected()) {
            return fileIdSearchResultsList.get(index).getText();
        }
        return null;
    }
    public void getLocalGateway() {
        Select select=new Select(gateway);
        select.selectByValue("4");
    }

    public String getSubmitFileName(int index) {
        if (requestsChkbxList.get(index).isSelected()) {
            return submitFileNameSearchResultsList.get(index).getText();
        }
        return null;
    }
    public String getCollectFileName(int index) {
        if (requestsChkbxList.get(index).isSelected()) {
            return collectFileNameSearchResultsList.get(index).getText();
        }
        return null;
    }

    public boolean isGatewayValuesMatchesToSearchQuery(String gatewayQuery) {
        for (WebElement e : gatewaySearchResultsList) {
            if (!(e.getText().equals(gatewayQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFileIdValuesMatchesToSearchQuery(String fileIdQuery) {
        for (WebElement e : fileIdSearchResultsList) {
            if (!(e.getText().contains(fileIdQuery))) {
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

    public boolean isSubmitFilenameValuesMatchesToSearchQuery(String fileNameQuery) {
        for (WebElement e : submitFileNameSearchResultsList) {
            if (!(e.getText().contains(fileNameQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isCollectFilenameValuesMatchesToSearchQuery(String fileNameQuery) {
        for (WebElement e : collectFileNameSearchResultsList) {
            if (!(e.getText().contains(fileNameQuery))) {
                return false;
            }
        }
        return true;
    }
}
