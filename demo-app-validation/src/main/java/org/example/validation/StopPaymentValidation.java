package org.example.validation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.StopPayment;
import org.example.validation.error.ValidationError;

public class StopPaymentValidation {

	private static final Logger log = LogManager.getLogger(StopPaymentValidation.class);

	private static final String ERR001_CODE = "ERR001";
	private static final String ERR001_DESC = "Missing Debit Card Number";
	private static final String ERR002_CODE = "ERR002";
	private static final String ERR002_DESC = "Missing Merchant Name";

	public static List<ValidationError> validate(StopPayment stopPayment) {
		List<ValidationError> errors = new ArrayList<ValidationError>();

		log.debug("Stop Payment for validation: {}", stopPayment);

		if (stopPayment.getDebitCardNumber() == null || stopPayment.getDebitCardNumber().equals("")) {
			ValidationError error = new ValidationError();
			error.setErrorCode(ERR001_CODE);
			error.setErrorDescription(ERR001_DESC);
			errors.add(error);
		}
		if (stopPayment.getMerchantName() == null || stopPayment.getMerchantName().equals("")) {
			ValidationError error = new ValidationError();
			error.setErrorCode(ERR002_CODE);
			error.setErrorDescription(ERR002_DESC);
			errors.add(error);
		}

		return errors;
	}
}
