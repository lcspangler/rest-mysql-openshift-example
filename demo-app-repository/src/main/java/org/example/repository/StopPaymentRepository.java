package org.example.repository;

import java.math.BigInteger;
import java.util.Collection;

import org.example.model.StopPayment;

public interface StopPaymentRepository {

	public void addStopPayment(StopPayment stopPayment);

	public Collection<StopPayment> getAllStopPayments();

	public StopPayment getStopPayment(BigInteger id);

	public void updateStopPayment(StopPayment stopPayment);

	public void deleteStopPayment(StopPayment stopPayment);

}
