package org.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.StopPayment;
import org.example.service.model.CreateStopPaymentResponse;
import org.example.service.model.GetStopPaymentResponse;

@Path("/stop-payments")
public class StopPaymentService {

	private static final Logger log = LogManager.getLogger(StopPaymentService.class);

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public CreateStopPaymentResponse createStopPayment(StopPayment stopPayment) {
		CreateStopPaymentResponse response = new CreateStopPaymentResponse();
		// In a real application we wouldn't log the full request at info level
		log.info("Creating stop payment: {}", stopPayment);

		return response;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public GetStopPaymentResponse getAllStopPayments() {
		GetStopPaymentResponse response = new GetStopPaymentResponse();
		log.info("Retrieving all Stop Payments");

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
