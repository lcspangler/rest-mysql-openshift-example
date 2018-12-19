package org.example.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.example.model.StopPayment;

@XmlRootElement(name = "GetStopPaymentsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetStopPaymentsResponse {

	private List<StopPayment> stopPayments = new ArrayList<StopPayment>();

	public List<StopPayment> getStopPayments() {
		return stopPayments;
	}

	public void setStopPayments(List<StopPayment> stopPayments) {
		this.stopPayments = stopPayments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stopPayments == null) ? 0 : stopPayments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetStopPaymentsResponse other = (GetStopPaymentsResponse) obj;
		if (stopPayments == null) {
			if (other.stopPayments != null)
				return false;
		} else if (!stopPayments.equals(other.stopPayments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetStopPaymentsResponse [stopPayments=" + stopPayments + "]";
	}

}
