package com.cognizant.training.hotelmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.training.hotelmanagement.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

    Optional<Staff> findByMailAndPassword(String mail, String password);
    
}