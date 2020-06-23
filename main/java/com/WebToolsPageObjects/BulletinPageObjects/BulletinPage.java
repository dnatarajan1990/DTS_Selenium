package com.WebToolsPageObjects.BulletinPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 26.06.2017.
 */
public class BulletinPage extends BaseMethods {
    public BulletinPage(WebDriver driver) {
        super(driver);}

    public static final String BULLETIN_LABEL ="//bulletin/h2";
    //public static final String NEW_BUTTON = "//button[contains(text(),'New')]";
  public static final String NEW_BUTTON = "//button[contains(text(),'New') and @type='button' ]";
    public static final String FIRST_FROM_TOP_EDIT_BUTTON = ".fa.fa-edit[0]";
    public static final String FIRST_FROM_TOP_REMOVE_BUTTON = "//button[normalize-space() = 'Remove'][1]";
    //TODO ask for id?
    public static final String FIRST_BULLETIN_TEXT = "(//div[@ng-model='item.text'])[1]";
            //
    public static final String CONFIRM_REMOVE_BUTTON = "//button[contains(text(),'OK')]";
    public static final String User_DXC="//button[contains(text(),'button')]";
    public static final String SHOW_CHAT_ON_OFF="";


    @FindBy(xpath = BULLETIN_LABEL)
    public WebElement bulletinLabel;

    @FindBy(xpath = NEW_BUTTON)
    public WebElement newButton;

    @FindBy(css = FIRST_FROM_TOP_EDIT_BUTTON)
    public WebElement firstFromTopEditButton;

    @FindBy(xpath = FIRST_FROM_TOP_REMOVE_BUTTON)
    public WebElement firstFromTopRemoveButton;

    @FindBy(xpath = FIRST_BULLETIN_TEXT)
    public WebElement firstBulletinText;

    @FindBy(xpath = CONFIRM_REMOVE_BUTTON)
    public WebElement confirmRemoveButton;

    public WebElement getBulletinLabel() {return bulletinLabel;}
    public WebElement getNewButton() {return newButton;}
    public WebElement getFirstFromTopEditButton() {return firstFromTopEditButton;}
    public WebElement getFirstFromTopRemoveButton() {return firstFromTopRemoveButton;}
    public WebElement getFirstBulletinText() {return firstBulletinText;}
    public WebElement getConfirmRemoveButton() {return confirmRemoveButton;}


    public boolean isBulletinTextDisplayed(String text){
        WebElement bulletinText = driver.findElement(By.xpath("//div/p[contains(text(),'"+text+"')]"));
        try{
            boolean x = bulletinText.isDisplayed();
            return x;
        }catch (NullPointerException e){
            return false;
        }
    }

}
