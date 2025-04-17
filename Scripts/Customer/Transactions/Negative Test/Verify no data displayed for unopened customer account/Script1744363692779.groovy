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

// Bank manager add a new customer
WebUI.callTestCase(findTestCase('Bank Manager/Add customer/Positive Test/Verify customer is added successfully'), [:], FailureHandling.CONTINUE_ON_FAILURE)

// Click the home button
WebUI.click(findTestObject('Home/button_Home'))

// Click the customer login button
WebUI.click(findTestObject('Object Repository/Customer/Validate customer login/button_Customer Login'))

// Select the customer name
WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Validate customer login/select_---Your Name---       Hermoine Grang_6e895b'), 
    '6', true)

// Click the button login
WebUI.click(findTestObject('Object Repository/Customer/Validate customer login/button_Login'))

// Verify that the page displayed message: "Please open an account with us."
WebUI.verifyTextPresent('Please open an account with us.', false)

// Take screenshot
WebUI.takeScreenshot()

// Close browser
WebUI.closeBrowser()

