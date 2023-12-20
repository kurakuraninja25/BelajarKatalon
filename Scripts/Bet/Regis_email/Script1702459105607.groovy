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

WebUI.navigateToUrl('https://www.asiabet5000.com/en')

WebUI.click(findTestObject('Object Repository/regis_email/button_register'))

WebUI.setText(findTestObject('Object Repository/regis_email/input_username'), 'beruang')

WebUI.setText(findTestObject('Object Repository/regis_email/input_email'), 'kangguru@email.com')

WebUI.setText(findTestObject('Object Repository/regis_email/input_phone'), '083333333333333')

WebUI.setEncryptedText(findTestObject('Object Repository/regis_email/input_password'), 'p4y+y39Ir5MTnmIMzlS5SQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/regis_email/input_retype_password'), 'p4y+y39Ir5MTnmIMzlS5SQ==')

WebUI.click(findTestObject('Object Repository/regis_email/div_absolute top-0 right-0 bottom-0 left-0 _99d12f'))

WebUI.click(findTestObject('Object Repository/regis_email/label_BCA'))

WebUI.click(findTestObject('Object Repository/regis_email/button_Pilih'))

WebUI.setText(findTestObject('Object Repository/regis_email/input_account_name'), 'MARJUKi')

WebUI.setText(findTestObject('Object Repository/regis_email/input_account_number'), '33333333333333333333')

WebUI.click(findTestObject('Object Repository/regis_email/button_register'))

WebUI.click(findTestObject('Object Repository/regis_email/button_register'))

WebUI.closeBrowser()

