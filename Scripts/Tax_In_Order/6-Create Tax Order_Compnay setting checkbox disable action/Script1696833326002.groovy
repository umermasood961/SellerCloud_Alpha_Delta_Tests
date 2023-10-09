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

WebUI.callTestCase(findTestCase('Create New Order_Alpha/Create Order_With Product_Alpha 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrderEdit_actions/select_clickActionsdepdown'))

WebUI.selectOptionByValue(findTestObject('OrderEdit_actions/select_clickActionsdepdown'), '5000', false)

WebUI.click(findTestObject('OrderEdit_actions/input_GoActionBtn'))

WebUI.waitForPageLoad(2)

WebUI.scrollToElement(findTestObject('Page_Tax/Tax Override  Addresses'), 0)

WebUI.scrollToElement(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'), 0)

WebUI.click(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'), '')

WebUI.setText(findTestObject('OrderEdit_actions/Discount_Item_level/change Price'), '5')

WebUI.click(findTestObject('Page_Tax/input_TaxRate'))

WebUI.setText(findTestObject('Page_Tax/input_TaxRate'), '')

WebUI.setText(findTestObject('Page_Tax/input_TaxRate'), '2')

WebUI.click(findTestObject('Page_Tax/input_Go Btn'))

WebUI.waitForJQueryLoad(0)

WebUI.scrollToElement(findTestObject('Page_Tax/save calculation btn'), 0)

WebUI.click(findTestObject('Page_Tax/save calculation btn'))

WebUI.scrollToElement(findTestObject('Page_Tax/Page_Taxupdate/a_Clear Taxes'), 0)

WebUI.click(findTestObject('Page_Tax/Page_Taxupdate/a_Clear Taxes'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_Tax/Page_Taxupdate/input__AddtxtRate'))

WebUI.setText(findTestObject('Page_Tax/Page_Taxupdate/input__AddtxtRate'), '')

WebUI.setText(findTestObject('Page_Tax/Page_Taxupdate/input__AddtxtRate'), '25')

WebUI.click(findTestObject('Page_Tax/Page_Taxupdate/TaxGobtn'))

WebUI.scrollToElement(findTestObject('Page_Tax/save calculation btn'), 0)

WebUI.click(findTestObject('Page_Tax/save calculation btn'))

taxpercentage = WebUI.getText(findTestObject('Page_Tax/get_texPRvalue'))

taxvalue = WebUI.getText(findTestObject('Page_Tax/GetTaxValSBT'))

grandtotalprice = WebUI.getText(findTestObject('Page_Tax/Check GTprice'))

grandtotalprice = WebUI.getText(findTestObject('Extras_CreateOrder/Shp_Value/addShipPrice'))

reload_URL = WebUI.getUrl()

WebUI.waitForPageLoad(0)

'Add compnay id here\r\n'
WebUI.navigateToUrl('http://cwa/settings/Merchant_Taxes.aspx?MerchantID=' + '164')

WebUI.click(findTestObject('Edit_TaxWork/a_Edit'))

WebUI.waitForPageLoad(2)

WebUI.verifyTextPresent('Do not charge tax on shipping', false)

WebUI.verifyElementNotChecked(findTestObject('Edit_TaxWork/CheckorUncheckState'), 0)

WebUI.click(findTestObject('Edit_TaxWork/SaveTaxBtn'))

WebUI.navigateToUrl(reload_URL)

WebUI.waitForPageLoad(5)

WebUI.scrollToElement(findTestObject('Extras_CreateOrder/Shp_Value/FirstSaveandCalcualte'), 0)

WebUI.click(findTestObject('Extras_CreateOrder/Shp_Value/FirstSaveandCalcualte'))

WebUI.scrollToElement(findTestObject('Extras_CreateOrder/Shp_Value/ManeSaveOrdr'), 0)

WebUI.click(findTestObject('Extras_CreateOrder/Shp_Value/ManeSaveOrdr'))

Ship_Value = WebUI.getText(findTestObject('Extras_CreateOrder/Shp_Value/ShipVal'))

Ship_Disc = WebUI.getText(findTestObject('Extras_CreateOrder/Shp_Value/ShpDics'))

WebUI.scrollToElement(findTestObject('Extras_CreateOrder/Shp_Value/ShpDics'), 0)

