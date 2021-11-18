import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
		@Test
		public void test() {

			Response response = RestAssured.get("https://reqres.in/api/users?page=2");
			System.out.println(response.statusCode());
			System.out.println(response.asString());
			System.out.println(response.getBody().asString());
			System.out.println(response.statusLine());

			int statusCode = response.getStatusCode();
			Assert.assertEquals(statusCode, 200);

		}

		@Test
		public void test1() {

				given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7));

		}

	}

