package org.example.validation;

import java.util.ArrayList;
import java.util.List;

import org.example.model.StopPayment;
import org.example.validation.error.ValidationError;

public class StopPaymentValidation {

	public static List<ValidationError> validate(StopPayment stopPayment) {
		List<ValidationError> errors = new ArrayList<ValidationError>();

		if (stopPayment.getDebitCardNumber().isEmpty()) {
			ValidationError error = new ValidationError();
			error.setErrorCode("ERR001");
			error.setErrorDescription("Missing Debit Card Number");
			errors.add(error);
		}
		if (stopPayment.getStopPayAmount() == null) {
			ValidationError error = new ValidationError();
			error.setErrorCode("ERR002");
			error.setErrorDescription("Missing Stop Pay Amount");
			errors.add(error);
		}
		if (stopPayment.getMerchantName().isEmpty()) {
			ValidationError error = new ValidationError();
			error.setErrorCode("ERR003");
			error.setErrorDescription("Missing Merchant Name");
			errors.add(error);
		}

		return errors;
	}
}
