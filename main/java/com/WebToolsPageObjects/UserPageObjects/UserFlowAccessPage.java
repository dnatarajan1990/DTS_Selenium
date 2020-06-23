package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 06.07.2017.
 */
public class UserFlowAccessPage extends BaseMethods {

    public UserFlowAccessPage(WebDriver driver) {
        super(driver);
    }

    public static final String NEW_BUTTON = "//button[contains(text(),'New')]";
    public static final String BACK_BUTTON = "//button[contains(text(),'Back')]";



    //new FLOW page

    public static final String FLOW_FROM = "//input[@id='flowFrom']";
    public static final String FLOW_TO = "//input[@id='flowTo']";
    public static final String TF_FROM = "//input[@id='tfFrom']";
    public static final String TF_TO = "//input[@id='tfTo']";
    public static final String VN_FROM = "//input[@id='vnFrom']";
    public static final String VN_TO = "//input[@id='vnTo']";
    public static final String INDUSTRY_DROPDOWN = "//select[@id='indCode']";
    public static final String SAVE_BUTTON ="//button[contains(text(),'Save')]";
    public static final String CANCEL_BUTTON = "//button[contains(text(),'Cancel')]";
    //industry codes
    public static final String ELEC = "Elec";
    public static final String RGMA = "RGMA";


    @FindBy(xpath = NEW_BUTTON)
    public WebElement newButton;

    @FindBy(xpath = BACK_BUTTON)
    public WebElement backButton;

    @FindBy(xpath = FLOW_FROM)
    public WebElement flowFrom;

    @FindBy(xpath = FLOW_TO)
    public WebElement flowTo;

    @FindBy(xpath = TF_FROM)
    public WebElement tfFrom;

    @FindBy(xpath = TF_TO)
    public WebElement tfTo;

    @FindBy(xpath = VN_FROM)
    public WebElement vnFrom;

    @FindBy(xpath = VN_TO)
    public WebElement vnTo;

    @FindBy(xpath = INDUSTRY_DROPDOWN)
    public WebElement industryDropdown;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;


    public WebElement getNewButton(){return newButton;}
    public WebElement getBackButton(){return backButton;}
    public WebElement getFlowFrom(){return flowFrom;}
    public WebElement getFlowTo(){return flowTo;}
    public WebElement getTfFrom(){return tfFrom;}
    public WebElement getTfTo(){return tfTo;}
    public WebElement getVnFrom(){return vnFrom;}
    public WebElement getVnTo(){return  vnTo;}
    public WebElement getIndustryDropdown(){return industryDropdown;}
    public WebElement getSaveButton(){return saveButton;}
    public WebElement getCancelButton(){return cancelButton;}


    public void createNewFlowAccess(String FlowFrom,String FlowTo,String tfFrom, String tfTo, String vnFrom, String vnTo, String industryName) throws InterruptedException {
        waitAndClick(getNewButton());
        waitForElement(getFlowFrom());
        waitAndType(getFlowFrom(),FlowFrom);
        waitAndType(getFlowTo(),FlowTo);
        waitAndType(getTfFrom(),tfFrom);
        waitAndType(getTfTo(),tfTo);
        waitAndType(getVnFrom(),vnFrom);
        waitAndType(getVnTo(),vnTo);
        selectVisibleOptionFromMenu(industryName,getIndustryDropdown());
        waitAndClick(getSaveButton());
        waitForElement(getNewButton());
    }
}
