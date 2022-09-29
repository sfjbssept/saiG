package com.Admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Admin.Entity.FlightEntity;
import com.Admin.Entity.NewAirlineEntity;
import com.Admin.Services.IAirLineService;
import com.Admin.Services.IFlightService;

@RestController
public class AdminController {

	@Autowired
	IAirLineService airLineService;
	@Autowired
	IFlightService flightService;
	
	@GetMapping("/ping")
	public void ping() {
		System.out.println("Hi This is Admin");
	}
	
	@PostMapping("/airline/register")
	public Integer addAirLine(@RequestBody NewAirlineEntity airLine) {
		Integer addAirline = airLineService.addAirline(airLine);
		System.err.println(addAirline);
		return addAirline;
		
	}
	@PostMapping("/airline/inventory/add")
	public Integer addFlight(@RequestBody FlightEntity flight) {
		Integer filght = flightService.addFlight(flight);
		System.err.println(filght);
		return filght;
	}
	
}
