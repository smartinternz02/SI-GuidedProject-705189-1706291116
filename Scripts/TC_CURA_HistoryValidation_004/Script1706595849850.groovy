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

/*
WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/button_Login'))
*/

WebUI.selectOptionByValue(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center_5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/textarea_comment'), 'Sample Test')

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/amenu-toggle'))

WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_History'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/h2_History'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/div_31012024'), '31/01/2024')

WebUI.verifyElementText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/p_Sample Text'), 'Sample Test')

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Go to Homepage'))

