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

WebUI.click(findTestObject('Player Perfomance/Player Perfomance Button Page'))

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/League Coverage Heading'))

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/League Coverage Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/BRI Liga 1 Section'))

WebUI.verifyElementText(findTestObject('Home Page/League Coverage/BRI Liga 1 Text'), 'BRI LIGA 1')

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/AFC Qualifiers Section'))

WebUI.verifyElementText(findTestObject('Home Page/League Coverage/AFC Qualifiers Text'), 'AFC QUALIFIERS')

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/Thai League Section'))

WebUI.verifyElementText(findTestObject('Home Page/League Coverage/Thai League Text'), 'THAI LEAGUE')

WebUI.click(findTestObject('Home Page/League Coverage/Next Section Button of League Coverage'))

WebUI.click(findTestObject('Home Page/League Coverage/Next Section Button of League Coverage'))

WebUI.click(findTestObject('Home Page/League Coverage/Next Section Button of League Coverage'))

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/Asian Cup Section'))

WebUI.verifyElementText(findTestObject('Home Page/League Coverage/Asian Cup Text'), 'ASIAN CUP')

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/Liga Super Malaysia Section'))

WebUI.verifyElementText(findTestObject('Home Page/League Coverage/Liga Super Malaysia Text'), 'LIGA SUPER MALAYSIA')

WebUI.verifyElementVisible(findTestObject('Home Page/League Coverage/ACL Section'))

WebUI.verifyElementText(findTestObject('Home Page/League Coverage/ACL Text'), 'ACL')

WebUI.click(findTestObject('Home Page/League Coverage/Back Section Button of League Coverage'))

WebUI.click(findTestObject('Home Page/League Coverage/Back Section Button of League Coverage'))

WebUI.click(findTestObject('Home Page/League Coverage/Back Section Button of League Coverage'))

WebUI.closeBrowser()

