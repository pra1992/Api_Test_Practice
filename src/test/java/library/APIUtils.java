package library;

import java.io.File;
import java.io.IOException;
import java.lang.module.Configuration;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import config.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import steps.BaseAPI;

public class APIUtils extends BaseAPI {

	public static Response sendPostWithBasicAuth(String endpoint, String username, String password, String body) {
		 return RestAssured.given().log().all()
		  .contentType(ContentType.JSON)
		  .body(body)
		  .post(endpoint);			  
	
	}
	
	 public static Response sendPostWithOAuth(String endpoint, String token, String body) {
	        return RestAssured.given()
	                .contentType(ContentType.JSON)
	                .header("Authorization", "Bearer " + token)
	                .body(body)
	                .post(endpoint);
	    }
	
	public static Response sendGetRequestWithBasicAuth(String endpoint, String username, String password) {
		return RestAssured.given().auth()
				.preemptive().basic(username, password)
				.accept(ContentType.JSON)
				.get(endpoint);
	}
	
	  public static Response sendPutWithOAuth(String endpoint, String token, String body) {
	        return RestAssured.given()
	                .contentType(ContentType.JSON)
	                .header("Authorization", "Bearer " + token)
	                .body(body)
	                .put(endpoint);
	    }
	
	  public static Response sendGetWithOAuth(String endpoint, String token) {
	        return RestAssured.given()
	                .header("Authorization", "Bearer " + token)
	                .get(endpoint);
	    }

	
	public static Response sendPutWithBasicAuth(String endpoint, String username, String password, String body) {
		return RestAssured.given()
				.auth()
				.preemptive()
				.basic(username, password)
				.contentType(ContentType.JSON)
				.body(body)
				.put(endpoint);
	}
	
	 public static Response sendDeleteWithBasicAuth(String endpoint, String username, String password) {
	        return RestAssured.given()
	                .auth().preemptive().basic(username, password)
	                .delete(endpoint);
	    }
	 
	 public static Response sendDeleteWithOAuth(String endpoint, String token) {
	        return RestAssured.given()
	                .header("Authorization", "Bearer " + token)
	                .delete(endpoint);
	    }
	 
	 //Reads the JSON Input/Response as String
	 public static String readJsonFromFile(String FileName) throws IOException {
	        ObjectMapper objectMapper = new ObjectMapper();
	        File file = new File("./src/test/resources/Payloads/Input/"+FileName);
	        Object obj = objectMapper.readValue(file, Object.class);
	        return objectMapper.writeValueAsString(obj);
}
	 
	 public static String getStatusMessage() {		
			String[] strings = response.getStatusLine().split(" ", 3);
			return strings[strings.length - 1];
		}
	 
	 public static String getContentType() {
			String[] values = response.getContentType().split(";");
			return values[0];
		}	
	 
	 public static String getResponseBody() {		
			return response.getBody().asString();
		}

	



	 
}	 
