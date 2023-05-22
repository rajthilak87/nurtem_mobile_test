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

Mobile.startApplication('D:\\nurtem_mobile\\Nurtem-Tutor.apk', true)

Mobile.tap(findTestObject('Object Repository/Application/android.widget.EditText - srinivasesaivanan6325gmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Application/android.widget.EditText - srinivasesaivanan6325gmail.com (1)'), 
    'chandramouli.klm@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Application/android.widget.EditText -'), 0)

Mobile.setText(findTestObject('Object Repository/Application/android.widget.EditText - (1)'), 'Admin@123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Application/android.widget.Button (1)'), 0)

Mobile.closeApplication()

Mobile.startApplication('D:\\nurtem_mobile\\Nurtem-Tutor.apk', true)

Mobile.tap(findTestObject('Object Repository/Application/android.widget.EditText - chandramouli.klmgmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Application/android.widget.EditText - chandramouli.klmgmail.com (1)'), 
    'basicmasterapps@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject(''), 'Test@1234', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject(''), 'Test@1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

Mobile.startApplication('D:\\nurtem_mobile\\Nurtem-Tutor.apk', true)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Application/android.widget.Button (2)'), 0)

Mobile.startApplication('D:\\nurtem_mobile\\Nurtem-Tutor.apk', true)

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

Mobile.startApplication('D:\\nurtem_mobile\\Nurtem-Tutor.apk', true)

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Application/android.view.View'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Application/android.widget.Button (3)'), 0)

Mobile.closeApplication()

