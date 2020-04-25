package com.json_server.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.BeforeSuite;

import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSONPARER{
	
	
	JSONObject jsonObject=new JSONObject();
	//jsonObject.put("title","Microprocessor");
	//jsonObject.put("version","Microcvontroller");
	RequestSpecification reqSpec=given();
	JSONParser parser=new JSONParser();
	//JSONObject  json=(JSONObject) parser.parse(toString());
	public JSONObject obj;
	JSONObject  jo=(JSONObject) obj;
	String phone=(String) jo.get("phone");
	
	

	Response response=reqSpec.post("http://localhost:3000/posts/");

	
	
	
}
	
	
	
	
		
	
		

	