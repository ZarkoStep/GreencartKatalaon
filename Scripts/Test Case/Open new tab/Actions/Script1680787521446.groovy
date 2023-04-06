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
import org.openqa.selenium.Alert as Alert

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationUrl)

WebUI.scrollToElement(findTestObject('webdriver univesity/Page_WebDriverUniversity.com/Webdriver waits can be'), 2)

String path = WebUI.takeScreenshot()

WebUI.takeScreenshot('C:\\Users\\User\\Downloads\\test.png')

WebUI.takeScreenshot('C:\\Users\\User\\Downloads\\Action section .png')

WebUI.verifyElementText(findTestObject('webdriver univesity/Page_WebDriverUniversity.com/h1_ACTIONS'), 'ACTIONS')

WebUI.click(findTestObject('Object Repository/webdriver univesity/Page_WebDriverUniversity.com/h1_ACTIONS'))

WebUI.takeScreenshot('C:\\Users\\User\\Downloads\\Action section .png')

WebUI.delay(1)

WebUI.switchToWindowTitle('WebDriver | Actions')

WebUI.delay(1)

WebUI.dragAndDropToObject(findTestObject('Page_WebDriver  Actions/p_DRAG ME TO MY TARGET'), findTestObject('Page_WebDriver  Actions/Drop me here'))

WebUI.delay(1)

WebUI.takeScreenshot('C:\\Users\\User\\Downloads\\Before dragging.png')

WebUI.verifyElementNotVisible(findTestObject('Page_WebDriver  Actions/a_Link 1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/button_Hover Over Me First'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Actions/a_Link 1'))

WebUI.waitForAlert(1)

String alertText = WebUI.getAlertText(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://www.webdriveruniversity.com/Contact-Us/contactus.html')

WebUI.delay(2)

WebUI.setText(findTestObject('Contact/Contact textarea'), alertText)

WebUI.delay(1)

WebUI.closeBrowser()

