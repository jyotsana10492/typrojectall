package com.json_server.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;
import org.hamcrest.Matchers;


import com.json_server.generics.IEndPoints;

import io.restassured.http.ContentType;

public class Autorization {
	
	@Test
	public void get_All_Data() {
	
	given().when().get(IEndPoints.POST_REQUEST).then().assertThat().statusCode(400).and().
	contentType(ContentType.JSON).and().body("message",Matchers.equalTo("Bad Request")).and().
	time(lessThan(1000l));
		

}}
