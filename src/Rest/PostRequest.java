package Rest;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	@Test
	public void RegistrationSuccessful() throws JSONException
	{		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "les"); // Cast
		requestParams.put("LastName", "pot");
		requestParams.put("UserName", "sslevi");
		requestParams.put("Password", "passsword1");

		requestParams.put("Email",  "ssamplelevid9@gmail.com");
		request.body(requestParams);
		Response response = request.post("/register");
		
		String successCode = response.jsonPath().get("SuccessCode");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
	
		Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}
}
