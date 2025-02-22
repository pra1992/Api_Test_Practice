Feature: Booking APIs


Scenario Outline: Create a new booking for the below persons
Given enable logs
When a new booking is created for <Inputs>
And enable logs for response
Then validate the response code is 201
#And validate the status message is "OK"
And validate the booking is successful with a valid message

Examples:
|Inputs|
#|Person1Details.json|
|Person2Details.json|


 
