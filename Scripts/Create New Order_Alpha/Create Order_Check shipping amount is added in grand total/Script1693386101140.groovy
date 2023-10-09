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

WebUI.callTestCase(findTestCase('Create New Order_Alpha/1-Create Order_With Product_Alpha'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrderEdit_actions/select_clickActionsdepdown'))

WebUI.selectOptionByValue(findTestObject('OrderEdit_actions/select_clickActionsdepdown'), '5000', false)

WebUI.click(findTestObject('OrderEdit_actions/input_GoActionBtn'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('OrderEdit_actions/Discount_Item_level/chnage Qty'))

WebUI.setText(findTestObject('OrderEdit_actions/Discount_Item_level/chnage Qty'), '')

WebUI.setText(findTestObject('OrderEdit_actions/Discount_Item_level/chnage Qty'), '3')

WebUI.click(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'))

WebUI.setText(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'), '')

WebUI.setText(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'), '25')

WebUI.scrollToElement(findTestObject('OrderEdit_actions/Discount_Item_level/Savecalculate btn'), 0)

WebUI.click(findTestObject('OrderEdit_actions/Discount_Item_level/Savecalculate btn'))

totalItemlvldisc = WebUI.getText(findTestObject('OrderEdit_actions/Discount_Item_level/ConfirmItemLevelDisc'))

WebUI.scrollToElement(findTestObject('OrderEdit_actions/Discount_Item_level/Savecalculate btn'), 0)

subtotal = WebUI.getText(findTestObject('Calculations verifications/Page_GetIntValues/Subtotla'))

grandtotal = WebUI.getText(findTestObject('Calculations verifications/Page_GetIntValues/GrandTotal'))

WebUI.verifyNotEqual(subtotal, grandtotal)

