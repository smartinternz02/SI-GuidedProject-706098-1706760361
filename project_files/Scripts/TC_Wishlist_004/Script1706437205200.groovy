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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_email'), '9573036310')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Sign In/input_password'), 'qXiBuml661/cKlcuxN7ZqQ==')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'pillows')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.in  pillows/span_Wakefit Microfiber Height Adjustable H_61883f'))

WebUI.switchToWindowTitle('Wakefit Microfiber Height Adjustable Hollow Fibre Sleeping Pillow With Zip | Set of 2 (White And Grey,  27 X 16 Inches) : Amazon.in: Sports, Fitness & Outdoors')

WebUI.click(findTestObject('Object Repository/Page_Wakefit Microfiber Height Adjustable H_67c2ca/input_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.in Shopping Cart/a_Go to Cart'))

WebUI.closeBrowser()

