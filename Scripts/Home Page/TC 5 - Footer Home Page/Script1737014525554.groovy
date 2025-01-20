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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://midblockstats.com/')

WebUI.verifyElementVisible(findTestObject('Home Page/Footer Home Page/Contact'))

WebUI.verifyElementVisible(findTestObject('Home Page/Footer Home Page/Resource'))

WebUI.verifyElementVisible(findTestObject('Home Page/Footer Home Page/Footer Text'))

WebUI.verifyElementText(findTestObject('Home Page/Footer Home Page/Location'), 'Jakarta, Indonesia')

WebUI.verifyElementText(findTestObject('Home Page/Footer Home Page/Email'), 'business@thecourtstats.com')

WebUI.verifyElementText(findTestObject('Home Page/Footer Home Page/Number Phone'), '+62 814-6038-0735')

WebUI.verifyElementClickable(findTestObject('Home Page/Footer Home Page/Number Phone'))

WebUI.verifyElementClickable(findTestObject('Home Page/Footer Home Page/Instagram Logo'))

WebUI.verifyElementClickable(findTestObject('Home Page/Footer Home Page/LinkedIn Logo'))

WebUI.verifyElementVisible(findTestObject('Home Page/Footer Home Page/Home Resources'))

WebUI.click(findTestObject('Home Page/Footer Home Page/Home Resources'))

WebUI.verifyElementVisible(findTestObject('Home Page/Home Page Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Footer Home Page/Player Perfomances Resources'))

WebUI.click(findTestObject('Home Page/Footer Home Page/Player Perfomances Resources'))

WebUI.verifyElementVisible(findTestObject('Player Perfomance/Dashboard Text'))

WebUI.navigateToUrl('https://midblockstats.com/')

WebUI.verifyElementVisible(findTestObject('Home Page/Footer Home Page/Team Perfomances Resources'))

WebUI.click(findTestObject('Home Page/Footer Home Page/Team Perfomances Resources'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Home Team Perfomance Text'))

WebUI.closeBrowser()

