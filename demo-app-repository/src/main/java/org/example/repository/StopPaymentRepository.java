package org.example.repository;

import java.math.BigInteger;

import org.example.model.StopPayment;

public interface StopPaymentRepository {

	public void addStopPayment();

	public StopPayment getStopPayment(BigInteger id);

	public void updateStopPayment(StopPayment stopPayment);

	public void deleteStopPayment(BigInteger id);

}
