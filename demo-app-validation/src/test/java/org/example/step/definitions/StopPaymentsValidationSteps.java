package org.example.step.definitions;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.example.model.StopPayment;
import org.example.validation.error.ValidationError;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StopPaymentsValidationSteps {

	StopPaymentsValidationTestContext testContext = new StopPaymentsValidationTestContext();

	@Given("^I have a Stop Payment with the following:$")
	public void i_have_a_Stop_Payment_with_the_following(DataTable stopPaymentTable) throws Throwable {
		testContext.setStopPayment(makeStopPayment(stopPaymentTable));
	}

	@When("^I validate the Stop Payment$")
	public void i_validate_the_Stop_Payment() throws Throwable {
		testContext.execute();
	}

	@Then("^I expect the following validation errors:$")
	public void i_expect_the_following_validation_errors(DataTable errorsTable) throws Throwable {
		List<ValidationError> expectedErrors = makeValidationErrors(errorsTable);
		List<ValidationError> actualErrors = testContext.getErrors();

		System.out.println("\n\nExpected errors: " + expectedErrors);
		System.out.println("Actual errors: " + actualErrors);

		assertEquals(expectedErrors.size(), actualErrors.size());

		testContext.getErrors().forEach(actualError -> {
			expectedErrors.forEach(expectedError -> {
				assertEquals(actualError.getErrorCode(), expectedError.getErrorCode());
				assertEquals(actualError.getErrorDescription(), expectedError.getErrorDescription());
			});
		});
	}

	private StopPayment makeStopPayment(DataTable stopPaymentTable) {
		StopPayment stopPayment = new StopPayment();

		List<Map<String, String>> rows = stopPaymentTable.asMaps(String.class, String.class);
		rows.forEach(row -> {
			stopPayment.setDebitCardNumber(row.get("Debit Card Number"));
			if (!row.get("Stop Pay Amount").isEmpty()) {
				stopPayment.setStopPayAmount(new BigDecimal(row.get("Stop Pay Amount")));
			}
			stopPayment.setMerchantName(row.get("Merchant Name"));
			stopPayment.setReason(row.get("Reason"));
		});

		return stopPayment;
	}

	private List<ValidationError> makeValidationErrors(DataTable validationErrorsTable) {
		List<ValidationError> expectedErrors = new ArrayList<ValidationError>();

		List<Map<String, String>> rows = validationErrorsTable.asMaps(String.class, String.class);
		rows.forEach(row -> {
			if (!row.get("Error Code").isBlank()) {
				ValidationError expectedError = new ValidationError();
				expectedError.setErrorCode(row.get("Error Code"));
				expectedError.setErrorDescription(row.get("Error Description"));
				expectedErrors.add(expectedError);
			}
		});

		return expectedErrors;
	}

}