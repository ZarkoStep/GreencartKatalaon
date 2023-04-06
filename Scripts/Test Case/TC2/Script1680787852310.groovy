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

WebUI.navigateToUrl(GlobalVariable.ApplicationUrl)

WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'GreenKart - veg and fruits kart', true)

// 1. Add 1 item in the basket 4 times using FOR loop
for (def i = 0; i < 4; i++) {
    WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART'))
}

//2. Add 3 random items in the basket
for (def i = 0; i < 3; i++) {
    WebUI.click(findTestObject('Page_GreenKart - veg and fruits kart/button_ADD TO CART random'))
}

//3. Click on basket icon and then click on Proceed to checkout button
WebUI.click(findTestObject('Page_GreenKart - veg and fruits kart/img'))

WebUI.delay(GlobalVariable.DelayTime)

WebUI.takeScreenshot('C:\\Users\\User\\Downloads\\Product in cart.png')

WebUI.click(findTestObject('Page_GreenKart - veg and fruits kart/button_PROCEED TO CHECKOUT'))

WebUI.getValue('Page_GreenKart - veg and fruits kart/items')

WebUI.takeScreenshot('C:\\Users\\User\\Downloads\\Product in table.png')
WebUI.closeBrowser()