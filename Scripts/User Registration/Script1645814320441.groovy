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

WebUI.click(findTestObject('HomePage/button_SignIn'))

WebUI.click(findTestObject('LoginPage/RegistrationSection/input_EmailAddress'))

WebUI.setText(findTestObject('LoginPage/RegistrationSection/input_EmailAddress'), 'peterjenkins777@test.com')

WebUI.click(findTestObject('LoginPage/RegistrationSection/button_CreateAnAccount'))

WebUI.click(findTestObject('RegistrationPage/radio_Gender_Mr'))

WebUI.setText(findTestObject('RegistrationPage/PersonalInfoSection/input_CustomerFirstname'), 'Peter')

WebUI.setText(findTestObject('RegistrationPage/PersonalInfoSection/input_CustomerLastname'), 'Jenkins')

WebUI.click(findTestObject('RegistrationPage/input__email'))

WebUI.setEncryptedText(findTestObject('RegistrationPage/input__passwd'), 'eFl1iyAb2pw=')

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_DoB_Day'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_DoB_Month'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_DoB_Year'), 
    '2007', true)

WebUI.click(findTestObject('RegistrationPage/check_SignUpForNewsletter'))

WebUI.click(findTestObject('RegistrationPage/check_PartnerSpecialOffers'))

WebUI.click(findTestObject('RegistrationPage/check_SignUpForNewsletter'))

WebUI.click(findTestObject('RegistrationPage/check_PartnerSpecialOffers'))

WebUI.setText(findTestObject('RegistrationPage/input_Company'), 'Test Co')

WebUI.click(findTestObject('RegistrationPage/input__address1'))

WebUI.setText(findTestObject('RegistrationPage/input__address1'), '77 Main Street')

WebUI.setText(findTestObject('RegistrationPage/input_Address (Line 2)_address2'), 'suite 34')

WebUI.setText(findTestObject('RegistrationPage/input__city'), 'London')

WebUI.selectOptionByValue(findTestObject('RegistrationPage/select_State'), 
    '14', true)

WebUI.setText(findTestObject('RegistrationPage/input__postcode'), '98765')

WebUI.setText(findTestObject('RegistrationPage/textarea_Additional information_other'), 'No')

WebUI.click(findTestObject('RegistrationPage/input_Home phone'))

WebUI.setText(findTestObject('RegistrationPage/input_Home phone'), '2234 0978')

WebUI.setText(findTestObject('RegistrationPage/input__phone_mobile'), '09987 765432')

WebUI.click(findTestObject('RegistrationPage/button_Register'))

WebUI.closeBrowser()

