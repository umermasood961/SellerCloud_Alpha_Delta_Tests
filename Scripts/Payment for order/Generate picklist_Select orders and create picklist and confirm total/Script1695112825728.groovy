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

WebUI.callTestCase(findTestCase('Create New Order_Alpha/Login Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/a_Orders'))

WebUI.verifyElementText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/span_Manage_Orders_chk'), 'Manage Orders')

WebUI.click(findTestObject('Pick_list/input_btnSearch'))

WebUI.waitForJQueryLoad(2)

WebUI.click(findTestObject('Pick_list/input_selectOrd1'))

WebUI.click(findTestObject('Pick_list/input_selectOrd2'))

WebUI.click(findTestObject('Pick_list/input_selectOrd3'))

WebUI.click(findTestObject('Pick_list/select_SelectActionBtn'))

WebUI.selectOptionByValue(findTestObject('Pick_list/select_SelectActionBtn'), '8105', false)

WebUI.click(findTestObject('Pick_list/input_GoActionBtn'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Pick_list/input_PicklistTitle'))

WebUI.setText(findTestObject('Pick_list/input_PicklistTitle'), 'Dummylist')

WebUI.click(findTestObject('Pick_list/input_ContinueGenerateBtn'))

WebUI.click(findTestObject('Pick_list/a_Job_ClickonSJob'))

WebUI.waitForPageLoad(5)

Get_URL = WebUI.getUrl()

WebUI.navigateToUrl(Get_URL + "&showexecute=1")

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Pick_list/input_btnProcessJob'))

WebUI.click(findTestObject('Pick_list/a_Show Pick List'))

WebUI.switchToWindowIndex(1)

Resutl = WebUI.getText(findTestObject('Pick_list/span_picklistDtl'))