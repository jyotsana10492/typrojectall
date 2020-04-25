package com.json_server.parser;

import java.util.List;

import org.testng.annotations.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import io.restassured.response.Response;

public class JsonUtil {
	
//	/*
	//@param response 
	//@param jsonpath
	//return null
//	*/
	
@Test	
public static String getJsonString(Response response,String jsonPath) {
return response.getBody().jsonPath().get(jsonPath).toString();}
/*
//@param response 
//@param jsonpath
//return counter in json list
//*/

@Test
public static List<String> getJsonList(Response response,String jsonPath){
	return response.getBody().jsonPath().getList(jsonPath);
}	
	



public static String ParseJson(String response,String Key) {
	JsonElement json = new JsonParser().parse(response).getAsJsonObject().get(Key);
	if (json !=null)
	{
		if(!json.isJsonNull()) {
			return json.toString();
		}
	}
	
	return null;
}



	
}	
	
	
	
	
	
	
	
	
	
	
	
	


