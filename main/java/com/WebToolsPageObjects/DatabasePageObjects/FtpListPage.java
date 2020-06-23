package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FtpListPage extends BaseMethods {

    public FtpListPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/ftp-list")
    public WebElement ftpList;

    @FindBy(xpath = "/html/body/div/div/div/button")
    public WebElement warnButton;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> ftpRowsList;

    @FindBy(xpath = "//div/table/tbody/tr/td[1]")
    public List<WebElement> ftpIpAddrList;

    @FindBy(xpath = "//ui-view/ftp-list/div/div/button")
    public List<WebElement> newFtpButton;

    @FindBy(xpath = "//table/tbody/tr/td[3]/button")
    public List<WebElement> editFtpButton;

    //@FindBy(xpath ="/html[1]/body[1]/ui-view[1]/webtools[1]/div[1]/div[2]/webtools-menu[1]/div[1]/div[1]/div[2]/ui-view[1]/ftp-list[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    @FindBy(xpath = "//table[@class='table table-striped']/tbody/tr/td[2][contains(text(),'-edited')]")
    public List<WebElement> editedTextfield;

    @FindBy(xpath = "/html[1]/body[1]/ui-view[1]/webtools[1]/div[1]/div[2]/webtools-menu[1]/div[1]/div[1]/div[2]/ui-view[1]/ftp-list[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    public List<WebElement> editedUserName;


}
