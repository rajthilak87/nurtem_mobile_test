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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.netkathir.Util as WebUtil
import java.awt.event.KeyEvent as KeyEvent
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.support.ui.WebDriverWait
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.OutputType
import org.openqa.selenium.remote.DesiredCapabilities
import org.apache.commons.io.FileUtils
import java.io.File
import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.util.LoadLibs
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import java.net.URL

import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.ios.IOSDriver as IOSDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities

try {	
	
	Mobile.startApplication('D:\\nurtem_mobile\\Nurtem-Tutor.apk', true)
	Mobile.delay(2)
	Mobile.tap(findTestObject('Object Repository/Application/android.widget.username'), 0)
	
	usern = testCaseData.username
	Mobile.setText(findTestObject('Object Repository/Application/android.widget.username1'), usern, 0)
	
	Mobile.tap(findTestObject('Object Repository/Application/android.widget.password'), 0)
	
	passw = testCaseData.password
	Mobile.setText(findTestObject('Object Repository/Application/android.widget.password1'), passw ,0)
	
	Mobile.tap(findTestObject('Object Repository/Application/android.widget.Button'), 0)	
	
	Mobile.delay(2)
	
	result = WebUtil.readToastMsg()
	print(result)
	if (result.contains('Incorrect')) {
		WebUtil.mobile_reportAndtakeScreenshot(testCaseName, testCaseData, 'The password is incorrect ', true)
		Mobile.delay(1)
	}	
	else if (result.contains('Sign up'))
	{
		WebUtil.mobile_reportAndtakeScreenshot(testCaseName, testCaseData, 'Please signup first  ', true)
		Mobile.delay(1)
	}else if (result.contains('EmaH'))
	{
		WebUtil.mobile_reportAndtakeScreenshot(testCaseName, testCaseData, 'Invalid Email or Password  ', true)
		Mobile.delay(1)
	}else  if (result.contains('= nurtem'))
	{
		WebUtil.mobile_reportAndtakeScreenshot(testCaseName, testCaseData, 'Login Successful  ', false)
		Mobile.delay(1)
	}
	Mobile.delay(3)
Mobile.closeApplication()

}

catch (Exception e) {
	print('Exceptional Error Thrown : ' + e)
	WebUtil.mobile_reportAndtakeScreenshot(testCaseName, testCaseData, 'Tutor Login' + e.getMessage(), true)

}

