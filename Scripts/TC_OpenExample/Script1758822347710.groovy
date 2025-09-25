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

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// 1. Open browser
WebUI.openBrowser('')

// 2. Navigate to Example.com
WebUI.navigateToUrl('https://example.com')

// 3. Verify page text
WebUI.verifyTextPresent('Example Domain', false)

// 4. Highlight the heading (h1 text "Example Domain")
TestObject heading = new TestObject('heading')
heading.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//h1')
WebUI.verifyElementPresent(heading, 5)

// 5. Get the text of heading and log it
String headingText = WebUI.getText(heading)
WebUI.comment("Heading text is: " + headingText)

// 6. Verify paragraph text exists
TestObject para = new TestObject('paragraph')
para.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//p')
WebUI.verifyElementPresent(para, 5)
String paraText = WebUI.getText(para)
WebUI.comment("Paragraph text is: " + paraText)

// 7. Take a screenshot
WebUI.takeScreenshot('Reports/example_page.png')

// 8. Close browser
WebUI.closeBrowser()

// Demo: open example.com and assert text is present
WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com')
WebUI.verifyTextPresent('Example Domain', false)
WebUI.closeBrowser()
