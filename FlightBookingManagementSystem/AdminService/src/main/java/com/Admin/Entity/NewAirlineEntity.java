package com.Admin.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewAirlineEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer airLineId;
	private String airLineName;
	private String contactName;
	private String contactAddress;
	private Integer flightNo;
	private Boolean isBlocked;
	
	
	public NewAirlineEntity() {
		super();
	}


	public NewAirlineEntity(Integer airLineId, String airLineName, String contactName, String contactAddress,
			Integer flightNo, Boolean isBlocked) {
		super();
		this.airLineId = airLineId;
		this.airLineName = airLineName;
		this.contactName = contactName;
		this.contactAddress = contactAddress;
		this.flightNo = flightNo;
		this.isBlocked = isBlocked;
	}
	
	
	public Integer getAirLineId() {
		return airLineId;
	}
	public void setAirLineId(Integer airLineId) {
		this.airLineId = airLineId;
	}
	public String getAirLineName() {
		return airLineName;
	}
	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public Integer getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}
	public Boolean getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}


	@Override
	public String toString() {
		return "NewAirlineEntity [airLineId=" + airLineId + ", airLineName=" + airLineName + ", contactName="
				+ contactName + ", contactAddress=" + contactAddress + ", flightNo=" + flightNo + ", isBlocked="
				+ isBlocked + "]";
	}
	
	
}
