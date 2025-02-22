package hooks;

import config.ConfigManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import steps.BaseAPI;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class SetUp  {
	
	@Before
	public void setUp() {
//		RestAssured.baseURI= ConfigManager.getProperty("Login");
//		
//		Map<String, String> cookies = given().log().all().contentType(ContentType.JSON).body("{\r\n"
//				+ "    \"username\": \"admin\", \r\n"
//				+ "    \"password\": \"password\"\r\n"
//				+ " }").when().post("auth/login").then().log().all().extract().response().getCookies();
//		String string = cookies.get("token");
//		System.out.println("TOKEN" + " " + string);
//		
//		given().log().all().contentType(ContentType.JSON).body("{\r\n"
//				+ "    \"username\": \"admin\", \r\n"
//				+ "    \"password\": \"password\"\r\n"
//				+ " }").when().post("auth/login").then().log().all().extract().response().getCookies();
		
////		JsonPath js = new JsonPath(token);
		RestAssured.baseURI = ConfigManager.getProperty("protocol")+"://"
                +ConfigManager.getProperty("hostname")
                +ConfigManager.getProperty("basepath");
		   
		/*
		 * String string =
		 * RestAssured.given().log().all().contentType(ContentType.JSON).body("{\r\n" +
		 * "  \"bookingid\": 2,\r\n" + "  \"roomid\": 1,\r\n" +
		 * "  \"firstname\": \"Ragavendran\",\r\n" +
		 * "  \"lastname\": \"Venkatesan\",\r\n" + "  \"depositpaid\": true,\r\n" +
		 * "  \"email\": \"ragav@gmail.com\",\r\n" +
		 * "  \"phone\": \"996238585111\",\r\n" + "  \"bookingdates\": {\r\n" +
		 * "    \"checkin\": \"2025-02-28\",\r\n" +
		 * "    \"checkout\": \"2025-03-03\"\r\n" + "  }\r\n" +
		 * "}").when().post().then().log().all().extract().response().toString();
		 * 
		 * System.out.println("RESPONSE IS " + " " + string);
		 */
	
		
	}

	@After
	public void tearDown() {
		RestAssured.reset();
	}
}
