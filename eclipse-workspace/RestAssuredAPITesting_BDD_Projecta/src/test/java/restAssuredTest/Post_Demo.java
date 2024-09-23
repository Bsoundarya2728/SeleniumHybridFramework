package restAssuredTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Post_Demo {
	
	public static HashMap datamap=new HashMap();
	String Name= RestUtilityFile.name();
	String Job= RestUtilityFile.job();

	//Preparing Data for post
	@BeforeClass
	public void setData()
	{
		datamap.put("name",Name);
		datamap.put("job", Job);
		
		RestAssured.baseURI="https://reqres.in/api/users";
		//RestAssured.basePath=""; //Query parameter or path parameter
	}
	
	@Test
	public void postData()
	{
	
	given()
		.contentType("application/json")
		.body(datamap)

	.when()
		.post()
		
	.then()
		.statusCode(201)
		.statusLine("HTTP/1.1 201 Created")
		.log().all();
		
	}
}
