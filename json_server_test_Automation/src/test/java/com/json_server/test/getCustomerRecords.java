package com.json_server.test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;



import io.restassured.http.ContentType;

import com.json_server.generics.BaseLib;
import com.json_server.generics.IEndPoints;



public class getCustomerRecords  extends BaseLib  implements IEndPoints {
	/**
	 * 
	 * @author jyotsana
	 *
	 */

	/**
 * checking for contacts
 */
	
	@Test
	public void get_all_contactsdetails() {

		given().when().get(IEndPoints.GET_RESOURSE).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Unauthorized")).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(3000l));}
	
	@Test
	public void get_all_contactsdetails1() {

		given().when().get(IEndPoints.GET_RESOURSE).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Unauthorized")).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(10000l));

	}

	

	/**
	 * Validation by passing wrong token
	 */
	@Test
	public void getUsersRecordWithWrongToken()
	{
   given().header("Authorization","WRONG_TOKEN").get(USER_ENDPOINT)
   .then().assertThat().statusCode(401).and().contentType("");
   		
	
   
	
}}