package com.Admin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Admin.Entity.NewAirlineEntity;

public interface IAirLineRepo extends JpaRepository<NewAirlineEntity, Integer>{

}
