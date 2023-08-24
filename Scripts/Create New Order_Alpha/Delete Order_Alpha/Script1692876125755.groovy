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

'This will get the order num after creating the order'
Order_Num = WebUI.getText(findTestObject('Page_Delete_Order/get order value'))

WebUI.click(findTestObject('Page_Delete_Order/a_Manage Orders'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Delete_Order/input_Order_value'))

WebUI.setText(findTestObject('Page_Delete_Order/input_Order_value'), Order_Num)

WebUI.click(findTestObject('Page_Delete_Order/input_select_btnSearch'))

WebUI.click(findTestObject('Page_Delete_Order/input_columnSelectCheckBox'))

WebUI.click(findTestObject('Page_Delete_Order/Select_Actionfor_deleteOrder'))

'Add the delete action value here.you can get this by inspecting the element '
WebUI.selectOptionByValue(findTestObject('Page_Delete_Order/Select_Actionfor_deleteOrder'), '8101', false)

WebUI.click(findTestObject('Page_Delete_Order/input_MarkSelectedGO'))

WebUI.verifyElementText(findTestObject('Page_Delete_Order/matchText_confirm_DeleteOrderTxt'), 'Are you sure you want to delete 1 Orders?')

WebUI.click(findTestObject('Page_Delete_Order/input_ConfirmDelete_ContinueFnlDelete'))

