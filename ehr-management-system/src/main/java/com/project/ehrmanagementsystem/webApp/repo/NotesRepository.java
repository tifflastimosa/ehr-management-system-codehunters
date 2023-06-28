package com.project.ehrmanagementsystem.webApp.repo;

import com.project.ehrmanagementsystem.webApp.entity.Note;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {
  List<Note> findByPatientId(Long patientId);
}
