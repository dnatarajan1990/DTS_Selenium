package com.WebToolsPageObjects.AcmtPageObjects;


import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 05.06.2017.
 */
public class AcmtSummaryPage extends BaseMethods {

    public AcmtSummaryPage(WebDriver driver) {
        super(driver);
    }

    public static final String GATEWAY_DROPDOWN = "//select[contains(@ng-model,'ctrl.gatewayNum')]";
    public static final String HOSTS_MAIN_DROPPING_ARROW = "//span[contains(@ng-class,'$ctrl.allTestRouteGroupsExpanded')]";
    public static final String MPID_MAIN_DROPPING_ARROW = "//span[contains(@ng-class,'$ctrl.allRouteGroupsExpanded')]";


    @FindBy(xpath = GATEWAY_DROPDOWN)
    public WebElement gatewayDropDown;

    @FindBy(xpath = HOSTS_MAIN_DROPPING_ARROW)
    public WebElement hostMainDroppingArrow;

    @FindBy(xpath = MPID_MAIN_DROPPING_ARROW)
    public WebElement mpidMainDroppingArrow;

    public WebElement getGatewayDropDown() {
        return gatewayDropDown;
    }

    public WebElement getHostMainDroppingArrow() {
        return hostMainDroppingArrow;
    }

    public WebElement getMpidMainDroppingArrow() {
        return mpidMainDroppingArrow;
    }
}
