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

WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')

for (def i = 0; i < 4; i++) {
    WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))
}

for (def i = 0; i < 3; i++) {
    WebUI.click(findTestObject('Page_GreenKart - veg and fruits kart/button_ADD TO CART random'))
}

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/img'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_PROCEED TO CHECKOUT'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Page_GreenKart - veg and fruits kart/Quantiry'), 10)

WebUI.takeScreenshot()

WebUI.closeBrowser()

