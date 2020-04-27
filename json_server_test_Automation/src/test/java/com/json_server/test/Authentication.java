package com.json_server.test;
import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.lessThan;

	import java.net.URI;

	import org.hamcrest.Matchers;
	import org.testng.annotations.Test;

	import com.json_server.generics.BaseLib;
	import com.json_server.generics.IEndPoints;


	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	/**
	 * 
	 * @author jyotsana
	 *
	 */


	public class Authentication extends BaseLib implements IEndPoints{
		@Test
		public void get_all_Authenticate() {

			given().when().post(IEndPoints.POST_REQUEST).then().assertThat().statusCode(401).and()
					.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Unauthorized")).and()
					.time(lessThan(9000l));

		}
		
		
		/**
//			 *  related negative Scenarios
//			 */
//				
				@Test
				public void getTokenWithInvalidInput() 
				{
					given().contentType(ContentType.JSON).body("{ }").post(BASE_URL_Authenticate).then().assertThat().statusCode(401)
					.and().contentType("").and().time(lessThan(9000L));
					
				
				}
				@Test
				public void gettokenWithInvalidInput2() 
				{
					given().contentType(ContentType.JSON).body("{ }").post(BASE_URL_Authenticate).then().assertThat().statusCode(401)
					.and().contentType("").and().time(lessThan(9000L));
				}
				
				@Test
				public void gettokenWithInvalidInput3() 
				{
					given().contentType(ContentType.JSON).body("{ }").post(BASE_URL_Authenticate).then().assertThat().statusCode(401)
					.and().contentType("").and().time(lessThan(9000L));
				}


			
				
				@Test
				public void gettokenWithInvalidWrongpwd()
				{
					given().contentType(ContentType.JSON).body("{ }").post(BASE_URL_Authenticate).then().assertThat().statusCode(401)
					.and().contentType("").and().time(lessThan(9000L));
				}
				
				@Test
				public void gettokenWithInvalidpasswordField()
				{
					given().contentType(ContentType.JSON).body("{}").post(BASE_URL_Authenticate).then().assertThat().statusCode(401)
					.and().contentType("").and().time(lessThan(9000L));
			
				
				}
				
				
				
//				@Test
//				public void getTokenWithvalidinput()
//				{
//							
//				given().contentType(ContentType.JSON).body("{baseURI}").post(BASE_URL_Authenticate).then().assertThat().statusCode(200)
//						.and().contentType(ContentType.JSON).and().time(lessThan(9000L));
//						
//						Response response = (Response) given().contentType(ContentType.JSON).and().body("").post(BASE_URL_Authenticate).then().assertThat().statusCode(401).
//								and().contentType("").and().time(lessThan(9000L));
//						//System.out.println(response.getBody().asString());
//					}
//				
		}
		





