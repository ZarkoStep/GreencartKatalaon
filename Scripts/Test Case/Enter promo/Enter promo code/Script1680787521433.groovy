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
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver


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

WebUI.delay(1)

// (for the promo code number use the Total Amount number)
def text = WebUI.getText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/span_304'))

// Total Amount number should be used and entered in the Promo Code field
WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_Total_promoCode'), text)

//Click on Apply button
WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Apply'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Enter promo code/error message'), 'Invalid code ..!')

//Error message should be displayed
WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/div_Product NameQuantiryPriceTotalCarrot - _6acca8'))

//Click on Place Order button
WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Place Order'))



WebUI.closeBrowser()
