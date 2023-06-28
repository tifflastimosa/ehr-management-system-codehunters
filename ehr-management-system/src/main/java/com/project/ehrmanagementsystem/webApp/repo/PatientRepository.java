package com.project.ehrmanagementsystem.webApp.repo;

import java.util.List;
import java.util.Optional;
import com.project.ehrmanagementsystem.webApp.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//PatientRepository.java
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
  List<Patient> findByNameContainingIgnoreCase(String name);

  boolean existsById(Long patientId);
  Optional<Patient> findByIdAndName(Long patientId, String patientName);

  boolean existsByContactDetails(String contactDetails);
}
