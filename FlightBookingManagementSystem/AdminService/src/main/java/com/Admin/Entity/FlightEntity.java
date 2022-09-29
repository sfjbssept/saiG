package com.Admin.Entity;

import java.lang.annotation.ElementType;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class FlightEntity {

	@Id
	
	private Integer flightNo;
	private String instrumentUsed;
	private String departure;
	private String arrival;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date journyDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date endDate;
	private Integer businessClassSeats;
	private Integer nonBusinessClassSeats;
	private Integer price;
	private Integer norows;
	private String mealCategory;
	
	
	
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Date getJournyDate() {
		return journyDate;
	}
	public void setJournyDate(Date journyDate) {
		this.journyDate = journyDate;
	}
	public Integer getNorows() {
		return norows;
	}
	public void setNorows(Integer norows) {
		this.norows = norows;
	}
	public FlightEntity() {
	}
	public FlightEntity(Integer flightNo, String instrumentUsed, String departure, String arrival, Date journyDate,
			Date endDate, Integer businessClassSeats, Integer nonBusinessClassSeats, Integer price, Integer norows,
			String mealCategory) {
		this.flightNo = flightNo;
		this.instrumentUsed = instrumentUsed;
		this.departure = departure;
		this.arrival = arrival;
		this.journyDate = journyDate;
		this.endDate = endDate;
		this.businessClassSeats = businessClassSeats;
		this.nonBusinessClassSeats = nonBusinessClassSeats;
		this.price = price;
		this.norows = norows;
		this.mealCategory = mealCategory;
	}
	public Integer getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public Date getjournyDate() {
		return journyDate;
	}
	public void setjournyDate(Date journyDate) {
		this.journyDate = journyDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getBusinessClassSeats() {
		return businessClassSeats;
	}
	public void setBusinessClassSeats(Integer businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}
	public Integer getNonBusinessClassSeats() {
		return nonBusinessClassSeats;
	}
	public void setNonBusinessClassSeats(Integer nonBusinessClassSeats) {
		this.nonBusinessClassSeats = nonBusinessClassSeats;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getnorows() {
		return norows;
	}
	public void setnorows(Integer norows) {
		this.norows = norows;
	}
	public String getMealCategory() {
		return mealCategory;
	}
	public void setMealCategory(String mealCategory) {
		this.mealCategory = mealCategory;
	}
	@Override
	public String toString() {
		return "FlightEntity [flightNo=" + flightNo + ", instrumentUsed=" + instrumentUsed + ", departure=" + departure
				+ ", arrival=" + arrival + ", journyDate=" + journyDate + ", endDate=" + endDate + ", businessClassSeats="
				+ businessClassSeats + ", nonBusinessClassSeats=" + nonBusinessClassSeats + ", price=" + price
				+ ", norows=" + norows + ", mealCategory=" + mealCategory + "]";
	}
	
	
	
}
