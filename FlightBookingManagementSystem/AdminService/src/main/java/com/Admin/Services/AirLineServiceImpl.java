package com.Admin.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Admin.Entity.NewAirlineEntity;
import com.Admin.Repo.IAirLineRepo;


@Service
public class AirLineServiceImpl implements IAirLineService{

	@Autowired
	IAirLineRepo iAirLine;
	
	@Override
	public Integer addAirline(NewAirlineEntity airLine) {
		NewAirlineEntity save = iAirLine.save(airLine);
		return save.getAirLineId();
		
	}
}
