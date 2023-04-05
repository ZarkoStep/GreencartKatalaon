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

WebUI.click(findTestObject('Page_GreenKart - veg and fruits kart/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/webdriver univesity/Page_GreenKart - veg and fruits kart/img'))

WebUI.click(findTestObject('HomePage/Header/Cart'))

WebUI.delay(2)

WebUI.click(findTestObject('HomePage/Header/button_PROCEED TO CHECKOUT'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_GreenKart - veg and fruits kart/button_Place Order'))

WebUI.delay(2)

WebUI.click(findTestObject('webdriver univesity/Page_GreenKart - veg and fruits kart/input_Choose Country_chkAgree'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.switchToWindowTitle('Switch To Window Title')

WebUI.click(findTestObject('Page_WebDriverUniversity.com/a_WebdriverUniversity.com (New Approach To )'))

WebUI.delay(2)

WebUI.switchToWindowTitle('WebDriver | Actions')

WebUI.delay(2)

//Open a new tab and switch to it
WebUI.sendKeys(null, Keys.chord(Keys.CONTROL, 't'))

//Enter the URL in the address bar
WebUI.sendKeys(findTestObject('Page_newtab/input_Address bar'), 'http://www.webdriveruniversity.com/')

WebUI.sendKeys(findTestObject('Page_newtab/input_Address bar'), Keys.ENTER)

WebUI.switchToWindowTitle('http://www.webdriveruniversity.com/')

WebUI.scrollToElement(findTestObject('webdriver univesity/Page_WebDriverUniversity.com/h1_ACTIONS'), 2)

WebUI.click(findTestObject('Object Repository/webdriver univesity/Page_WebDriverUniversity.com/h1_ACTIONS'))

WebUI.switchToWindowTitle('WebDriverUniversity.com')

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.switchToWindowTitle('WebDriver | Actions')

WebUI.click(findTestObject('Object Repository/webdriver univesity/Page_WebDriver  Actions/p_DRAG ME TO MY TARGET'))

WebUI.verifyElementVisible(findTestObject('Object Repository/webdriver univesity/Page_WebDriver  Actions/button_Hover Over Me First'))

WebUI.mouseOver(findTestObject('webdriver univesity/Page_WebDriver  Actions/button_Hover Over Me First'))

WebUI.click(findTestObject('Object Repository/webdriver univesity/Page_WebDriver  Actions/a_Link 1'))

WebUI.verifyAlertPresent(0)

WebUI.getAlertText()

WebUI.acceptAlert()

