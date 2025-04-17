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
WebUI.callTestCase(findTestCase('Bank Manager/Login/Verify successful bank manager login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

// Click open account button
WebUI.click(findTestObject('Object Repository/Bank Manager/Open account/button_Open Account'))

// Select a customer name
WebUI.selectOptionByValue(findTestObject('Object Repository/Bank Manager/Open account/select_---Customer Name---       Hermoine G_e4ab73'), 
    '5', true)

// Select the currency for customer's account
WebUI.selectOptionByValue(findTestObject('Object Repository/Bank Manager/Open account/select_---Currency---       Dollar      Pou_e54511'), 
    'Dollar', true)

// Click process button
WebUI.click(findTestObject('Object Repository/Bank Manager/Open account/button_Process'))

// Click ok button on the pop-up
WebUI.acceptAlert()

// Take screenshot
WebUI.takeScreenshot()

// Close browser
WebUI.closeBrowser()

