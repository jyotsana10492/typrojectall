package com.json_server.generics;
import static io.restassured.RestAssured.*;
/*
//@author jyotsana  
//
//
//*/


import org.testng.annotations.BeforeSuite;

public class BaseLib {
//private Object token;
	
	
	
	/**to intialization the base url .port and authentication  
	
	*/
	

@BeforeSuite	
public void config()	
{
baseURI="http://13.126.80.194:8080";
port=3000;

String password = null;
String userName = null;
given().auth().basic("rupeek","password");
String token = null;
given().auth().oauth2(token);





}
	
	
	

}
