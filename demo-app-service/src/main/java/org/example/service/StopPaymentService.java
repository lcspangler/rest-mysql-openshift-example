package org.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.application.StopPaymentServiceValidation;
import org.example.model.StopPayment;
import org.example.repository.MySqlStopPaymentRepository;
import org.example.repository.StopPaymentRepository;
import org.example.service.model.CreateStopPaymentResponse;
import org.example.service.model.GetStopPaymentResponse;
import org.example.service.model.GetStopPaymentsResponse;

@Path("/stop-payments")
public class StopPaymentService {

	private static final Logger log = LogManager.getLogger(StopPaymentService.class);

	private StopPaymentRepository stopPaymentRepository = new MySqlStopPaymentRepository();
	private StopPaymentServiceValidation stopPaymentServiceValidation = new StopPaymentServiceValidation();

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public CreateStopPaymentResponse createStopPayment(StopPayment stopPayment) {
		CreateStopPaymentResponse response = new CreateStopPaymentResponse();
		// In a real application we wouldn't log the full request at info level
		log.info("Creating stop payment: {}", stopPayment);

		// response.setErrors(stopPaymentServiceValidation.validate(stopPayment));
		// if (response.getErrors().isEmpty()) {
		// stopPaymentRepository.addStopPayment(stopPayment);
		// }

		return response;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public GetStopPaymentsResponse getAllStopPayments() {
		GetStopPaymentsResponse response = new GetStopPaymentsResponse();
		log.info("Retrieving all Stop Payments");

		// response.setStopPayments(stopPaymentRepository.getAllStopPayments());

		return response;
	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public GetStopPaymentResponse getStopPayment(@PathParam("id") String id) {
		GetStopPaymentResponse response = new GetStopPaymentResponse();
		log.info("Retrieving Stop Payment with id: {}", id);

		return response;
	}

}
