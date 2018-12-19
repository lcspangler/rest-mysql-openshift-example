package org.example.repository;

import java.math.BigInteger;
import java.util.List;

import org.example.model.StopPayment;

public interface StopPaymentRepository {

	public void addStopPayment(StopPayment stopPayment);

	public List<StopPayment> getAllStopPayments();

	public StopPayment getStopPayment(BigInteger id);

	public void updateStopPayment(StopPayment stopPayment);

	public void deleteStopPayment(StopPayment stopPayment);

}
