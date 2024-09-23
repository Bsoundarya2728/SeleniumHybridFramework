package restAssured_Demo;

import io.restassured.RestAssured;
//import io.restassured.response.Response;
import org.testng.Assert;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostPlace_Detatil {
	public static void main(String args[])
	{
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		String response = 
				given()
				.log().all().queryParam("key","qaclick123")
				.body("address")
				
				.when()
				.post("/maps/api/place/add/json")
				
				.then()
				.assertThat().statusCode(200).body("status", equalTo("OK")).extract().response().asString();
				//.header("server","Apache/2.4.52 (Ubuntu)")

				
	}

	

}







