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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://cwa/login.aspx?ReturnUrl=%2f')

WebUI.setText(findTestObject('Object Repository/Page_SellerCloud/input_Email Address_ctl00ContentPlaceHolder_5caeea'), 'umer.m@sellercloud.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SellerCloud/input_Password_ctl00ContentPlaceHolder1txtPwd'), 
    'oMYFmvvfqWpyT73MSll7MQ==')

WebUI.click(findTestObject('Object Repository/Page_SellerCloud/input_Remember me next time_ctl00ContentPla_398d79'))

WebUI.click(findTestObject('Object Repository/Page_SellerCloud Homepage/span_Home'))

