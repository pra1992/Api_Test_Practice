package steps;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.Assert;

import config.ConfigManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.APIUtils;


public class BookingsSteps extends BaseAPI{
	
	@Given("enable logs")
	public void setUp() {
		request = given().log().all();
	}
	
	@When("a new booking is created for (.*)$")
	public void createNewBooking(String FileName) throws IOException {
		
		response=APIUtils.sendPostWithBasicAuth("","", "", APIUtils.readJsonFromFile(FileName));
	}
	
	@When("enable logs for response")
	public void enableLogsForResponse() {
		response.then().log().all();
	}
	
	@Then("validate the response code is {int}")
	public void validateCreateBookingResponseCode(int expectedCode) {
		MatcherAssert.assertThat(response.getStatusCode(), Matchers.equalTo(expectedCode));
	}
	
	@Then("validate the status message is {string}")
	public void validateCreateBookingStatusMessage(String message) {
		MatcherAssert.assertThat(APIUtils.getStatusMessage(), Matchers.equalToIgnoringCase("OK")); 
	}
	
	@Then("validate the booking is successful with a valid message")
	public void validateCreateBookingResponseBody() {
		MatcherAssert.assertThat(APIUtils.getResponseBody(), Matchers.notNullValue());  
	}

}
