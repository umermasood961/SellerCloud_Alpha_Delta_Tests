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

WebUI.callTestCase(findTestCase('Alpha Basic Tests/Login Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Alpha Basic Tests/Create Order With Product_Alpha'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_SellerCloud_Login/Page_After_Order_create/select_ActionForEditOrder'))

'add value for edit order. get edit order value by inspecting the actions bar'
WebUI.selectOptionByValue(findTestObject('Page_SellerCloud_Login/Page_After_Order_create/select_ActionForEditOrder'), '5000', 
    false)

WebUI.click(findTestObject('Page_SellerCloud_Login/Page_After_Order_create/input_GO_ImageButton1'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_SellerCloud_Login/Page_After_Order_create/input_btnSaveAfter Edit'))

WebUI.waitForJQueryLoad(0)

