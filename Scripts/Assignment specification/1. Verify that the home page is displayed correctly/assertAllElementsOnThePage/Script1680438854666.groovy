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

WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/header_GREENKARTFree Access to InterviewQue_8c5b1b'))

WebUI.verifyElementText(findTestObject('HomePage/Header/Free access to interview Ques'), 'Free Access to InterviewQues/ResumeAssistance/Material')

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/div_GREENKARTFree Access to InterviewQuesRe_7de52d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/div_GREENKART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/span_KART'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Header/button_KART_search-button'))

WebUI.verifyElementVisible(findTestObject('HomePage/Header/a_Free Access to InterviewQuesResumeAssista_ebce08'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Header/a_Top Deals'), 'Top Deals')

WebUI.verifyElementText(findTestObject('HomePage/Header/a_Flight Booking'), 'Flight Booking')

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/img'))

WebUI.click(findTestObject('HomePage/Page_GreenKart - veg and fruits kart/img'))

WebUI.verifyElementVisible(findTestObject('HomePage/Header/Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/h2_You cart is empty'), 
    'You cart is empty!')

WebUI.waitForElementNotClickable(findTestObject('Object Repository/HomePage/Header/button_PROCEED TO CHECKOUT'), 3)

WebUI.verifyElementText(findTestObject('HomePage/Header/button_PROCEED TO CHECKOUT'), 'PROCEED TO CHECKOUT')

WebUI.click(findTestObject('Object Repository/HomePage/Page_GreenKart - veg and fruits kart/p_120'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Header/itemAdd'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Header/increment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage/Header/button_ADD TO CART'))

WebUI.closeBrowser()

