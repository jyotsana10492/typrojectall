package com.json_server.test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.http.ContentType;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import com.json_server.generics.BaseLib;
import com.json_server.generics.IEndPoints;

public class getSingleRecord extends BaseLib  implements IEndPoints{  
	
	/**
	 * 
	 * @author jyotsana
	 *
	 */





/**
 *  performing the Validation  with wrong phone number which does not occurs
 */
@Test
public void getAutherizationWithInValidphone()
{
given().header("Authorization",TOKEN).get(USER_PHONE +"")
.then().assertThat().statusCode(401).and().contentType("");
		
}

}
