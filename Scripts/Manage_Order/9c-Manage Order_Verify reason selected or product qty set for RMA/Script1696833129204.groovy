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

WebUI.click(findTestObject('Create_For_RMA/For_Paymetns'))

WebUI.click(findTestObject('Create_For_RMA/select_PaymentActions'))

WebUI.selectOptionByValue(findTestObject('Create_For_RMA/select_PaymentActions'), '7', false)

WebUI.click(findTestObject('Create_For_RMA/input_btnSubmitPayment'))

WebUI.getText(findTestObject('Create_For_RMA/Get_span_Charged'))

WebUI.click(findTestObject('Create_For_RMA/img_imgShippingStatus'))

WebUI.click(findTestObject('Create_For_RMA/input_btnSubmitShip'))

Status = WebUI.getText(findTestObject('Create_For_RMA/div_Order Shipping updated'))

WebUI.click(findTestObject('Create_For_RMA/input_btnContinue_Back'))

WebUI.click(findTestObject('Page_CaseQty/Select_Actions'))

WebUI.scrollToElement(findTestObject('Page_CaseQty/Select_Actions'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Page_CaseQty/Select_Actions'), '7206', false)

WebUI.click(findTestObject('Page_CaseQty/input_GoBtn'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Create_For_RMA/select_Select ReasonCustomer'))

'Reason Selected'
WebUI.selectOptionByValue(findTestObject('Create_For_RMA/select_Select ReasonCustomer'), '8', false)

WebUI.click(findTestObject('Create_For_RMA/input_chkSelect'))

WebUI.click(findTestObject('Create_For_RMA/input_QtyReturned'))

WebUI.setText(findTestObject('Create_For_RMA/input_QtyReturned'), '')

WebUI.setText(findTestObject('Create_For_RMA/input_QtyReturned'), '3')

WebUI.click(findTestObject('Create_For_RMA/input_btnCreateReturnImg'))

RMA_Status = WebUI.getText(findTestObject('Create_For_RMA/div_RMA Created success'))

