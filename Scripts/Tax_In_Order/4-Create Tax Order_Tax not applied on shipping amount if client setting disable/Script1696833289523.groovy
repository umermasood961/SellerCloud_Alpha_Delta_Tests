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

taxvalue1 = WebUI.getText(findTestObject('Page_Tax/GetTaxValSBT'))

grandtotalprice = WebUI.getText(findTestObject('Page_Tax/Check GTprice'))

WebUI.navigateToUrl('http://cwa/Settings/ClientSetting.aspx')

Checkboxstate = WebUI.verifyElementNotChecked(findTestObject('Ship tax cal/input_chkChargeTaxOnShipping'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://cwa/Orders/ManageOrders.aspx?DateRange=6&ShipDateRange=9&CompanyId=&advancedMode=false&LocationNotesFilter=0')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_texsave/select order'))

WebUI.click(findTestObject('Page_texsave/selectActions'))

WebUI.selectOptionByValue(findTestObject('Page_texsave/selectActions'), '5000', false)

WebUI.click(findTestObject('Page_texsave/Go_btn'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Ship_AfterEdit/Input_shippingPriceaftrEdit'))

WebUI.setText(findTestObject('Ship_AfterEdit/Input_shippingPriceaftrEdit'), '')

WebUI.setText(findTestObject('Ship_AfterEdit/Input_shippingPriceaftrEdit'), '10')

WebUI.scrollToElement(findTestObject('Page_texsave/saveAdnCalculateBtn'), 0)

WebUI.click(findTestObject('Page_texsave/saveAdnCalculateBtn'))

WebUI.click(findTestObject('Page_texsave/SaveMainBtn'))

WebUI.scrollToElement(findTestObject('Page_texsave/saveAdnCalculateBtn'), 0)

WebUI.click(findTestObject('Page_texsave/saveAdnCalculateBtn'))

taxvalue2 = WebUI.getText(findTestObject('Page_Tax/GetTaxValSBT'))

shipvalueAfterEdit = WebUI.getText(findTestObject('Ship_AfterEdit/Getshipamount'))

