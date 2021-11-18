import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VerifyStatusCode {

	@Test
	public void verify_statusCode()
	{
		String url ="https://reqres.in/api/users?page=2";
		RequestSpecification http_request = RestAssured.given();
		Response response = http_request.get(url);
		int statusCode = response.getStatusCode();
		System.out.println("Print Status Code---->"+statusCode);
		Assert.assertEquals(statusCode,200,"Status Code are Matched");
	}
}
