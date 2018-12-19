package org.example.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "StopPayment")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "STOP_PAY_TBL")
public class StopPayment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", updatable = false, unique = true)
	private BigInteger id;
	@Column(name = "MERCHANT_NM", unique = true, nullable = false, length = 256)
	private String merchantName;
	@Column(name = "DEBIT_CARD_NO", unique = true, nullable = false, length = 16)
	private String debitCardNumber;
	@Column(name = "STOP_PAY_AMT", unique = true, nullable = false)
	private BigDecimal stopPayAmount;
	@Column(name = "FEE_AMT", unique = true, nullable = true)
	private BigDecimal feeAmount;
	@Column(name = "REASON", unique = true, nullable = true, length = 256)
	private String reason;
	@Column(name = "LAST_MATCH_DT", unique = true, nullable = false)
	private LocalDateTime lastMatchDate;
	@Column(name = "EXPIRATION_DT", unique = true, nullable = false)
	private LocalDateTime expirationDate;
	@Column(name = "CREATED_BY", unique = true, nullable = false)
	private String createdBy;
	@Column(name = "CREATE_DT", unique = true, nullable = false)
	private LocalDateTime createdTimestamp;
	@Column(name = "UPDATED_BY", unique = true, nullable = true)
	private String updatedBy;
	@Column(name = "UPDATE_DT", unique = true, nullable = false)
	private LocalDateTime updatedTimestamp;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}

	public BigDecimal getStopPayAmount() {
		return stopPayAmount;
	}

	public void setStopPayAmount(BigDecimal stopPayAmount) {
		this.stopPayAmount = stopPayAmount;
	}

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getLastMatchDate() {
		return lastMatchDate;
	}

	public void setLastMatchDate(LocalDateTime lastMatchDate) {
		this.lastMatchDate = lastMatchDate;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTimestamp == null) ? 0 : createdTimestamp.hashCode());
		result = prime * result + ((debitCardNumber == null) ? 0 : debitCardNumber.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + ((feeAmount == null) ? 0 : feeAmount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastMatchDate == null) ? 0 : lastMatchDate.hashCode());
		result = prime * result + ((merchantName == null) ? 0 : merchantName.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + ((stopPayAmount == null) ? 0 : stopPayAmount.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		result = prime * result + ((updatedTimestamp == null) ? 0 : updatedTimestamp.hashCode());
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
		StopPayment other = (StopPayment) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdTimestamp == null) {
			if (other.createdTimestamp != null)
				return false;
		} else if (!createdTimestamp.equals(other.createdTimestamp))
			return false;
		if (debitCardNumber == null) {
			if (other.debitCardNumber != null)
				return false;
		} else if (!debitCardNumber.equals(other.debitCardNumber))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (feeAmount == null) {
			if (other.feeAmount != null)
				return false;
		} else if (!feeAmount.equals(other.feeAmount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastMatchDate == null) {
			if (other.lastMatchDate != null)
				return false;
		} else if (!lastMatchDate.equals(other.lastMatchDate))
			return false;
		if (merchantName == null) {
			if (other.merchantName != null)
				return false;
		} else if (!merchantName.equals(other.merchantName))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (stopPayAmount == null) {
			if (other.stopPayAmount != null)
				return false;
		} else if (!stopPayAmount.equals(other.stopPayAmount))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		if (updatedTimestamp == null) {
			if (other.updatedTimestamp != null)
				return false;
		} else if (!updatedTimestamp.equals(other.updatedTimestamp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StopPayment [id=" + id + ", merchantName=" + merchantName + ", debitCardNumber=" + debitCardNumber
				+ ", stopPayAmount=" + stopPayAmount + ", feeAmount=" + feeAmount + ", reason=" + reason
				+ ", lastMatchDate=" + lastMatchDate + ", expirationDate=" + expirationDate + ", createdBy=" + createdBy
				+ ", createdTimestamp=" + createdTimestamp + ", updatedBy=" + updatedBy + ", updatedTimestamp="
				+ updatedTimestamp + "]";
	}

}
