package org.example.repository;

import org.hibernate.Query;
import org.hibernate.Transaction;

public class TestMySqlStopPaymentRepository extends MySqlStopPaymentRepository {

	public void clearAllStopPayments() {
		Transaction transaction = session.beginTransaction();

		String hql = String.format("delete from StopPayment");
		Query query = session.createQuery(hql);
		query.executeUpdate();

		transaction.commit();
	}

}
