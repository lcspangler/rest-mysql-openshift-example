package org.example.repository;

import java.math.BigInteger;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.StopPayment;
import org.example.repository.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MySqlStopPaymentRepository implements StopPaymentRepository {

	private static final Logger log = LogManager.getLogger(MySqlStopPaymentRepository.class);

	HibernateUtil hibernateUtil = new HibernateUtil();

	final Session session = hibernateUtil.getHibernateSession();

	@Override
	public void addStopPayment(StopPayment stopPayment) {
		// In a real application the full object would not be logged at info level
		log.info("Saving stop payment: {}", stopPayment);

		Transaction transaction = session.beginTransaction();
		session.save(stopPayment);

		transaction.commit();
	}

	@Override
	public List<StopPayment> getAllStopPayments() {
		Transaction transaction = session.beginTransaction();

		Criteria cr = session.createCriteria(StopPayment.class);
		List<StopPayment> results = cr.list();

		transaction.commit();

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

	public HibernateUtil getHibernateUtil() {
		return hibernateUtil;
	}

	public void setHibernateUtil(HibernateUtil hibernateUtil) {
		this.hibernateUtil = hibernateUtil;
	}

	public Session getSession() {
		return session;
	}

}
