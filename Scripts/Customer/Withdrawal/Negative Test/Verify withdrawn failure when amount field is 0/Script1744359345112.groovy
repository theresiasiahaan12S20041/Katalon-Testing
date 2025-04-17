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

// Login
WebUI.callTestCase(findTestCase('Customer/Login/Verify successful customer login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

// Click the withdrawal button
WebUI.click(findTestObject('Customer/Withdrawn/button_Withdrawn'))

// Input the amount to be withdrawn
WebUI.setText(findTestObject('Customer/Withdrawn/input_Amount to be Withdrawn_form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'), 
    '0')

// Click the withdraw button on bottom left
WebUI.click(findTestObject('Customer/Withdrawn/button_Withdrawn_1'))

// Verify that the page is still the same (the web using native browser validation, so it can't be inspect)
WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Withdrawn/input_Amount to be Withdrawn_form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'))

// Verify that the page is still the same (the web using native browser validation, so it can't be inspect)
WebUI.verifyTextPresent('The amount can not be 0', false)

// Take screenshot
WebUI.takeScreenshot()

// Close browser
WebUI.closeBrowser()

