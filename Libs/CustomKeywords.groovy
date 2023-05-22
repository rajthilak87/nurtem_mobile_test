
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.Map


 /**
	 * Get AbsoluteUrl
	 * @param String relativeUrlName
	 * @return String absoluteUrl
	 */ 
def static "com.netkathir.Util.getAbsoluteUrl"(
    	String relativeUrlName	) {
    (new com.netkathir.Util()).getAbsoluteUrl(
        	relativeUrlName)
}

 /**
	 * Find element
	 * @param String name,
	 *  
	 */ 
def static "com.netkathir.Util.getWebElement"(
    	String name	) {
    (new com.netkathir.Util()).getWebElement(
        	name)
}

 /**
	 * Click element
	 * @param String name,
	 * @param TestObject to
	 */ 
def static "com.netkathir.Util.clickElement"(
    	String name	) {
    (new com.netkathir.Util()).clickElement(
        	name)
}

 /**
	 * Submit LoginForm
	 * @param String name,
	 * @param TestObject to
	 */ 
def static "com.netkathir.Util.submitLoginForm"(
    	String tcName	
     , 	Map data	) {
    (new com.netkathir.Util()).submitLoginForm(
        	tcName
         , 	data)
}

 /**
	 * Submit LoginForm
	 * @param String name,
	 * @param TestObject to
	 */ 
def static "com.netkathir.Util.tutorLoginForm"(
    	String tcName	
     , 	Map data	) {
    (new com.netkathir.Util()).tutorLoginForm(
        	tcName
         , 	data)
}


def static "com.netkathir.Util.submitLoginForm"(
    	String tcName	) {
    (new com.netkathir.Util()).submitLoginForm(
        	tcName)
}


def static "com.netkathir.Util.submitLoginForm"() {
    (new com.netkathir.Util()).submitLoginForm()
}


def static "com.netkathir.Util.tutorLoginForm"(
    	String tcName	) {
    (new com.netkathir.Util()).tutorLoginForm(
        	tcName)
}


def static "com.netkathir.Util.tutorLoginForm"() {
    (new com.netkathir.Util()).tutorLoginForm()
}
