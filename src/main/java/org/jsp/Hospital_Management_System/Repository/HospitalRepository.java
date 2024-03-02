package org.jsp.Hospital_Management_System.Repository;

import java.util.List;
import java.util.Optional;

import org.jsp.Hospital_Management_System.dto.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	
	public Hospital findByName(String hospital_name);
	
	public Optional<Hospital> findBygstNumber(String hospital_gstNumber);
	
	public Optional<Hospital> findByFounder(String hospital_founder);
	
	
	
	
}
