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

WebUI.callTestCase(findTestCase('General/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Team Perfomance Button Page'))

WebUI.click(findTestObject('Team Perfomance/Team Perfomance Button Page'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/View More Button Competitive'))

WebUI.click(findTestObject('Team Perfomance/View More Button Competitive'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/This Is For You Text'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/For Clubs Text'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Value For Clubs'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/For Sports Text'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Value For Sports'))

WebUI.click(findTestObject('Team Perfomance/Next Section Button'))

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Advanced Matrics Text'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Team Perfomance/View More Button Advanced Text'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Team Perfomance/View More Button Advanced Matrics'))

WebUI.verifyElementText(findTestObject('Team Perfomance/Dashboard Capabilities Text'), 'DASHBOARD CAPABILITIES')

WebUI.verifyElementText(findTestObject('Team Perfomance/Box Stats Text'), 'Box Stats')

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Chart Box Stats'))

WebUI.verifyElementText(findTestObject('Team Perfomance/Advanced Categorical Text'), 'Advanced Categorical Analytics')

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Chart Advanced Categorical'))

WebUI.verifyElementText(findTestObject('Team Perfomance/Advance Time Metrics Text'), 'Advanced Time Metrics')

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Chart Advanecd Time Metrics'))

WebUI.verifyElementText(findTestObject('Team Perfomance/Mid Blocks Features Text'), 'Mid Block Features')

WebUI.verifyElementVisible(findTestObject('Team Perfomance/Chart Mid Blocks Feature'))

WebUI.callTestCase(findTestCase('General/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

