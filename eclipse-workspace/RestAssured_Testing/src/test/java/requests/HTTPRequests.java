package requests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


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
	int id;
	
	@Test(priority=1)
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
	@Test(priority=2)
	void createUser()
	{
		HashMap data=new HashMap();
		data.put("name", "Soudnarya");
		data.put("Job", "Senior QA");
		data.put("Location", "Noida-Unit1");
		
		id= given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id")
		/*.then()
			.statusCode(201)
			.log().all()*/
			;
	}
	@Test(priority=3, dependsOnMethods  ={"createUser"})
	void updateUser()
	{
		HashMap data=new HashMap();
		data.put("name", "BejjenkiSoudnarya");
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.put("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(200)
			.log().all();
		
	}
	@Test(priority=4)
	void deleteUser()
	{
		given()
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all()
		;
	}
	
}
