package com.WebToolsPageObjects.RecollectResubmitPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class StatusPage extends BaseMethods {

    public StatusPage(WebDriver driver) {
        super(driver);
    }

    private static final String FROM_DATE = "//date-picker[contains(@model,'dateFrom')]/div/input";
    private static final String TO_DATE = "//date-picker[contains(@model,'dateTo')]/div/input";
    private static final String SEARCH_BUTTON = "//button[contains(@ng-click,'search')]";
    private static final String RESET_BUTTON = "//button[contains(@ng-click,'reset')]";
    private static final String PERSON_RESPONSIBLE = "//select[contains(@ng-model,'loginId')]";
    private static final String FILE_ID = "//input[contains(@ng-model,'fileId')]";
    private static final String GATEWAY = "//select[contains(@ng-model,'gateway')]";
    private static final String HOST = "//select[contains(@ng-model,'hostId')]";
    private static final String SENDER_MPID = "//input[contains(@ng-model,'fromMPID')]";
    private static final String SENDER_ROLE = "//input[contains(@ng-model,'fromRole')]";
    private static final String RECEIVER_MPID = "//input[contains(@ng-model,'toMPID')]";
    private static final String RECEIVER_ROLE = "//input[contains(@ng-model,'toRole')]";
    private static final String FLOW = "(//input[contains(@ng-model,'flow')])[1]";
    private static final String FLOW_VERSION = "//input[contains(@ng-model,'flowVersion')]";
    private static final String TEST_FLAG = "//select[contains(@ng-model,'testFlag')]";
    private static final String RSM_STATUS = "//select[contains(@ng-model,'rsmStatus')]";
    private static final String TABLE_QUERY_HEADER_LIST = "//th";
    private static final String TABLE_QUERY = "//table[contains(@class,'table')]";
    private static final String STATUS_COUNT = "//ng-pluralize";
    private static final String SELECT_SINGLE_REQUEST_CHECKBOX = "//input[contains(@ng-click,'toggleSingle')]";
    private static final String CLIENT_ID_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[1]";
    private static final String GATEWAY_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[2]";
    private static final String HOST_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[3]";
    private static final String FILE_ID_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[6]";
    private static final String FILENAME_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[7]";
    private static final String STATE_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[9]";

    @FindBy(xpath = FROM_DATE)
    public WebElement fromDate;

    @FindBy(xpath = TO_DATE)
    public WebElement toDate;

    @FindBy(xpath = SEARCH_BUTTON)
    public WebElement searchBtn;

    @FindBy(xpath = RESET_BUTTON)
    public WebElement resetBtn;

    @FindBy(xpath = PERSON_RESPONSIBLE)
    public WebElement personResp;

    @FindBy(xpath = FILE_ID)
    public WebElement fileId;

    @FindBy(xpath = GATEWAY)
    public WebElement gateway;

    @FindBy(xpath = HOST)
    public WebElement host;

    @FindBy(xpath = SENDER_MPID)
    public WebElement senderMpid;

    @FindBy(xpath = SENDER_ROLE)
    public WebElement senderRole;

    @FindBy(xpath = STATUS_COUNT)
    public WebElement statusCount;

    @FindBy(xpath = RECEIVER_MPID)
    public WebElement receiverMpid;

    @FindBy(xpath = RECEIVER_ROLE)
    public WebElement receiverRole;

    @FindBy(xpath = SELECT_SINGLE_REQUEST_CHECKBOX)
    public WebElement selectSingleRequestChckbx;

    @FindBy(xpath = FLOW)
    public WebElement fl;

    @FindBy(xpath = FLOW_VERSION)
    public WebElement flowVersion;

    @FindBy(xpath = TEST_FLAG)
    public WebElement testFl;

    @FindBy(xpath = RSM_STATUS)
    public WebElement rsmStatus;

    @FindBy(xpath = TABLE_QUERY)
    public WebElement tableQuery;

    @FindBy(xpath = TABLE_QUERY_HEADER_LIST)
    public List<WebElement> tableQueryHdrList;

    @FindBy(xpath = GATEWAY_SEARCH_RESULTS_LIST)
    public List<WebElement> gatewaySearchResultsList;

    @FindBy(xpath = CLIENT_ID_SEARCH_RESULTS_LIST)
    public List<WebElement> clientIdSearchResultsList;

    @FindBy(xpath = HOST_SEARCH_RESULTS_LIST)
    public List<WebElement> hostSearchResultsList;

    @FindBy(xpath = FILE_ID_SEARCH_RESULTS_LIST)
    public List<WebElement> fileIdSearchResultsList;

    @FindBy(xpath = STATE_SEARCH_RESULTS_LIST)
    public List<WebElement> stateSearchResultsList;

    @FindBy(xpath = FILENAME_SEARCH_RESULTS_LIST)
    public List<WebElement> fileNameSearchResultsList;

    public void clickOnSearch() {
        waitAndClick(searchBtn);
    }

    public void clickOnReset(){waitAndClick(resetBtn);}

    public void clickOnSingleRequestCheckbox(){waitAndClick(selectSingleRequestChckbx);}

    public void typeDates(String fromDateVal, String toDateVal) {
        waitAndType(fromDate, fromDateVal);
        waitAndType(toDate, toDateVal);
    }

    public void choosePersonResponsible(String personResponsible) {
        waitAndSelect(personResp, personResponsible);
    }

    public void isTableQueryHeaderListComplete() {
        assertTrue("Client Id header isn't displayed", tableQueryHdrList.get(0).getText().contains("Client ID"));
        assertTrue("Gateway header isn't displayed", tableQueryHdrList.get(1).getText().contains("Gateway"));
        assertTrue("Host header isn't displayed", tableQueryHdrList.get(2).getText().contains("Host"));
        if (tableQueryHdrList.get(3).getText().contains("RCOL Date/Time")){
            assertTrue("RSM Date/Time header isn't displayed", tableQueryHdrList.get(3).getText().contains("RCOL Date/Time"));
        }
        if(tableQueryHdrList.get(3).getText().contains("RSM Date/Time")){
            assertTrue("RSM Date/Time header isn't displayed", tableQueryHdrList.get(3).getText().contains("RSM Date/Time"));
        }
        assertTrue("Reception Date/Time header isn't displayed", tableQueryHdrList.get(4).getText().contains("Reception Date/Time"));
        assertTrue("File Id header isn't displayed", tableQueryHdrList.get(5).getText().contains("User File ID"));
        assertTrue("Filename header isn't displayed", tableQueryHdrList.get(6).getText().contains("Filename"));
        assertTrue("Rsm status header isn't displayed", tableQueryHdrList.get(7).getText().contains("G/B"));
        assertTrue("Message state header isn't displayed", tableQueryHdrList.get(8).getText().contains("State"));
    }

    public void typeFlowValues(String flowVal, String flowVersionVal) {
        waitAndType(fl, flowVal);
        waitAndType(flowVersion, flowVersionVal);
    }

    public void typeReceiverValues(String receiverMpidVal, String receiverRoleVal) {
        waitAndType(receiverMpid, receiverMpidVal);
        waitAndType(receiverRole, receiverRoleVal);
    }

    public void typeSenderValues(String senderMpidVal, String senderRoleVal) {
        waitAndType(senderMpid, senderMpidVal);
        waitAndType(senderRole, senderRoleVal);
    }

    public int getStatusCountValue() {
        int statusCountValue = Integer.parseInt(statusCount.getText().substring(0, statusCount.getText().lastIndexOf("m") - 1));
        return statusCountValue;
    }

    public void selectTestFlag(String testFlagVal) {
        waitAndSelect(testFl, testFlagVal);
    }

    public void getLocalGateway() {
        Select select=new Select(gateway);
        select.selectByValue("8");
    }
    public void chooseGateway(String gatewayVal) {
        waitAndSelect(gateway, gatewayVal);
    }

    public void chooseHost(String hostVal) {
        waitAndSelect(host, hostVal);
    }

    public void chooseRsmStatus(String rsmStatusVal) {
        waitAndSelect(rsmStatus, rsmStatusVal);
    }

    public boolean isGatewayValuesMatchesToSearchQuery(String gatewayQuery) {
        for (WebElement e : gatewaySearchResultsList) {
            if (!(e.getText().equals(gatewayQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isClientIdValuesMatchesToSearchQuery(String clientIdQuery) {
        for (WebElement e : clientIdSearchResultsList) {
            if (!(e.getText().equals(clientIdQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isHostValuesMatchesToSearchQuery(String hostQuery) {
        for (WebElement e : hostSearchResultsList) {
            if (!(e.getText().equals(hostQuery))) {
                return false;
            }
        }
        return true;
    }

    public boolean isFilenameValuesMatchesToSearchQuery(String filenameQuery) {
        for (WebElement e : fileIdSearchResultsList) {
            if (!(e.getText().equals(filenameQuery))) {
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
}
