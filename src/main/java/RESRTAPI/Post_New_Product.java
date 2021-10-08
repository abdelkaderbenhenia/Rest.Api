package RESRTAPI;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Post_New_Product {
	
	@Test 
	public void New_Product() {
		
		Response response=	
				given()
				.baseUri("http://techfios.com/api-prod/api/product")
				.headers("Content-Type","application/json; charset=UTF-8").
				when()
					.get("/read.php").
				then()
					.extract().response();
		
		
		int statusCode=response.getStatusCode();
		System.out.println("Status code: "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		response.getTimeIn(TimeUnit.MILLISECONDS);
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body: "+responseBody);

		
	}


	

}
