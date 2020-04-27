package com.json_server.parser;

import java.util.List;

//import com.google.gson.JsonArray;
//import com.google.gson.JsonParser;

import io.restassured.response.Response;

/**
* 
* @author Jyotsana
*
*/

public class JsonUtil {
	

	public static String getJsonString(Response response, String jsonPath) {

		return response.getBody().jsonPath().get(jsonPath).toString();
	}



	/**
	 * getJsonList returns the value of json array from the specified jsonPath
	 * 
	 * @param response
	 * @param json     Path
	 * @param counter
	 * 
	 * 
	 * 
	 */

	public static List<String> getJsonList(Response response, String jsonPath) {
		return response.getBody().jsonPath().getList(jsonPath);

//	public static String parseJsonArray(String response, String Key, int index) {
//
//		JsonArray jsonArray = new JsonParser().parse(response).getAsJsonArray();
//		return jsonArray.get(index).getAsJsonObject().get(Key).getAsString();
	}

}
	
	
	
	
	
	
	
	
	
	
	
	


