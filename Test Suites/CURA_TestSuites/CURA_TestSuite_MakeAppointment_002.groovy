import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = true) // Please change skipped to be false to activate this method.
def setUp() {
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = true) // Please change skipped to be false to activate this method.
def tearDown() {
	// Put your code here.
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = false) // Please change skipped to be false to activate this method.
def setupTestCase() {
	WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Make Appointment'))
	
	// Set Username
	WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Username_username'), findTestData(
        'DDT_Test Data/CURA_Login_TestData').getValue('input_Username', 1))

	// Set Password
	WebUI.setText(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/input_Password_password'), findTestData(
        'DDT_Test Data/CURA_Login_TestData').getValue('input_Password', 1))
	
	WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/button_Login'))
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = false) // Please change skipped to be false to activate this method.
def tearDownTestCase() {
	WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/amenu-toggle'))
	
	WebUI.click(findTestObject('Object Repository/CURA_Pages_OR/Page_CURA Healthcare Service/a_Logout'))
	
	WebUI.delay(1)
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */