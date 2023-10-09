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

WebUI.click(findTestObject('OrderEdit_actions/input_EditCompanyName'))

WebUI.setText(findTestObject('OrderEdit_actions/input_EditCompanyName'), '')

WebUI.setText(findTestObject('OrderEdit_actions/input_EditCompanyName'), 'Latest Company co')

WebUI.click(findTestObject('OrderEdit_actions/input_EditAddress_Order'))

WebUI.setText(findTestObject('OrderEdit_actions/input_EditAddress_Order'), '')

WebUI.setText(findTestObject('OrderEdit_actions/input_EditAddress_Order'), '8754212 Oxford Court, Montgomery AL 54884')

WebUI.scrollToElement(findTestObject('OrderEdit_actions/input_PhoneEdit'), 0)

WebUI.click(findTestObject('OrderEdit_actions/input_PhoneEdit'))

WebUI.setText(findTestObject('OrderEdit_actions/input_PhoneEdit'), '')

WebUI.setText(findTestObject('OrderEdit_actions/input_PhoneEdit'), '7414674318')

WebUI.click(findTestObject('OrderEdit_actions/a_PasteAddress_ShipTo'))

WebUI.waitForJQueryLoad(0)

WebUI.click(findTestObject('OrderEdit_actions/Edit_productQty'))

WebUI.setText(findTestObject('OrderEdit_actions/Edit_productQty'), '')

WebUI.setText(findTestObject('OrderEdit_actions/Edit_productQty'), '2')

WebUI.click(findTestObject('OrderEdit_actions/Edit_unitprice'))

WebUI.setText(findTestObject('OrderEdit_actions/Edit_unitprice'), '')

WebUI.setText(findTestObject('OrderEdit_actions/Edit_unitprice'), '10')

WebUI.click(findTestObject('OrderEdit_actions/save Calcualte btn'))

WebUI.waitForJQueryLoad(0)

WebUI.click(findTestObject('OrderEdit_actions/input_EidtSaveOrder'))

