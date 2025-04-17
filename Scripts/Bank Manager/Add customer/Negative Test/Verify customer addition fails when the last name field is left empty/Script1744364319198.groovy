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

// Open browser
WebUI.openBrowser('')

// Go to the website
WebUI.navigateToUrl('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/')

// Click the bank manager button
WebUI.click(findTestObject('Object Repository/Bank Manager/Add customer/button_Bank Manager Login'))

// Click add customer button
WebUI.click(findTestObject('Object Repository/Bank Manager/Add customer/button_Add Customer'))

// Fill in the customer's first name
WebUI.setText(findTestObject('Object Repository/Bank Manager/Add customer/input_First Name_form-control ng-pristine n_693e51'), 
    'Lily')

// Fill in the customer's post code
WebUI.setText(findTestObject('Object Repository/Bank Manager/Add customer/input_Post Code_form-control ng-pristine ng_b8fd27'), 
    '672900')

// Click the add customer button on bottom left
WebUI.click(findTestObject('Object Repository/Bank Manager/Add customer/button_Add Customer_1'))

// Verify that the value of the 'Post Code' input field is the same as the entered value (Add customer failed)
WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/Bank Manager/Add customer/input_Post Code_form-control ng-pristine ng_b8fd27'), 'value'), '672900', FailureHandling.CONTINUE_ON_FAILURE)

// Take screenshot
WebUI.takeScreenshot()

// Close browser
WebUI.closeBrowser()

