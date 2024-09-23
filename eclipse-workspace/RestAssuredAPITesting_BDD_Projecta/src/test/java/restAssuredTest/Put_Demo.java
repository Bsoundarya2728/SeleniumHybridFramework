package restAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.fge.uritemplate.vars.values.MapValue;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Put_Demo {
	
	public static HashMap datamap=new HashMap();
	public static HashMap map=new HashMap();
	
	//map.put("job","IT Service");
	
	@BeforeClass
	public void setData()
	{
		datamap.put("name",RestUtilityFile.name());
		datamap.put("job", RestUtilityFile.job());
		map.put("name","IRIS");
		map.put("job","IT Service");
		
		//RestAssured.baseURI="";
		//RestAssured.basePath=""; //Query parameter or path parameter
	}
	
	@Test(priority=1)
	public void postData()
	{
	
	 int id = given()
		.contentType("application/json")
		.body(datamap)

	.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	/*.then()
		.statusCode(201)
		.log().all();*/
		
	}
	
	
	@Test(priority=2)
	public void postData_Demo()
	{
	 given()
		.contentType("application/json")
		.body(map)

	.when()
		.put("https://reqres.in/api/users/"+"id")
	
	.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		//.assertThat().body("name",equalTo(RestUtilityFile.name()))
		.assertThat().body("name",equalTo(map.get("name")))
		.log().all();
		
	}

}
