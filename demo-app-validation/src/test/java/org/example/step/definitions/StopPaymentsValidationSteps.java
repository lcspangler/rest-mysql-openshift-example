package org.example.step.definitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.example.model.StopPayment;
import org.example.validation.error.ValidationError;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StopPaymentsValidationSteps {

	@Given("^I have a Stop Payment with the following:$")
	public void i_have_a_Stop_Payment_with_the_following(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@When("^I validate the Stop Payment$")
	public void i_validate_the_Stop_Payment() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I expect the following validation errors:$")
	public void i_expect_the_following_validation_errors(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	private StopPayment makeAStopPayment(DataTable stopPaymentTable) {
		StopPayment stopPayment = new StopPayment();

		List<Map<String, String>> rows = stopPaymentTable.asMaps(String.class, String.class);
		rows.forEach(row -> {

			stopPayment.setDebitCardNumber(((Map<String, String>) row).get("Debit Card Number"));

		});

		return stopPayment;
	}

	private List<ValidationError> makeValidationErrors(DataTable validationErrorsTable) {
		List<ValidationError> expectedErrors = new ArrayList<ValidationError>();

		List<Map<String, String>> rows = validationErrorsTable.asMaps(String.class, String.class);
		rows.forEach(row -> {
			ValidationError expectedError = new ValidationError();
			expectedError.setErrorCode(((Map<String, String>) row).get("Debit Card Number"));
			expectedError.setErrorDescription(row.get("Error Message"));
			expectedErrors.add(expectedError);
		});

		return expectedErrors;
	}

}
