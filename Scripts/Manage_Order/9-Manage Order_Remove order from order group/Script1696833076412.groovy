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

WebUI.click(findTestObject('Page_Delete_Order/input_select_btnSearch'))

WebUI.click(findTestObject('Page_texsave/select order'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_CaseQty/Select_Actions'))

WebUI.selectOptionByValue(findTestObject('Page_CaseQty/Select_Actions'), 'RemoveFromOrderGroup', false)

WebUI.click(findTestObject('Page_CaseQty/input_GoBtn'))

WebUI.click(findTestObject('Order_addToGroupTest/Remove_order_grp/select_orderstest_OrderGrp'))

WebUI.selectOptionByValue(findTestObject('Order_addToGroupTest/Remove_order_grp/select_orderstest_OrderGrp'), '10', false)

WebUI.click(findTestObject('Order_addToGroupTest/Remove_order_grp/input_btnRemoveFromGroup'))

WebUI.getText(findTestObject('Order_addToGroupTest/Remove_order_grp/div_output'))

