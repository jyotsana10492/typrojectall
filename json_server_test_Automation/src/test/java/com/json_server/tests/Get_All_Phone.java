package com.json_server.tests;

import org.testng.annotations.Test;

import com.json_server.generics.BaseLib;
import com.json_server.generics.IEndPoints;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;
import org.hamcrest.Matchers;


import com.json_server.generics.IEndPoints;

import io.restassured.http.ContentType;


public class Get_All_Phone extends BaseLib{
	
	@Test
	public void get_all_contacts_phone() {
		
	given().when().get(IEndPoints.GET_RESOURSE_PHONE).then().assertThat().statusCode(401).and().
	contentType(ContentType.JSON).and().body("message",Matchers.equalTo("Unauthorized")).time(lessThan(1000l));
		
	}
	
	
}

