import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Click on Make Appointment
WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Make Appointment'))

// Set Username
WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Username_username'), findTestData(
        'DDT_Test Data/CURA_Login_InternalData').getValue('input_Username', 1))

// Set Password
WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Password_password'), findTestData(
        'DDT_Test Data/CURA_Login_InternalData').getValue('input_Password', 1))

// Click on Login button
WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/button_Login'))

// Verify if Make Appointment element is present
WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/h2_Make Appointment'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Logout'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Logout'))

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Logout'))

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Login'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Login'))

