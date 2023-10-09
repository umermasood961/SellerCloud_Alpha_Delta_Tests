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

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/a_Create_New_Order_Click'))

WebUI.waitForJQueryLoad(0)

WebUI.verifyElementText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/span_Create New Order_chk'), 'Create New Order')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/select_Company_frst'))

'This action select the comapny by value.. find compnay value by inspecting company..'
WebUI.selectOptionByValue(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/select_Company_frst'), '164', false)

WebUI.verifyElementText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/td_This order is Sample Order'), 
    'This order is Sample Order')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_chkIsSampleOrder'))

WebUI.verifyElementText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/td_User_Account_UA'), 'User Account')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Email_txtUserName_UA'))

'give dummy Email address'
WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Email_txtUserName_UA'), 'Dummyperson123@mysite.com')

WebUI.scrollToElement(findTestObject('Orders_Alpha_CreateNew/Page_Payment_infor/input_Refresh_Totals_btnCreateOrder_SaveOrder'), 
    0)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Payment_infor/input_Refresh_Totals_btnCreateOrder_SaveOrder'))

'This will show the error. while we try to create order without data'
error = WebUI.getText(findTestObject('Page_Delete_Order/Page_Create New Order/CreateOrder_get error while empty fields'), FailureHandling.STOP_ON_FAILURE)

if (error.contains('Please enter complete')) {
	println('Right exception')
} else {
	error.contains('Other Error')

	KeywordUtil.markFailed('Failed due to Error')
}
