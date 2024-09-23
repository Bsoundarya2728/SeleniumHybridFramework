package requests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


/*
 given()
 	content type, set cookies, add auth, add param, set header info etc...	
 when()
 	get, post, put, delete
 then()
 	validate status code, extract response, extract headers cookies & response body ...
 add() - is also part of then(), if we want use we can use add()
 */
public class HTTPRequests {
	
	@Test
	void getUser()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
	}
	
}
