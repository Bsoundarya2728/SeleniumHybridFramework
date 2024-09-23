package restAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete_Demo {
	
	@Test
	public void postData_Demo()
	{
		
	RestAssured.baseURI= "https://reqres.in/api/users";
	RestAssured.basePath="/2"; 
	
	 given()
		.contentType("application/json")

	.when()
		.delete()
	
	.then()
		.statusCode(204)
		.statusLine("HTTP/1.1 204 No Content")
		//.assertThat().body("name",equalTo(RestUtilityFile.name()))
		//.assertThat().body("name",equalTo(map.get("name")))
		.log().all();
		
	}

	

}
