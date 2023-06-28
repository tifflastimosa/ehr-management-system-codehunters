package com.project.ehrmanagementsystem.webApp.repo;

import com.project.ehrmanagementsystem.webApp.entity.Appointment;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
  List<Appointment> findByAppointmentDate(LocalDate appointmentdate);
  Appointment findByAppointmentDateAndTimeSlot(LocalDate appointmentDate, String timeSlot);
  List<Appointment> findByPatientId(Long patientId);
  List<Appointment> findByAppointmentDateAfter(Date currentDate);
}