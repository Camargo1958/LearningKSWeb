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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('HomePage/a_Sign in'))

WebUI.click(findTestObject('LoginPage/input_Email address_email_create'))

WebUI.setText(findTestObject('LoginPage/input_Email address_email_create'), 'peterjenkins777@test.com')

WebUI.click(findTestObject('LoginPage/span_Create an account'))

WebUI.click(findTestObject('RegistrationPage/input_Mr_id_gender'))

WebUI.setText(findTestObject('RegistrationPage/input__customer_firstname'), 'Peter')

WebUI.setText(findTestObject('RegistrationPage/input__customer_lastname'), 'Jenkins')

WebUI.click(findTestObject('RegistrationPage/input__email'))

WebUI.setEncryptedText(findTestObject('RegistrationPage/input__passwd'), 'eFl1iyAb2pw=')

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_-12345678910111213141516171819202122_51e29d'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_-20222021202020192018201720162015201_66c453'), 
    '2007', true)

WebUI.click(findTestObject('RegistrationPage/input_July_newsletter'))

WebUI.click(findTestObject('RegistrationPage/input_Sign up for our newsletter_optin'))

WebUI.click(findTestObject('RegistrationPage/input_July_newsletter'))

WebUI.click(findTestObject('RegistrationPage/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('RegistrationPage/input_Company_company'), 'Test Co')

WebUI.click(findTestObject('RegistrationPage/input__address1'))

WebUI.setText(findTestObject('RegistrationPage/input__address1'), '77 Main Street')

WebUI.setText(findTestObject('RegistrationPage/input_Address (Line 2)_address2'), 'suite 34')

WebUI.setText(findTestObject('RegistrationPage/input__city'), 'London')

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '14', true)

WebUI.setText(findTestObject('RegistrationPage/input__postcode'), '98765')

WebUI.setText(findTestObject('RegistrationPage/textarea_Additional information_other'), 'No')

WebUI.click(findTestObject('RegistrationPage/input_Home phone_phone'))

WebUI.setText(findTestObject('RegistrationPage/input_Home phone_phone'), '2234 0978')

WebUI.setText(findTestObject('RegistrationPage/input__phone_mobile'), '09987 765432')

WebUI.click(findTestObject('RegistrationPage/span_Register'))

WebUI.closeBrowser()

