package org.example.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.example.model.StopPayment;
import org.junit.Before;
import org.junit.Test;

public class StopPaymentIntegration {

	private TestMySqlStopPaymentRepository testStopPaymentRepository = new TestMySqlStopPaymentRepository();

	@Before
	public void setup() {
		// Clear test data using test impl of the repository, before each test
		testStopPaymentRepository.clearAllStopPayments();
	}

	@Test
	public void shouldSaveAndRetrieveStopPayment() {
		// Populate test data
		StopPayment stopPaymentForSave = makeStopPayment();
		testStopPaymentRepository.addStopPayment(stopPaymentForSave);

		// Retrieve and check
		List<StopPayment> retrievedStopPayments = testStopPaymentRepository.getAllStopPayments();
		if (retrievedStopPayments.isEmpty()) {
			fail("No stop payment retrieved");
		} else {
			assertTrue(retrievedStopPayments.size() == 1);
			StopPayment retrievedStopPayment = retrievedStopPayments.get(0);
			assertEquals(stopPaymentForSave, retrievedStopPayment);
		}
	}

	@Test
	public void shouldSaveAndRetrieveMultipleStopPayments() {
		// Populate test data
		StopPayment stopPaymentForSave1 = makeStopPayment();
		testStopPaymentRepository.addStopPayment(stopPaymentForSave1);

		StopPayment stopPaymentForSave2 = makeStopPayment();
		stopPaymentForSave2.setDebitCardNumber("0000111100001112");
		testStopPaymentRepository.addStopPayment(stopPaymentForSave2);

		StopPayment stopPaymentForSave3 = makeStopPayment();
		stopPaymentForSave3.setDebitCardNumber("0000111100001113");
		testStopPaymentRepository.addStopPayment(stopPaymentForSave3);

		// Retrieve and check
		List<StopPayment> retrievedStopPayments = testStopPaymentRepository.getAllStopPayments();
		if (retrievedStopPayments.isEmpty()) {
			fail("No stop payment retrieved");
		} else {
			assertTrue(retrievedStopPayments.size() == 3);
		}
	}

	private StopPayment makeStopPayment() {
		StopPayment stopPayment = new StopPayment();
		stopPayment.setDebitCardNumber("0000111100001111");
		stopPayment.setStopPayAmount(new BigDecimal("26.21"));
		stopPayment.setMerchantName("Netflix");
		stopPayment.setCreatedBy("test123");
		stopPayment.setCreatedTimestamp(LocalDateTime.now());
		stopPayment.setExpirationDate(LocalDateTime.now().plusDays(5));
		stopPayment.setLastMatchDate(LocalDateTime.now());
		stopPayment.setUpdatedTimestamp(LocalDateTime.now());

		return stopPayment;

	}

}
