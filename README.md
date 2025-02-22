# Rest Assured Cucumber Java Framework

This repository contains a simple framework built using **Rest Assured** and **Cucumber** in **Java**. The framework is designed for API testing and currently supports the validation of POST, PUT, GET, and DELETE responses. As of now, the implementation includes the **POST** method, and more methods will be added soon.

## Features

- **REST API Testing:** Validate POST, PUT, GET, and DELETE HTTP methods.
- **Cucumber Integration:** Use Gherkin syntax for behavior-driven development (BDD) style tests.
- **Easy to Extend:** You can add more API methods and corresponding tests as needed.

## Project Setup

### Prerequisites

Before setting up the framework, ensure you have the following software installed:

- **Java 8 or above**
- **Maven**
- **IDE** (like IntelliJ IDEA, Eclipse, etc.)

### Dependencies

This project uses the following libraries:

- **Rest Assured** for API testing
- **Cucumber Java** for BDD-style testing
- **Cucumber Java** for running tests

These dependencies are included in the `pom.xml` file for Maven.

### Steps to Setup

1. Clone this repository to your local machine:

   ```bash
   git clone
2. Navigate to the project directory:
   cd rest-assured-cucumber-java-framework
3. Install the required dependencies:
   mvn clean install
4.Open the project in your preferred IDE.

**src/test/resources**: Contains feature files written in Gherkin syntax.

**features**: Contains the feature files for different API scenarios.
**pom.xm**l: Contains the Maven dependencies for the project.

**TODO**
Implement validation for the PUT, GET, and DELETE HTTP methods
Implement reporting in the framework.
Add more tests to cover different API scenarios.
