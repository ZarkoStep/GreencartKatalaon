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

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.navigateToUrl('https://webdriveruniversity.com/')

WebUI.switchToWindowTitle('https://webdriveruniversity.com/')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/a_WebdriverUniversity.com (New Approach To )'))

WebUI.switchToWindowTitle('WebDriverUniversity.com')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_ACTIONS'))

WebUI.switchToWindowTitle('WebDriverUniversity.com')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_CONTACT US'))

WebUI.switchToWindowTitle('WebDriver | Actions')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/div_DRAG ME TO MY TARGET'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/a_Link 1'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.navigateToUrl('https://webdriveruniversity.com/')

WebUI.switchToWindowTitle('https://webdriveruniversity.com/')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/a_WebdriverUniversity.com (New Approach To )'))

WebUI.switchToWindowTitle('WebDriverUniversity.com')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_ACTIONS'))

WebUI.switchToWindowTitle('WebDriverUniversity.com')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_CONTACT US'))

WebUI.switchToWindowTitle('WebDriver | Actions')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/a_Link 1'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webdriveruniversity.com/')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_ACTIONS'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/p_DRAG ME TO MY TARGET'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/p_DRAG ME TO MY TARGET'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/p_DRAG ME TO MY TARGET'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/button_Hover Over Me First'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/a_Link 1'))

