package org.example.validation;

import java.util.ArrayList;
import java.util.List;

import org.example.model.StopPayment;
import org.example.validation.error.ValidationError;

public class StopPaymentValidation {

	public static List<ValidationError> validate(StopPayment stopPayment) {
		List<ValidationError> errors = new ArrayList<ValidationError>();

		if (stopPayment.getDebitCardNumber() == null || stopPayment.getDebitCardNumber().equals("")) {
			ValidationError error = new ValidationError();
			error.setErrorCode("ERR001");
			error.setErrorDescription("Missing Debit Card Number");
			errors.add(error);
		}
		if (stopPayment.getMerchantName() == null || stopPayment.getMerchantName().equals("")) {
			ValidationError error = new ValidationError();
			error.setErrorCode("ERR002");
			error.setErrorDescription("Missing Merchant Name");
			errors.add(error);
		}

		return errors;
	}
}
