package com.WebToolsPageObjects.AcmtPageObjects;

import com.CommonPages.BaseMethods;
import com.WebToolsPageObjects.ApplicationDataEnumsPageObjects.DFlowList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import com.WebToolsPageObjects.ApplicationDataEnums.DFlowList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * Created by sciborek on 05.06.2017.
 */
public class AcmtRestorePage extends BaseMethods {

    public AcmtRestorePage(WebDriver driver) {
        super(driver);
}
    public static final String NO_ROUTE_DEFINED_TEXT = "No route defined";
    public static final String SEARCH_BUTTON = "//button[normalize-space()='Search']";
    public static final String RESTORE_CONFIRM_BUTTON = "//button[contains(text(),'Restore')]";
    public static final String RESTORE_BUTTON = "//button[contains(text(),'Restore')]";
    public static final String ROUTES_PAGE_LABEL = "//span[contains(.,'Search Routes to Restore')]";
    public static final String TO_MPID_DROPDOWN = "//select[contains(@ng-change,'processToMpidChange')]";
    public static final String TO_ROLE_DROPDOWN = "//select[contains(@ng-model,'criteria.toRoleCode')]";
    public static final String DATA_FLOW_DROPDOWN = "//select[contains(@ng-model,'ctrl.criteria.flow')]";
    public static final String VERSION_DROPDOWN = "//select[contains(@ng-model,'criteria.flowVersion')]";
    public static final String TEST_FLAG_DROPDOWN = "//select[contains(@ng-change,'processTestFlagChange')]";
    public static final String FROM_MPID_DROPDOWN = "//select[contains(@ng-change,'filterFromRoles')]";
    public static final String FROM_ROLE_DROPDOWN = "//select[contains(@ng-model,'criteria.fromRoleCode')]";
    public static final String GATEWAY_DROPDOWN = "//select[contains(@ng-change,'filterHosts')]";
    public static final String HOST_DROPDOWN = "//select[contains(@ng-model,'criteria.host')]";
    public static final String INITIAL_RESTORE_TO_DROPDOWN = "//select[contains(@ng-model,'criteria.restoreOption')]";
    public static final String RESTORE_TO_DATE_BOX = "//input[contains(@ng-model,'criteria.dateTo')]";
    public static final String CALENDAR_BUTTON = "//*[@class='glyphicon glyphicon-calendar']";
    public static final String RESULT_TABLE = "//table[@id='route-collection']";
    public static final String RESULT_COUNT_INFORMATION = "//div/h4";
    public static final String ANY_AREA_AFTER_TOGGLE_HISTORY = "//button[contains(text(),'Toggle history')]";
    public static final String SEARCH_BOX = "//input[contains(@ng-model,'query')]";
    public static final String TOGGLE_CHECKBOX = "//input[contains(@type,'checkbox')]";
    public static final String SELECTED_TOGGLE_CHECKBOX = "//input[contains(@class,'ng-valid ng-dirty ng-valid-parse ng-touched ng-not-empty')]";
    public static final String UNSELECTED_TOGGLE_CHECKBOX = "//input[contains(@class,'ng-valid ng-dirty ng-valid-parse ng-touched ng-empty')]";
    public static final String ITEMS_BY_PAGE_DROPDOWN = "//select[contains(@ng-model,'$ctrl.itemsByPage')]";
    public static final String SEARCH_BOX_ZERO_RESULTS = "//div/h4[contains(text(),'Found 0')]";
    public static final String ROUTE_RESTORE_COMPLETED_TEXT = "#row-restorefinished > .col-md-12:first-child"; // need to be trimed
    public static final String NO_ROUTE_RESTORES_REQUESTED_TEXT = "#row-restorefinished > .col-md-12:nth-child(2)"; // need to be trimed
    public static final String NUMBER_OF_ROUTE_CHANGES_DELETED_TEXT = "#row-restorefinished p.ng-binding:first-child";
    public static final String NUMBER_OF_OLD_ROUTES_REACTIVATED_TEXT = "#row-restorefinished p.ng-binding:nth-child(2)";
   // public static final String TOGGLE_HISTORY_CHECKBOX="//input[contains(@type,'checkbox')]";
    //TODO acmt restore add page object for result table


    @FindBy(xpath = SEARCH_BUTTON)
    public WebElement searchButton;

    @FindBy(xpath = RESTORE_BUTTON)
    public WebElement restoreButton;

    @FindBy(xpath = ROUTES_PAGE_LABEL)
    public WebElement routesPageLabel;

    @FindBy(xpath = TO_MPID_DROPDOWN)
    public WebElement toMpidDropdown;

    @FindBy(xpath = TO_ROLE_DROPDOWN)
    public WebElement toRoleDropdown;

    @FindBy(xpath = DATA_FLOW_DROPDOWN)
    public WebElement dataFlowDropdown;

    @FindBy(xpath = VERSION_DROPDOWN)
    public WebElement versionDropdown;

    @FindBy(xpath = TEST_FLAG_DROPDOWN)
    public WebElement testFlagDropDown;

