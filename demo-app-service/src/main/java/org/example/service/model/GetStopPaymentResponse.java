package org.example.service.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.example.model.StopPayment;

@XmlRootElement(name = "GetStopPaymentResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetStopPaymentResponse {

	private StopPayment stopPayment;

	public StopPayment getStopPayment() {
		return stopPayment;
	}

	public void setStopPayment(StopPayment stopPayment) {
		this.stopPayment = stopPayment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stopPayment == null) ? 0 : stopPayment.hashCode());
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
		GetStopPaymentResponse other = (GetStopPaymentResponse) obj;
		if (stopPayment == null) {
			if (other.stopPayment != null)
				return false;
		} else if (!stopPayment.equals(other.stopPayment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetStopPaymentResponse [stopPayment=" + stopPayment + "]";
	}

}
