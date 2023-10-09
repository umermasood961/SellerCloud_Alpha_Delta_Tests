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

WebUI.callTestCase(findTestCase('Manage_Order/Create Order_With Product_Alpha 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CaseQty/Select_Actions'))

WebUI.selectOptionByValue(findTestObject('Page_CaseQty/Select_Actions'), '587841', false)

WebUI.click(findTestObject('Page_CaseQty/input_GoBtn'))

WebUI.click(findTestObject('Page_CaseQty/Continue btn'))

WebUI.waitForJQueryLoad(2)

Notification_Enb = WebUI.getText(findTestObject('Page_CaseQty/div_Per case Qty enabled'))

WebUI.click(findTestObject('Page_CaseQty/Page_CaseQty_dtl/a_OrderDtl'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_CaseQty/Select_Actions'))

WebUI.selectOptionByValue(findTestObject('Page_CaseQty/Select_Actions'), '587841', false)

WebUI.click(findTestObject('Page_CaseQty/input_GoBtn'))

Notification_Dsb = WebUI.getText(findTestObject('Page_CaseQty/div_Case Qty disabled on order'))

if (Notification_Dsb.contains('Case Qty disabled on order')) {
	println('Success')
} else {
	KeywordUtil.markFailed('Failed due to setting AllowShippingUnpaidOrders disabled on client or company level')
}
