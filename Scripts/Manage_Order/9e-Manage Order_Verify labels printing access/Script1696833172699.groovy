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

WebUI.selectOptionByValue(findTestObject('Page_CaseQty/Select_Actions'), 'PrintProductLabels', false)

WebUI.click(findTestObject('Page_CaseQty/input_GoBtn'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Label_Print/input_SKU_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_UPC_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_FNSKU_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_ASIN_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_Detailed_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_LabelPaper_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_EAN_select'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Label_Print/input_GTIN_select'))