    @FindBy(xpath = FROM_MPID_DROPDOWN)
    public WebElement fromMpidDropdown;

    @FindBy(xpath = FROM_ROLE_DROPDOWN)
    public WebElement fromRoleDropdown;

    @FindBy(xpath = GATEWAY_DROPDOWN)
    public WebElement gatewayDropdown;

    @FindBy(xpath = HOST_DROPDOWN)
    public WebElement hostDropdown;

    @FindBy(xpath = INITIAL_RESTORE_TO_DROPDOWN)
    public WebElement initialRestoreToDropdown;

    @FindBy(xpath = RESTORE_TO_DATE_BOX)
    public WebElement restoreToDateBox;

    @FindBy(xpath = CALENDAR_BUTTON)
    public WebElement calendarButton;

    @FindBy(xpath = RESULT_TABLE)
    public WebElement resultTable;

    @FindBy(xpath = RESULT_COUNT_INFORMATION)
    public WebElement resultCountInformation;

    @FindBy(xpath = ANY_AREA_AFTER_TOGGLE_HISTORY)
    public WebElement anyAreaAfterToggleHistory;

    @FindBy(xpath = SEARCH_BOX)
    public WebElement searchBox;

    @FindBy(xpath = TOGGLE_CHECKBOX)
    public WebElement toggleCheckbox;

    @FindBy(xpath = ITEMS_BY_PAGE_DROPDOWN)
    public WebElement itemsByPageDropdown;

    @FindBy(xpath = SEARCH_BOX_ZERO_RESULTS)
    public WebElement searchBoxZeroResults;

    @FindBy(xpath = SELECTED_TOGGLE_CHECKBOX)
    public WebElement selectedToggleCheckbox;

    @FindBy(xpath = UNSELECTED_TOGGLE_CHECKBOX)
    public WebElement unSelectedToggleCheckbox;

    @FindBy(css = ROUTE_RESTORE_COMPLETED_TEXT)
    public WebElement routeRestoreCompleted;

    @FindBy(css = NO_ROUTE_RESTORES_REQUESTED_TEXT)
    public WebElement noRouteRestoresRequested;

    @FindBy(css = NUMBER_OF_OLD_ROUTES_REACTIVATED_TEXT)
    public WebElement numberOfOldRoutesReactivated;

    @FindBy(xpath = NUMBER_OF_ROUTE_CHANGES_DELETED_TEXT)
    public WebElement numberOfRouteChangesDeleted;

    @FindBy(xpath = RESTORE_CONFIRM_BUTTON)
    public WebElement restoreConfirmButton;


    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getRestoreButton() {
        return restoreButton;
    }

    public WebElement getRoutesPageLabel() {
        return routesPageLabel;
    }

    public WebElement getToMpidDropdown() {
        return toMpidDropdown;
    }

    public WebElement getToRoleDropdown() {
        return toRoleDropdown;
    }

    public WebElement getDataFlowDropdown() {
        return dataFlowDropdown;
    }

    public WebElement getVersionDropdown() {
        return versionDropdown;
    }

    public WebElement getTestFlagDropDown() {
        return testFlagDropDown;
    }

    public WebElement getFromMpidDropdown() {
        return fromMpidDropdown;
    }

    public WebElement getFromRoleDropdown() {
        return fromRoleDropdown;
    }

    public WebElement getGatewayDropdown() {
        return gatewayDropdown;
    }

    public WebElement getHostDropdown() {
        return hostDropdown;
    }

    public WebElement getInitialRestoreToDropdown() {
        return initialRestoreToDropdown;
    }

    public WebElement getRestoreToDateBox() {
        return restoreToDateBox;
    }

    public WebElement getCalendarButton() {
        return calendarButton;
    }

    public WebElement getResultTable() {
        return resultTable;
    }

    public WebElement getResultCountInformation() {
        return resultCountInformation;
    }

