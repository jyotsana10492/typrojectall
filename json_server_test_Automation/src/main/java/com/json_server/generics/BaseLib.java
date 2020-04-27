package com.json_server.generics;
import static io.restassured.RestAssured.*;
/*
//@author jyotsana  
//
//
//*/


import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;

/**
 * 
 * @author jyotsana
 *
 */

public class BaseLib {

	/**
	 * to initialize the base URI, port and authentication
	 */

	@BeforeSuite
	public void config() {

		baseURI = "http://13.126.80.194:8080/authenticate"; 
				
		port = 8080;

			given().auth().basic("rupeek", "password");
		// given().auth().oauth2(token);

	}
}