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

Mobile.startApplication('D:\\belajar\\Katalon_Studio\\Happy_Day_Shopping\\Happy_Day_Shopping\\MobileApp\\Happy Day Shopping_v1.1_apkpure.com.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - NEW ARRIVAL'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Abutine 3C3'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Your Bag'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Catalog'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - FOOD CATEGORY'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Chichirya'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Chips'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Aling Conching Banana Chips 200g'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Add to Bag (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Your Bag (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New_Product/android.widget.TextView - Checkout'), 0)

Mobile.getText(findTestObject('Object Repository/New_Product/android.widget.TextView - Happy Shopping'), 0)

Mobile.closeApplication()

