package com.example.market_data_service.repository;

import com.example.market_data_service.model.SecurityMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityMasterRepository extends JpaRepository<SecurityMaster,Integer> {

}
