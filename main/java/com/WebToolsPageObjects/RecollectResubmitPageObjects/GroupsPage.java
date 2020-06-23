package com.WebToolsPageObjects.RecollectResubmitPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class GroupsPage extends BaseMethods {

    public GroupsPage(WebDriver driver) {
        super(driver);
    }

    private static final String FROM_DATE = "//date-picker[contains(@model,'dateFrom')]/div/input";
    private static final String TO_DATE = "//date-picker[contains(@model,'dateTo')]/div/input";
    private static final String PERSON_RESPONSIBLE = "//select[contains(@ng-model,'loginId')]";
    private static final String GROUP_STATUS = "//select[contains(@ng-model,'groupStatus')]";
    private static final String SEARCH_BUTTON = "//button[contains(@ng-click,'findGroups')]";
    private static final String RESET_BUTTON = "//button[contains(@ng-click,'resetModel')]";
    private static final String TABLE_QUERY_HEADER_LIST = "//th";
    private static final String TABLE_QUERY = "//table[contains(@class,'table')]";
    private static final String GROUPS_COUNT = "//ng-pluralize";
    private static final String CLIENT_ID_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[1]";
    private static final String REQUEST_DATE_TIME_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[2]";
    private static final String NUM_FILES_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[3]";
    private static final String NUM_BYTES_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[4]";
    private static final String NUM_SUCCEEDED_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[5]";
    private static final String NUM_FAILED_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[6]";
    private static final String NUM_DELIVERED_OK_SEARCH_RESULTS_LIST = "//tr[contains(@ng-repeat,'displayedCollection')]/td[7]";
    private static final String JUSTIFICATION_SEARCH_RESULTS_LIST= "//tr[contains(@ng-repeat,'displayedCollection')]/td[8]";

    @FindBy(xpath = FROM_DATE)
    public WebElement fromDate;

    @FindBy(xpath = TO_DATE)
    public WebElement toDate;

    @FindBy(xpath = PERSON_RESPONSIBLE)
    public WebElement selectPersonResp;

    @FindBy(xpath = GROUP_STATUS)
    public WebElement groupStatus;

    @FindBy(xpath = SEARCH_BUTTON)
    public WebElement searchBtn;

    @FindBy(xpath = RESET_BUTTON)
    public WebElement resetBtn;

    @FindBy(xpath = TABLE_QUERY)
    public WebElement tableQuery;

    @FindBy(xpath = GROUPS_COUNT)
    public WebElement groupCount;

    @FindBy(xpath = TABLE_QUERY_HEADER_LIST)
    public List<WebElement> tableQueryHdrList;

    @FindBy(xpath = CLIENT_ID_SEARCH_RESULTS_LIST)
    public List<WebElement> clientIdSearchResultsList;

    @FindBy(xpath = REQUEST_DATE_TIME_SEARCH_RESULTS_LIST)
    public List<WebElement> requestDateTimeSearchResultsList;

    @FindBy(xpath = NUM_FILES_SEARCH_RESULTS_LIST)
    public List<WebElement> numFilesSearchResultsList;

    @FindBy(xpath = NUM_BYTES_SEARCH_RESULTS_LIST)
    public List<WebElement> numBytesSearchResultsList;

    @FindBy(xpath = NUM_SUCCEEDED_SEARCH_RESULTS_LIST)
    public List<WebElement> numSucceededSearchResultsList;

    @FindBy(xpath = NUM_FAILED_SEARCH_RESULTS_LIST)
    public List<WebElement> numFailedSearchResultsList;

    @FindBy(xpath = NUM_DELIVERED_OK_SEARCH_RESULTS_LIST)
    public List<WebElement> numDeliveredOkSearchResultsList;

    @FindBy(xpath = JUSTIFICATION_SEARCH_RESULTS_LIST)
    public List<WebElement> justificationSearchResultsList;

    public void typeDates(String fromDateVal, String toDateVal) {
        waitAndType(fromDate, fromDateVal);
        waitAndType(toDate, toDateVal);
    }

    public void selectPersonResp(String personResp) {
        waitAndSelect(selectPersonResp, personResp);
    }

    public void clickOnSearch(){
        waitAndClick(searchBtn);
    }

    public void clickOnReset(){
        waitAndClick(resetBtn);
    }

    public void isTableQueryHeaderListComplete() {
        assertTrue("Client Id header isn't displayed", tableQueryHdrList.get(0).getText().contains("Client ID"));
        assertTrue("Request Date/Time header isn't displayed", tableQueryHdrList.get(1).getText().contains("Request Date/Time"));
        assertTrue("Num files header isn't displayed", tableQueryHdrList.get(2).getText().contains("Num files"));
        assertTrue("Num bytes header isn't displayed", tableQueryHdrList.get(3).getText().contains("Num bytes"));
        assertTrue("Num succeeded header isn't displayed", tableQueryHdrList.get(4).getText().contains("Num succeeded"));
        assertTrue("Num failed header isn't displayed", tableQueryHdrList.get(5).getText().contains("Num failed"));
        assertTrue("Num delivered ok header isn't displayed", tableQueryHdrList.get(6).getText().contains("Num delivered ok"));
        assertTrue("Justification header isn't displayed", tableQueryHdrList.get(7).getText().contains("Justification"));
    }
    public int getGroupsCountValue() {
        int groupCountValue = Integer.parseInt(groupCount.getText().substring(0,groupCount.getText().lastIndexOf("groups")-1));
        return groupCountValue;
    }

    public void sortByClientId() throws InterruptedException {
        tableQueryHdrList.get(0).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : clientIdSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(0).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : clientIdSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by client id",
                ascendSorting.equals(descendSorting));
    }
    public void sortByRequestDateTime() throws InterruptedException {
        tableQueryHdrList.get(1).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : requestDateTimeSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(1).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : requestDateTimeSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by request date/time",
                ascendSorting.equals(descendSorting));
    }
    public void sortByNumFiles() throws InterruptedException {
        tableQueryHdrList.get(2).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : numFilesSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(2).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : numFilesSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by num files",
                ascendSorting.equals(descendSorting));
    }
    public void sortByNumBytes() throws InterruptedException {
        tableQueryHdrList.get(3).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : numBytesSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(3).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : numBytesSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by num bytes",
                ascendSorting.equals(descendSorting));
    }
    public void sortByNumSucceeded() throws InterruptedException {
        tableQueryHdrList.get(4).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : numSucceededSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(4).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : numSucceededSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by num succeeded",
                ascendSorting.equals(descendSorting));
    }
    public void sortByNumFailed() throws InterruptedException {
        tableQueryHdrList.get(5).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : numFailedSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(5).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : numFailedSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by num failed",
                ascendSorting.equals(descendSorting));
    }
    public void sortByNumDeliveredOk() throws InterruptedException {
        tableQueryHdrList.get(6).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : numDeliveredOkSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(6).click();
        Thread.sleep(1000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : numDeliveredOkSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by num delivered ok",
                ascendSorting.equals(descendSorting));
    }
    public void sortByJustification() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(tableQueryHdrList.get(7)));
        tableQueryHdrList.get(7).click();
        Thread.sleep(1000);
        List<String> ascendSorting = new ArrayList<>();
        for (WebElement e : justificationSearchResultsList) {
            ascendSorting.add(e.getText());
        }
        tableQueryHdrList.get(7).click();
        Thread.sleep(4000);
        List<String> descendSorting = new ArrayList<>();
        for (WebElement e : justificationSearchResultsList) {
            descendSorting.add(e.getText());
        }
        Collections.reverse(descendSorting);
        assertTrue("Search result list are not properly sorted by justification",
                ascendSorting.equals(descendSorting));
    }
}
