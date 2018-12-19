package org.example.step.definitions;

import java.util.ArrayList;
import java.util.List;

import org.example.model.StopPayment;
import org.example.validation.StopPaymentValidation;
import org.example.validation.error.ValidationError;

public class StopPaymentsValidationTestContext {

	private List<ValidationError> errors = new ArrayList<ValidationError>();
	private StopPayment stopPayment = new StopPayment();
	private StopPaymentValidation stopPaymentValidation = new StopPaymentValidation();

	public void execute() {
		errors = StopPaymentValidation.validate(stopPayment);
	}

	public List<ValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<ValidationError> errors) {
		this.errors = errors;
	}

	public StopPayment getStopPayment() {
		return stopPayment;
	}

	public void setStopPayment(StopPayment stopPayment) {
		this.stopPayment = stopPayment;
	}

	public StopPaymentValidation getStopPaymentValidation() {
		return stopPaymentValidation;
	}

	public void setStopPaymentValidation(StopPaymentValidation stopPaymentValidation) {
		this.stopPaymentValidation = stopPaymentValidation;
	}

}
