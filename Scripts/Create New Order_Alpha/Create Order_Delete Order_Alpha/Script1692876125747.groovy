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

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_UserFirstName_UA'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_UserFirstName_UA'), 'Dummy')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_txtUserLastName_UA'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_txtUserLastName_UA'), 'Person')

WebUI.verifyElementText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/td_Billing_To_BT'), 'Billing To')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Company_BillingAddssCompanyField'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Company_BillingAddssCompanyField'), 'Testing Co')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_First_BillingAddssFirstNameField'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_First_BillingAddssFirstNameField'), 'Testing')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Last_BillingAddssLastNameField'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Last_BillingAddssLastNameField'), 'Purpose')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Address_ShippingAddressStreet1Field'))

'Dummy Address'
WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Address_ShippingAddressStreet1Field'), 
    '5331 Rexford Court, Montgomery AL 36116')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_CityBillingAddssCityField'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_CityBillingAddssCityField'), 'DummyCityTown')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_StateZip_BillingAddssPostalCodeField'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_StateZip_BillingAddssPostalCodeField'), 
    '6541230')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/select_Country_BillingAddss'))

WebUI.selectOptionByValue(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/select_Country_BillingAddss'), 
    'US', false)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Phone_BillingAddssPhoneField'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Phone_BillingAddssPhoneField'), '090078601')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/a_Copy_Billing_ShitTo'))

WebUI.waitForPageLoad(2)

WebUI.scrollToElement(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Phone_BillingAddssPhoneField'), 
    0)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Customer Instructions_txtCustomerInstructions_OtherInfo'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Customer Instructions_txtCustomerInstructions_OtherInfo'), 
    'cover with good hands')

'if you want to change the rating then open the object and change the value according to rating'
WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/input_Rating_rating_Rtng'))

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/textarea_Order Notes_1tbOrderNotes'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_SellerCloud_Orders/textarea_Order Notes_1tbOrderNotes'), 'Lorem Ipsum')

WebUI.scrollToElement(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/td_Shipping Method'), 0)

WebUI.verifyElementText(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/td_Shipping Method'), 'Shipping Method')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/select_carrier_NameComp_select'))

'add carrier name here\r\n'
WebUI.selectOptionByValue(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/select_carrier_NameComp_select'), 'Amazon', 
    false)

WebUI.waitForJQueryLoad(0)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/select_method_after_carriername_select'))

'add carrier method here'
WebUI.selectOptionByValue(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/select_method_after_carriername_select'), 
    'AmazonMerchantFulfillment', false)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_lboz_txtWeightLbs'))

'add weight in Lbs'
WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_lboz_txtWeightLbs'), '3')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_lboz_txtWeightOz'))

'add weight in Oz'
WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_lboz_txtWeightOz'), '6')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_Shipping Price_txtShippingCost'))

'add shipping cost price here'
WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_Shipping Price_txtShippingCost'), '1.8')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_Shipping Promise Date_txtShippingPromisedate'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_Shipping Promise Date_txtShippingPromisedate'), 
    '12/30/2023 12:00 AM')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_txtEstimatedDeliveryDate'))

WebUI.setText(findTestObject('Orders_Alpha_CreateNew/Page_Shipping_Mthd/input_txtEstimatedDeliveryDate'), '11/30/2023 12:00 AM')

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Payment_infor/select_Payment_mthd_for_payment'))

'find payment method by inspecting the payment method'
WebUI.selectOptionByValue(findTestObject('Orders_Alpha_CreateNew/Page_Payment_infor/select_Payment_mthd_for_payment'), '30', 
    false)

WebUI.click(findTestObject('Orders_Alpha_CreateNew/Page_Payment_infor/input_Refresh_Totals_btnCreateOrder_SaveOrder'))

WebUI.waitForPageLoad(5)

WebUI.getText(findTestObject('Page_SellerCloud_Login/Page_After_Order_create/span_get ordernumber'))

WebUI.callTestCase(findTestCase('Create New Order_Alpha/Delete Order_Alpha'), [:], FailureHandling.STOP_ON_FAILURE)

