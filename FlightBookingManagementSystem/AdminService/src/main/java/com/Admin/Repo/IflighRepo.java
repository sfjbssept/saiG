package com.Admin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Admin.Entity.FlightEntity;

public interface IflighRepo extends JpaRepository<FlightEntity, Integer>{

}
