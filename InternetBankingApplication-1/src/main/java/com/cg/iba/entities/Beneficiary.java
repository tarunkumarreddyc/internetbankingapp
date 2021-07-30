package com.cg.iba.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beneficiary {
	@Id
	private long beneficiaryId;
	private String beneficiaryName;
	private long beneficiaryAccNo;
	private String IFSC;
	private AccountType accountType;
	public long getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public long getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}
	public void setBeneficiaryAccNo(long beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Beneficiary [beneficiaryId=" + beneficiaryId + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryAccNo=" + beneficiaryAccNo + ", IFSC=" + IFSC + ", accountType=" + accountType + "]";
	}
	
}
