package com.WebToolsPageObjects.DflowMasterPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertNotEquals;

public class DflowMasterPreferencesPage extends BaseMethods {

    public DflowMasterPreferencesPage(WebDriver driver) {
        super(driver);
    }

    public static final String user = "user";
    public static final String nextFileIdTemplate = "nextFileIdTemplate";
    public static final String nextFileId = "nextFileId";
    public static final String defaultSenderMPID = "defaultSenderMPID";
    public static final String defaultSenderRole = "defaultSenderRole";
    public static final String restrictSenderMpidRole = "restrictSenderMpidRole";
    public static final String defaultReceiverMPID = "defaultReceiverMPID";
    public static final String defaultReceiverRole = "defaultReceiverRole";
    public static final String defaultFlow = "defaultFlow";
    public static final String defaultFlowVersion = "defaultFlowVersion";
    public static final String defaultTestFlag = "defaultTestFlag";
    public static final String defaultFormat = "defaultFormat";
    public static final String flowRequirements = "flowRequirements";
    public static final String customFilenameTemplate = "customFilenameTemplate";
    public static final String validateAgainstMdd = "validateAgaistMdd";
    public static final String Save = "//button[@type='submit' and contains(text(),'Save')]";
    public static final String Reset = "//button[contains(@ng-click,'resetForm')]";
    public static final String SUCCESS = "//div[@class='toast-message' and contains(text(),'Preferences for') and contains(text(),'saved')]";
    public static final String NOT_VALID_TEMPLATE_ERROR = "//span[contains(text(),'Not a valid template')]";
    public static final String NOT_MATCH_TO_TEMPLATE_ERROR = "//span[contains(text(),'Next File Id Template')]";
    public static final String FLOW_VERSION_3_DIGITS_ERROR = "//span[contains(text(),'Must be 3 digits')]";
    public static final String TOKEN_MANDATORY_ERROR = "//span[contains(text(),'Next File Id Template')]";
    public static final String INVALID_TOKEN_ERROR = "//span[contains(text(),'Use only')]";
    public static final String REQUIRED_ERROR = "//span[contains(@ng-if,'required')]";
    public static final String NEXT_FILE_ID_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'nextFileId.editor') and @type='checkbox']";
    public static final String FROM_MPID_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultFromMPID.editorLocked') and @type='checkbox']";
    public static final String FROM_ROLE_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultFromRole.editorLocked') and @type='checkbox']";
    public static final String TO_MPID_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultToMPID.editorLocked') and @type='checkbox']";
    public static final String TO_ROLE_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultToRole.editorLocked') and @type='checkbox']";
    public static final String FLOW_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultFlow.editorLocked') and @type='checkbox']";
    public static final String FLOW_VERSION_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultFlowVersion.editorLocked') and @type='checkbox']";
    public static final String TEST_FLAG_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultTestFlag.editorLocked') and @type='checkbox']";
    public static final String FORMAT_LOCK_EDITOR_CHECKBOX = "//input[contains(@ng-model,'defaultFormat.editorLocked') and @type='checkbox']";
    public static final String PREFERENCES_LOCKED_CHECKBOX_LIST = "//input[contains(@ng-model,'preferenceLocked')]";
    //public static final String DISABLED_PREFERENCES_LIST = "//input[@disabled]|//select[@disabled]";
    public static final String DISABLED_PREFERENCES_LIST="//input[@class='ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']";

    @FindBy(id = user)
    public WebElement dropdownUser;

    @FindBy(id = nextFileIdTemplate)
    public WebElement inputNextFileIdTemplate;

    @FindBy(id = nextFileId)
    public WebElement inputNextFileId;

    @FindBy(id = defaultSenderMPID)
    public WebElement dropdownDefaultSenderMPID;

    @FindBy(id = defaultSenderRole)
    public WebElement dropdownDefaultSenderRole;

    @FindBy(id = restrictSenderMpidRole)
    public WebElement dropdownRestrictSenderMpidRoled;

    @FindBy(id = defaultReceiverMPID)
    public WebElement dropdownDefaultReceiverMPID;

    @FindBy(id = defaultReceiverRole)
    public WebElement dropdownDefaultReceiverRole;

    @FindBy(id = defaultFlow)
    public WebElement dropdownDefaultFlow;

    @FindBy(id = defaultFlowVersion)
    public WebElement inputDefaultFlowVersion;

    @FindBy(id = defaultTestFlag)
    public WebElement inputDefaultTestFlag;

    @FindBy(id = defaultFormat)
    public WebElement dropdownDefaultFormat;

    @FindBy(id = flowRequirements)
    public WebElement dropdownFlowRequirements;

    @FindBy(id = customFilenameTemplate)
    public WebElement inputcustomFilenameTemplate;

    @FindBy(id = validateAgainstMdd)
    public WebElement dropdownValidateAgainstMdd;

    @FindBy(xpath = Save)
    public WebElement saveBtn;

    @FindBy(xpath = Reset)
    public WebElement resetBtn;

    @FindBy(xpath = SUCCESS)
    public WebElement successMsg;

    @FindBy(xpath = NEXT_FILE_ID_LOCK_EDITOR_CHECKBOX)
    public WebElement nextFileIdLckEditor;

    @FindBy(xpath = FROM_MPID_LOCK_EDITOR_CHECKBOX)
    public WebElement fromMpidLckEditor;

    @FindBy(xpath = FROM_ROLE_LOCK_EDITOR_CHECKBOX)
    public WebElement fromRoleLckEditor;

    @FindBy(xpath = TO_MPID_LOCK_EDITOR_CHECKBOX)
    public WebElement toMpidLckEditor;

    @FindBy(xpath = TO_ROLE_LOCK_EDITOR_CHECKBOX)
    public WebElement toRoleLckEditor;

    @FindBy(xpath = TEST_FLAG_EDITOR_CHECKBOX)
    public WebElement testFlagLckEditor;

    @FindBy(xpath = FLOW_LOCK_EDITOR_CHECKBOX)
    public WebElement flowLckEditor;

    @FindBy(xpath = FLOW_VERSION_LOCK_EDITOR_CHECKBOX)
    public WebElement flowVersionLckEditor;

    @FindBy(xpath = FORMAT_LOCK_EDITOR_CHECKBOX)
    public WebElement formatLckEditor;

    @FindBy(xpath = NOT_VALID_TEMPLATE_ERROR)
    public WebElement notValidTempErr;

    @FindBy(xpath = NOT_MATCH_TO_TEMPLATE_ERROR)
    public WebElement notMatchToTempErr;

    @FindBy(xpath = FLOW_VERSION_3_DIGITS_ERROR)
    public WebElement flowVer3DigitsErr;

    @FindBy(xpath = TOKEN_MANDATORY_ERROR)
    public WebElement mandatoryTokenErr;

    @FindBy(xpath = INVALID_TOKEN_ERROR)
    public WebElement invalidTokenErr;

    @FindBy(xpath = REQUIRED_ERROR)
    public List<WebElement> requiredErr;

    @FindBy(xpath = PREFERENCES_LOCKED_CHECKBOX_LIST)
    public List<WebElement> preferencesLockedChkbxList;

    @FindBy(xpath = DISABLED_PREFERENCES_LIST)
    public List<WebElement> disabledPreferencesList;

    public void chooseOtherUser(String user) throws InterruptedException {
        waitForElement(getDropdownUser());
        waitAndSelect(dropdownUser, user);
    }

    public void typePreferencesFields(String nextFileIdTemplate, String nextFileId, String defaultSenderMPID, String defaultSenderRole, String restrictSenderMpidRole, String defaultReceiverMPID, String defaultReceiverRole, String defaultFlow, String defaultFlowVersion, String defaultTestFlag, String defaultFormat, String flowRequirements, String customFilenameTemplate, String validateAgainstMdd) {
        waitAndType(inputNextFileIdTemplate, nextFileIdTemplate);
        waitAndType(inputNextFileId, nextFileId);
        waitAndSelect(dropdownDefaultSenderMPID, defaultSenderMPID);
        waitAndSelect(dropdownDefaultSenderRole, defaultSenderRole);
        waitAndSelect(dropdownRestrictSenderMpidRoled, restrictSenderMpidRole);
        waitAndSelect(dropdownDefaultReceiverMPID, defaultReceiverMPID);
        waitAndSelect(dropdownDefaultReceiverRole, defaultReceiverRole);
        waitAndSelect(dropdownDefaultFlow, defaultFlow);
        waitAndType(inputDefaultFlowVersion, defaultFlowVersion);
        waitAndType(inputDefaultTestFlag, defaultTestFlag);
        waitAndSelect(dropdownDefaultFormat, defaultFormat);
        waitAndSelect(dropdownFlowRequirements, flowRequirements);
        waitAndType(inputcustomFilenameTemplate, customFilenameTemplate);
        waitAndSelect(dropdownValidateAgainstMdd, validateAgainstMdd);
    }

    public void lockInEditorNextFileId() {
        waitAndClick(nextFileIdLckEditor);
    }

    public void lockInEditorSenderMpid() {
        waitAndClick(fromMpidLckEditor);
    }

    public void lockInEditorSenderRole() {
        waitAndClick(fromRoleLckEditor);
    }

    public void lockInEditorReceiverMpid() {
        waitAndClick(toMpidLckEditor);
    }

    public void lockInEditorReceiverRole() {
        waitAndClick(toRoleLckEditor);
    }

    public void lockInEditorFlow() {
        waitAndClick(flowLckEditor);
    }

    public void lockInEditorFlowVersion() {
        waitAndClick(flowVersionLckEditor);
    }

    public void lockInEditorTestFlag() {
        waitAndClick(testFlagLckEditor);
    }

    public void lockInEditorFormat() {
        waitAndClick(formatLckEditor);
    }

    public void lockDislockAllFieldsInEditor() {
        lockInEditorNextFileId();
        lockInEditorSenderMpid();
        lockInEditorSenderRole();
        lockInEditorReceiverMpid();
        lockInEditorReceiverRole();
        lockInEditorFlow();
        lockInEditorFlowVersion();
        lockInEditorTestFlag();
        lockInEditorFormat();
    }

    public void clickOnSave() {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", saveBtn);
        waitAndClick(saveBtn);
    }

    public void clickOnReset() {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", resetBtn);
        waitAndClick(resetBtn);
    }

    public void waitForPreferencesPage() throws InterruptedException {
        waitForElement(dropdownUser);
        waitForElement(inputNextFileIdTemplate);
        waitForElement(inputNextFileId);
        waitForElement(dropdownDefaultSenderMPID);
        waitForElement(dropdownDefaultSenderRole);
        waitForElement(dropdownRestrictSenderMpidRoled);
        waitForElement(dropdownDefaultReceiverMPID);
        waitForElement(dropdownDefaultReceiverRole);
        waitForElement(dropdownDefaultFlow);
        waitForElement(inputDefaultFlowVersion);
        waitForElement(inputDefaultTestFlag);
        waitForElement(dropdownDefaultFormat);
        waitForElement(dropdownFlowRequirements);
        waitForElement(inputcustomFilenameTemplate);
        waitForElement(dropdownValidateAgainstMdd);
    }

    public WebElement getDropdownUser() {
        return dropdownUser;
    }

    public WebElement getInputNextFileIdTemplate() {
        return inputNextFileIdTemplate;
    }

    public WebElement getInputNextFileId() {
        return inputNextFileId;
    }

    public WebElement getDropdownDefaultSenderMPID() {
        return dropdownDefaultSenderMPID;
    }

    public WebElement getDropdownDefaultSenderRole() {
        return dropdownDefaultSenderRole;
    }

    public WebElement getDropdownRestrictSenderMpidRoled() {
        return dropdownRestrictSenderMpidRoled;
    }

    public WebElement getDropdownDefaultReceiverMPID() {
        return dropdownDefaultReceiverMPID;
    }

    public WebElement getDropdownDefaultReceiverRole() {
        return dropdownDefaultReceiverRole;
    }

    public WebElement getDropdownDefaultFlow() {
        return dropdownDefaultFlow;
    }

    public WebElement getInputDefaultFlowVersion() {
        return inputDefaultFlowVersion;
    }

    public WebElement getInputDefaultTestFlag() {
        return inputDefaultTestFlag;
    }

    public WebElement getDropdownDefaultFormat() {
        return dropdownDefaultFormat;
    }

    public WebElement getDropdownFlowRequirements() {
        return dropdownFlowRequirements;
    }

    public WebElement getInputcustomFilenameTemplate() {
        return inputcustomFilenameTemplate;
    }

    public WebElement getDropdownValidateAgainstMdd() {
        return dropdownValidateAgainstMdd;
    }

    public WebElement getSuccessMsg() {
        return successMsg;
    }

    public String getNextFileIdTemplateValue() {
        return inputNextFileIdTemplate.getAttribute("value");
    }

    public String getNextFileIdValue() {
        return inputNextFileId.getAttribute("value");
    }

    public String getSenderMpidValue() {
        return dropdownDefaultSenderMPID.getAttribute("value");
    }

    public String getSenderRoleValue() {
        return dropdownDefaultSenderRole.getAttribute("value");
    }

    public String getRestrictSenderMpidRoleValue() {
        return dropdownRestrictSenderMpidRoled.getAttribute("value");
    }

    public String getReceiverMpidValue() {
        return dropdownDefaultReceiverMPID.getAttribute("value");
    }

    public String getReceiverRoleValue() {
        return dropdownDefaultReceiverRole.getAttribute("value");
    }

    public String getFlowValue() {
        return dropdownDefaultFlow.getAttribute("value");
    }

    public String getFlowVersionValue() {
        return inputDefaultFlowVersion.getAttribute("value");
    }

    public String getFlowRequirementsValue() {
        return dropdownFlowRequirements.getAttribute("value");
    }

    public String getCustomFilenameTemplateValue() {
        return inputcustomFilenameTemplate.getAttribute("value");
    }

    public int getRequiredErrorsCount() {
        return requiredErr.size();
    }

    public int getDisabledPreferencesCount() {
        return disabledPreferencesList.size();
    }

    public void clearNonMandatoryPreferencesFields() {
        waitAndSelect(dropdownDefaultSenderMPID, "");
        waitAndSelect(dropdownDefaultSenderRole, "");
        waitAndSelect(dropdownDefaultReceiverMPID, "");
        waitAndSelect(dropdownDefaultReceiverRole, "");
        waitAndSelect(dropdownDefaultFlow, "");
        inputDefaultFlowVersion.clear();
        inputDefaultTestFlag.clear();
        inputcustomFilenameTemplate.clear();
    }

    public void clickOnAllPreferencesLockedCheckboxes() {
        for (WebElement onePreferenceLockedCheckbox : preferencesLockedChkbxList) {
            waitAndClick(onePreferenceLockedCheckbox);
        }
    }

    public void getAllPreferencesValues1stVerifiacation(String nextFileIdBefore, String nextTemplateIdBefore, String senderMpidBefore, String senderRoleBefore
            , String restrictSenderMpidRoleBefore, String receiverMpidBefore, String receiverRoleBefore, String defaultFlowBefore, String defaultFlowVersionBefore,
                                                        String flowRequirementsBefore, String customFilenameTemplateBefore) {
        nextFileIdBefore = getNextFileIdTemplateValue();
        nextTemplateIdBefore = getNextFileIdTemplateValue();
        senderMpidBefore = getSenderMpidValue();
        senderRoleBefore = getSenderRoleValue();
        restrictSenderMpidRoleBefore = getRestrictSenderMpidRoleValue();
        receiverMpidBefore = getReceiverMpidValue();
        receiverRoleBefore = getReceiverRoleValue();
        defaultFlowBefore = getFlowValue();
        defaultFlowVersionBefore = getFlowVersionValue();
        flowRequirementsBefore = getFlowRequirementsValue();
        customFilenameTemplateBefore = getCustomFilenameTemplateValue();
    }
    public void validateValuesCorrectness(String nextFileIdBefore,String nextTemplateIdBefore
            , String senderMpidBefore, String senderRoleBefore,String restrictSenderMpidRoleBefore
            , String receiverMpidBefore, String receiverRoleBefore,String defaultFlowBefore
            , String defaultFlowVersionBefore, String customFilenameTemplateBefore){
        assertNotEquals(nextFileIdBefore,getNextFileIdTemplateValue());
        assertNotEquals(nextTemplateIdBefore, getNextFileIdTemplateValue());
        assertNotEquals(senderMpidBefore, getSenderMpidValue());
        assertNotEquals(senderRoleBefore, getSenderRoleValue());
        assertNotEquals(restrictSenderMpidRoleBefore, getRestrictSenderMpidRoleValue());
        assertNotEquals(receiverMpidBefore, getReceiverMpidValue());
        assertNotEquals(receiverRoleBefore, getReceiverRoleValue());
        assertNotEquals(defaultFlowBefore, getFlowValue());
        assertNotEquals(defaultFlowVersionBefore, getFlowVersionValue());
        assertNotEquals(customFilenameTemplateBefore, getCustomFilenameTemplateValue());
    }
}

