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

WebUI.click(findTestObject('Page_My Store/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'peterjenkins777@test.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Peter')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'Jenkins')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'eFl1iyAb2pw=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20222021202020192018201720162015201_66c453'), 
    '2007', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_July_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Sign up for our newsletter_optin'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_July_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'Test Co')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__address1'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), '77 Main Street')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'suite 34')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'London')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '14', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '98765')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), 'No')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '2234 0978')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '09987 765432')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.closeBrowser()

