package org.example.service.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.example.service.error.ServiceError;

@XmlRootElement(name = "CreateStopPaymentResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateStopPaymentResponse {

	private List<ServiceError> errors = new ArrayList<ServiceError>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errors == null) ? 0 : errors.hashCode());
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
		CreateStopPaymentResponse other = (CreateStopPaymentResponse) obj;
		if (errors == null) {
			if (other.errors != null)
				return false;
		} else if (!errors.equals(other.errors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreateStopPaymentResponse [errors=" + errors + "]";
	}

}
