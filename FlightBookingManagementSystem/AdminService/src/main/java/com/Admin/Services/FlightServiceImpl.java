package com.Admin.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admin.Entity.FlightEntity;
import com.Admin.Repo.IflighRepo;

@Service
public class FlightServiceImpl implements IFlightService{

	@Autowired
	IflighRepo iFlight;
	
	@Override
	public Integer addFlight(FlightEntity flight) {
		// TODO Auto-generated method stub
		FlightEntity dbFlight = iFlight.save(flight);
		return dbFlight.getFlightNo();
	}

}
