package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PortalHostOutboxPage extends BaseMethods {

    public PortalHostOutboxPage(WebDriver driver) {
        super(driver);
    }

    public static final String OUTBOX_CONTENT = "//a[contains(text(),'File ID')]";
    public static final String OUTBOX = "//div[@id='collapseELNKTESTPH']/ul/li[@folder='Outbox']";

    @FindBy(xpath = OUTBOX)
    public WebElement outbox_folder;

    @FindBy(xpath = OUTBOX_CONTENT)
    public WebElement outbox_content;

    public boolean isFileIdExistsInOutbox(String fileId){
        List<WebElement> outboxFileIds = driver.findElements(By.xpath("//strong"));
        for(WebElement e : outboxFileIds) {
            if (fileId.contains(e.getText()))
                return true;
        }
        return false;
    }
    public void clickOnOutbox() {
        waitAndClick(outbox_folder);
    }
    public void goToOutbox(){
        try {

            waitForElement(outbox_folder);
            clickOnOutbox();

        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }
}
