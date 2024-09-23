package restAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/*
 Sections
 given() 
 	set cookies, add auth, add para, set header info etc.
 when()
 	 All kinds of Request ex: Get, Post, Put and Delete
 Then()
 	Validate the status code, extract response, extract headers cookies and response body...
*/

public class Get_Demo {

	@Test
	public void getDetails()
	{
		given()
		.when()
			.get("http://reqres.in/api/users")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("total_pages",equalTo(2))
			//.body("RestResponse.result.email",equalTo("janet.weaver@reqres.in"))
			.header("Content-Type", "application/json; charset=utf-8")
			.log().all();
		
	}
	@Test
	public void getListOfUser()
	{
		
		//String response=
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("total_pages",equalTo(2))
		
		.header("Content-Type", "application/json; charset=utf-8")
		.log().all();
		//.body("RestResponse.result.first_name",equalTo("Lindsay"));
		//.extract().response().asString();
		
	//String jsonResponseAsString =response.asString();
	//Assert.assertEquals(jsonResponseAsString.contains("michael.lawson@reqres.in"));
		
	}
}
