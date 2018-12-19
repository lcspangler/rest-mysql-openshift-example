package org.example.application;

import java.util.ArrayList;
import java.util.List;

import org.example.model.StopPayment;
import org.example.service.error.ServiceError;
import org.example.validation.StopPaymentValidation;
import org.example.validation.error.ValidationError;

public class StopPaymentServiceValidation {

	public List<ServiceError> validate(StopPayment stopPayment) {
		List<ServiceError> serviceErrors = new ArrayList<ServiceError>();
		List<ValidationError> validationErrors = StopPaymentValidation.validate(stopPayment);

		validationErrors.forEach(validationError -> {
			ServiceError serviceError = new ServiceError();
			serviceError.setErrorCode(validationError.getErrorCode());
			serviceError.setErrorDescription(validationError.getErrorDescription());
			serviceErrors.add(serviceError);
		});

		return serviceErrors;

	}
}
