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

WebUI.verifyElementVisible(findTestObject('Home Page/logoMidblock'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Home Page/Home Page Text'))

WebUI.click(findTestObject('Home Page/Next Section Button'))

WebUI.verifyElementVisible(findTestObject('Home Page/Player Insights Text'))

WebUI.verifyElementClickable(findTestObject('Home Page/View More Player Insights'))

WebUI.click(findTestObject('Home Page/Next Section Button'))

WebUI.verifyElementVisible(findTestObject('Home Page/Team Text'))

WebUI.verifyElementClickable(findTestObject('Home Page/View More Team'))

WebUI.click(findTestObject('Home Page/Next Section Button'))

WebUI.verifyElementVisible(findTestObject('Home Page/Home Page Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Our Featured Solution Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Player Perfomance Section/Player Pefomance Text'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Home Page/Player Perfomance Section/See More Player Perfomance Button'))

WebUI.verifyElementVisible(findTestObject('Home Page/Team Perfomance Section/Team Perfomance Text'))

WebUI.verifyElementClickable(findTestObject('Home Page/Team Perfomance Section/See More Team Perfomance Button'))

WebUI.verifyElementVisible(findTestObject('Home Page/Our Competition Client Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Value Our Competition Client'))

WebUI.verifyElementVisible(findTestObject('Home Page/Our Club Client Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Value Our Club Client'))

WebUI.verifyElementVisible(findTestObject('Home Page/Our Media Client Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Value Our Media Client'))

WebUI.verifyElementVisible(findTestObject('Home Page/Digital AI Text'))

WebUI.verifyElementVisible(findTestObject('Home Page/Digital AI Video'))

WebUI.verifyElementClickable(findTestObject('Home Page/Digital AI Video'))

WebUI.callTestCase(findTestCase('General/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

