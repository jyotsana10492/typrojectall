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
import org.hamcrest.Matchers.*;import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

//import com.customer.search.app.BaseLib;
//import com.customer.search.app.IEndPoints;

import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;




import com.json_server.generics.IEndPoints;

import io.restassured.http.ContentType;

public class Get_All_Req_Data extends BaseLib{
	
	
	@Test
	public void get_all_contacts() {

		given().when().get(IEndPoints.GET_RESOURSE).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Unauthorized")).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(3000l));

	}
	
}

