package org.example.repository;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.StopPayment;
import org.example.repository.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class MySqlStopPaymentRepository implements StopPaymentRepository {

	private static final Logger log = LogManager.getLogger(MySqlStopPaymentRepository.class);

	private Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void addStopPayment(StopPayment stopPayment) {
		// In a real application the full object would not be logged at info level
		log.info("Saving stop payment: {}", stopPayment);
		session.beginTransaction();
		session.save(stopPayment);
		session.getTransaction().commit();
	}

	@Override
	public Collection<StopPayment> getAllStopPayments() {
		Criteria cr = session.createCriteria(StopPayment.class);
		List results = cr.list();
		return results;
	}

	@Override
	public StopPayment getStopPayment(BigInteger id) {
		log.info("Retrieving stop payment with id: {}", id);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStopPayment(StopPayment stopPayment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStopPayment(StopPayment stopPayment) {
		// TODO Auto-generated method stub

	}

}