    public WebElement getAnyAreaAfterToggleHistory() {
        return anyAreaAfterToggleHistory;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getToggleCheckbox() {
        return toggleCheckbox;
    }

    public WebElement getItemsByPageDropdown() {
        return itemsByPageDropdown;
    }

    public WebElement getSearchBoxZeroResults() {
        return searchBoxZeroResults;
    }

    public WebElement getSelectedToggleCheckbox() {
        return selectedToggleCheckbox;
    }

    public WebElement getUnSelectedToggleCheckbox() {
        return unSelectedToggleCheckbox;
    }

    public WebElement getRouteRestoreCompleted() {
        return routeRestoreCompleted;
    }

    public WebElement getNoRouteRestoresRequested() {
        return noRouteRestoresRequested;
    }

    public WebElement getNumberOfOldRoutesReactivated() {
        return numberOfOldRoutesReactivated;
    }

    public WebElement getNumberOfRouteChangesDeleted() {
        return numberOfRouteChangesDeleted;
    }

    public WebElement getRestoreConfirmButton() {
        return restoreConfirmButton;
    }

    public void clickOnSearch() {
        waitAndClick(searchButton);
    }

    public void clickOnRestore() {
        waitAndClick(restoreButton);
    }

    public void clickOnCalendarButton() {
        waitAndClick(calendarButton);
    }

    public void clickOnToggleCheckbox() {
        waitAndClick(toggleCheckbox);
    }

    public String getSearchBoxZeroResultsText() {
        return getSearchBoxZeroResults().getText();
    }

    public String getRouteRestoreCompletedText() {
        return getRouteRestoreCompleted().getText();
    }

    public String getNoRouteRestoresRequestedText() {
        return getNoRouteRestoresRequested().getText();
    }

    public String getNumberOfOldRoutesReactivatedText() {
        return getNumberOfOldRoutesReactivated().getText();
    }

    public String getNumberOfRouteChangesDeletedText() {
        return getNumberOfRouteChangesDeleted().getText();
    }

    public int getResultCountNumber() throws Exception {
        waitForElement(getResultCountInformation());
        int result;
        if (getResultCountInformation().getText() != null && getResultCountInformation().isDisplayed()) {
            String information = getResultCountInformation().getText().replaceAll("\\D+", "");
            result = Integer.parseInt(information);
        } else {
            throw new Exception("No result of found text!!!");
        }
        return result;
    }

    public List getListOfDropdowns() {
        List<WebElement> list = new ArrayList<WebElement>();
        list.add(getToMpidDropdown());
        list.add(getToRoleDropdown());
        list.add(getDataFlowDropdown());
        list.add(getVersionDropdown());
        list.add(getTestFlagDropDown());
        list.add(getFromMpidDropdown());
        list.add(getFromRoleDropdown());
        list.add(getGatewayDropdown());
        list.add(getHostDropdown());
        return list;
    }

    public void setAsSelectToggleCheckbox() {
        try {
            if (verifyIsElementNotDisplayed(getSelectedToggleCheckbox())) {
                getToggleCheckbox().click();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAsUnselectedToggleCheckBox() {
        try {
            if (!verifyIsElementNotDisplayed(getSelectedToggleCheckbox())) {
                getToggleCheckbox().click();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getAndClickToggleHistory(String ToOrFromMPID, DFlowList flow, String TestFlag) {
        String dFlow = flow.getDflow();
        setAsUnselectedToggleCheckBox();
        //TODO sprawdzic moze dla list webelementow, jezeli jest tylko jeden to wybrac, jezeli wiecej niz 1 to ??
        try{
            WebElement toggleButton = driver.findElement(By.cssSelector("div table tbody tr:contains(\"" + ToOrFromMPID + "\"):contains(\"" + dFlow + "\"):contains(\"" + TestFlag + "\") button"));
            toggleButton.click();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    public void getAndClickRestoreOption(String Fmt, String Host, Optional<String> fromDate) throws InterruptedException {
        String optionalDate = fromDate.isPresent() ? fromDate.get() : "";
        WebElement restoreChecbox;
        try{
            restoreChecbox = driver.findElement(By.cssSelector("div table tbody tr td table tbody tr:contains(\"" + Fmt + "\"):contains(\"" + Host + "\"):contains(\"" + optionalDate + "\") input"));
            if (!verifyIsElementNotDisplayed(restoreChecbox)) {
                if (!restoreChecbox.isSelected()) {
                    restoreChecbox.click();
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    public void getAndClickNoRouteDefined() throws Exception {

        try {
            WebElement noRouteDefinedChechbox = driver.findElement(By.cssSelector("div table tbody tr td table tbody:contains(\"No route defined on\") input"));
            //if is displayed
            if (!verifyIsElementNotDisplayed(noRouteDefinedChechbox)) {
                //if is unselected
                if (!noRouteDefinedChechbox.isSelected()) {
                    noRouteDefinedChechbox.click();
                }
            } else {
                throw new Exception("There is no visible No route defined option");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public void getAndClickMakeNoChanges() throws Exception {
        try{
            WebElement makeNoChanges = driver.findElement(By.cssSelector("div table tbody tr td table tbody tr:contains(\"Make no changes to this route\") input"));
            if (!verifyIsElementNotDisplayed(makeNoChanges)) {
                if (!makeNoChanges.isSelected()) {
                    makeNoChanges.click();
                }
            } else {
                throw new Exception("There is no visible Make no changes option");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
    public void selectAllCheckboxWithText (String text){
        List<WebElement> x = driver.findElements(By.xpath("//tr/td/strong[contains(text(),'"+text+"')]//..//..//td/input"));
        for(WebElement e : x){
            e.click();
        }
    }
    public void deleteRoute(String MPID) throws InterruptedException {
        waitForElement(getInitialRestoreToDropdown());
        Thread.sleep(2000);
        selectVisibleOptionFromMenu(MPID,getToMpidDropdown());
        getSearchButton().click();
        try{
            waitForElement(getRestoreButton());
            selectAllCheckboxWithText(NO_ROUTE_DEFINED_TEXT);
            getRestoreButton().click();
            Thread.sleep(1000);
            waitForElement(getRestoreConfirmButton());
            getRestoreConfirmButton().click();
            verifyIsElementNotDisplayed(getRestoreConfirmButton());
        }catch (Error e){

        }

    }

}
